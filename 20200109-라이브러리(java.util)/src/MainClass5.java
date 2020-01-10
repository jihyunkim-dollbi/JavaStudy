import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class MainClass5 extends JFrame implements MouseListener{
	
	JTextField tf1, tf2;
	JLabel la;
	JComboBox box;
	JTextField tf3;
	
	public MainClass5(){
		
		tf1= new JTextField(9);
		tf2 = new JTextField(9);
		
		la = new JLabel("=");
		box = new JComboBox();
		box.addItem("+");
		box.addItem("-");
		box.addItem("*");
		box.addItem("/");
		
		tf3 = new JTextField(9);
		
		setLayout(new FlowLayout()); 
		
		add(tf1);add(box); add(tf2);add(la); add(tf3);
		
		setSize(450,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		la.addMouseListener(this);
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass5();
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==la)
		{
			String num1 = tf1.getText();  // 스트링상태
			String num2 = tf2.getText();
			
			String op = box.getSelectedItem().toString();   //사칙연산 읽음
			
			//숫자2개는 정수형으로 바뀌어있어야함
			
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			int n3 = 0;
			
			switch(op) {
			case "+":
				n3=n1+n2;
				break;
			case "-":
				n3=n1-n2;
				break;
			case "*":
				n3=n1*n2;
				break;
			case "/":
				n3=n1/n2;
				break;
			}			
			tf3.setText(String.valueOf(n3));
			
		}
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
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

}
