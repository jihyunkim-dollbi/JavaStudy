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
public class MainForm extends JDialog implements ActionListener, Runnable, MouseListener  {   // 모든 이벤트는 메인에서 // 다중상속 인터페이스인 경우만!!
	//                =======> extends를 android로 바꾸면? 모바일?

	login Login  = new login();
	WaitRoom wr = new WaitRoom();
	GameRoom gr = new GameRoom();
	MakeRoom mr = new MakeRoom();
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
	
	String myRoom, myId;  // 메인폼이 끝날때까지 방이름을 기억해야한다. myId 방에 있는 사람들 
	int imageNo=1;
	
	
	MainForm(){
			
		setLayout(card);
		
		add("Login", Login); 
		add("WR", wr);
		add("Game",gr); 
		
		// 상속받지 않으면 에러
		
		//this.add("Login", Login);
	
		//this.add("WR", wr);
		
		
		setBounds(448, 216, 1024, 768);       // 1024,768   // setsize는 0,0이 기본이고  // 셋 바운드는 윈도우창 위치를 만들 수 있다. 전체화면크기에서 위도우크기를 빼고 2로 나누기. 
		setVisible(true);     //윈도우를 보여라
		
		
		setResizable(false); // 최대화버튼 기능 없애고, 화면 사이즈 조절 x 
		setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);  // 대기실에서 x표 끄기 눌러도 꺼지지 않음. 
		
		Login.b1.addActionListener(this);
		wr.tf.addActionListener(this); // (waitroom버튼에서 이벤트 처리)데이터 전송/출력 - 메인폼  , 데이터 처리 - server!!
		wr.b6.addActionListener(this); // 나가기  // 버튼에 이벤트를 주려함.
		wr.b1.addActionListener(this);  // 방 만들기
		
		
		mr.b1.addActionListener(this); // 이것을 클릭했을떄 실제로방이 만들어짐
		mr.b2.addActionListener(this); // 이미 만들어진 방(x- ok) or 새로 방 만들까?    // this는 mr
		
		
		wr.table1.addMouseListener(this);   // this는 wr을 가리킨다.
		
		// 방안에서 채팅 등록
		gr.tf.addActionListener(this); // 방 안에서 채팅하는 이벤트 등록
		gr.b5.addActionListener(this); // 나가기 버튼 이벤트 등록
		gr.b2.addActionListener(this); //강퇴하기에 이벤트 등록 // 서버로 값을 보내러 고고 액션 퍼폼에서 서버로 값을 보내기
		
		
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
		// 나가기 (대기실)
		else if(e.getSource() == wr.b6) //나가기(대기실) ==> 아예 나가기 때문에 백터를 지워야함
		{
			try
			{
				out.write((Function.EXIT+"|\n").getBytes());
				/*
				 * 나가기 => 요청
				 * 		   === 
				 * 			처리 ==> 서버
				 * 			결과 출력 => 클라이언트
				 */
			}catch(Exception ex) {}
			
		}
		else if(e.getSource()==wr.b1)  //방만들기 버튼 클릭
		{
			
			// 초기화 작업
			mr.tf.setText("");
			mr.rb1.setSelected(true);
			mr.box.setSelectedIndex(0);
			mr.la4.setVisible(false);
			mr.pf.setVisible(false);
			mr.pf.setText("");
			mr.tf.requestFocus();
			mr.setVisible(true);
		}
		else if(e.getSource()==mr.b1)     // 방 만드는 경우
		{
			//1. 방이름 rn
			String rn = mr.tf.getText();
			if(rn.length()<1)
			{
				JOptionPane.showMessageDialog(this, "방이름을 입력하세요");
				mr.tf.requestFocus();
				return;
			
			}
			
			for(int i=0; i< wr.model1.getRowCount();i++)
			{
				String roomName=wr.model1.getValueAt(i, 0).toString();
				if(rn.equals(roomName))
				{	
					JOptionPane.showMessageDialog(this, "이미 존재하는 방입니다.\n 다시 입력하세요");
					mr.tf.setText("");
					mr.tf.requestFocus();
					return;   // break안하고 return! // 중복체크 
				}
				
			}
			
			// 공개, 비공개
			String rs=""; //상태
			String rp=""; //비밀번호
			if(mr.rb1.isSelected()) //공개버튼이 선택됐다면
			{
				rs="공개";
				rp=" ";    // 공개하기를 클릭했으니까 비번은 공백으로...?
				
			}
			else
			{
				rs = "비공개";
				rp=String.valueOf(mr.pf.getPassword());  // 입력받기
			}
			
			// 인원체크
			int inwon = mr.box.getSelectedIndex()+2;  // 인덱스 사용 // 2명 이상부터 가능! 
			
			
			//서버로 전송
			try
			{
				
				out.write((Function.MAKEROOM+"|"+rn+"|"+rs+"|"+rp+"|"+inwon+"\n").getBytes());  // 테이블 위에 출력될 것임.
				
			}catch(Exception ex) {}
			
			mr.setVisible(false);
			
		}
		else if(e.getSource()==mr.b2)   // 방 안만드는 경우 (b2 => 취소버튼)
		{
			mr.setVisible(false);
		}
		else if(e.getSource()==gr.tf)  // 채팅입력란???
		{
			
			String msg = gr.tf.getText(); //입력한 글자를 가져와
			if(msg.length()<1)
			return; //밑에 있는 문장 수행 x
			
			try
			{
				//서버로 msg 값이 넘어감 ==> 해당 방 안에 있는 유저에게 값이 넘어가야함...따라서 방이름이 넘어가야함..String myRoom, ROOMIN에서 myRoom저장해 놓음 ,, 방안에 userVt가 있으니까 그 안에 사람들에게 간다..
				// ex )귓속말할 대상의 id필요..
			
				out.write((Function.ROOMCHAT+"|"+myRoom+"|"+msg +"\n").getBytes());
				
			}catch(Exception ex) {}
			
			gr.tf.setText(""); // 공백문자로 리셋.
			
			
			
		}
		else if(e.getSource()==gr.b5) // 방나가기 버튼 눌렀다면~~
		{
			
			try
			{
				//서버한테 방 이름을 넘어겨야햠
				out.write((Function.ROOMOUT+"|"+myRoom+"\n").getBytes());				
				//처리하는 곳은 쓰레드 ==>쓰레드로 고고씽 case!!
				
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
			//로그인버튼 누르면 커넥션 호출해서 서버랑 연결해야함.  --> else 일때
			s = new Socket("localhost", 16789); //전화걸기 => 서버한테  //서버주소
			// 송신=> 유저 /수신 - 쓰레드
			//송신 
			out=s.getOutputStream(); // 서버 안으로 데이터를 보내겠다. s=서버.
			
			//수신
			in  = new BufferedReader(new InputStreamReader(s.getInputStream())); // 1 => 2byte로 바꾸겠다.
			
			//로그인 데이터 보내기 => funtion이 갖고 있는 번호주기
			//100 | hong | 홍길동 | 남자 \n     ==> 문자열로 묶어서 한번에 보낸다. 2byte로 변환함.   디코딩 => 원래 대로의 문자를 가져옴.
			out.write((Function.LOGIN+"|"+userData+"\n").getBytes());
			
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
					case Function.EXIT:   // 남아있는 사람들의 화면 처리
					{
						
						String id = st.nextToken(); // 서버가 나가는 사람의 id를 줘야함.
						for(int i=0; i<wr.model2.getRowCount();i++) //getRowCount()   대기실 0,1,2 사용함.. 대기실의 사람수 /getRowCount(0) i가 0번째면 삭제..  
						{
							String mid = wr.model2.getValueAt(i,0).toString();  //getValueAt 테이블에서 값을 읽어옴 , toString()-> object 형을 문자열 변환
							//(String)wr.model2.getValueAt(i, 0)
							if(mid.equals(id))
							{
								wr.model2.removeRow(i);  // i번째 줄 지우기
								break;	
							}
						}
						break;
						
					}
					case Function.MYEXIT:  // 실제 나가는 사람 처리
					{
						dispose(); // 메모리회수
						System.exit(0); // 프로그램 종료
						
					}
					case Function.MAKEROOM:
					{
						String[] data= {
								st.nextToken(),  //방이름 
								st.nextToken(),  //상태(공개/비공개)
								st.nextToken()   // 1/6
						};
						wr.model1.addRow(data);  //가변형이기 때문에 addrow할때마다 한개씩 추가됨.
						break;
						
						
					}
					case Function.ROOMIN:   // 내가 방에 있는 것. 내정보 처리
					{
						//messegeTo(Function.ROOMIN+"|"+room.roomName+"|"+id+"|"+sex+"|"+avata);
						myRoom=st.nextToken();
						String id = st.nextToken();
						String sex = st.nextToken();
						String avata = st.nextToken();
						String bang = st.nextToken();
						myId = id;     //해당 방 안에있는 id들..
						
						String temp="";
						if(sex.equals("남자"))
						{
							temp="m"+avata; //m1.png m2.png
	
						}
						else
						{
							temp = "w"+avata; //w1.png w2.png..
						}
						
						//화면 이동
						card.show(getContentPane(), "Game");  //R게임으로 이동해라
						
						
						for(int i=0; i<6;i++)
						{
							if(gr.sw[i]==false) // 빈공백이 false // false일때만 수행하게 만듬.
							{
								gr.sw[i]=true; //들어감
								gr.pans[i].removeAll(); // 패널위에 검정색 라벨들 올라간것을 지울 것임// 라벨위에 라벨은 안올라감.
								gr.pans[i].setLayout(new BorderLayout());
 							    gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon("c:\\image\\"+temp+"+.png"), 150, 120))));
 							    gr.pans[i].validate();   // 재배치  ==>  + removeAll() 항상 함께!
 							    gr.ids[i].setText(id);   // 텍스트필드에 아이디를 넣음.
 							    break;
								
							}
						}
						
						break;
					}
					case Function.ROOMADD:  // 상대방 정보를 출력해줌  // 방에 있는 상대방들을 처리할 수 있는....
					{
						
						String id = st.nextToken();
						String sex = st.nextToken();
						String avata = st.nextToken();
						String bang = st.nextToken();
						
						String temp="";
						if(sex.equals("남자"))
						{
							temp="m"+avata; //m1.png m2.png
	
						}
						else
						{
							temp = "w"+avata; //w1.png w2.png..
						}
						
						
						//화면 이동  // 이미 들어와있는 상태이기 때문에 화면이동 필요 x
					//	card.show(getContentPane(), "Game");  //R게임으로 이동해라
						
						
						for(int i=0; i<6;i++)
						{
							if(gr.sw[i]==false) // 빈공백이 false // false일때만 수행하게 만듬.
							{
								gr.sw[i]=true; //들어감
								gr.pans[i].removeAll(); // 패널위에 검정색 라벨들 올라간것을 지울 것임// 라벨위에 라벨은 안올라감.
								gr.pans[i].setLayout(new BorderLayout());
 							    gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon("c:\\image\\"+temp+"+.png"), 150, 120))));
 							    gr.pans[i].validate();   // 재배치  ==>  + removeAll() 항상 함께!
 							    gr.ids[i].setText(id);   // 텍스트필드에 아이디를 넣음.
 							    break;
								
							}
						}
						
						gr.box.addItem(id);
						
						
						
						break;
					}
					case Function.ROOMCHAT:
					{
						gr.ta.append(st.nextToken()+"\n");  // 입장 알림
						break;
						
					}
					case Function.WAITUPDATE:
					{
						/*
						 * messegeAll(Function.WAITUPDATE+"|"+room.roomName+"|"+room.current+"|"+room.maxcount+"|"+id+"|"+pos);
						 * 받아야되는 값 4개
						 */
						
						String rn=st.nextToken();
						String current = st.nextToken();
						String maxcount = st.nextToken();
						String id = st.nextToken();
						String pos = st.nextToken();
						
						//테이블에서 방찾기 // 같은 줄에 있으면 수정하라.
						for(int i=0; i<wr.model1.getRowCount();i++)
						{
							String roomName = wr.model1.getValueAt(i,0).toString();
							if(rn.equals(roomName)) //i번째와 같음
							{
								if(Integer.parseInt(current)==0)
								{
									wr.model1.removeRow(i);   // i번째 삭제
									
									
								}
								else
								{
									//현재인원한테 바꿔줌
									wr.model1.setValueAt(current+"/"+maxcount, i, 2);  // 그 위치에 값을 이걸로 바꿔라
									
								}
								break;
								
							}
							
							
						}
						// 접속자 목록 변경 
						// model2의 '위치'변경하기 - 뒤에들어오는 사람은 바뀌는데, 앞에 있던 사람을 바꿔줘야함.
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
						// 방에 있던 사람들한테는 아바타만 디폴트로 바꿔주기
						
						String id=st.nextToken();
						
						for(int i=0; i<6; i++)
						{
							String mid=gr.ids[i].getText();  //i번째와 같은 건 지우기
							
							if(id.equals(mid))
							{
								gr.sw[i]=false; // 
								gr.pans[i].removeAll(); // 패널위에 검정색 라벨들 올라간것을 지울 것임// 라벨위에 라벨은 안올라감.
								gr.pans[i].setLayout(new BorderLayout());
								gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 150, 120))));  //검은색으로 초기화
								gr.pans[i].validate();   // 재배치  ==>  + removeAll() 항상 함께!
								gr.ids[i].setText("");   // 공백으로 바꿔줌
								break;
								
							}
						}
						
				  		break;
						
					}
					case Function.MYROOMOUT:
					{
						//실제 나가는 사람 동작 => 창이 갱신되어야함--> 게임방에서 대기실로==>창을 대기실로 바꿔라 
						//방 객체는 한개를 이미 만들었기 때문에 다시 새로운 방에 들어갈 경우 값이 그대로 들어가 있음==> 따라서 새로운 방을 들어갈때마다 초기화 시켜줘야함
						//전역변수는 한번 생성되면 값이 안지워짐.==> 초기화해주기가 어렵다..
						
						//초기화= 아바타 /아이디 모두 지우기
						for(int i=0; i<6;i++)
						{	
							gr.sw[i]=false; // 
							gr.pans[i].removeAll(); // 패널위에 검정색 라벨들 올라간것을 지울 것임// 라벨위에 라벨은 안올라감.
							gr.pans[i].setLayout(new BorderLayout());
							gr.pans[i].add("Center",new JLabel(new ImageIcon(gr.getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 150, 120))));  //검은색으로 초기화
							gr.pans[i].validate();   // 재배치  ==>  + removeAll() 항상 함께!
							gr.ids[i].setText("");   // 공백으로 바꿔줌
						}
						
						gr.ta.setText("");
						gr.tf.setText("");
						card.show(getContentPane(), "WR");
						break;
						
					
						
						
					}
					case Function.KANG:
					{
						String rn = st.nextToken();  // 방이름 전송
						JOptionPane.showMessageDialog(this, rn+"방에서 강퇴되었습니다.");
						out.write((Function.ROOMOUT+"|"+rn+"\n").getBytes());   //서버 처리하러 고고
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

						  JOptionPane.showMessageDialog(this, "게임이 종료되었습니다");

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
 * 			break;        ==> 스위치 케이크 한 블럭안에 동일한 변수가 있으면 에러
 *		 }				 ==> 블럭을 케이스마다 줘서 블록변수로 사용해야한다.
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
			if(e.getClickCount()==2) //더블클릭 이벤트
			{
				//방이름 
				int row=wr.table1.getSelectedRow();  // 몇번째 줄을 선택했나? 선택한 줄 가져오기.
				String rn = wr.model1.getValueAt(row, 0).toString();     //칸 0번째 / 내가 클릭한 위치의 방번호 읽기, 방이름
				String inwon = wr.model1.getValueAt(row, 2).toString();  // 칸 2번째 /인원수 체크가 먼저 than state보다!!
				//String state = wr.model1.getValueAt(row, 1).toString();  // 칸 1번째 / 공개/ 비공개 체크 
				StringTokenizer st = new StringTokenizer(inwon,"/");
				
				// 1/5  ==> 자르기
				int no1= Integer.parseInt(st.nextToken());   // 1  
				int no2= Integer.parseInt(st.nextToken());   // 5
				if(no1==no2)  // 인원이 찬 상태
				{
					
					// 방에 들어갈 수 없다.
					JOptionPane.showMessageDialog(this, "이미 방이 찼습니다.\n다른 방을 선택하세요.");
					
					
				}else   // 방에 들어갈 수 있다 //인원이 차지 않은 상태 ==> 공개/비공개 여부 연결
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
