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



	/*   ����������� 
	 *     1. ����ġ��(�ķ�Ʈ ����)
	 *     2. �������������
	 *     3. Ÿ�̸�(�ð�)
	 *     4. ����ǥ�ñ�
	 *     5. ������ڼ�ǥ�ñ�
	 *     6. ä��
	 *     7. �����ʴ�
	 *     8. ģ���߰�
	 *     9. ������
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

		b1=new JButton("�����ʴ�");

		b2=new JButton("ģ���߰�");

		b3=new JButton("������");

		

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

//Ÿ�̸�

		timer.setBounds(15, 630, 250, 110);

		timer.setBackground(Color.gray);

		add(timer);

//����ǥ�ñ�

		turn.setBounds(280, 630, 250, 70);

		turn.setBackground(Color.pink);

		add(turn);

//������ڼ�ǥ�ñ�		

		answer.setBounds(545, 630, 250, 70);

		answer.setBackground(Color.yellow);

		add(answer);

//����		

		palette.setBounds(810, 630, 350, 70);

		palette.setBackground(Color.MAGENTA);

		add(palette);

//ä���Է�ĭ

		tf.setBounds(280, 710, 880, 30);

		add(tf);

//��ư		

		JPanel p=new JPanel();

		/* //ĭ ĭ�� ���� �¿찣�� ���Ʒ�����

		 * //1��ǥ��(ũ��)

		 * p.setLayout(new GridLayout(1,2,5,0));

		 */

		

		p.setLayout(new GridLayout(3,1,0,10));//ĭ ĭ�� ���� �¿찣�� ���Ʒ�����

		p.add(b1);p.add(b2); p.add(b3);

		  //b1. �����ʴ�

		  b1.setBackground(Color.white); 

		  //b1.setOpaque(false);

		  

		  //b2. ģ���߰�

		  b2.setBackground(Color.white); 

		  //b2.setOpaque(false);

		  

		  //b3. ������

		  b3.setBackground(Color.white); 

		  //b3.setOpaque(false);	 

		/* //1��ǥ��(��ġ)

		 * p.setBounds(671, 625, 500, 30);

		 */	  

		p.setBounds(1175, 630, 250, 110);

		add(p);

		

	}


	
}
