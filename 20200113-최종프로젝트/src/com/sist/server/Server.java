package com.sist.server;

import java.io.*;
import java.net.*;
import java.util.*;
import com.sist.common.*;

public class Server implements Runnable {

	
	//���� => ����ó�� => ServerSocket
	//�� Ŭ���̾�Ʈ ���� ��� ��� (Thread ����) ==> Socket <=> Socket
	//1. ���� ����
	public ServerSocket ss;
	private final int PORT=16789;
	
	//������ ���� ���� -����ȭ -  �Ѹ� �� ������ �� ���� ����
	private Vector<Client> waitVc = new Vector<Client>();
	
	public Server()
	{
		try {
			
			ss=new ServerSocket(PORT); //bind, listen
			System.out.println("Server Start ...");
			
			
		}catch(Exception ex) {}
		
		
	}
	
	// ���ӽ� ó���Ǵ� ��qns	
	public void run() 
	{
		
		try
		{
			while(true) 
			{
				
				//������ �ߴٸ� Ŭ���̾�Ʈ�� ������ �����ؾ��� =>ip, port�� ������ �޾���(Socket)
				Socket s = ss.accept();  //�̶� Ŭ���̾�Ʈ ������ �޾ƾ���. ==> �������� �Ѿ��
				//����� 1�� ����� ����.
				Client client = new Client(s);
				client.start();
				
				
				//s(Ŭ���̾�Ʈ ���� ip port)���� ������� �����ϸ� ���ڸ��� ����� ���� �� �� �ִ�.==>�����带 ���鷯����! 
			}
			
		}catch(Exception ex) {}
		
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Server server = new Server();
		new Thread(server).start();
	}
	
	
	// ������ �����
	// ��� ����ϴ� �κ�=������(�� Ŭ���̾�Ʈ���� ���� �۾��ϱ⶧��) - MULTI Thread
	class Client extends Thread
	{
		String id, name, sex,pos;
		//pos = ����ġ - ����濡 �ִ��� Ȯ���ϱ�
		
		//������� ���� �ʿ�- ������
		Socket s; //������
		//�����͸� ������ ��Ʈ�� ���
		// ������ 
		OutputStream out; // 1byte�� ����==> input, output
		// �ޱ�
		BufferedReader in;   // �ѱ� 2byte�� ����  ==> Reader // �ѱ��� �ƴϸ� Stream���� ����
		
		public Client(Socket s)
		{
			try
			{
				this.s = s;
				out = s.getOutputStream(); //Ŭ���̾�Ʈ�� ���� ��ġ => �о �� �ְ� ���� ���� ��ġ
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				// InputStreamReader() (���ͽ�Ʈ��) => byte => 2byte�� ��ȯ
				
				
			}catch(Exception ex) {}
			
		}
		
		// �ݺ� �κ��� �����ϱ� ���� ��ҵ� ���� 
		// �������� �����ϴ� �ΰ���
		//1. ���������� ���� -messegeTo
		//2. ��ü������ ���� - messegeAll
		// TCP(������ �ϰ� �޾Ҵ��� Ȯ����) -> �ŷڼ� ���� ����  ==>UPGRADE RTCP(��Ȯ+����),  UDP - �ŷڼ� ���� ����
		
		// ������ // synchronized==> ����ȭ ������ , ������ �񵿱�ȭ ���α׷� ��(�񵿱�ȭ������ ����.. )
		
		
		// Ŭ���̾�Ʈ�� ����ϴ� �κ�
		public void run()
		{
			//100 | hong | ȫ�浿 | ����\n
		
			try
			{
				while(true)
				{
					
					String msg = in.readLine();
					StringTokenizer st = new StringTokenizer(msg,"|");

					int protocol = Integer.parseInt(st.nextToken());
					
					switch(protocol)
					{
					
						case Function.LOGIN:   // ó���ϴ� ��.
						{
							// vector�� ������ ����
							id=st.nextToken();
							name = st.nextToken();
							sex = st.nextToken();
							pos = "����";
							
							
							
							// ��4���� ��� ������� �����͸� ���� ��
							messegeAll(Function.LOGIN + "|" + id + "|" + name + "|" + sex + "|" + pos);
							
							waitVc.add(this); // ������ �������� �ʰ� ������ ����鿡�� ���� �Ѹ� ����.
							
							messegeTo(Function.MYLOG+"|" +id);
							
							for(Client user:waitVc)
							{
								
								messegeTo(Function.LOGIN+"|" + user.id+ "|" + user.name + "|" + user.sex+"|"+user.pos);
								
							}
							
							
							break;
						
						}
						case Function.WAITCHAT:
						{
							
							messegeAll(Function.WAITCHAT+"|["+ name + "]" + st.nextToken());  // ������� [name]
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
			
				out.write((msg+"\n").getBytes()); // ���� ������
				//readLine() => ������ ���� =>(\n) ��Ŷ- ������ ������ �߰��������.
			
			}catch(Exception ex) {}
			
			
		}
		
		
		// �����ڰ� ��ü���� ����!
		public synchronized void messegeAll(String msg)
		{
			try
			{
				for(Client user:waitVc) //������ ��� ����鿡�� ���� ����.
				{
					user.messegeTo(msg);
					
				}
			}catch(Exception ex) {}
				
			
		}
		
			
	}

	
}
