package com.sist.io2;
import java.util.*;
import java.io.*;
import java.net.*;
/*
 * 클래스의 종류
 * 
 * 1)일반 클래스
 * 2)추상 클래스(인터페이스)
 * 3)내부 클래스
 * 		1.클래스끼리 데이터를 공유 => static ==> 멤버클래스가 되고..
 * 			class A
 * 				{
 * 					class B
 * 					{
 * 					}
 * 	
 * 				}	
 * 
 * 			Server가 가지고 있는 모든 변수를 공유
 * 
 * 		2. 상속 없이 overriding오버라이딩을 사용할때 => 익명의 클래스
 * 
 * 
 *   ++ 내부 클래스는 쓰레드에서만 많이 쓰이고...
 *   대부분 POJO가 많이 쓰임...
 *   
 *   서버 - 소켓 - 쓰레드 - 클라이언트....................
 * 
 */

public class Server implements Runnable {  // 접속기능 - 메인서버

	private ServerSocket ss;
	private final int PORT=3355;
	private Vector<Client> waitVc = new Vector<Client>(); //접속한 유저의 정보 (IP, PORT)를 저장함  // 클라이언트 저장
	
	//한개의 컴퓨터에서 한개의 서버만 돌아가야함, 두개는 X 따라서 new연산자 사용x
	//따라서 위에 3가지를 공유하도록 만들어야한다. ==> 그 공유할 수 있는 방법은 내부 클래스로 만들어서 사용하는 것이다.
	
	
	
	// 서버 가동 => Server => 메모리할당을 한번만 사용
	public  Server() { // 생성자만듬..
	
		try
		{
		
			ss= new ServerSocket(PORT); // 기본서버이다 디폴트로 50명만 접근 가능.  (int port, int backlog)
			//개통 => bind, 대기상태 => listen
			System.out.println("Server Start...");
		
		
		}catch(Exception ex) {}
	
	
	}
	
	
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		//접속시에 처리
		
		while(true)
		{
			try
			{
				//접속시에 클라이언트의 정보를 받아서 저장하고 => 쓰레드로 전송
				//접속시에 정보가 Socket(ip, port)에 들어옴 한번에 뭉쳐서 들어옴 그 메소드가 소켓 => 쓰레드에 넘겨서 이 아이피로만 연결된다.
				// new하면 쓰레드 생성됨...
				Socket s = ss.accept();   //접속이 됐다면... // 접속이 되면 호출되는 함수
				// Socket ==> 클라이언트(user) 여기서 ip를 받아서 아래 class Client extends Thread  에서 쓰래드 한명당 생성됨...
				// 이 소켓의 정보는 클라이언트 정보다.
				
				System.out.println("클라이언트 접속 완료==>" + s.getInetAddress().getHostAddress());
				
				Client client = new Client(s);  // 클라이언트 생성됨.  // 접속할때마다 생성됨
				client.start(); // 클라이언트 run() :통신
				
				
				waitVc.add(client); //접속한 사람의 정보를 저장 // 지역변수이기 때문에 저장을 해놓아야함..// 일반적으로는 로그인시에 저장을 함 일치가 되야하기 때문에..
				
				 
				
			}catch(Exception ex) {}
		
			
		}
			
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		new Thread(server).start();
	}
	
	
	// static의 경우 다른 클래스에서 사용할 수 있기 때문에 inner클래스로 사용도 함. 
	// 내부 클래스 ,멤버 클래스  => 모든 변수 사용 가능하다. private변수도 모두 사용 할 수 있다. 
	// inner class이다. outer? 클래스의 모든 정보를 공유받을 수 있다. => Thread, 윈도우, 빅데이터
	// A.B b = (B)new A(); A안에 B 클래스.
	
	class Client extends Thread   // 통신기능!!
	{
		// 이 안에서 waitVc를 사용하려함. ==> 클라이언트들의 여러 ip와 port를 저장후(id로) 서로 클라이언트들간 소통이 되도록 만들어주려한다. 
		// 								서버와 클라이언트만 소통하는게 아니라 클라이언트와 클라이언트간에 소통도 가능해짐.- 메시지 보내기 가능
		// Server가 갖고 있는 모든 데이터를 사용 할 수 있다.
		// 서버에 접속을 하면(클라이언트 정보를 저장하면서) 통신(쓰레드)을 한개씩 만들어줌
		// waitVc에 있는 저장된 사람을 찾아서 서로 통신 가능하게 함.
		// ip, port를 저장하면서 id를 만들게끔 하여 id하나로 모든 것을 찾아오게 하려는 것이다.....id를 알면 메시지 전송가능해짐
	     
		// 기능에 대한 번호를 여기서 처리함(통신번호)--> 내부 프로토콜 
		
		//Server가 가지고 있는 모든 데이터를 상ㅇ할 수 있다.
		Socket s;    //클라이언트와 연결 전화기(연결기계 => 소프트웨어 제작)
		OutputStream out;  // 클라이언트로 결과값 전송
		BufferedReader in;  // 클라이언트로부터 요청값을 받는다.   ==> in과 out 이 교차됨.. in 메모리(저장)에서 stream을 통해 out 메모리로 보낸다.. TCP
		//두 소캣 서버와 클라이언트는 IN 과 OUT 에서 서로의 정보를 갖고 있게됨.. 반대쪽 out 정보..

		public Client (Socket s)
		{
			try
			{
				
				this.s=s;
				out = s.getOutputStream(); //클라이언트로 값을 전송할 목적으로 
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				//							(===============>) 1byte를 받아서 2byte로 변환해줌
				
			}catch(Exception ex) {}
			
		}
		
		
		public void run()  // 처리하는 부분
		{
			while(true)
			{
				try
				{
	/*				//클라이언트가 전송한 메세지 읽기
					String msg=in.readLine();
					System.out.println("Client..." + msg);
					//전체 접속한 클라이언트에 값을 전송
					for(Client c:waitVc)
					{
						c.out.write((msg+"\n").getBytes());
					}
					
		*/			
				}catch(Exception ex) {}
				
				
			}
			
			
		}
		
		
		
	}

}
