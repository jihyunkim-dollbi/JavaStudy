package com.sist.io;
import java.io.*;
import java.net.*;
/*
 * ������ ���� �۵� ���� �˱� ����.
 * 
 * MVC, Spring, Kotlin
 * ������ �Ѱ� ����ϴ� ������ ������ => �������� ������ �ʿ�!!
 * ������ǻ�Ϳ��� ����!
 * 
 * ������ ����� ���
 * 
 * 1) ��� ���� : 1���� �۵�(1���� ������ ������) ==> ������(Socket) => ��ȭ��(��ȭ��ȣ�� ���ἱ(port no) �ʿ�)
 * 		
 * 		��ȭ���� ����Ʈ����ȭ = ����
 * 
 *  ip 70.12.114.150�� port 7777 �� arraylist �� �����س���.
 *  
 *  read/write  <==> read/write ���� �����ϸ鼭 ��Ʈ��ũ �Ѵ�. read=> 1byte, write => 2byte
 *  ��Ʈ��ũ�� 1byte�� ���´� ==> �ѱۃ��� => ���� 2byte�� ��ȯ�ϸ鼭 ���(������ stream���� ����)
 *  ���� ���ڵ� , ���ڵ� �ʿ�
 * 
 * 
 * (������) -> C�� ���� => char 1����Ʈ��. => �ѱ��� 2byte! ����, �ѱ۷� ��ȯ�� �������. 
 * https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%B0%94(�ڹ�)
 * 																		===================����Ʈ�� �ٲ㼭 �� => ���ڵ�
 * 																		=== ���ڵ��� �ٽ� ���󺹱� ==> ���ڵ�!!
 * ip�� port�� ����� ������ �� - ������ ip�� ������ port�� �������.
 * 
 * 			   ServerSocket => ���ӽ� ó�� 
 * 
 * ++�����带 ���� ������������ �ӵ��� ������.
 * 
 * 
 * 2) ��� ����: ���ӵ� ����ŭ ������(Thread)
 * 			   Socket => ���� ���
 * 	
 * 
 * 
 * 
 * (������) -> C�� ���� => char 1����Ʈ��. => �ѱ��� 2byte! ����, �ѱ۷� ��ȯ�� �������. 
 * https://search.naver.com/search.naver?sm=top_hty&fbm=1&ie=utf8&query=%EC%9E%90%EB%B0%94(�ڹ�)
 * 																		===================����Ʈ�� �ٲ㼭 �� => ���ڵ�
 * 																		=== ���ڵ��� �ٽ� ���󺹱� ==> ���ڵ�!!
 * 
 * 
 *   ���� ==> �������� ����ϴ� ���α׷��� �ʿ�
 *   		===========�����ؾ���
 *   
 *   ���⿡ �ִ� ���� ������ �۵����־������
 *   Ŭ���̾�Ʈ�� 
 *   
 *   ������� ���� �о ������ ����ϴ� ���Ҹ� �Ѵ�.
 * 
 * 
 *   ������� 1 , �� ������ ������ - Ŭ���̾�Ʈ�� ....
 */
public class Server implements Runnable{
	
	
	private ServerSocket ss;

	
	public Server() {
		
		try {
			
			ss=new ServerSocket(3355);
			//bind=>����� �����ϰ� ���������
			//bind => 1.ip, 2.port
			//����port �� ������Ʈ, Ŭ���̾�Ʈ�� �ӽ� port���
			//Ŭ���̾�Ʈ�� ��� ��ġ������ ������ �����ϵ��� �ߺ��� �ȵǴ� ��ȣ�� �ڹٿ��� �������=> �ӽ���Ʈ 
			//������ �Լ��� ����� �����·� ���� ��
			//listen => ������(Ŭ���̾�Ʈ�� �����Ҷ����� ��ٸ��°�.) -> �ڹٴ� �����ڸ� ����� ok bind�� listen����.
			//
			System.out.println("Server starts....");
			
		}catch(Exception ex) {}
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Server server = new Server();
		new Thread(server).start();
		// server�� �ִ� run�Լ��� ȣ��
		
		
	}

	
	
	//������ �۵��ϴ� ��ġ Runnable�޼ҵ�
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// ������ �����
		
		while(true)
		{
			
			try
			{
				
				Socket s= ss.accept(); //������ �ߴٸ�, ���ӵ��� true�� ����, ���� ���� ���� // ������ Ŭ���׾�Ʈ ��ȭ��ȣ �ޱ� �ʿ�(Socket)
				System.out.println("������ Ŭ���̾�Ʈ�� IP: " + s.getInetAddress().getHostAddress());  //���ͳݻ��� ������
				 System.out.println("�ӽ���Ʈ�� ��ȣ:" + s.getPort()); //������ ������� ip�� port�� ������ �� ������.
				System.out.println("==============");
				
				//ip�� �޾Ƴ��� (socket�� �ϴ� ��) 
	
				
				
			}catch(Exception ex) {}
			
			
			
		}
	}
}
