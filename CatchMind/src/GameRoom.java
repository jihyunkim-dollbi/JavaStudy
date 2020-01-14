
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;

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
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;






public class GameRoom extends JPanel {



	/*
	 * �����������
	 *  1. ����ġ��(�ķ�Ʈ ����) : ���� 
	 *  2. �����г�(ĳ����/ID/LV/�濡�� �����������) : ��ȣ 
	 *  3. ����ǥ�ñ� : ��ȣ
	 *  4. ����ǥ�ñ� : ��ȣ 
	 *  5. ������ڼ�ǥ�ñ� :��ȣ 
	 *  6. ä�� : ȫ�� 
	 *  7. Ÿ�̸�(�ð�) : ȫ�� 
	 *  8. ����ġ�� : ��ȣ (�ǽð�)
	 *  9. �����غ� : ȫ�� 
	 *  10. �����ʴ� : ȫ�� 
	 *  11. ģ���߰� : ȫ�� 
	 *  12. ������ : ȫ��
	 */



	JPanel grSketch = new JPanel();
	JPanel[] userPanel = new JPanel[6];
	JPanel exp = new JPanel();
	JPanel timer = new JPanel();
	JPanel turn = new JPanel();
	JPanel answer = new JPanel();
	JPanel round = new JPanel();
	JButton[] b = new JButton[4];
	JPanel p = new JPanel();
	JTextField tf;
	JProgressBar jb;
	GrSketch sketchPanel = new GrSketch();
	
	GameRoom() {


	
		setLayout(null);	

//1. ����ġ��		

		grSketch.setBounds(280, 15, 880, 600);

		grSketch.setBackground(Color.BLACK);
		
		grSketch.setLayout(null);
		
		sketchPanel.setBounds(0, 0, 880, 600);
		
		grSketch.add(sketchPanel);

		add(grSketch);

		

//2. �����г�		

	    for (int i = 0; i < 6; i++) {

			userPanel[i] = new JPanel();

			userPanel[i].setBackground(Color.BLACK);

		}

		

		for (int i = 0; i < 3; i++) {

			userPanel[i].setLayout(null);

			userPanel[i].setBounds(15, 15 + (205 * i), 250, 190);

			add(userPanel[i]);

			

			userPanel[3+i].setLayout(null);

			userPanel[3+i].setBounds(1175, 15 + (205 * (i)), 250, 190);

			add(userPanel[3+i]);

		}

		

	/*	for (int i = 3; i < 6; i++) {

			userPanel[i].setLayout(null);

			userPanel[i].setBounds(1175, 15 + (205 * (i - 3)), 250, 190);

			add(userPanel[i]);

			}

	*/	

		

//3.����ǥ�ñ�

		timer.setBounds(15, 630, 250, 150);

		timer.setBackground(Color.gray);

		add(timer);

		

//4.����ǥ�ñ�

		turn.setBounds(280, 630, 250, 105);

		turn.setBackground(Color.pink);

		add(turn);

		

//5.������ڼ�ǥ�ñ�		

		answer.setBounds(545, 630, 250, 105);

		answer.setBackground(Color.yellow);

		add(answer);

		

//7.Ÿ�̸�		

		round.setBounds(810, 630, 350, 70);

		round.setBackground(Color.blue);

		add(round);

		

//6.ä��	

		tf = new JTextField();

		tf.setBounds(810, 710, 350, 30);

		add(tf);

		

//8.����ġ��

		jb = new JProgressBar(0,100);

		jb.setBounds(280, 750, 880, 30);

		jb.setValue(0);

		jb.setStringPainted(true);

		add(jb);

		

//��ư		

		    

		p.setLayout(new GridLayout(4, 1, 0, 10)); //ĭ ĭ�� ���� �¿찣�� ���Ʒ����� 

		p.setBounds(1175, 630, 250, 150);

		add(p);

		

		for(int i=0; i<1; i++) {

			b[i] = new JButton("�����غ�");

			b[i+1] = new JButton("�����ʴ�");

			b[i+2] = new JButton("ģ���߰�");

			b[i+3] = new JButton("������");

		}



		for (int i=0;i<1;i++)

		{   /* b1. �����غ� 

			 * b2. �����ʴ�

			 * b3. ģ���߰�

			 * b4. ������

			 */

			p.add(b[i]);      b[i].setBackground(Color.white);		

			p.add(b[i+1]);    b[i+1].setBackground(Color.white);

			p.add(b[i+2]);    b[i+2].setBackground(Color.white);

			p.add(b[i+3]);    b[i+3].setBackground(Color.white);

		}

		

// ��

		Label[] label = new Label[24];	

		

		for (int i = 0; i < 6; i++) {

			label[i] = new Label("�ƹ�Ÿ");			

			label[i].setBounds(10, 15, 120, 160);

			label[i].setBackground(Color.white);

			userPanel[i].add(label[i]);

			

			label[6+i] = new Label("Id");			

			label[6+i].setBounds(135, 15, 105, 50);

			label[6+i].setBackground(Color.white);

			userPanel[i].add(label[6+i]);

			

			label[12+i] = new Label("Level");			

			label[12+i].setBounds(135, 70, 105, 50);

			label[12+i].setBackground(Color.white);

			userPanel[i].add(label[12+i]);

			

			label[18+i] = new Label("�����");			

			label[18+i].setBounds(135, 125, 105, 50);

			label[18+i].setBackground(Color.white);

			userPanel[i].add(label[18+i]);

		}



	}



}