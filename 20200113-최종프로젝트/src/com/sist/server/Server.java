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
	
	//������ ���� ���� -����ȭ -  �Ѹ�  ������=> �� ���� ����
	private Vector<Client> waitVc = new Vector<Client>();
	private Vector<Room> roomVc = new Vector<Room>(); // Room Ŭ�������� Vector����.  //������ ����Ǹ� ������� �� ���� ���� �����ͺ��̽��� ���� x, id�� ���� ������ DB�� ����!
	
	
	
	public Server()
	{
		try {
			
			ss=new ServerSocket(PORT); //bind, listen
			System.out.println("Server Start ...");
			
			}catch(Exception ex) {}
		
	}
	
	
	
	
	// ���ӽ� ó���Ǵ�  �κ�	
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
	class Client extends Thread // Ŭ���̾�Ʈ ����  ==> this.id�� ������ �Ѵ�.  out.write�� ���� ���� this(�����ϴ�)�� ���� �ִ�
	{
		String id, name, sex,pos;
		//pos = ����ġ - ����濡 �ִ��� Ȯ���ϱ�
		int avata;
		
		
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
					
					String msg = in.readLine();   // Ŭ���̾�Ʈ�� ������ ��(��û -=>msg)
					System.out.println("Client=>" + msg); // out.write ���� �� ����. ��Ŷ ������ Ȯ�� �� �� �ִ�.
					
					StringTokenizer st = new StringTokenizer(msg,"|");

					int protocol = Integer.parseInt(st.nextToken());
					
					switch(protocol)
					{
					
						case Function.LOGIN:   // ó���ϴ� ��. // �α���
						{
							// vector�� ������ ����
							id=st.nextToken(); // ��� ���� ����ص� �Ǵµ� ���� �ʰ��ϸ� ����..(�迭 ��ȣ�־ ��ȣ �ʰ��ϸ� ����.) ������ ��ū ���� ���߱�!
							name = st.nextToken();
							sex = st.nextToken();
							avata=Integer.parseInt(st.nextToken());
							pos = "����";
							
							 
							
							// ��4���� ���� �ƴ� ��� ������� �����͸� ���� ��
							messegeAll(Function.LOGIN + "|" + id + "|" + name + "|" + sex + "|" + pos);
							
							waitVc.add(this); // ������ �������� �ʰ� ������ ����鿡�� ���� �Ѹ� ����.
							
							messegeTo(Function.MYLOG+"|" +id);
							
							
							
							for(Client user:waitVc)
							{
								
								messegeTo(Function.LOGIN+"|" + user.id+ "|" + user.name + "|" + user.sex+"|"+user.pos);
								
							}
							
							//������ ������ ����
							for(Room room:roomVc)
							{
								
								messegeTo((Function.MAKEROOM + "|" + room.roomName + "| "+ room.roomState + "|"+ room.current + "/" + room.maxcount));	
							}
							
							
							break;
						
						}
						case Function.WAITCHAT:
						{
						
							messegeAll(Function.WAITCHAT+"|["+ name + "]" + st.nextToken());  // ������� [name]
							break;
							
							
						}
						case Function.EXIT:
						{
							String mid = id;  // ���̵� ������ => ������ �����ϰ� ������ ����鿡�� ��������ϱ� ������.. ���ΰ��� �����س��� ����..
							// 1.���Ϳ��� ���� => �ε��� ��ȣ ���� ,�迭  = => �迭�ƴϸ�foreach������ ���ϰ�, �迭�̸� �Ϲ� for�� �ʿ�
							for(int i=0;i<waitVc.size();i++)
							{
								Client user = waitVc.get(i);
								if(mid.equals(user.id))
								{
									//������ ����
									messegeTo(Function.MYEXIT+"|"); 
									// Vector���� ����(������ ��ġ)
									waitVc.remove(i);
									//�ݱ�(��� ����)
									in.close();
									out.close();
									break;
								}
								
							}
							//��ü �޼��� => ������ ������ ���̺��� �����϶�
							messegeAll(Function.EXIT+"|"+mid);  //mid �� ���̵� ������
							break;
						}
						case Function.MAKEROOM:   //�� ����� ������ ó���Ǵ� �κ� - ������4���� ���� Ŭ���� room �����
						{
							
							Room room = new Room(st.nextToken(), st.nextToken(), st.nextToken(), Integer.parseInt(st.nextToken()));  // room���Ϳ� �����ϸ� ��@@!!
							room.userVc.add(this); //�濡 �ο� �ϳ� �߰�
							
							roomVc.add(room);
							pos=room.roomName; //pos�� ��������� �ٲٱ� 
							
							messegeAll((Function.MAKEROOM + "|" + room.roomName + "| "+ room.roomState + "|"+ room.current + "/" + room.maxcount));	
							
							// �濡 ���� �����. messegeto => �� �����׸� ����.
							messegeTo(Function.ROOMIN+"|"+room.roomName+"|"+id+"|"+sex+"|"+avata);
					
							
							break;
						}
						case Function.ROOMIN:
						{
							//Function.ROOMIN+"|"+rn
							String rn = st.nextToken(); // ���� �޴´�
							/*
							 * 1.���̸��� �޴´�
							 * 2.���� ã�´�(roomVc����)
							 * 3.pos(��ġ),current(�����ο�)�� ����  ==> �����⵵ ����....
							 * ===============================
							 * =���1:�̹� �濡 �� ��� ó�� => ROOMADD ����� �濡 �߰��ض�
							 *    1.�濡 �����ϴ� ����� ������ �����Ѵ� (id,avata...)
							 *    2.����޼�������
							 * =���2:�濡 ���� ���ó�� 
							 * 	  1. �濡 ���� => ROOMIN	
							 * 	  2. �濡 �ִ� ������� ������ �����ش�
							 * =���3:���ǿ� �����ִ� ����� ���� ���� ����
							 *    1.�ο����� ���� => �޼��� ����
							 */	
 							for(Room room:roomVc)
 							{
 								if(rn.equals(room.roomName)) //��ã��
 								{
 									pos = room.roomName;   
 									room.current++; // �濡 �ִ� �����ο��� ����
 									
 									// �濡 �����ִ� ������� �Ѹ�
 									for(Client user:room.userVc)// �� �ȿ��� ���� ���ԵǾ����� �ʴ�. 
 									{
 										
 										user.messegeTo(Function.ROOMADD+"|"+id+"|"+sex+"|"+avata);  //�濡 �ƹ�Ÿ�� �߰�����
 										user.messegeTo(Function.ROOMCHAT+"|[�˸� ��]"+id+"���� �����ϼ̽��ϴ�.");  //  2.����޼�������
 									}
 									
 									// ���ο��� ó���ϱ�    /////// ������ ���� ó��=> �״��� ���� ó�� => �״��� ���� ó��..
 									room.userVc.add(this); // �������� ������ ���� // ������ ������ �Ʒ����� Ŭ���̾�Ʈ���� ������ ����. messegeto, messegeall
 									// ���ӹ����� â�� �ٲ�
 									messegeTo(Function.ROOMIN+"|"+room.roomName+"|"+id+"|"+sex+"|"+avata);
 									
 									// ������ ���� �ޱ�
 									for(Client user:room.userVc)
 									{
 										if(!id.equals(user.id)) 
 										{
 											messegeTo(Function.ROOMADD+"|"+user.id+"|"+user.sex+"|"+user.avata);  // .user => ���� ����  �� ���� this�� ������ ����.
 											
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
		
			
		
		
	}  // Client extends Thread ��!!

	
}  // class Server implements Runnable��!!
