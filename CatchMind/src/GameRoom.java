import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;



public class GameRoom extends JPanel{



	/*   구현예정기능 
	 *     1. 스케치북(파레트 포함)
	 *     2. 참여자정보출력
	 *     3. 타이머(시계)
	 *     4. 차례표시기
	 *     5. 정답글자수표시기
	 *     6. 채팅
	 *     7. 게임초대
	 *     8. 친구추가
	 *     9. 나가기
	 */

	

	JPanel grSketch = new JPanel();
	JPanel[] userPanel = new JPanel[6];
	JPanel palette = new JPanel();
	JPanel timer = new JPanel();
	JPanel turn = new JPanel();
	JPanel answer = new JPanel();

    

	JButton b1,b2,b3;
	JTextField tf;    

	

	GameRoom(){

		setLayout(null);

		

		tf=new JTextField();

		b1=new JButton("게임초대");

		b2=new JButton("친구추가");

		b3=new JButton("나가기");

		

		grSketch.setBounds(280, 15, 880, 600);

		grSketch.setBackground(Color.green);

		add(grSketch);

		

		for(int i=0; i<6; i++) {

			userPanel[i] = new JPanel();

			userPanel[i].setBackground(Color.BLACK);

		}

		for(int i=0; i<3; i++) {

			userPanel[i].setBounds(15, 15+(205*i), 250, 190);

			add(userPanel[i]);

		}

		for(int i=3; i<6; i++) {

			userPanel[i].setBounds(1175, 15+(205*(i-3)), 250, 190);

			add(userPanel[i]);

		}

//타이머

		timer.setBounds(15, 630, 250, 110);

		timer.setBackground(Color.gray);

		add(timer);

//차례표시기

		turn.setBounds(280, 630, 250, 70);

		turn.setBackground(Color.pink);

		add(turn);

//정답글자수표시기		

		answer.setBounds(545, 630, 250, 70);

		answer.setBackground(Color.yellow);

		add(answer);

//물감		

		palette.setBounds(810, 630, 350, 70);

		palette.setBackground(Color.MAGENTA);

		add(palette);

//채팅입력칸

		tf.setBounds(280, 710, 880, 30);

		add(tf);

//버튼		

		JPanel p=new JPanel();

		/* //칸 칸당 갯수 좌우간격 위아래간격

		 * //1줄표시(크기)

		 * p.setLayout(new GridLayout(1,2,5,0));

		 */

		

		p.setLayout(new GridLayout(3,1,0,10));//칸 칸당 갯수 좌우간격 위아래간격

		p.add(b1);p.add(b2); p.add(b3);

		  //b1. 게임초대

		  b1.setBackground(Color.white); 

		  //b1.setOpaque(false);

		  

		  //b2. 친구추가

		  b2.setBackground(Color.white); 

		  //b2.setOpaque(false);

		  

		  //b3. 나가기

		  b3.setBackground(Color.white); 

		  //b3.setOpaque(false);	 

		/* //1줄표시(위치)

		 * p.setBounds(671, 625, 500, 30);

		 */	  

		p.setBounds(1175, 630, 250, 110);

		add(p);

		

	}


	
}
