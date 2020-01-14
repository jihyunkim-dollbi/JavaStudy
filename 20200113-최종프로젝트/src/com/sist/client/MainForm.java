package com.sist.client;
import java.awt.*;

import javax.swing.*;
import java.awt.event.*;

import com.sist.common.Function;
import com.sist.dao.*;  // 패키지가 다를때 불러오기
// 서버 연결
import java.util.*;
import java.net.*;
import java.io.*;


//이미 상속을 받은 상태에서는 인터페이스로 받기=> 인터페이스 여러개 가능!!
public class MainForm extends JFrame implements ActionListener, Runnable  {
	//                =======> extends를 android로 바꾸면? 모바일?

	login Login  = new login();
	WaitRoom wr = new WaitRoom();
	CardLayout card = new CardLayout();
	//서버 연결과 관련된 라이브러리
	Socket s; //서버와 연결된!
	OutputStream out; //서버로 데이터 전송(요청)
	BufferedReader in; //서버에서 응답한 데이터를 받는다!
	/*
	 * 1) 유저가 직접 보내는 데이터 => 이벤트 "발생"할때마다 서버에 값을 보내주기!!  => 각 이벤트바다 서버에 알리기				
	 * 2) 서버에서 들어오는 데이터는 Thread!가 출력! ==> 출력(Function번호 )
	 * 3) 이벤트마다 번호부여하여 쓰레드가 처리할것 => 내부 프로토콜!
	 */
	
	MainForm(){
			
		setLayout(card);
		add("Login", Login);  
		//this.add("Login", Login);
		add("WR", wr);
		//this.add("WR", wr);
		//add("Game",gr);
		
		setSize(1024,768);       // 1024,768
		setVisible(true);     //윈도우를 보여라
		Login.b1.addActionListener(this);
		
		
		wr.tf.addActionListener(this); // (waitroom버튼에서 이벤트 처리)데이터 전송/출력 - 메인폼  , 데이터 처리 - server!!
		
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
			// 오류처리하기 아이디 미입력시
			if(id.length()<1)
			{
				JOptionPane.showMessageDialog(this,"아이디를 입력하세요");
				Login.tf.requestFocus();
				return;			
			}
			
			// 비번 미입력시
			String pwd=String.valueOf(Login.pf.getPassword());
			if(pwd.length()<1)
			{
				JOptionPane.showMessageDialog(this,"비밀번호를 입력하세요");
				Login.pf.requestFocus();
				return;
			}
			
			
			
			//처리
			MemberDAO dao = new MemberDAO();
			String result = dao.isLogin(id, pwd);
			
			if(result.equals("NOID"))
			{
				JOptionPane.showMessageDialog(this,"ID가 존재하지 않습니다");
				Login.tf.setText("");
				Login.pf.setText("");
				Login.tf.requestFocus();
				
			}
			else if(result.equals("NOPWD"))
			{
				JOptionPane.showMessageDialog(this,"비밀번호가 틀립니다.");
				Login.tf.setText("");
				Login.pf.requestFocus();
				
			}
			else
			{
				connection(result);
			}
			
			
			
			
		}
		else if(e.getSource()==wr.tf) { //대기실 채팅
			
			//입력된 문자열 읽기
			String msg = wr.tf.getText();
			if(msg.length()<1) //입력이 안된 경우
			{
				wr.tf.requestFocus();
				return;  //정상입력됨.
				
			}
			
			//서버로 전송
			try
			{
				out.write((Function.WAITCHAT + "|" + msg + "\n").getBytes());
				
				
			}catch(Exception ex) {}
			
			wr.tf.setText(""); //==> enter 시  이벤트 발생 후  공백으로 바로 바꿔줌
			
		}
		
		
		
		
		
		
		
		
	}

	public void connection(String userData)
	{
		try
		{
			//로그인버튼 누르면 커넥션 호출해서 서버랑 연결해야함.  --> else 일때
			s = new Socket("localhost", 16789); //전화걸기 => 서버한테  //서버주소
			// 송신=> 유저 /수신 - 쓰레드
			//송신 
			out=s.getOutputStream(); // 서버 안으로 데이터를 보내겠다. s=서버.
			
			//수신
			in  = new BufferedReader(new InputStreamReader(s.getInputStream())); // 1 => 2byte로 바꾸겠다.
			
			//로그인 데이터 보내기 => funtion이 갖고 있는 번호주기
			//100 | hong | 홍길동 | 남자 \n     ==> 문자열로 묶어서 한번에 보낸다. 2byte로 변환함.   디코딩 => 원래 대로의 문자를 가져옴.
			out.write((Function.LOGIN+ "|" + userData + "\n").getBytes());
			
			
			
		}catch(Exception ex) {}
		// 서버로부터 데이터를 읽기 시작해라
		
		new Thread(this).start();
		
	}
	
	
	
	//서버로 부터 수신 하는 기능!
	@Override
	public void run() {
		// TODO Auto-generated method stub
		//수신을 했을때 어떻게 처리를 할 것인가.........
		//버튼을 눌렀을때 이벤트 발생시 처리하는 부분!!
		
		try
		{
			
			
			while(true)
			{
				String msg = in.readLine(); //in 위치로 부터 역 슬래시까지 값을 받기 =>100 | hong | 홍길동 | 남자 \n 이렇게 넘어옴==> 잘라야함
				StringTokenizer st = new StringTokenizer(msg,"|");  //4개 잘림
				//100 | hong | 홍길동 | 남자 |대기실\n => 아이디 성별 이름 위치
				//a맨처음
				int protocol = Integer.parseInt(st.nextToken()); // 맨처음것 하나 자름 번호한개
				
				switch(protocol)
				{
					case Function.LOGIN:
					{
						String[] data = {
								st.nextToken(),  // 아이디  
								st.nextToken(),  // 이름
								st.nextToken(),  // 성별
								st.nextToken()   // 위치
						};
				
						wr.model2.addRow(data);  // 데이블에 출력하라..
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
						wr.tp.append(st.nextToken()+"\n");  // text area 에 바로바로 글 출력.
						break;
					}
					
				}
				
			}
			
			
		}catch(Exception ex) {}
		
		
		
	}

}
