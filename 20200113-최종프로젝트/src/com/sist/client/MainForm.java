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
public class MainForm extends JDialog implements ActionListener, Runnable, MouseListener  {   // ��� �̺�Ʈ�� ���ο��� // ���߻�� �������̽��� ��츸!!
	//                =======> extends�� android�� �ٲٸ�? �����?

	login Login  = new login();
	WaitRoom wr = new WaitRoom();
	GameRoom gr = new GameRoom();
	MakeRoom mr = new MakeRoom();
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
	
	String myRoom, myId;  // �������� ���������� ���̸��� ����ؾ��Ѵ�. myId �濡 �ִ� ����� 
	int imageNo=1;
	
	
	MainForm(){
			
		setLayout(card);
		
		add("Login", Login); 
		add("WR", wr);
		add("Game",gr); 
		
		// ��ӹ��� ������ ����
		
		//this.add("Login", Login);
	
		//this.add("WR", wr);
		
		
		setBounds(448, 216, 1024, 768);       // 1024,768   // setsize�� 0,0�� �⺻�̰�  // �� �ٿ��� ������â ��ġ�� ���� �� �ִ�. ��üȭ��ũ�⿡�� ������ũ�⸦ ���� 2�� ������. 
		setVisible(true);     //�����츦 ������
		
		
		setResizable(false); // �ִ�ȭ��ư ��� ���ְ�, ȭ�� ������ ���� x 
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);  // ���ǿ��� xǥ ���� ������ ������ ����. 
		
		Login.b1.addActionListener(this);
		wr.tf.addActionListener(this); // (waitroom��ư���� �̺�Ʈ ó��)������ ����/��� - ������  , ������ ó�� - server!!
		wr.b6.addActionListener(this); // ������  // ��ư�� �̺�Ʈ�� �ַ���.
		wr.b1.addActionListener(this);  // �� �����
		
		
		mr.b1.addActionListener(this); // �̰��� Ŭ�������� �����ι��� �������
		mr.b2.addActionListener(this); // �̹� ������� ��(x- ok) or ���� �� �����?    // this�� mr
		
		
		wr.table1.addMouseListener(this);   // this�� wr�� ����Ų��.
		
		// ��ȿ��� ä�� ���
		gr.tf.addActionListener(this); // �� �ȿ��� ä���ϴ� �̺�Ʈ ���
		gr.b5.addActionListener(this); // ������ ��ư �̺�Ʈ ���
		gr.b2.addActionListener(this); //�����ϱ⿡ �̺�Ʈ ��� // ������ ���� ������ ��� �׼� �������� ������ ���� ������
		
		
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
		// ������ (����)
		else if(e.getSource() == wr.b6) //������(����) ==> �ƿ� ������ ������ ���͸� ��������
		{
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
				/*
				 * ������ => ��û
				 * 		   === 
				 * 			ó�� ==> ����
				 * 			��� ��� => Ŭ���̾�Ʈ
				 */
			}catch(Exception ex) {}
			
		}
		else if(e.getSource()==wr.b1)  //�游��� ��ư Ŭ��
		{
			
			// �ʱ�ȭ �۾�
			mr.tf.setText("");
			mr.rb1.setSelected(true);
			mr.box.setSelectedIndex(0);
			mr.la4.setVisible(false);
			mr.pf.setVisible(false);
			mr.pf.setText("");
			mr.tf.requestFocus();
			mr.setVisible(true);
		}
		else if(e.getSource()==mr.b1)     // �� ����� ���
		{
			//1. ���̸� rn
			String rn = mr.tf.getText();
			if(rn.length()<1)
			{
				JOptionPane.showMessageDialog(this, "���̸��� �Է��ϼ���");
				mr.tf.requestFocus();
				return;
			
			}
			
			for(int i=0; i< wr.model1.getRowCount();i++)
			{
				String roomName=wr.model1.getValueAt(i, 0).toString();
				if(rn.equals(roomName))
				{	
					JOptionPane.showMessageDialog(this, "�̹� �����ϴ� ���Դϴ�.\n �ٽ� �Է��ϼ���");
					mr.tf.setText("");
					mr.tf.requestFocus();
					return;   // break���ϰ� return! // �ߺ�üũ 
				}
				
			}
			
			// ����, �����
			String rs=""; //����
			String rp=""; //��й�ȣ
			if(mr.rb1.isSelected()) //������ư�� ���õƴٸ�
			{
				rs="����";
				rp=" ";    // �����ϱ⸦ Ŭ�������ϱ� ����� ��������...?
				
			}
			else
			{
				rs = "�����";
				rp=String.valueOf(mr.pf.getPassword());  // �Է¹ޱ�
			}
			
			// �ο�üũ
			int inwon = mr.box.getSelectedIndex()+2;  // �ε��� ��� // 2�� �̻���� ����! 
			
			
			//������ ����
			try
			{
				
				out.write((Function.MAKEROOM+"|"+rn+"|"+rs+"|"+rp+"|"+inwon+"\n").getBytes());  // ���̺� ���� ��µ� ����.
				
			}catch(Exception ex) {}
			
			mr.setVisible(false);
			
		}
		else if(e.getSource()==mr.b2)   // �� �ȸ���� ��� (b2 => ��ҹ�ư)
		{
			mr.setVisible(false);
		}
		else if(e.getSource()==gr.tf)  // ä���Է¶�???
		{
			
			String msg = gr.tf.getText(); //�Է��� ���ڸ� ������
			if(msg.length()<1)
			return; //�ؿ� �ִ� ���� ���� x
			
			try
			{
				//������ msg ���� �Ѿ ==> �ش� �� �ȿ� �ִ� �������� ���� �Ѿ����...���� ���̸��� �Ѿ����..String myRoom, ROOMIN���� myRoom������ ���� ,, ��ȿ� userVt�� �����ϱ� �� �ȿ� ����鿡�� ����..
				// ex )�ӼӸ��� ����� id�ʿ�..
			
				out.write((Function.ROOMCHAT+"|"+myRoom+"|"+msg +"\n").getBytes());
				
			}catch(Exception ex) {}
			
			gr.tf.setText(""); // ���鹮�ڷ� ����.
			
			
			
		}
		else if(e.getSource()==gr.b5) // �泪���� ��ư �����ٸ�~~
		{
			
			try
			{
				//�������� �� �̸��� �Ѿ�ܾ��t
				out.write((Function.ROOMOUT+"|"+myRoom+"\n").getBytes());				
				//ó���ϴ� ���� ������ ==>������� ���� case!!
				
			}catch(Exception ex) {}
			
			
			
			
		}
		else if(e.getSource() == gr.b2)
		{
			
			String youId = gr.box.getSelectedItem().toString();
			try
			{
				out.write((Function.KANG+"|"+myRoom+"|"+youId+"\n").getBytes());
				
			}catch(Exception ex) {}
			
		}
		
	
		
	} // ActionPerformed end

	
	
	
	
	
	
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
			out.write((Function.LOGIN+"|"+userData+"\n").getBytes());
			
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
					case Function.EXIT:   // �����ִ� ������� ȭ�� ó��
					{
						
						String id = st.nextToken(); // ������ ������ ����� id�� �����.
						for(int i=0; i<wr.model2.getRowCount();i++) //getRowCount()   ���� 0,1,2 �����.. ������ ����� /getRowCount(0) i�� 0��°�� ����..  
						{
							String mid = wr.model2.getValueAt(i,0).toString();  //getValueAt ���̺��� ���� �о�� , toString()-> object ���� ���ڿ� ��ȯ
							//(String)wr.model2.getValueAt(i, 0)
							if(mid.equals(id))
							{
								wr.model2.removeRow(i);  // i��° �� �����
								break;	
							}
						}
						break;
						
					}
					case Function.MYEXIT:  // ���� ������ ��� ó��
					{
						dispose(); // �޸�ȸ��
						System.exit(0); // ���α׷� ����
						
					}
					case Function.MAKEROOM:
					{
						String[] data= {
								st.nextToken(),  //���̸� 
								st.nextToken(),  //����(����/�����)
								st.nextToken()   // 1/6
						};
						wr.model1.addRow(data);  //�������̱� ������ addrow�Ҷ����� �Ѱ��� �߰���.
						break;
						
						
					}
					case Function.ROOMIN:   // ���� �濡 �ִ� ��. ������ ó��
					{
						//messegeTo(Function.ROOMIN+"|"+room.roomName+"|"+id+"|"+sex+"|"+avata);
						myRoom=st.nextToken();
						String id = st.nextToken();
						String sex = st.nextToken();
						String avata = st.nextToken();
						String bang = st.nextToken();
						myId = id;     //�ش� �� �ȿ��ִ� id��..
						
						String temp="";
						if(sex.equals("����"))
						{
							temp="m"+avata; //m1.png m2.png
	
						}
						else
						{
							temp = "w"+avata; //w1.png w2.png..
						}
						
						//ȭ�� �̵�
						card.show(getContentPane(), "Game");  //R�������� �̵��ض�
						
						
						for(int i=0; i<6;i++)
						{
							if(gr.sw[i]==false) // ������� false // false�϶��� �����ϰ� ����.
							{
								gr.sw[i]=true; //��
								gr.pans[i].removeAll(); // �г����� ������ �󺧵� �ö󰣰��� ���� ����// ������ ���� �ȿö�.
								gr.pans[i].setLayout(new BorderLayout());
 							    gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon("c:\\image\\"+temp+"+.png"), 150, 120))));
 							    gr.pans[i].validate();   // ���ġ  ==>  + removeAll() �׻� �Բ�!
 							    gr.ids[i].setText(id);   // �ؽ�Ʈ�ʵ忡 ���̵� ����.
 							    break;
								
							}
						}
						
						break;
					}
					case Function.ROOMADD:  // ���� ������ �������  // �濡 �ִ� ������� ó���� �� �ִ�....
					{
						
						String id = st.nextToken();
						String sex = st.nextToken();
						String avata = st.nextToken();
						String bang = st.nextToken();
						
						String temp="";
						if(sex.equals("����"))
						{
							temp="m"+avata; //m1.png m2.png
	
						}
						else
						{
							temp = "w"+avata; //w1.png w2.png..
						}
						
						
						//ȭ�� �̵�  // �̹� �����ִ� �����̱� ������ ȭ���̵� �ʿ� x
					//	card.show(getContentPane(), "Game");  //R�������� �̵��ض�
						
						
						for(int i=0; i<6;i++)
						{
							if(gr.sw[i]==false) // ������� false // false�϶��� �����ϰ� ����.
							{
								gr.sw[i]=true; //��
								gr.pans[i].removeAll(); // �г����� ������ �󺧵� �ö󰣰��� ���� ����// ������ ���� �ȿö�.
								gr.pans[i].setLayout(new BorderLayout());
 							    gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon("c:\\image\\"+temp+"+.png"), 150, 120))));
 							    gr.pans[i].validate();   // ���ġ  ==>  + removeAll() �׻� �Բ�!
 							    gr.ids[i].setText(id);   // �ؽ�Ʈ�ʵ忡 ���̵� ����.
 							    break;
								
							}
						}
						
						gr.box.addItem(id);
						
						
						
						break;
					}
					case Function.ROOMCHAT:
					{
						gr.ta.append(st.nextToken()+"\n");  // ���� �˸�
						break;
						
					}
					case Function.WAITUPDATE:
					{
						/*
						 * messegeAll(Function.WAITUPDATE+"|"+room.roomName+"|"+room.current+"|"+room.maxcount+"|"+id+"|"+pos);
						 * �޾ƾߵǴ� �� 4��
						 */
						
						String rn=st.nextToken();
						String current = st.nextToken();
						String maxcount = st.nextToken();
						String id = st.nextToken();
						String pos = st.nextToken();
						
						//���̺��� ��ã�� // ���� �ٿ� ������ �����϶�.
						for(int i=0; i<wr.model1.getRowCount();i++)
						{
							String roomName = wr.model1.getValueAt(i,0).toString();
							if(rn.equals(roomName)) //i��°�� ����
							{
								if(Integer.parseInt(current)==0)
								{
									wr.model1.removeRow(i);   // i��° ����
									
									
								}
								else
								{
									//�����ο����� �ٲ���
									wr.model1.setValueAt(current+"/"+maxcount, i, 2);  // �� ��ġ�� ���� �̰ɷ� �ٲ��
									
								}
								break;
								
							}
							
							
						}
						// ������ ��� ���� 
						// model2�� '��ġ'�����ϱ� - �ڿ������� ����� �ٲ�µ�, �տ� �ִ� ����� �ٲ������.
						for(int i=0; i<wr.model2.getRowCount();i++)
						{
							String mid = wr.model2.getValueAt(i, 0).toString();
							if(mid.equals(id))
							{
								wr.model2.setValueAt(pos, i, 3);
								break; 
							}
							
						}
						
						break;
					}
					case Function.POSCHANGE:
					{
						
						String id=st.nextToken();
						String pos=st.nextToken();
						
						for(int i=0; i<wr.model2.getRowCount();i++)
						{
							String mid = wr.model2.getValueAt(i, 0).toString();
							if(mid.equals(id))
							{
								wr.model2.setValueAt(pos, i, 3);
								break; 
							}				
						}
						break;
						
						
					}
					case Function.ROOMOUT:
					{  
						// �濡 �ִ� ��������״� �ƹ�Ÿ�� ����Ʈ�� �ٲ��ֱ�
						
						String id=st.nextToken();
						
						for(int i=0; i<6; i++)
						{
							String mid=gr.ids[i].getText();  //i��°�� ���� �� �����
							
							if(id.equals(mid))
							{
								gr.sw[i]=false; // 
								gr.pans[i].removeAll(); // �г����� ������ �󺧵� �ö󰣰��� ���� ����// ������ ���� �ȿö�.
								gr.pans[i].setLayout(new BorderLayout());
								gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 150, 120))));  //���������� �ʱ�ȭ
								gr.pans[i].validate();   // ���ġ  ==>  + removeAll() �׻� �Բ�!
								gr.ids[i].setText("");   // �������� �ٲ���
								break;
								
							}
						}
						
				  		break;
						
					}
					case Function.MYROOMOUT:
					{
						//���� ������ ��� ���� => â�� ���ŵǾ����--> ���ӹ濡�� ���Ƿ�==>â�� ���Ƿ� �ٲ�� 
						//�� ��ü�� �Ѱ��� �̹� ������� ������ �ٽ� ���ο� �濡 �� ��� ���� �״�� �� ����==> ���� ���ο� ���� �������� �ʱ�ȭ ���������
						//���������� �ѹ� �����Ǹ� ���� ��������.==> �ʱ�ȭ���ֱⰡ ��ƴ�..
						
						//�ʱ�ȭ= �ƹ�Ÿ /���̵� ��� �����
						for(int i=0; i<6;i++)
						{	
							gr.sw[i]=false; // 
							gr.pans[i].removeAll(); // �г����� ������ �󺧵� �ö󰣰��� ���� ����// ������ ���� �ȿö�.
							gr.pans[i].setLayout(new BorderLayout());
							gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 150, 120))));  //���������� �ʱ�ȭ
							gr.pans[i].validate();   // ���ġ  ==>  + removeAll() �׻� �Բ�!
							gr.ids[i].setText("");   // �������� �ٲ���
						}
						
						gr.ta.setText("");
						gr.tf.setText("");
						card.show(getContentPane(), "WR");
						break;
						
					
						
						
					}
					case Function.KANG:
					{
						String rn = st.nextToken();  // ���̸� ����
						JOptionPane.showMessageDialog(this, rn+"�濡�� ����Ǿ����ϴ�.");
						out.write((Function.ROOMOUT+"|"+rn+"\n").getBytes());   //���� ó���Ϸ� ���
						break;
					}
					case Function.START:
					{

						  //JOptionPane.showMessageDialog(this, st.nextToken());

						  gr.ta.append(st.nextToken()+"\n");

				//		  gr.games.setImage(1);

						  gr.games.repaint();

						  new ProgressThread().start();

						  break;

					  }

					  case Function.NEXT:

					  {

						  

						  
						  //games -> 
				//		  gr.games.setImage(Integer.parseInt(st.nextToken()));

						  gr.games.repaint();

						  gr.bar.setValue(0);

						  new ProgressThread().start();

						  break;

					  }

					  case Function.END:

					  {

						  JOptionPane.showMessageDialog(this, "������ ����Ǿ����ϴ�");

					  }
					
					
					
				}
			}
			
		}catch(Exception ex) {}
		
		
		
	}
/*
 * switch(no)
 * {
 * 		case 1:
 * 		{
 * 			int num=3;
 * 			break;        ==> ����ġ ����ũ �� ���ȿ� ������ ������ ������ ����
 *		 }				 ==> ���� ���̽����� �༭ ��Ϻ����� ����ؾ��Ѵ�.
 * 		case 2:
 * 		{
 * 			int num=5;
 * 			break;
 * 		}
 * }
 */
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==wr.table1)
		{
			if(e.getClickCount()==2) //����Ŭ�� �̺�Ʈ
			{
				//���̸� 
				int row=wr.table1.getSelectedRow();  // ���° ���� �����߳�? ������ �� ��������.
				String rn = wr.model1.getValueAt(row, 0).toString();     //ĭ 0��° / ���� Ŭ���� ��ġ�� ���ȣ �б�, ���̸�
				String inwon = wr.model1.getValueAt(row, 2).toString();  // ĭ 2��° /�ο��� üũ�� ���� than state����!!
				//String state = wr.model1.getValueAt(row, 1).toString();  // ĭ 1��° / ����/ ����� üũ 
				StringTokenizer st = new StringTokenizer(inwon,"/");
				
				// 1/5  ==> �ڸ���
				int no1= Integer.parseInt(st.nextToken());   // 1  
				int no2= Integer.parseInt(st.nextToken());   // 5
				if(no1==no2)  // �ο��� �� ����
				{
					
					// �濡 �� �� ����.
					JOptionPane.showMessageDialog(this, "�̹� ���� á���ϴ�.\n�ٸ� ���� �����ϼ���.");
					
					
				}else   // �濡 �� �� �ִ� //�ο��� ���� ���� ���� ==> ����/����� ���� ����
				{
					try
					{
						out.write((Function.ROOMIN+"|"+rn+"\n").getBytes());
						
					}catch(Exception ex) {}
					
					
				}
				
				
			}
			
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	class ProgressThread extends Thread

	{

		public void run()

		{

			try

			{

				for(int i=0;i<=100;i++)

				{

					gr.bar.setValue(i);

					Thread.sleep(100);

					

					if(i==100)

					{

						out.write((Function.NEXT+"|"+myRoom+"|"+(++imageNo)+"\n").getBytes());

						break;

					}

				}

				

				

				//imageNo++;

			}catch(Exception ex) {}

		}

	}
	
	
	

}
