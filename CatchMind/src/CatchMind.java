import java.awt.CardLayout;
import javax.swing.*;
import java.awt.*;


public class CatchMind extends JFrame {

	CardLayout card = new CardLayout();

	GameRoom gr = new GameRoom();

	

	CatchMind() {

		setLayout(card);

		add("GR", gr);
		// 프레임 크기
		setBounds( 0, 0, 1431+15, 809+15);

		// 1446, 824 => ¿ø·¡´Â 1440,900

		setResizable(false);

		setVisible(true);

	}

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CatchMind cm = new CatchMind();

		cm.setDefaultCloseOperation(cm.EXIT_ON_CLOSE);
		
		
	}

}
