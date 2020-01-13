package com.sist.io2;
import java.util.*;
import java.io.*;
import java.net.*;
/*
 * Ŭ������ ����
 * 
 * 1)�Ϲ� Ŭ����
 * 2)�߻� Ŭ����(�������̽�)
 * 3)���� Ŭ����
 * 		1.Ŭ�������� �����͸� ���� => static ==> ���Ŭ������ �ǰ�..
 * 			class A
 * 				{
 * 					class B
 * 					{
 * 					}
 * 	
 * 				}	
 * 
 * 			Server�� ������ �ִ� ��� ������ ����
 * 
 * 		2. ��� ���� overriding�������̵��� ����Ҷ� => �͸��� Ŭ����
 * 
 * 
 *   ++ ���� Ŭ������ �����忡���� ���� ���̰�...
 *   ��κ� POJO�� ���� ����...
 *   
 *   ���� - ���� - ������ - Ŭ���̾�Ʈ....................
 * 
 */

public class Server implements Runnable {  // ���ӱ�� - ���μ���

	private ServerSocket ss;
	private final int PORT=3355;
	private Vector<Client> waitVc = new Vector<Client>(); //������ ������ ���� (IP, PORT)�� ������  // Ŭ���̾�Ʈ ����
	
	//�Ѱ��� ��ǻ�Ϳ��� �Ѱ��� ������ ���ư�����, �ΰ��� X ���� new������ ���x
	//���� ���� 3������ �����ϵ��� �������Ѵ�. ==> �� ������ �� �ִ� ����� ���� Ŭ������ ���� ����ϴ� ���̴�.
	
	
	
	// ���� ���� => Server => �޸��Ҵ��� �ѹ��� ���
	public  Server() { // �����ڸ���..
	
		try
		{
		
			ss= new ServerSocket(PORT); // �⺻�����̴� ����Ʈ�� 50�� ���� ����.  (int port, int backlog)
			//���� => bind, ������ => listen
			System.out.println("Server Start...");
		
		
		}catch(Exception ex) {}
	
	
	}
	
	
	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		//���ӽÿ� ó��
		
		while(true)
		{
			try
			{
				//���ӽÿ� Ŭ���̾�Ʈ�� ������ �޾Ƽ� �����ϰ� => ������� ����
				//���ӽÿ� ������ Socket(ip, port)�� ���� �ѹ��� ���ļ� ���� �� �޼ҵ尡 ���� => �����忡 �Ѱܼ� �� �����Ƿθ� ����ȴ�.
				// new�ϸ� ������ ������...
				Socket s = ss.accept();   //������ �ƴٸ�... // ������ �Ǹ� ȣ��Ǵ� �Լ�
				// Socket ==> Ŭ���̾�Ʈ(user) ���⼭ ip�� �޾Ƽ� �Ʒ� class Client extends Thread  ���� ������ �Ѹ�� ������...
				// �� ������ ������ Ŭ���̾�Ʈ ������.
				
				System.out.println("Ŭ���̾�Ʈ ���� �Ϸ�==>" + s.getInetAddress().getHostAddress());
				
				Client client = new Client(s);  // Ŭ���̾�Ʈ ������.  // �����Ҷ����� ������
				client.start(); // Ŭ���̾�Ʈ run() :���
				
				
				waitVc.add(client); //������ ����� ������ ���� // ���������̱� ������ ������ �س��ƾ���..// �Ϲ������δ� �α��νÿ� ������ �� ��ġ�� �Ǿ��ϱ� ������..
				
				 
				
			}catch(Exception ex) {}
		
			
		}
			
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		new Thread(server).start();
	}
	
	
	// static�� ��� �ٸ� Ŭ�������� ����� �� �ֱ� ������ innerŬ������ ��뵵 ��. 
	// ���� Ŭ���� ,��� Ŭ����  => ��� ���� ��� �����ϴ�. private������ ��� ��� �� �� �ִ�. 
	// inner class�̴�. outer? Ŭ������ ��� ������ �������� �� �ִ�. => Thread, ������, ������
	// A.B b = (B)new A(); A�ȿ� B Ŭ����.
	
	class Client extends Thread   // ��ű��!!
	{
		// �� �ȿ��� waitVc�� ����Ϸ���. ==> Ŭ���̾�Ʈ���� ���� ip�� port�� ������(id��) ���� Ŭ���̾�Ʈ�鰣 ������ �ǵ��� ������ַ��Ѵ�. 
		// 								������ Ŭ���̾�Ʈ�� �����ϴ°� �ƴ϶� Ŭ���̾�Ʈ�� Ŭ���̾�Ʈ���� ���뵵 ��������.- �޽��� ������ ����
		// Server�� ���� �ִ� ��� �����͸� ��� �� �� �ִ�.
		// ������ ������ �ϸ�(Ŭ���̾�Ʈ ������ �����ϸ鼭) ���(������)�� �Ѱ��� �������
		// waitVc�� �ִ� ����� ����� ã�Ƽ� ���� ��� �����ϰ� ��.
		// ip, port�� �����ϸ鼭 id�� ����Բ� �Ͽ� id�ϳ��� ��� ���� ã�ƿ��� �Ϸ��� ���̴�.....id�� �˸� �޽��� ���۰�������
	     
		// ��ɿ� ���� ��ȣ�� ���⼭ ó����(��Ź�ȣ)--> ���� �������� 
		
		//Server�� ������ �ִ� ��� �����͸� ���� �� �ִ�.
		Socket s;    //Ŭ���̾�Ʈ�� ���� ��ȭ��(������ => ����Ʈ���� ����)
		OutputStream out;  // Ŭ���̾�Ʈ�� ����� ����
		BufferedReader in;  // Ŭ���̾�Ʈ�κ��� ��û���� �޴´�.   ==> in�� out �� ������.. in �޸�(����)���� stream�� ���� out �޸𸮷� ������.. TCP
		//�� ��Ĺ ������ Ŭ���̾�Ʈ�� IN �� OUT ���� ������ ������ ���� �ְԵ�.. �ݴ��� out ����..

		public Client (Socket s)
		{
			try
			{
				
				this.s=s;
				out = s.getOutputStream(); //Ŭ���̾�Ʈ�� ���� ������ �������� 
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				//							(===============>) 1byte�� �޾Ƽ� 2byte�� ��ȯ����
				
			}catch(Exception ex) {}
			
		}
		
		
		public void run()  // ó���ϴ� �κ�
		{
			while(true)
			{
				try
				{
	/*				//Ŭ���̾�Ʈ�� ������ �޼��� �б�
					String msg=in.readLine();
					System.out.println("Client..." + msg);
					//��ü ������ Ŭ���̾�Ʈ�� ���� ����
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
