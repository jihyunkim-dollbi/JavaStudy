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
import javax.swing.JTextField;


public class Paint extends JFrame {

	
		// gui���� �гΰ�, �׷����� �г� �� 2���� �г��� �ִ�.
		JPanel gui_panel, paint_panel;

		// ����, ���찳 ���� ��ư
		JButton pencil_bt, eraser_bt, colorRed, colorBlue, colorGreen, colorYellow, colorPink, colorViolet, colorOrange, colorBrown;
		
		
				
		
		

		//������ ��ư
		JButton colorSelect_bt;

		//�������� ��
		JLabel thicknessInfo_label;

		//���� ���Ⱑ ������ �ؽ�Ʈ�ʵ�
		JTextField thicknessControl_tf;

		//�÷����� - �һ����� �����ִ� ������ �Ű������� ����Ѵ�.
		Color selectedColor;

		// Graphics2D Ŭ������ ����� ���� ����
		Graphics graphics;

		//Graphics2D�� ���� Graphics�� ��������
		Graphics2D g;

		//�׷����� ���� ���⸦ �����Ҷ� ���氪�� ����Ǵ� ����
		int thickness = 10;

		int startX;  // Ŭ�����۽ÿ� X��ǥ���� ����� ����
		int startY;  // Ŭ�����۽ÿ� Y��ǥ���� ����� ����
		int endX;    // Ŭ������ÿ� X��ǥ���� ����� ����
		int endY;    // Ŭ������ÿ� Y��ǥ���� ����� ����
	

	    boolean tf = false;
	    
	    

	    public Paint (){
	    //Paint Ŭ������ ����Ʈ(Default)�����ڷ� �⺻���� GUI ����, �����ϴ� �κ�.

	 
	    	//���� �������� ���̾ƿ��� �ʱ�ȭ��Ŵ - �츮�� ���� ���������ϰ���
	    	setLayout(null);
	

	    	//�������� Ÿ��Ʋ
	    	setTitle(" ");


	    	//������ ������
	    	setSize(880, 600);

	    	  	

	    	//������ X��ư ������ ����Ǵ� ���
	    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    	

	    	

	    	//�׸��� �������� �ö󰡴� ����
	    	gui_panel = new JPanel();
	
	    	//���ȭ���� �����
	    	gui_panel.setBackground(Color.WHITE);

	
	    	//��ġ������ ���� �õ��Ҽ� �ִ�.
	    	gui_panel.setLayout(null);
	    	

	    	//���� ��ư ����  --> ���Ŀ� ���� �׸����� ��������
	    	pencil_bt = new JButton(new ImageIcon("c:\\image\\black.jpg")); 
	    	
	    	pencil_bt.setBorderPainted(false);
	    	pencil_bt.setFocusPainted(false);
	    	pencil_bt.setContentAreaFilled(false);
	    	
	    	
	    	colorRed = new JButton(new ImageIcon("c:\\image\\red.jpg")); 
	    	
	    	colorRed.setBorderPainted(false);
	    	colorRed.setFocusPainted(false);
	    	colorRed.setContentAreaFilled(false);
	    	
	    	
	    	colorBlue = new JButton(new ImageIcon("c:\\image\\blue.jpg")); 
	    	
	    	colorBlue.setBorderPainted(false);
	    	colorBlue.setFocusPainted(false);
	    	colorBlue.setContentAreaFilled(false);
	    	
	    	colorGreen = new JButton(new ImageIcon("c:\\image\\green.jpg")); 
	    	
	    	colorGreen.setBorderPainted(false);
	    	colorGreen.setFocusPainted(false);
	    	colorGreen.setContentAreaFilled(false);
	    	
	    	colorYellow = new JButton(new ImageIcon("c:\\image\\yellow.jpg")); 
	    	
	    	colorYellow.setBorderPainted(false);
	    	colorYellow.setFocusPainted(false);
	    	colorYellow.setContentAreaFilled(false);
	    	
	    	
	    	colorPink = new JButton(new ImageIcon("c:\\image\\pink.jpg")); 
	    	
	    	colorPink.setBorderPainted(false);
	    	colorPink.setFocusPainted(false);
	    	colorPink.setContentAreaFilled(false);
	    	
	    	colorViolet = new JButton(new ImageIcon("c:\\image\\violet.jpg")); 
	    	
	    	colorViolet.setBorderPainted(false);
	    	colorViolet.setFocusPainted(false);
	    	colorViolet.setContentAreaFilled(false);
	    	
	    	colorOrange = new JButton(new ImageIcon("c:\\image\\orange.jpg")); 
	    	
	    	colorOrange.setBorderPainted(false);
	    	colorOrange.setFocusPainted(false);
	    	colorOrange.setContentAreaFilled(false);

	    	
	    	colorBrown = new JButton(new ImageIcon("c:\\image\\brown.jpg")); 
	    	
	    	colorBrown.setBorderPainted(false);
	    	colorBrown.setFocusPainted(false);
	    	colorBrown.setContentAreaFilled(false);

	    	
	    	
	    	
	    
	    	//���� ��ư�� �۾�ü�� ũ�� ����
	    //	pencil_bt.setFont(new Font("���ʷյ���",Font.BOLD, 15));
   	
	    	// ���� ��ư�� ���� 
	   // 	pencil_bt.setBackground(Color.WHITE);

	    	
	    	eraser_bt = new JButton(new ImageIcon("c:\\image\\eraser.jpg"));
	    	
	    	eraser_bt.setBorderPainted(false);
	    	eraser_bt.setFocusPainted(false);
	    	eraser_bt.setContentAreaFilled(false);

	    //	eraser_bt.setFont(new Font("���ʷյ���",Font.BOLD, 20));

	    	//���찳 ��ư�� ���� �������

	   // 	eraser_bt.setBackground(Color.WHITE);

	    	
	    	
	    	
	    	colorSelect_bt = new JButton("����");

	//    	colorSelect_bt.setFont(new Font("���ʷյ���",Font.BOLD, 20));

	  //  	colorSelect_bt.setBackground(Color.WHITE);


	    	colorSelect_bt.setBorderPainted(false);
	    	colorSelect_bt.setFocusPainted(false);
	    	colorSelect_bt.setContentAreaFilled(false);
  	

	    	thicknessInfo_label = new JLabel("����");

	    	thicknessInfo_label.setFont(new Font("���ʷյ���",Font.BOLD, 15));

	    	//���� ���� �Է� �ؽ�Ʈ â�ʵ� ����

	    	thicknessControl_tf = new JTextField("10", 5);

	    	thicknessControl_tf.setHorizontalAlignment(JTextField.CENTER);

	    	thicknessControl_tf.setFont(new Font("���ʷյ���",Font.BOLD, 20));

	
	    	
	   // 	colorRed, colorBlue, colorGreen, colorYellow, colorPink, colorViolet, colorOrange, colorBrown;
			
	    	//���ʹ�ư ��ġ����

	    	pencil_bt.setBounds(10, 10, 90, 50);
	    	colorRed.setBounds(80, 10, 90, 50);
	    	colorBlue.setBounds(150, 10, 90, 50);
	    	colorGreen.setBounds(220, 10, 90, 50);
	    	colorYellow.setBounds(290, 10, 90, 50);
	    	
	    	colorPink.setBounds(10, 50, 90, 50);
	    	colorViolet.setBounds(80, 50, 90, 50);
	    	colorOrange.setBounds(150, 50, 90, 50);
	    	colorBrown.setBounds(220, 50, 90, 50);

	    	

	    	//���찳 ��ġ����
	    	eraser_bt.setBounds(290, 50, 90, 50);

	    	

	    	//���� �� ��ġ ����
	    	colorSelect_bt.setBounds(600, 10, 90, 55);

	    	

	    	//�������� �� ��ġ ����
	    	thicknessInfo_label.setBounds(660, 10, 100, 55);

	    	

	    	//���� ���� ����Ʈ �ʵ� ��ġ ����
	    	thicknessControl_tf.setBounds(720, 10, 50, 35);

	    	// (500, 0, 880, 100)

	    	

	    

	    	gui_panel.add(pencil_bt); //gui_panel�� �����ʹ�ư �߰�
	    	gui_panel.add(colorRed);
	    	gui_panel.add(colorBlue);
	    	gui_panel.add(colorGreen);
	    	gui_panel.add(colorYellow);
	    	gui_panel.add(colorPink);
	    	gui_panel.add(colorViolet);
	    	gui_panel.add(colorOrange);
	    	gui_panel.add(colorBrown);
	    	
	    	
	    	gui_panel.add(eraser_bt);  //gui_panel��  ���찳 ��ư �߰�

	    	gui_panel.add(colorSelect_bt); //gui_panel�� ���� ��å �߰�

	    	gui_panel.add(thicknessInfo_label); //gui_panel�� ���� ���� �� �߰�

	    	gui_panel.add(thicknessControl_tf); // gui_panel�� �������� �ؽ�Ʈ�ʵ� �߰�


	    	
	    	

	    	gui_panel.setBounds(0, 450, 880, 150);  // gui_panel�� ������ ���� ��ġ�� ��ġ ����

	    	

	    	

	    	

	    	//  �г� ���� /////////////////////////////////////////////////////////////////

	    	

	    	// �׸��� �׷��� ��ȭ�� �г� ����

	    	paint_panel = new JPanel();

	    	

	    	paint_panel.setBackground(Color.WHITE); // �г��� �Ͼ� ����

	    	

	    	paint_panel.setLayout(null); // paint_panel�� ���̾ƿ��� null���ְ� �г� ��ü�� setBounds�� ��ġ�� ������ �� �ִ�.

	    	

	    	

	    	paint_panel.setBounds(0, 0, 880, 600);  //paint_panel �� ��ġ����



	    	

	    	

	    	//���� �����ӿ� �ΰ��� �г� �߰� - ��ġ�� ������ �� ��������

	    	add(gui_panel);

	    	add(paint_panel);

	    	

	    	//���� �������� ���̰� �Ѵ�.

	    	setVisible(true);

	    	

	    	graphics = getGraphics(); //�׷��� �ʱ�ȭ

	    	

	    	

	    	//������ graphics ������ 2D �� ��ȯ�� 2D�� �ʱ�ȭ��(2D�� ����ϴ� ������ ���� ����� ���õ� ����� �����ϱ� ����. 2DŬ������ ��üȭ��)

	    	g = (Graphics2D)graphics;

	    	

	    	// �׷��� ���� ������  selectedColor�� ������ ����

	    	g.setColor(selectedColor);

	    	

	    	

	    	// �׼�ó�� �κ�//////////////////////////////////////////////////////////////////////

	    	

	    	

	    	paint_panel.addMouseListener(new MouseListener(){



				@Override

				public void mouseClicked(MouseEvent e) {

					// TODO Auto-generated method stub

					//Ŭ�� �̺�Ʈ ó��

				}



				@Override

				public void mousePressed(MouseEvent e) {

					// TODO Auto-generated method stub

					

					startX = e.getX(); //���콺 �������� X��ǥ������ �ʱ�ȭ

					startY = e.getY(); //���콺 �������� Y��ǥ������ �ʱ�ȭ

					

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

	    	

	    	 

	    	 

	    	//paint_panel�� ���콺 ��Ǹ����� �߰�

	    	paint_panel.addMouseMotionListener(new PaintDraw());

	    	//���ʹ�ưó��

	    	pencil_bt.addActionListener(new ToolActionListener());

	    	//���찳 ��ư ó��

	    	eraser_bt.addActionListener(new ToolActionListener());

	    	

	    	colorSelect_bt.addActionListener(new ActionListener(){

	    		//�����ư �׼�ó���� �͸�Ŭ������ �ۼ�

	    		

	    		public void actionPerformed(ActionEvent e){

	    			

	    			tf = true;

	    			JColorChooser chooser = new JColorChooser();  // JColorChooserŬ���� ��üȭ

	    			

	    			selectedColor = chooser.showDialog(null, "Color", Color.ORANGE);

	    			//selectedColor�� ���õ� ������ �ʱ�ȭ

	    			

	    			g.setColor(selectedColor);

	    			// �׷����� ���� ������ selectedColor�� �Ű������� �Ͽ� ����

	    		

	    		}

	    		

	    	});

	    	

	    }

		

	    

	    public class PaintDraw implements MouseMotionListener{

	    	

	    	

	    	@Override

	    	public void mouseDragged(MouseEvent e){

	    		// paint_panel ���� ���콺 �巡�� �׼��� ó���� �� �޼ҵ� ����

	    		

	    		thickness = Integer.parseInt(thicknessControl_tf.getText());

	    		//�ؽ�Ʈ �ʵ� �κп��� ���� ������ thickness������ ����

	    		

	    		endX = e.getX(); //�巡�� �Ǵ� �������� x��ǥ ����

	    		

	    		endY = e.getY();  //�巡�� �Ǵ� �������� y��ǥ ����

	    		

	    		

	    		g.setStroke(new BasicStroke(thickness, BasicStroke.CAP_ROUND,0));

	    		

	    		g.drawLine(startX+10, startY+121, endX+10,endY +121);

	    		//������ �׷����� �Ǵ� �κ�

	    		

	    		startX = endX;   // ���ۺκ��� �������� �巹�׵� X��ǥ�� ������ ������ �̾� �׷��� �� �ִ�.

	    		

	    		startY = endY;    // ���ۺκ��� �������� �巹�׵� Y��ǥ�� ������ ������ �̾� �׷��� �� �ִ�.

	    		

	    	}

	    	

	    	@Override

	    	public void mouseMoved(MouseEvent e){

	    		

	    		

	    	}

	    	

	    	

	    }

		

		

		public class ToolActionListener implements ActionListener {

			

			

			public void actionPerformed(ActionEvent e){

				

				if(e.getSource() == pencil_bt){

					

					if(tf == false)g.setColor(Color.BLACK);

					

					else g.setColor(selectedColor);

					

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
