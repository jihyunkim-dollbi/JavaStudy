package com.sist.client;
import java.awt.*;


import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Canvas;

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
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;


import javax.swing.JPanel;

public class GameRoom extends JPanel{

	  JPanel[] pans=new JPanel[6];

	   JTextField[] ids=new JTextField[6];

	   JTextArea ta=new JTextArea();

	   JTextField tf=new JTextField();

	   JButton b1,b2,b3,b4,b5;
	   
	//   JPanel grSketch = new JPanel();
	   
	//   GrSketch sketchPanel = new GrSketch();
		

	   GameView games=new GameView();
	   
	   boolean[] sw = new boolean[6]; // ������� ã�´�.. ���� true(�ִ°���) ������ false(�����)   ==> false�� ���� ä����. ä������ true�� �ȴ�.
	   
	   
	   

	   public GameRoom()

	   {
		   
		   
		//    grSketch.setBounds(280, 15, 880, 600);

		//	grSketch.setBackground(Color.BLACK);
			
		//	grSketch.setLayout(null);
			
		//	sketchPanel.setBounds(0, 0, 880, 600);
			
		//	grSketch.add(sketchPanel);

		//	add(grSketch);
		   
		   
		   

		   for(int i=0;i<6;i++)

		   {

			   pans[i]=new JPanel();

			   pans[i].setBackground(Color.black);

			   ids[i]=new JTextField();
			   ids[i].setEnabled(false);

		   }

		   setLayout(null);

		   pans[0].setBounds(10, 15, 150,120 );

		   pans[0].setLayout(new BorderLayout());

		   pans[0].add("Center",new JLabel(new ImageIcon(getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 150, 120))));

		   ids[0].setBounds(10, 140, 150, 30);

		 //  ids[0].setEditable(false);

		//   ids[0].setText("��û��");

		   

		   pans[1].setBounds(10, 180, 150,120 );

		   pans[1].setLayout(new BorderLayout());

		   pans[1].add("Center",new JLabel(new ImageIcon(getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 150, 120))));

		   ids[1].setBounds(10, 305, 150, 30);

		//   ids[1].setEditable(false);

		//   ids[1].setText("�̼���");

		   

		   pans[2].setBounds(10, 345, 150,120 );

		   pans[2].setLayout(new BorderLayout());

		   pans[2].add("Center",new JLabel(new ImageIcon(getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 150, 120))));

		   ids[2].setBounds(10, 470, 150, 30);

		//   ids[2].setEditable(false);

		//   ids[2].setText("�ڹ���");

		   

		   pans[3].setBounds(850, 15, 150,120 );

		   pans[3].setLayout(new BorderLayout());

		   pans[3].add("Center",new JLabel(new ImageIcon(getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 150, 120))));

		   ids[3].setBounds(850, 140, 150, 30);

		//   ids[3].setEditable(false);

		//   ids[3].setText("������");

		   

		   pans[4].setBounds(850, 180, 150,120 );

		   pans[4].setLayout(new BorderLayout());

		   pans[4].add("Center",new JLabel(new ImageIcon(getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 150, 120))));

		   ids[4].setBounds(850, 305, 150, 30);

		 //  ids[4].setEditable(false);

		//   ids[4].setText("ȫ�浿");

		   

		   pans[5].setBounds(850, 345, 150,120 );

		   pans[5].setLayout(new BorderLayout());

		   pans[5].add("Center",new JLabel(new ImageIcon(getImageSizeChange(new ImageIcon("c:\\image\\def.png"), 150, 120))));

		   ids[5].setBounds(850, 470, 150, 30);

		//   ids[5].setEditable(false);

		//   ids[5].setText("�Ҽ���");

		   

		   for(int i=0;i<6;i++)

		   {

			   add(pans[i]);

			   add(ids[i]);

		   }
		   
		   
		   
		   
		   
		   
		   

		   

		  //  games.setBackground(Color.white);

		   games.setBounds(170, 15, 670, 485);

		   add(games);

		   

		   JScrollPane js=new JScrollPane(ta);

		   js.setBounds(10, 510, 830, 180);

		   add(js);

		   

		   tf.setBounds(10, 695, 830, 30);

		   add(tf);

		   

		   b1=new JButton("�ʴ��ϱ�");

		   b2=new JButton("�����ϱ�");

		   b3=new JButton("�����غ�");

		   b4=new JButton("���ӽ���");

		   b5=new JButton("������");

		   

		   JPanel p=new JPanel();

		   p.setLayout(new GridLayout(5,1,5,5));

		   p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);

		   p.setBounds(850, 510, 150, 210);

		   add(p);

	   }

	   public Image getImageSizeChange(ImageIcon icon,int width,int height)   //  ����ũ�⸦ �г�ũ�⿡ �� �°� ������ش�.

	   {

	   	Image img=icon.getImage();

	   	Image change=img.getScaledInstance(width, height, Image.SCALE_SMOOTH);

	   	return change;

	   }
	
	
	
	
	
}
