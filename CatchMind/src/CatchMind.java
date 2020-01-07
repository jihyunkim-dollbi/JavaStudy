import java.awt.CardLayout;
import javax.swing.*;
import java.awt.*;


public class CatchMind extends JFrame {

	int userNum = 3;

	CardLayout card = new CardLayout();

	GameRoom gr = new GameRoom();

	

	CatchMind() {

		setLayout(card);

		add("GR", gr);

		setBounds(0, 0, 1431+15, 768+15);

		setResizable(false);

		setVisible(true);

	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CatchMind cm = new CatchMind();

		cm.setDefaultCloseOperation(cm.EXIT_ON_CLOSE);
		
	}

}
