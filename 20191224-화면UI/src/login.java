import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel; //윈도우와 관련된 class 모음
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*	 단일상속? 
 *   JFrame -> 크게 작게 끄기
 *   JPanel  -> 화면 카테고리-> 바꿀때 -> 클릭할때마다 화면 변경(매뉴). 
 *              윈도우 창을 끄지 않아도 된다. 패널 여러개을 위도창 하나에 올려줌. 
 *              1. CARDLAYOUT! 
 *              2. TAB(TAB당 )으로 만들수도 있다.
 *              3. SPLIT PAN(이벤트)
 *              4. INTERAL FRAME => 창안에 또 다른 창 만들기 => EXCEL.....
 *              
 *                  
 *   JWindow  -> 실행창 
 *   JDialog  ->MODAL 1. 파일저장시 생성되는 창!최대화 최소화버튼 x -> 닫기버튼만 있다. modal => 이 창을 종료전까지 다른 실행을 못함.(아이디 중복체크할때)
 *   			MODALIS? 2. ctrl+F => REPLACE창 뜬다 => 다른 수행 가능 
 * 
 *   오른쪽 클릭 = SOURCE => COMPONANT -> PAINTCOMPONANT @Override
 *   
 *   new 생성자로 초기값을 주어 구현을 할 수도 있다.
 */
import java.awt.*; //윈도우와 관련된 class 모음
public class login extends JPanel {              // 구현이 안되는 선언부 이기때문에. 클래스는 무조건 선언만 하는 곳. --> 따라서 구현부는 메소드 안에 있어야 함.

	Image back;   // 블럭을 열고 닫으면 초기값을 주는데 그림을 가져와 클래스 안에서 구현할 수도 있다. 초기화블럭: 선언된 변수의 초기화하는 곳
	// Login login = new Login()  ==> 리턴형을 붙이면 안됨, 안붙이면 자동호출하는 생성자가됨?
	
	JLabel la1, la2;       //==> 선언함! new 생성하여 사용!
	JTextField tf;         //id 표기란
	JPasswordField pf;     //pw표기란
	JButton b1,b2;         //로그인 하기 버튼
	
	// 7개의 변수! 사용자 정의 한 변수들.
	
	login(){  // 생성자 함수 에서 화면을 다 띄워야 호출할때 가져올 수 있음.
		
				setLayout(null);
		        back = Toolkit.getDefaultToolkit().getImage("c:\\image\\background.jpg"); 
	
		        la1 = new JLabel("ID", JLabel.RIGHT);
		        la1.setForeground(Color.white);   // 글자색 바꾸기.
		        la2 = new JLabel("Password", JLabel.RIGHT);
		        la2.setForeground(Color.white);
		        
		        tf = new JTextField();
		        pf = new JPasswordField();
		        
		        b1 = new JButton("로그인");
		        b2 = new JButton("취소");
		        
		        
		        // 배치하기
		        	
		        la1.setBounds(390, 330,80,30);   // 내가 원하는 위치에 놓기
		        tf.setBounds(475,330,150,30);  
		        // setBounds
		        
		      	
		        la2.setBounds(390, 365,80,30);   
		        pf.setBounds(475,365,150,30);  
		        
		        JPanel p = new JPanel();
		        p.setBounds(390,405,235,35);
		        p.setOpaque(false);
		        
		        p.add(b1);
		        p.add(b2);
		        
		        add(la1);
		        add(tf);
		        
		        add(la2);
		        add(pf);
		        add(p);
		               	                
		   }
		
	
	@Override
	protected void paintComponent(Graphics g) {    //g 에서 수정 가능하다.  // paintComponent위도우 창에서 스킨 입힐때.
		 //오른쪽 클릭 = SOURCE => COMPONANT -> PAINTCOMPONANT @Override 만들기.
		
		
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);      // getWidth(), getHeight() 실제크기// observer:어디에 그릴 것인가? 여기에.
		
		
		
	}  
  
}
