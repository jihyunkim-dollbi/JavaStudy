package com.sist.client;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import java.awt.*;
import javax.swing.table.*;



public class WaitRoom extends JPanel {

//	Image back;  
	
	JTable table1, table2;
	DefaultTableModel model1,model2;
	JTextArea tp;    //여러줄 입력가능한  ==> 아바타, 그림올리기 가능 
	JTextField tf;   // 한줄입력
	JButton b1, b2,b3, b4, b5, b6;
	
	//초기화 할것임
	WaitRoom(){
		
	//	setLayout(null);
    //    back = Toolkit.getDefaultToolkit().getImage("c:\\image\\background1.jpg"); 
		
		
		String[] col1 = {"방이름","공개/비공개", "인원 "};
		String[][] row1 =  new String[0][3];
		
		model1 =  new DefaultTableModel(row1, col1) {

			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;  //편집을 방지함 // 더블클릭하면 편집이 안되고 이벤트를 발생시킬수 있음.
			}
			
			
			
		}; // 상속이 오버라이딩 만듬
		
		table1 = new JTable(model1);
		JScrollPane js1 = new JScrollPane(table1);
		
		
		String[] col2 = {"ID","이름", "성별 ","위치"};
		String[][] row2 =  new String[0][4];
		model2 =  new DefaultTableModel(row2, col2);
		table2 = new JTable(model2);
		JScrollPane js2 = new JScrollPane(table2);
		
		
		setLayout(null);
		js1.setBounds(10,15,600,400);
		js2.setBounds(10,420,600,290);
		
		
		tp = new JTextArea();
		tf = new JTextField();
		b1 = new JButton("방만들기");
		b2 = new JButton("방들어가기");
		b3 = new JButton("쪽지보내기");
		b4 = new JButton("정보보기");
		b5 = new JButton("1대1 게임");
		b6 = new JButton("나가기");
		
		
		JScrollPane js3 = new JScrollPane(tp);
		js3.setBounds(615,15,380,400);
		
		
		tf.setBounds(615, 420, 380, 30);
		add(tf);
		
		
		JPanel p = new JPanel();
		p.setLayout(new GridLayout(2,1,5,5));
		p.add(b1);p.add(b6);
	//	p.add(b3);p.add(b4);
	//	p.add(b5);p.add(b6);
		
		p.setBounds(615, 460, 380, 240);
		add(p);
		add(js3);
		add(js1);
		add(js2);
		
	/*	
		String[] data = {"빨리와","공개","1/6"};
		model1.addRow(data);
		
	*/
		
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		
	//	g.drawImage(back, 0, 0, getWidth(), getHeight(), this); 
	}
		
	
	  public Image getImageSizeChange(ImageIcon icon,int width,int height)

      {

      	Image img=icon.getImage();

      	Image change=img.getScaledInstance(width, height, Image.SCALE_SMOOTH);

      	return change;

      }
	
	
}
