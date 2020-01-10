
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import java.awt.FlowLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.*;
public class GraphicTest extends JFrame implements ActionListener{

	 JLabel x1L, y1L, x2L, y2L, z1L, z2L;
	 JTextField x1T, y1T, x2T, y2T, z1T, z2T;
	 JCheckBox fill;
	 JRadioButton line, circle, rect, roundR, arc;
	 JButton draw; 
	 Canvas can;
	 JComboBox combo;
	 int x1, y1, x2, y2, z1, z2;
	
	public GraphicTest() {
		
		// super("간단 그림판");//setTitle("간단 그림판"); //super는 맨위쪽
		 //라벨
		  x1L = new JLabel("x1L"); 
		  y1L = new JLabel("y1L");
		  x2L = new JLabel("x2L");
		  y2L = new JLabel("y2L");
		  z1L = new JLabel("z1L");
		  z2L = new JLabel("z2L");
		  
		  //값넣는곳
		  x1T = new JTextField("100",4);
		  y1T = new JTextField("150",4);
		  x2T = new JTextField("200",4);
		  y2T = new JTextField("250",4);
		  z1T = new JTextField("80",4);
		  z2T = new JTextField("80",4);
		  
		  //체크박스
		  fill = new JCheckBox("채우기");
		  
		  //버튼
		  line = new JRadioButton("선");
		  circle = new JRadioButton("원");
		  rect = new JRadioButton("사각형", true);
		  roundR = new JRadioButton("둥근사각형");
		  arc = new JRadioButton("호");
		  
		  //버튼그룹 객체 생성
		  ButtonGroup bg = new ButtonGroup();
		  
		  
		  //버튼 그룹 생성된 것에서 
		  bg.add(line);
		  bg.add(circle);
		  bg.add(rect);
		  bg.add(roundR);
		  bg.add(arc);
		  
		  //그리기버튼
		  draw = new JButton("그리기"); 
		  
		  //캔버스객체 생성
		  can = new DrCanvas();
		  
		  //콤보박스 생성
		  String[] color = {"빨강", "초록", "파랑", "검정", "보라"};
		  combo = new JComboBox(color);
		  
		  
		  //패널 p 1개 생성
		  JPanel p = new JPanel(); //FlowLayout(순서배치)   
		  
		  //패널 p에 맨위 버튼들 추가
		  p.add(x1L); p.add(x1T);
		  p.add(y1L); p.add(y1T);
		  p.add(x2L); p.add(x2T);
		  p.add(y2L); p.add(y2T);
		  p.add(z1L); p.add(z1T);
		  p.add(z2L); p.add(z2T);
		  p.add(fill); 
		  
		  //패널 p2 1개 생성
		  JPanel p2 = new JPanel();
		  
		  //패널p2에  아래 버튼들 추가
		  p2.add(line);
		  p2.add(circle);
		  p2.add(rect);
		  p2.add(roundR);
		  p2.add(arc);
		  p2.add(combo);
		  p2.add(draw);
		  
		  
		  //프레임위에 p, p2, can를 배치하여 올림
		  getContentPane().add("North", p);
		  getContentPane().add("South", p2);
		  getContentPane().add("Center", can);
		  
		  
		  // 프레임 위치
		  setBounds(500,300,600,500);
		  // 보이게
		  setVisible(true);
		  // 프레임 위에 x버튼!
		  setDefaultCloseOperation(EXIT_ON_CLOSE);  
		  
		  
		  
		  //아래 p2에 있는 버튼들에  이번트 처리 줌
		  draw.addActionListener(this);
		  line.addActionListener(this);
		  circle.addActionListener(this);
		  rect.addActionListener(this);
		  roundR.addActionListener(this);
		  arc.addActionListener(this);    
		  
		  
		  
		  // 캔버스 can 객체에 마우스리스너 부착하기
		  can.addMouseListener(new MouseAdapter() {
			  
		   public void mousePressed(MouseEvent e) {
		    x1T.setText(String.valueOf(e.getX()));
		    y1T.setText(String.valueOf(e.getY()));
		    can.repaint();
		   }
		   
		  });
		  
		  can.addMouseMotionListener(new MouseMotionAdapter(){
		  
			  public void mouseDragged(MouseEvent e){
		    x2T.setText(String.valueOf(e.getX()));
		    y2T.setText(String.valueOf(e.getY()));
		    can.repaint();
		   }
			  
		  });
		  
		 }//GraphicTest( ) 생성자 끝!!!!
		 
		 //ActionListner override
		 public void actionPerformed(ActionEvent e){ 
		   can.repaint(); //update () -> paint() 순서로 호출
		 }
		 class DrCanvas extends Canvas {
		  public  DrCanvas() {
		   this.setBackground(new Color(255,255,100)); //바탕색 -연한노랑
		   setForeground(new Color(255,0,0));//글자색
		  }//DrCanvas( ) 
		  public void paint(Graphics g) {
		   //좌표 얻어오기
		   x1 = Integer.parseInt(x1T.getText().trim()); //trim - 앞뒤공백제거
		   y1 = Integer.parseInt(y1T.getText().trim());
		   x2 = Integer.parseInt(x2T.getText().trim());
		   y2 = Integer.parseInt(y2T.getText().trim());
		   z1 = Integer.parseInt(z1T.getText().trim());
		   z2 = Integer.parseInt(z2T.getText().trim());    
		   
		   //색
		   switch(combo.getSelectedIndex()) {
		    case 0: this.setForeground(new Color (255,0,0)); 
		     break;    
		    case 1: this.setForeground(new Color (0,255,0)); 
		     break;
		    case 2: this.setForeground(new Color (0,0,255)); 
		     break;
		    case 3: this.setForeground(new Color (0,0,0)); 
		     break;
		    case 4: this.setForeground(new Color (255,0,255)); 
		     break;
		   }//switch
		   int startX = x1 < x2 ? x1 : x2;
		   int startY = y1 < y2 ? y1 : y2;
		   int width = x1 < x2 ? x2-x1 : x1-x2;
		   int height = y1 < y2 ? y2-y1 : y1-y2;
		   //도형 그리기
		   if(fill.isSelected()) {  //채우기 선택
		    if(line.isSelected()) 
		     g.drawLine(x1, y1, x2, y2);
		    else if(circle.isSelected())
		     g.fillOval(startX, startY, width, height);
		    else if(rect.isSelected())
		     g.fillRect(startX, startY, width, height);
		    else if(roundR.isSelected())
		     g.fillRoundRect(startX, startY, width, height, z1, z2);
		    else if(arc.isSelected())
		     g.fillArc(startX, startY, width, height, z1, z2);
		   }else { //채우기 해제
		    if(line.isSelected()) 
		     g.drawLine(x1, y1, x2, y2);
		    else if(circle.isSelected())
		     g.drawOval(startX, startY, width, height);
		    else if(rect.isSelected())
		     g.drawRect(startX, startY, width, height);
		    else if(roundR.isSelected())
		     g.drawRoundRect(startX, startY, width, height, z1, z2);
		    else if(arc.isSelected())
		     g.drawArc(startX, startY, width, height, z1, z2);
		    
		   }//else   
		  
		  }//paint( )
		 
		 } //DrCanvas
		
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GraphicTest();
	}

}
