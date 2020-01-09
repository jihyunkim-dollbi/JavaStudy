import java.awt.BasicStroke;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;


public class Paint extends JFrame {

	
		// gui구성 패널과, 그려지는 패널 총 2개의 패널이 있다.
		JPanel gui_panel, paint_panel;

		// 연필, 지우개 선택 버튼
		JButton pencil_bt, eraser_bt, colorRed, colorBlue, colorGreen, colorYellow, colorPink, colorViolet, colorOrange, colorBrown;
		
		JButton allClear;
				
		
		

		//색선택 버튼
		JButton colorSelect_bt;

		//도구굵기 라벨
		JLabel thicknessInfo_label;
		
	

		//도구 굵기가 정해질 텍스트필드
		JTextField thicknessControl_tf;

		//도구 굵기가 정해질 슬라이더
		JSlider thicknessControl_slider;
		
		
		//컬러변수 - 팬색상을 정해주는 변수의 매개변수로 사용한다.
		Color selectedColor;

		// Graphics2D 클래스의 사용을 위해 선언
		Graphics graphics;

		//Graphics2D는 기존 Graphics의 상위버전
		Graphics2D g;

		//그려지는 선의 굵기를 변경할때 변경값이 저장되는 변수
		int thickness = 10;

		int startX;  // 클릭시작시에 X좌표값이 저장될 변수
		int startY;  // 클릭시작시에 Y좌표값이 저장될 변수
		int endX;    // 클릭종료시에 X좌표값이 저장될 변수
		int endY;    // 클릭종료시에 Y좌표값이 저장될 변수
	

	    boolean tf = false;
	    
	    

	    public Paint (){
	    //Paint 클래스의 디폴트(Default)생성자로 기본적인 GUI 구성, 조립하는 부분.

	 
	    	//기존 프레임의 레이아웃을 초기화시킴 - 우리가 직접 수정가능하게함
	    	setLayout(null);
	

	    	//프레임의 타이틀
	    	setTitle(" ");


	    	//프레임 사이즈
	    	setSize(880, 600);

	    	  	

	    	//프레임 X버튼 누르면 종료되는 기능
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    	

	    	

	    	//그림판 도구들이 올라가는 공간
	    	gui_panel = new JPanel();
	
	    	//배경화면은 노란색
	    	gui_panel.setBackground(Color.WHITE);

	
	    	//위치지정을 직접 시도할수 있다.
	    	gui_panel.setLayout(null);
	    	

	    	//연필 버튼 생성  --> 추후에 연필 그림으로 수정예정
	    	pencil_bt = new JButton(new ImageIcon("c:\\image\\black1.jpg")); 
	    	
	    	pencil_bt.setBorderPainted(false);
	    	pencil_bt.setFocusPainted(false);
	    	pencil_bt.setContentAreaFilled(false);
	    	
	    	
	    	colorRed = new JButton(new ImageIcon("c:\\image\\red1.jpg")); 
	    	
	    	colorRed.setBorderPainted(false);
	    	colorRed.setFocusPainted(false);
	    	colorRed.setContentAreaFilled(false);
	    	
	    	
	    	colorBlue = new JButton(new ImageIcon("c:\\image\\blue1.jpg")); 
	    	
	    	colorBlue.setBorderPainted(false);
	    	colorBlue.setFocusPainted(false);
	    	colorBlue.setContentAreaFilled(false);
	    	
	    	colorGreen = new JButton(new ImageIcon("c:\\image\\green1.jpg")); 
	    	
	    	colorGreen.setBorderPainted(false);
	    	colorGreen.setFocusPainted(false);
	    	colorGreen.setContentAreaFilled(false);
	    	
	    	colorYellow = new JButton(new ImageIcon("c:\\image\\yellow1.jpg")); 
	    	
	    	colorYellow.setBorderPainted(false);
	    	colorYellow.setFocusPainted(false);
	    	colorYellow.setContentAreaFilled(false);
	    	
	    	
	    	colorPink = new JButton(new ImageIcon("c:\\image\\pink1.jpg")); 
	    	
	    	colorPink.setBorderPainted(false);
	    	colorPink.setFocusPainted(false);
	    	colorPink.setContentAreaFilled(false);
	    	
	    	colorViolet = new JButton(new ImageIcon("c:\\image\\violet1.jpg")); 
	    	
	    	colorViolet.setBorderPainted(false);
	    	colorViolet.setFocusPainted(false);
	    	colorViolet.setContentAreaFilled(false);
	    	
	    	colorOrange = new JButton(new ImageIcon("c:\\image\\orange1.jpg")); 
	    	
	    	colorOrange.setBorderPainted(false);
	    	colorOrange.setFocusPainted(false);
	    	colorOrange.setContentAreaFilled(false);

	    	
	    	colorBrown = new JButton(new ImageIcon("c:\\image\\brown1.jpg")); 
	    	
	    	colorBrown.setBorderPainted(false);
	    	colorBrown.setFocusPainted(false);
	    	colorBrown.setContentAreaFilled(false);

	    	
	    	
	    	
	    
	    //  연필 버튼의 글씨체와 크기 지정
	    //	pencil_bt.setFont(new Font("함초롱돋움",Font.BOLD, 15));
   	
	    	// 연필 버튼의 배경색 
	   // 	pencil_bt.setBackground(Color.WHITE);

	    	
	    	eraser_bt = new JButton(new ImageIcon("c:\\image\\eraser.jpg"));
	    	
	    	eraser_bt.setBorderPainted(false);
	    	eraser_bt.setFocusPainted(false);
	    	eraser_bt.setContentAreaFilled(false);

	    //	eraser_bt.setFont(new Font("함초롱돋움",Font.BOLD, 20));

	    	//지우개 버튼의 배경색 흰색으로

	   // 	eraser_bt.setBackground(Color.WHITE);

	    	
	    	
	    	
	    	
	    	allClear = new JButton("ALL");
	    	allClear.setFont(new Font("함초롱돋움",Font.BOLD, 17));
	    
	    	
	    	
	    	colorSelect_bt = new JButton("색상");

	    	colorSelect_bt.setFont(new Font("함초롱돋움",Font.BOLD, 17));

	  //  	colorSelect_bt.setBackground(Color.WHITE);


	    //	colorSelect_bt.setBorderPainted(false);
	    //	colorSelect_bt.setFocusPainted(false);
	    //	colorSelect_bt.setContentAreaFilled(false);
  	

	    	thicknessInfo_label = new JLabel("크기");

	    	thicknessInfo_label.setFont(new Font("함초롱돋움",Font.BOLD, 15));

	    	
	    	
	    	//도구 굵기 입력 텍스트 창필드 생성

	    	thicknessControl_tf = new JTextField("15", 10);

	    	thicknessControl_tf.setHorizontalAlignment(JTextField.CENTER);

	    	thicknessControl_tf.setFont(new Font("함초롱돋움",Font.BOLD, 20));
	   // 	thicknessControl_tf.setBorderPainted(false);
	   //	thicknessControl_tf.setFocusPainted(false);
		    
	   //	thicknessControl_tf.setContentAreaFilled(false);
	  	
	
	    	
	   // 	colorRed, colorBlue, colorGreen, colorYellow, colorPink, colorViolet, colorOrange, colorBrown;
			
	    	//연필버튼 위치지정

	    	pencil_bt.setBounds(30, 0, 80, 50);
	    	colorRed.setBounds(110, 0, 80, 50);
	    	colorBlue.setBounds(190, 0, 80, 50);
	    	colorGreen.setBounds(270, 0, 80, 50);
	    	colorYellow.setBounds(350, 0, 80, 50);
	    	
	    	allClear.setBounds(440, 0, 70, 55);
	    
	    	colorPink.setBounds(30, 55, 80, 50);
	    	colorViolet.setBounds(110, 55, 80, 50);
	    	colorOrange.setBounds(190, 55, 80, 50);
	    	colorBrown.setBounds(270, 55, 80, 50);


	    	//지우개 위치지정
	    	eraser_bt.setBounds(350, 50, 90, 50);

	    	

	    	//색상 라벨 위치 지정
	    	colorSelect_bt.setBounds(530, 0, 70, 55);

	    	

	    	//도구굵기 라벨 위치 지정
	    	thicknessInfo_label.setBounds(630, 0, 80, 55);

	    	

	    	//도구 굻기 덱스트 필드 위치 지정
	    	thicknessControl_tf.setBounds(670, 0, 70, 55);

	    	// (500, 0, 880, 100)

	    	

	    
	    	//gui_panel에 색연필버튼 추가
	    	gui_panel.add(pencil_bt); 
	    	gui_panel.add(colorRed);
	    	gui_panel.add(colorBlue);
	    	gui_panel.add(colorGreen);
	    	gui_panel.add(colorYellow);
	    	gui_panel.add(allClear);
	    	gui_panel.add(colorPink);
	    	gui_panel.add(colorViolet);
	    	gui_panel.add(colorOrange);
	    	gui_panel.add(colorBrown);
	    	
	    	
	    	gui_panel.add(eraser_bt);  //gui_panel에  지우개 버튼 추가

	    	gui_panel.add(colorSelect_bt); //gui_panel에 색상 선택 추가

	    	gui_panel.add(thicknessInfo_label); //gui_panel에 도구 굵기 라벨 추가

	    	gui_panel.add(thicknessControl_tf); // gui_panel에 도구굵기 텍스트필드 추가


	    	
	    	

	    	gui_panel.setBounds(0, 450, 880, 150);  // gui_panel이 프레임 위에 배치될 위치 지정

	    	

	    	

	    	

	    	//  패널 구분 /////////////////////////////////////////////////////////////////

	    	

	    	// 그림이 그려질 도화지 패널 생성

	    	paint_panel = new JPanel();

	    	paint_panel.setBackground(Color.WHITE); // 패널의 하얀 배경색
	

	    	paint_panel.setLayout(null); // paint_panel의 레이아웃을 null해주고 패널 자체를 setBounds로 위치를 조정할 수 있다.

	    	paint_panel.setBounds(0, 0, 880, 450);  //paint_panel 의 위치조정



	    	

	    	

	    	//메인 프레임에 두개의 패널 추가 - 위치는 위에서 다 쟁해줬음

	    	add(gui_panel);

	    	add(paint_panel);

	    	

	    	//메인 프레임을 보이게 한다.

	    	setVisible(true);

	    	
	    	

    		
    		

	    	

	
	    	
	    	

	    	// 액션처리 부분//////////////////////////////////////////////////////////////////////

	  
	    	paint_panel.addMouseListener(new MouseListener(){


	    		
	    		
	    		

				@Override

				public void mouseClicked(MouseEvent e) {

					// TODO Auto-generated method stub

					//클릭 이벤트 처리

				}



				@Override

				public void mousePressed(MouseEvent e) {

					// TODO Auto-generated method stub
					
					startX = e.getX(); //마우스 눌렀을때 X좌표값으로 초기화
					startY = e.getY(); //마우스 눌렀을때 Y좌표값으로 초기화

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

	    		   		

	    	});

	    	

	    	paint_panel.getGraphics();

    	  	graphics = getGraphics(); //그래픽 초기화

	    	
	    	//기존의 graphics 변수를 2D 로 변환후 2D에 초기화함(2D를 사용하는 이유는 선의 굵기와 관련된 기능을 수행하기 위해. 2D클래스를 객체화함)

	    	g = (Graphics2D)graphics;


	    	// 그려질 선의 색상을  selectedColor의 값으로 설정

	    	g.setColor(selectedColor);
	    	
	    	
	    	
	    	
	    	 

	    	 

	    	//paint_panel에 마우스 모션리스너 추가

	    	paint_panel.addMouseMotionListener(new PaintDraw());

	    	//색연필버튼처리
			
	    	pencil_bt.addActionListener(new ToolActionListener());
	    	
	    	colorRed.addActionListener(new ToolActionListener());
	    	colorBlue.addActionListener(new ToolActionListener());
	    	colorGreen.addActionListener(new ToolActionListener());
	    	colorYellow.addActionListener(new ToolActionListener());
	    	allClear.addActionListener(new ToolActionListener());
	    	
	    	colorPink.addActionListener(new ToolActionListener());
	    	colorViolet.addActionListener(new ToolActionListener());
	    	colorOrange.addActionListener(new ToolActionListener());
	    	colorBrown.addActionListener(new ToolActionListener());
	    	
	    	
	    	//지우개 버튼 처리

	    	eraser_bt.addActionListener(new ToolActionListener());

	    	

	    	colorSelect_bt.addActionListener(new ActionListener(){

	    		//색상버튼 액션처리를 익명클래스로 작성

	    		

	    		public void actionPerformed(ActionEvent e){

	    			

	    			tf = true;

	    			JColorChooser chooser = new JColorChooser();  // JColorChooser클래스 객체화

	    			

	    			selectedColor = chooser.showDialog(null, "Color", Color.ORANGE);

	    			//selectedColor에 선택된 색으로 초기화

	    			

	    			g.setColor(selectedColor);
	    			

	    			// 그려지는 펜의 색상을 selectedColor를 매개변수로 하여 지정
	  			
	    		
	    		}

	    	});

	    }

		

	    

	    public class PaintDraw implements MouseMotionListener{

	    	

	    	

	    	@Override

	    	public void mouseDragged(MouseEvent e){

	    		// paint_panel 에서 마우스 드래그 액션이 처리될 때 메소드 실행

	    		

	    		thickness = Integer.parseInt(thicknessControl_tf.getText());

	    		//텍스트 필드 부분에서 값을 가져와 thickness변수에 대입

	    		

	    		endX = e.getX(); //드래그 되는 시점에서 x좌표 저장

	    		

	    		endY = e.getY();  //드래그 되는 시점에서 y좌표 저장

	    	
	    		g.setStroke(new BasicStroke(thickness, BasicStroke.CAP_ROUND,0));

	    		g.drawLine(startX+5, startY+25, endX+5 ,endY+25);

	    		//라인이 그려지게 되는 부분

	    		

	    		startX = endX;   // 시작부분이 마지막에 드레그된 X좌표로 찍혀야 다음에 이어 그려질 수 있다.

	    		startY = endY;    // 시작부분이 마지막에 드레그된 Y좌표로 찍혀야 다음에 이어 그려질 수 있다.

	    		

	    	}

	    	

	    	@Override

	    	public void mouseMoved(MouseEvent e){

	    	}
    	

	    }

		
//     	colorRed, colorBlue, colorGreen, colorYellow, colorPink, colorViolet, colorOrange, colorBrown;

		

		public class ToolActionListener implements ActionListener {

		
			public void actionPerformed(ActionEvent e){

				if(e.getSource() == pencil_bt){

			//		if(tf == false) g.setColor(Color.BLACK);
			//		else g.setColor(selectedColor);
					g.setColor(Color.BLACK);
					

				}else if(e.getSource() == colorRed){

				//	if(tf == false) g.setColor(Color.RED);
				//	else g.setColor(selectedColor);
					g.setColor(Color.RED);
					

				}else if(e.getSource() == colorBlue){

			//		if(tf == false) g.setColor(Color.BLUE);
			//		else g.setColor(selectedColor);
					g.setColor(Color.BLUE);

				}else if(e.getSource() == colorGreen){

				//	if(tf == false) g.setColor(Color.GREEN);
				//	else g.setColor(selectedColor);
					g.setColor(Color.GREEN);

				}else if(e.getSource() == colorYellow){

				//	if(tf == false) g.setColor(Color.YELLOW);
				//	else g.setColor(selectedColor);
					g.setColor(Color.YELLOW);
					

				}else if(e.getSource() == colorPink){

				//	if(tf == false) g.setColor(Color.PINK);
				//	else g.setColor(selectedColor);
					g.setColor(Color.PINK);


				}else if(e.getSource() == colorViolet){

				//	if(tf == false) g.setColor(Color.MAGENTA);
				//	else g.setColor(selectedColor);
					g.setColor(Color.MAGENTA);


				}else if(e.getSource() == colorOrange){

				//	if(tf == false) g.setColor(Color.ORANGE);
				//	else g.setColor(selectedColor);
					
					g.setColor(new Color(255,130,51));


				}else if(e.getSource() == colorBrown){

				//	if(tf == false) g.setColor(Color.getHSBColor(153, 102, 51));
				//	else g.setColor(selectedColor);
					g.setColor(new Color(194,113,81));

				}else if(e.getSource() == allClear){

				
				    g.setColor(Color.white);
					g.fillRect(0, 0, 880, 482);
					

				}else if(e.getSource() == eraser_bt){


					g.setColor(Color.WHITE);

				}


			}

			
		}

		

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Paint();
		
	}

}
