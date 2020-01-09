
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
import java.awt.Color;

import java.awt.Dimension;

import java.awt.Font;

import java.awt.GridLayout;

import java.awt.Label;



import javax.swing.JButton;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JProgressBar;

import javax.swing.JScrollPane;

import javax.swing.JTextField;

import javax.swing.JTextPane;




public class GameRoom extends JPanel{



	/*

	 * 구현예정기능

	 *  1. 스케치북(파레트 포함) : 누나 

	 *  2. 유저패널(캐릭터/ID/LV/방에서 정답맞힌갯수) : 승호 

	 *  3. 라운드표시기 : 승호

	 *  4. 차례표시기 : 승호 

	 *  5. 정답글자수표시기 :승호 

	 *  6. 채팅 : 홍선 

	 *  7. 타이머(시계) : 홍선 

	 *  8. 경험치바 : 승호 (실시간)

	 *  9. 게임준비 : 홍선 

	 *  10. 게임초대 : 홍선 

	 *  11. 친구추가 : 홍선 

	 *  12. 나가기 : 홍선

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


	
	GameRoom() {


	
		setLayout(null);
	//	add(new Paint());

	//	add("Pt", Paint);
		

//1. 스케치북		

		grSketch.setBounds(280, 15, 880, 600);

		grSketch.setBackground(Color.BLACK);

		add(grSketch);

		

//2. 유저패널		

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

		

//3.라운드표시기

		timer.setBounds(15, 630, 250, 150);

		timer.setBackground(Color.gray);

		add(timer);

		

//4.차례표시기

		turn.setBounds(280, 630, 250, 105);

		turn.setBackground(Color.pink);

		add(turn);

		

//5.정답글자수표시기		

		answer.setBounds(545, 630, 250, 105);

		answer.setBackground(Color.yellow);

		add(answer);

		

//7.타이머		

		round.setBounds(810, 630, 350, 70);

		round.setBackground(Color.blue);

		add(round);

		

//6.채팅	

		tf = new JTextField();

		tf.setBounds(810, 710, 350, 30);

		add(tf);

		

//8.경험치바

		jb = new JProgressBar(0,100);

		jb.setBounds(280, 750, 880, 30);

		jb.setValue(0);

		jb.setStringPainted(true);

		add(jb);

		

//버튼		

		    

		p.setLayout(new GridLayout(4, 1, 0, 10)); //칸 칸당 갯수 좌우간격 위아래간격 

		p.setBounds(1175, 630, 250, 150);

		add(p);

		

		for(int i=0; i<1; i++) {

			b[i] = new JButton("게임준비");

			b[i+1] = new JButton("게임초대");

			b[i+2] = new JButton("친구추가");

			b[i+3] = new JButton("나가기");

		}



		for (int i=0;i<1;i++)

		{   /* b1. 게임준비 

			 * b2. 게임초대

			 * b3. 친구추가

			 * b4. 나가기

			 */

			p.add(b[i]);      b[i].setBackground(Color.white);		

			p.add(b[i+1]);    b[i+1].setBackground(Color.white);

			p.add(b[i+2]);    b[i+2].setBackground(Color.white);

			p.add(b[i+3]);    b[i+3].setBackground(Color.white);

		}

		

// 라벨

		Label[] label = new Label[24];	

		

		for (int i = 0; i < 6; i++) {

			label[i] = new Label("아바타");			

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

			

			label[18+i] = new Label("정답수");			

			label[18+i].setBounds(135, 125, 105, 50);

			label[18+i].setBackground(Color.white);

			userPanel[i].add(label[18+i]);

		}



	}



}