package com.sist.server;

import java.io.*;

import java.net.*;
import java.util.*;
import com.sist.common.*;

public class Server implements Runnable {

	
	//연결 => 접속처리 => ServerSocket
	//각 클라이언트 마다 통신 담당 (Thread 동작) ==> Socket <=> Socket
	//1. 서버 가동
	public ServerSocket ss;
	private final int PORT=16789;
	
	//접속자 저장 공간 -동기화 -  한명  저장후=> 그 다음 저장
	private Vector<Client> waitVc = new Vector<Client>();
	private Vector<Room> roomVc = new Vector<Room>(); // Room 클래스에서 Vector만듬.  //서버가 종료되면 사라지는 방 같은 경우는 데이터베이스에 저장 x, id나 개인 정보는 DB에 저장!
	
	
	
	public Server()
	{
		try {
			
			ss=new ServerSocket(PORT); //bind, listen
			System.out.println("Server Start ...");
			
			}catch(Exception ex) {}
		
	}
	
	
	
	
	// 접속시 처리되는  부분	
	public void run() 
	{
		
		try
		{
			while(true) 
			{
				
				//접속을 했다면 클라이언트의 정보를 수집해야함 =>ip, port를 소켓이 받아줌(Socket)
				Socket s = ss.accept();  //이때 클라이언트 정보를 받아야함. ==> 소켓으로 넘어옴
				//통신을 1개 만들어 놓음.
				Client client = new Client(s);
				client.start();
				
				
				//s(클라이언트 정보 ip port)값을 쓰레드로 전송하면 각자마다 통신을 따로 할 수 있다.==>쓰레드를 만들러가기! 
			}
			
		}catch(Exception ex) {}
		
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		new Thread(server).start();
	}
	
	
	
	
	
	// 쓰레드 만들기
	// 통신 담당하는 부분=쓰레드(각 클라이언트마다 따로 작업하기때문) - MULTI Thread
	class Client extends Thread // 클라이언트 정보  ==> this.id가 행위를 한다.  out.write를 보낸 것이 this(동작하는)를 갖고 있다
	{
		String id, name, sex,pos;
		//pos = 방위치 - 어느방에 있는지 확인하기
		int avata;
		
		
		//통신위해 소켓 필요- 통신장비
		Socket s; //통신장비
		//데이터를 보낼때 스트림 사용
		// 보내기 
		OutputStream out; // 1byte씩 보냄==> input, output
		// 받기
		BufferedReader in;   // 한글 2byte씩 받음  ==> Reader // 한글이 아니면 Stream으로 읽음
		
		public Client(Socket s)
		{
			try
			{
				this.s = s;
				out = s.getOutputStream(); //클라이언트의 저장 위치 => 읽어갈 수 있게 만든 저장 위치
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				// InputStreamReader() (필터스트림) => byte => 2byte로 변환
				
				
			}catch(Exception ex) {}
			
		}
		
		// 반복 부분을 제거하기 위해 멤소드 만듬 
		// 서버에서 전송하는 두가지
		//1. 개인적으로 전송 -messegeTo
		//2. 전체적으로 전송 - messegeAll
		// TCP(전송을 하고 받았는지 확인함) -> 신뢰성 높고 느림  ==>UPGRADE RTCP(정확+빠름),  UDP - 신뢰성 낮고 빠름
		
		// 개인적 // synchronized==> 동기화 시켜줌 , 없으면 비동기화 프로그램 됨(비동기화했을때 오류.. )
		
		
		// 클라이언트와 통신하는 부분
		public void run()
		{
			//100 | hong | 홍길동 | 남자\n
		
			try
			{
				while(true)
				{
					
					String msg = in.readLine();   // 클라이언트가 전송한 값(요청 -=>msg)
					System.out.println("Client=>" + msg); // out.write 읽을 수 있음. 패킷 갯수를 확인 할 수 있다.
					
					StringTokenizer st = new StringTokenizer(msg,"|");

					int protocol = Integer.parseInt(st.nextToken());
					
					switch(protocol)
					{
					
						case Function.LOGIN:   // 처리하는 곳. // 로그인
						{
							// vector에 저장할 것임
							id=st.nextToken(); // 토근 적게 사용해도 되는데 범위 초과하면 오류..(배열 번호있어서 번호 초과하면 오류.) 개수와 토큰 갯수 맞추기!
							name = st.nextToken();
							sex = st.nextToken();
							avata=Integer.parseInt(st.nextToken());
							pos = "대기실";
							
							 
							
							// 위4개를 내가 아닌 모든 사람에게 데이터를 보낼 것
							messegeAll(Function.LOGIN + "|" + id + "|" + name + "|" + sex + "|" + pos);
							
							waitVc.add(this); // 내것을 포함하지 않고 접속한 사람들에게 먼저 뿌릴 것임.
							
							messegeTo(Function.MYLOG+"|" +id);
							
							
							
							for(Client user:waitVc)
							{
								
								messegeTo(Function.LOGIN+"|" + user.id+ "|" + user.name + "|" + user.sex+"|"+user.pos);
								
							}
							
							//개설된 방정보 전송
							for(Room room:roomVc)
							{
								
								messegeTo((Function.MAKEROOM + "|" + room.roomName + "| "+ room.roomState + "|"+ room.current + "/" + room.maxcount));	
							}
							
							
							break;
						
						}
						case Function.WAITCHAT:
						{
						
							messegeAll(Function.WAITCHAT+"|["+ name + "]" + st.nextToken());  // 보낸사람 [name]
							break;
							
							
						}
						case Function.EXIT:
						{
							String mid = id;  // 아이디를 가져옴 => 본인은 제거하고 나머지 사람들에게 보내줘야하기 때문에.. 본인것을 저장해놓고 시작..
							// 1.백터에서 삭제 => 인덱스 번호 유의 ,배열  = => 배열아니면foreach구문이 편하고, 배열이면 일반 for문 필요
							for(int i=0;i<waitVc.size();i++)
							{
								Client user = waitVc.get(i);
								if(mid.equals(user.id))
								{
									//윈도우 종료
									messegeTo(Function.MYEXIT+"|"); 
									// Vector에서 제거(접속한 위치)
									waitVc.remove(i);
									//닫기(통신 종료)
									in.close();
									out.close();
									break;
								}
								
							}
							//전체 메세지 => 나가는 유저를 데이블에서 삭제하라
							messegeAll(Function.EXIT+"|"+mid);  //mid 이 아이디를 지워라
							break;
						}
						case Function.MAKEROOM:   //방 만들면 실제로 처리되는 부분 - 방정보4개를 갖은 클래스 room 만들기
						{
							
							Room room = new Room(st.nextToken(), st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));  // room백터에 저장하면 끝@@!!
							room.userVc.add(this); //방에 인원 하나 추가
							
							roomVc.add(room);
							pos=room.roomName; //pos를 룸네임으로 바꾸기 
							
							messegeAll((Function.MAKEROOM + "|" + room.roomName + "| "+ room.roomState + "|"+ room.current + "/" + room.maxcount));	
							
							// 방에 들어가게 만든다. messegeto => 한 명한테만 간다.
							messegeTo(Function.ROOMIN+"|"+room.roomName+"|"+id+"|"+sex+"|"+avata);
					
							
							break;
						}
						case Function.ROOMIN:
						{
							//Function.ROOMIN+"|"+rn
							String rn = st.nextToken(); // 값을 받는다
							/*
							 * 1.방이름을 받는다
							 * 2.방을 찾는다(roomVc에서)
							 * 3.pos(위치),current(현재인원)를 변경  ==> 나가기도 동일....
							 * ===============================
							 * =경우1:이미 방에 들어간 사람 처리 => ROOMADD 사람을 방에 추가해라
							 *    1.방에 입장하는 사람의 정보를 전송한다 (id,avata...)
							 *    2.입장메세지전송
							 * =경우2:방에 들어가는 사람처리 
							 * 	  1. 방에 들어가라 => ROOMIN	
							 * 	  2. 방에 있는 사람들의 정보를 보내준다
							 * =경우3:대기실에 남아있는 사람을 위한 대기실 변경
							 *    1.인원수가 변경 => 메세지 전송
							 */	
 							for(Room room:roomVc)
 							{
 								if(rn.equals(room.roomName)) //방찾기
 								{
 									pos = room.roomName;   
 									room.current++; // 방에 있는 현재인원을 증가
 									
 									// 방에 들어와있는 사람에게 뿌림
 									for(Client user:room.userVc)// 이 안에는 내가 포함되어있지 않다. 
 									{
 										
 										user.messegeTo(Function.ROOMADD+"|"+id+"|"+sex+"|"+avata);  //방에 아바타를 추가해줌
 										user.messegeTo(Function.ROOMCHAT+"|[알림 ☞]"+id+"님이 입장하셨습니다.");  //  2.입장메세지전송
 									}
 									
 									// 본인에게 처리하기    /////// 사람들것 먼저 처리=> 그다음 내것 처리 => 그다음 대기실 처리..
 									room.userVc.add(this); // 서버에서 저장한 상태 // 저장한 내용을 아래에서 클라이언트에게 보내고 있음. messegeto, messegeall
 									// 게임방으로 창이 바뀜
 									messegeTo(Function.ROOMIN+"|"+room.roomName+"|"+id+"|"+sex+"|"+avata);
 									
 									// 상대방의 정보 받기
 									for(Client user:room.userVc)
 									{
 										if(!id.equals(user.id)) 
 										{
 											messegeTo(Function.ROOMADD+"|"+user.id+"|"+user.sex+"|"+user.avata);  // .user => 상대방 정보  내 것은 this가 생략된 것임.
 											
 										}
 										
 										
 									}
 									
 								}
 							}
							
							break;
						}
					}
					
				}
				
				
				
			}catch(Exception  ex) {}
			
			
			
		}
		
		
		
		
		
		
		public synchronized void messegeTo(String msg)
		{
			
			try
			{
				out.write((msg+"\n").getBytes()); // 문장 보내기
				//readLine() => 끝나는 시점 =>(\n) 패킷- 문장의 끝마다 추가해줘야함.
			
			}catch(Exception ex) {}
			
			
		}
		
		
		
		
		
		// 접속자가 전체에게 전송!
		public synchronized void messegeAll(String msg)
		{
			try
			{
				for(Client user:waitVc) //접속한 모든 사람들에게 보낼 것임.
				{
					user.messegeTo(msg);	
				}
				
			}catch(Exception ex) {}	
			
		}
		
			
		
		
	}  // Client extends Thread 끝!!

	
}  // class Server implements Runnable끝!!
