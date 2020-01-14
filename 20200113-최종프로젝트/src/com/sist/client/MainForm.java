package com.sist.client;
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

import com.sist.common.Function;
import com.sist.dao.*;  // ��Ű���� �ٸ��� �ҷ�����
// ���� ����
import java.util.*;
import java.net.*;
import java.io.*;


//�̹� ����� ���� ���¿����� �������̽��� �ޱ�=> �������̽� ������ ����!!
public class MainForm extends JFrame implements ActionListener, Runnable  {
	//                =======> extends�� android�� �ٲٸ�? �����?

	login Login  = new login();
	WaitRoom wr = new WaitRoom();
	CardLayout card = new CardLayout();
	//���� ����� ���õ� ���̺귯��
	Socket s; //������ �����!
	OutputStream out; //������ ������ ����(��û)
	BufferedReader in; //�������� ������ �����͸� �޴´�!
	/*
	 * 1) ������ ���� ������ ������ => �̺�Ʈ "�߻�"�Ҷ����� ������ ���� �����ֱ�!!  => �� �̺�Ʈ�ٴ� ������ �˸���				
	 * 2) �������� ������ �����ʹ� Thread!�� ���! ==> ���(Function��ȣ )
	 * 3) �̺�Ʈ���� ��ȣ�ο��Ͽ� �����尡 ó���Ұ� => ���� ��������!
	 */
	
	MainForm(){
			
		setLayout(card);
		add("Login", Login);  
		//this.add("Login", Login);
		add("WR", wr);
		//this.add("WR", wr);
		//add("Game",gr);
		
		setSize(1024,768);       // 1024,768
		setVisible(true);     //�����츦 ������
		Login.b1.addActionListener(this);
		
		
		wr.tf.addActionListener(this); // (waitroom��ư���� �̺�Ʈ ó��)������ ����/��� - ������  , ������ ó�� - server!!
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
			JFrame.setDefaultLookAndFeelDecorated(true);
			
		}
		catch(Exception e) {}
		
		MainForm mf = new MainForm();  
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==Login.b1)
		{
			// card.show(getContentPane(), "WR");
			
			String id=Login.tf.getText();
			// ����ó���ϱ� ���̵� ���Է½�
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this,"���̵� �Է��ϼ���");
				Login.tf.requestFocus();
				return;			
			}
			
			// ��� ���Է½�
			String pwd=String.valueOf(Login.pf.getPassword());
			if(pwd.length()<1)
			{
				JOptionPane.showMessageDialog(this,"��й�ȣ�� �Է��ϼ���");
				Login.pf.requestFocus();
				return;
			}
			
			
			
			//ó��
			MemberDAO dao = new MemberDAO();
			String result = dao.isLogin(id, pwd);
			
			if(result.equals("NOID"))
			{
				JOptionPane.showMessageDialog(this,"ID�� �������� �ʽ��ϴ�");
				Login.tf.setText("");
				Login.pf.setText("");
				Login.tf.requestFocus();
				
			}
			else if(result.equals("NOPWD"))
			{
				JOptionPane.showMessageDialog(this,"��й�ȣ�� Ʋ���ϴ�.");
				Login.tf.setText("");
				Login.pf.requestFocus();
				
			}
			else
			{
				connection(result);
			}
			
			
			
			
		}
		else if(e.getSource()==wr.tf) { //���� ä��
			
			//�Էµ� ���ڿ� �б�
			String msg = wr.tf.getText();
			if(msg.length()<1) //�Է��� �ȵ� ���
			{
				wr.tf.requestFocus();
				return;  //�����Էµ�.
				
			}
			
			//������ ����
			try
			{
				out.write((Function.WAITCHAT + "|" + msg + "\n").getBytes());
				
				
			}catch(Exception ex) {}
			
			wr.tf.setText(""); //==> enter ��  �̺�Ʈ �߻� ��  �������� �ٷ� �ٲ���
			
		}
		
		
		
		
		
		
		
		
	}

	public void connection(String userData)
	{
		try
		{
			//�α��ι�ư ������ Ŀ�ؼ� ȣ���ؼ� ������ �����ؾ���.  --> else �϶�
			s = new Socket("localhost", 16789); //��ȭ�ɱ� => ��������  //�����ּ�
			// �۽�=> ���� /���� - ������
			//�۽� 
			out=s.getOutputStream(); // ���� ������ �����͸� �����ڴ�. s=����.
			
			//����
			in  = new BufferedReader(new InputStreamReader(s.getInputStream())); // 1 => 2byte�� �ٲٰڴ�.
			
			//�α��� ������ ������ => funtion�� ���� �ִ� ��ȣ�ֱ�
			//100 | hong | ȫ�浿 | ���� \n     ==> ���ڿ��� ��� �ѹ��� ������. 2byte�� ��ȯ��.   ���ڵ� => ���� ����� ���ڸ� ������.
			out.write((Function.LOGIN+ "|" + userData + "\n").getBytes());
			
			
			
		}catch(Exception ex) {}
		// �����κ��� �����͸� �б� �����ض�
		
		new Thread(this).start();
		
	}
	
	
	
	//������ ���� ���� �ϴ� ���!
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//������ ������ ��� ó���� �� ���ΰ�.........
		//��ư�� �������� �̺�Ʈ �߻��� ó���ϴ� �κ�!!
		
		try
		{
			
			
			while(true)
			{
				String msg = in.readLine(); //in ��ġ�� ���� �� �����ñ��� ���� �ޱ� =>100 | hong | ȫ�浿 | ���� \n �̷��� �Ѿ��==> �߶����
				StringTokenizer st = new StringTokenizer(msg,"|");  //4�� �߸�
				//100 | hong | ȫ�浿 | ���� |����\n => ���̵� ���� �̸� ��ġ
				//a��ó��
				int protocol = Integer.parseInt(st.nextToken()); // ��ó���� �ϳ� �ڸ� ��ȣ�Ѱ�
				
				switch(protocol)
				{
					case Function.LOGIN:
					{
						String[] data = {
								st.nextToken(),  // ���̵�  
								st.nextToken(),  // �̸�
								st.nextToken(),  // ����
								st.nextToken()   // ��ġ
						};
				
						wr.model2.addRow(data);  // ���̺� ����϶�..
						break;
					}
					case Function.MYLOG:
					{
						
						String id = st.nextToken();
						setTitle(id);
						card.show(getContentPane(), "WR");
						break;
					}
					case Function.WAITCHAT:
					{
						wr.tp.append(st.nextToken()+"\n");  // text area �� �ٷιٷ� �� ���.
						break;
					}
					
				}
				
			}
			
			
		}catch(Exception ex) {}
		
		
		
	}

}
