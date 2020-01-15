package com.sist.io;
import java.io.*;
import java.net.*;
/*
 * 간단한 서버 작동 원리 알기 위함.
 * 
 * MVC, Spring, Kotlin
 * 서버는 한개 통신하는 과정은 여러개 => 여러개의 쓰레드 필요!!
 * 서버컴퓨터에서 생성!
 * 
 * 서버를 만드는 방법
 * 
 * 1) 대기 서버 : 1개로 작동(1개로 접속을 도와줌) ==> 연결기기(Socket) => 전화기(전화번호와 연결선(port no) 필요)
 * 		
 * 		전화기의 소프트웨어화 = 소켓
 * 
 *  ip 70.12.114.150와 port 7777 를 arraylist 에 저장해놓고.
 *  
 *  read/write  <==> read/write 서로 교차하면서 네트워크 한다. read=> 1byte, write => 2byte
 *  네트워크는 1byte씩 들어온다 ==> 한글꺠짐 => 따라서 2byte로 변환하면서 출력(보낼때 stream으로 보냄)
 *  따라서 인코딩 , 디코딩 필요
 * 
 * 
 * (브라우저) -> C로 만듬 => char 1바이트임. => 한글은 2byte! 따라서, 한글로 변환을 해줘야함. 
 * https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%B0%94(자바)
 * 																		===================바이트로 바꿔서 옴 => 인코딩
 * 																		=== 인코딩후 다시 원상복귀 ==> 디코딩!!
 * ip와 port를 맞춰야 연결이 됨 - 서버의 ip와 서버의 port를 맞춰야함.
 * 
 * 			   ServerSocket => 접속시 처리 
 * 
 * ++쓰레드를 많이 만들어놓을수록 속도가 빨라짐.
 * 
 * 
 * 2) 통신 서버: 접속된 수만큼 생성됨(Thread)
 * 			   Socket => 실제 통신
 * 	
 * 
 * 
 * 
 * (브라우저) -> C로 만듬 => char 1바이트임. => 한글은 2byte! 따라서, 한글로 변환을 해줘야함. 
 * https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%B0%94(자바)
 * 																		===================바이트로 바꿔서 옴 => 인코딩
 * 																		=== 인코딩후 다시 원상복귀 ==> 디코딩!!
 * 
 * 
 *   서버 ==> 여러개의 통신하는 프로그램이 필요
 *   		===========동일해야함
 *   
 *   여기에 있는 것은 서버만 작동해주쓰레드고
 *   클라이언트는 
 *   
 *   쓰레드는 값을 읽어서 보내고 출력하는 역할만 한다.
 * 
 * 
 *   서버통신 1 , 개 쓰레드 여러개 - 클라이언트와 ....
 */
public class Server implements Runnable{
	
	
	private ServerSocket ss;

	
	public Server() {
		
		try {
			
			ss=new ServerSocket(3355);
			//bind=>통신이 가능하게 개통시켜줌
			//bind => 1.ip, 2.port
			//서버port 는 고정포트, 클라이언트는 임시 port사용
			//클라이언트는 어느 위치에서도 접속이 가능하도록 중복이 안되는 번호를 자바에서 만들어줌=> 임시포트 
			//생성자 함수만 만들면 대기상태로 들어가게 함
			//listen => 대기상태(클라이언트가 접속할때까지 기다리는것.) -> 자바는 생성자만 만들면 ok bind와 listen있음.
			//
			System.out.println("Server starts....");
			
		}catch(Exception ex) {}
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Server server = new Server();
		new Thread(server).start();
		// server에 있는 run함수를 호출
		
		
	}

	
	
	//쓰레드 작동하는 위치 Runnable메소드
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 대기상태 만들기
		
		while(true)
		{
			
			try
			{
				
				Socket s= ss.accept(); //접속을 했다면, 접속동안 true로 무한, 접속 끝에 나감 // 접속자 클라잉언트 전화번호 받기 필요(Socket)
				System.out.println("접속한 클라이언트의 IP: " + s.getInetAddress().getHostAddress());  //인터넷상의 가져옴
				 System.out.println("임시포트의 번호:" + s.getPort()); //접속한 사람들의 ip와 port를 들어오는 지 보려함.
				System.out.println("==============");
				
				//ip를 받아놔야 (socket이 하는 일) 
	
				
				
			}catch(Exception ex) {}
			
			
			
		}
	}
}
