import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainForm extends JFrame implements ActionListener {
	//                =======> extends를 android로 바꾸면? 모바일?

	login Login  = new login();
	WaitRoom wr = new WaitRoom();
	CardLayout card = new CardLayout();
	
	MainForm(){
		
		
		setLayout(card);
		add("Login", Login);  
		//this.add("Login", Login);
		add("WR", wr);
		//this.add("WR", wr);
		
		setSize(1024,768);       // 1024,768
		setVisible(true);     //윈도우를 보여라
		Login.b1.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
			JFrame.setDefaultLookAndFeelDecorated(true);
			
		}
		catch(Exception e) {}
		MainForm mf = new MainForm();  
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if(e.getSource()==Login.b1)
		{
			card.show(getContentPane(), "WR");
			
			
		}
		
	}

}
