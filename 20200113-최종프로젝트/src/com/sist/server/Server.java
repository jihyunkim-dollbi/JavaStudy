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
	
	//접속자 저장 공간 -동기화 -  한명 다 저장후 그 다음 저장
	private Vector<Client> waitVc = new Vector<Client>();
	
	public Server()
	{
		try {
			
			ss=new ServerSocket(PORT); //bind, listen
			System.out.println("Server Start ...");
			
			
		}catch(Exception ex) {}
		
		
	}
	
	// 접속시 처리되는 부qns	
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
	class Client extends Thread
	{
		String id, name, sex,pos;
		//pos = 방위치 - 어느방에 있는지 확인하기
		
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
					
					String msg = in.readLine();
					StringTokenizer st = new StringTokenizer(msg,"|");

					int protocol = Integer.parseInt(st.nextToken());
					
					switch(protocol)
					{
					
						case Function.LOGIN:   // 처리하는 곳.
						{
							// vector에 저장할 것임
							id=st.nextToken();
							name = st.nextToken();
							sex = st.nextToken();
							pos = "대기실";
							
							
							
							// 위4개를 모든 사람에게 데이터를 보낼 것
							messegeAll(Function.LOGIN + "|" + id + "|" + name + "|" + sex + "|" + pos);
							
							waitVc.add(this); // 내것을 포함하지 않고 접속한 사람들에게 먼저 뿌릴 것임.
							
							messegeTo(Function.MYLOG+"|" +id);
							
							for(Client user:waitVc)
							{
								
								messegeTo(Function.LOGIN+"|" + user.id+ "|" + user.name + "|" + user.sex+"|"+user.pos);
								
							}
							
							
							break;
						
						}
						case Function.WAITCHAT:
						{
							
							messegeAll(Function.WAITCHAT+"|["+ name + "]" + st.nextToken());  // 보낸사람 [name]
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
		
			
	}

	
}
