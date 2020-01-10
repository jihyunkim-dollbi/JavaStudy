
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
		
		// super("���� �׸���");//setTitle("���� �׸���"); //super�� ������
		 //��
		  x1L = new JLabel("x1L"); 
		  y1L = new JLabel("y1L");
		  x2L = new JLabel("x2L");
		  y2L = new JLabel("y2L");
		  z1L = new JLabel("z1L");
		  z2L = new JLabel("z2L");
		  
		  //���ִ°�
		  x1T = new JTextField("100",4);
		  y1T = new JTextField("150",4);
		  x2T = new JTextField("200",4);
		  y2T = new JTextField("250",4);
		  z1T = new JTextField("80",4);
		  z2T = new JTextField("80",4);
		  
		  //üũ�ڽ�
		  fill = new JCheckBox("ä���");
		  
		  //��ư
		  line = new JRadioButton("��");
		  circle = new JRadioButton("��");
		  rect = new JRadioButton("�簢��", true);
		  roundR = new JRadioButton("�ձٻ簢��");
		  arc = new JRadioButton("ȣ");
		  
		  //��ư�׷� ��ü ����
		  ButtonGroup bg = new ButtonGroup();
		  
		  
		  //��ư �׷� ������ �Ϳ��� 
		  bg.add(line);
		  bg.add(circle);
		  bg.add(rect);
		  bg.add(roundR);
		  bg.add(arc);
		  
		  //�׸����ư
		  draw = new JButton("�׸���"); 
		  
		  //ĵ������ü ����
		  can = new DrCanvas();
		  
		  //�޺��ڽ� ����
		  String[] color = {"����", "�ʷ�", "�Ķ�", "����", "����"};
		  combo = new JComboBox(color);
		  
		  
		  //�г� p 1�� ����
		  JPanel p = new JPanel(); //FlowLayout(������ġ)   
		  
		  //�г� p�� ���� ��ư�� �߰�
		  p.add(x1L); p.add(x1T);
		  p.add(y1L); p.add(y1T);
		  p.add(x2L); p.add(x2T);
		  p.add(y2L); p.add(y2T);
		  p.add(z1L); p.add(z1T);
		  p.add(z2L); p.add(z2T);
		  p.add(fill); 
		  
		  //�г� p2 1�� ����
		  JPanel p2 = new JPanel();
		  
		  //�г�p2��  �Ʒ� ��ư�� �߰�
		  p2.add(line);
		  p2.add(circle);
		  p2.add(rect);
		  p2.add(roundR);
		  p2.add(arc);
		  p2.add(combo);
		  p2.add(draw);
		  
		  
		  //���������� p, p2, can�� ��ġ�Ͽ� �ø�
		  getContentPane().add("North", p);
		  getContentPane().add("South", p2);
		  getContentPane().add("Center", can);
		  
		  
		  // ������ ��ġ
		  setBounds(500,300,600,500);
		  // ���̰�
		  setVisible(true);
		  // ������ ���� x��ư!
		  setDefaultCloseOperation(EXIT_ON_CLOSE);  
		  
		  
		  
		  //�Ʒ� p2�� �ִ� ��ư�鿡  �̹�Ʈ ó�� ��
		  draw.addActionListener(this);
		  line.addActionListener(this);
		  circle.addActionListener(this);
		  rect.addActionListener(this);
		  roundR.addActionListener(this);
		  arc.addActionListener(this);    
		  
		  
		  
		  // ĵ���� can ��ü�� ���콺������ �����ϱ�
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
		  
		 }//GraphicTest( ) ������ ��!!!!
		 
		 //ActionListner override
		 public void actionPerformed(ActionEvent e){ 
		   can.repaint(); //update () -> paint() ������ ȣ��
		 }
		 class DrCanvas extends Canvas {
		  public  DrCanvas() {
		   this.setBackground(new Color(255,255,100)); //������ -���ѳ��
		   setForeground(new Color(255,0,0));//���ڻ�
		  }//DrCanvas( ) 
		  public void paint(Graphics g) {
		   //��ǥ ������
		   x1 = Integer.parseInt(x1T.getText().trim()); //trim - �յڰ�������
		   y1 = Integer.parseInt(y1T.getText().trim());
		   x2 = Integer.parseInt(x2T.getText().trim());
		   y2 = Integer.parseInt(y2T.getText().trim());
		   z1 = Integer.parseInt(z1T.getText().trim());
		   z2 = Integer.parseInt(z2T.getText().trim());    
		   
		   //��
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
		   //���� �׸���
		   if(fill.isSelected()) {  //ä��� ����
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
		   }else { //ä��� ����
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
