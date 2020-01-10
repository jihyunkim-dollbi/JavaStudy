import javax.swing.JFrame;
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

public class Test1 extends JFrame {
	
	 
	JPanel grSketch = new JPanel();
	
	Test1() {
		
	//	add("Pt", Paint);
    //	add(new GameRoom());
		
		setBounds(200,200, 1431+15, 809+15);
	
		
		setVisible(true);
		
	//	Paint.setBounds(280, 15, 880, 600);

	//	Paint.setBackground(Color.BLACK);

	//	add(Paint);
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Test1();
	}

}
