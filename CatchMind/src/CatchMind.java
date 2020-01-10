import java.awt.CardLayout;

import javax.swing.*;
import java.awt.*;
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


public class CatchMind extends JFrame {

	CardLayout card = new CardLayout();

	GameRoom gr = new GameRoom();

	static Graphics gp;

	CatchMind() {

		
		
		setLayout(card);

	//	add(new GameRoom());
		add("GR", gr);
		// 프레임 크기
		setBounds( 0, 0, 1431+15, 809+15);

		// 1446, 824 => ¿ø·¡´Â 1440,900

		setResizable(false);

		setVisible(true);

		gp = this.getGraphics();
	}	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new CatchMind();

		// cm.setDefaultCloseOperation(cm.EXIT_ON_CLOSE);	
	}


}
