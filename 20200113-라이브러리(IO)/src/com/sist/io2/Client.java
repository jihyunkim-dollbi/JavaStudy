package com.sist.io2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.net.*;
import java.io.*;

public class Client extends JFrame implements ActionListener, Runnable{
	
	JTextArea ta;
	JTextField tf;
	JButton b;
	
	
	//서버
	Socket s;  // 서버의 정보를 갖고 있다
	OutputStream out;   // 서버로 데이터 전송위치
	BufferedReader in;   ///서버로부터 데이터를 읽어오는 위치
	//b버튼이 눌러졌을때...
	//서버로부터 값이 들어오는 것을 감시하는 쓰레드를 만든다...읽어서 출력하는 쓰레드.. 따라서 서버 쓰레(서버와 클라이언트 연결)드, 여기 쓰레드(서버에서 넘어오는 값을 출력해주는 기능) 두개
	
	
	public Client() {
		
		ta=new JTextArea();
		JScrollPane js = new JScrollPane(ta);
		ta.setEditable(false);
		
		tf=new JTextField(20);
		b = new JButton("접속");
		JPanel p= new JPanel();
		
		p.add(tf);
		p.add(b);
		
		tf.setEnabled(false);
		add("Center", js);
		add("South", p);
		
		setSize(350,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		b.addActionListener(this);
		tf.addActionListener(this);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new Client();
	}






	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b)
		{
			
			try {
				//연결
				s=new Socket("211.238.142.201", 16789);
				out = s.getOutputStream(); //서버로 값을 전송하는 목적으로
				in = new BufferedReader(new InputStreamReader(s.getInputStream()));
				// 서버로부터 값을 읽어온다.
				b.setEnabled(false);
				tf.setEnabled(true);
				tf.requestFocus();
				
				new Thread(this).start();  // run() 을 호출 => 서버에서 들어오는 값을 받는다.
				
				
			}catch(Exception ex) {}
			
			
		}
		
		
		else if(e.getSource()==tf)
		{
			String msg = tf.getText();
			if(msg.length()<1)
				return;
			
			try {
				
				out.write((msg + "\n").getBytes());    // \n 이 파일 보낼때 사용!!
				tf.setText("");
			}catch(Exception ex) {}
		}
		
	}






	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		while(true){
			
			
			try
			{
				String msg = in.readLine();
				ta.append(msg + "\n");
			
			}catch(Exception ex) {}
			
		}
		
		
	}

}
