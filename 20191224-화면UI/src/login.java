import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel; //������� ���õ� class ����
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*	 ���ϻ��? 
 *   JFrame -> ũ�� �۰� ����
 *   JPanel  -> ȭ�� ī�װ�-> �ٲܶ� -> Ŭ���Ҷ����� ȭ�� ����(�Ŵ�). 
 *              ������ â�� ���� �ʾƵ� �ȴ�. �г� �������� ����â �ϳ��� �÷���. 
 *              1. CARDLAYOUT! 
 *              2. TAB(TAB�� )���� ������� �ִ�.
 *              3. SPLIT PAN(�̺�Ʈ)
 *              4. INTERAL FRAME => â�ȿ� �� �ٸ� â ����� => EXCEL.....
 *              
 *                  
 *   JWindow  -> ����â 
 *   JDialog  ->MODAL 1. ��������� �����Ǵ� â!�ִ�ȭ �ּ�ȭ��ư x -> �ݱ��ư�� �ִ�. modal => �� â�� ���������� �ٸ� ������ ����.(���̵� �ߺ�üũ�Ҷ�)
 *   			MODALIS? 2. ctrl+F => REPLACEâ ��� => �ٸ� ���� ���� 
 * 
 *   ������ Ŭ�� = SOURCE => COMPONANT -> PAINTCOMPONANT @Override
 *   
 *   new �����ڷ� �ʱⰪ�� �־� ������ �� ���� �ִ�.
 */
import java.awt.*; //������� ���õ� class ����
public class login extends JPanel {              // ������ �ȵǴ� ����� �̱⶧����. Ŭ������ ������ ���� �ϴ� ��. --> ���� �����δ� �޼ҵ� �ȿ� �־�� ��.

	Image back;   // ���� ���� ������ �ʱⰪ�� �ִµ� �׸��� ������ Ŭ���� �ȿ��� ������ ���� �ִ�. �ʱ�ȭ��: ����� ������ �ʱ�ȭ�ϴ� ��
	// Login login = new Login()  ==> �������� ���̸� �ȵ�, �Ⱥ��̸� �ڵ�ȣ���ϴ� �����ڰ���?
	
	JLabel la1, la2;       //==> ������! new �����Ͽ� ���!
	JTextField tf;         //id ǥ���
	JPasswordField pf;     //pwǥ���
	JButton b1,b2;         //�α��� �ϱ� ��ư
	
	// 7���� ����! ����� ���� �� ������.
	
	login(){  // ������ �Լ� ���� ȭ���� �� ����� ȣ���Ҷ� ������ �� ����.
		
				setLayout(null);
		        back = Toolkit.getDefaultToolkit().getImage("c:\\image\\background.jpg"); 
	
		        la1 = new JLabel("ID", JLabel.RIGHT);
		        la1.setForeground(Color.white);   // ���ڻ� �ٲٱ�.
		        la2 = new JLabel("Password", JLabel.RIGHT);
		        la2.setForeground(Color.white);
		        
		        tf = new JTextField();
		        pf = new JPasswordField();
		        
		        b1 = new JButton("�α���");
		        b2 = new JButton("���");
		        
		        
		        // ��ġ�ϱ�
		        	
		        la1.setBounds(390, 330,80,30);   // ���� ���ϴ� ��ġ�� ����
		        tf.setBounds(475,330,150,30);  
		        // setBounds
		        
		      	
		        la2.setBounds(390, 365,80,30);   
		        pf.setBounds(475,365,150,30);  
		        
		        JPanel p = new JPanel();
		        p.setBounds(390,405,235,35);
		        p.setOpaque(false);
		        
		        p.add(b1);
		        p.add(b2);
		        
		        add(la1);
		        add(tf);
		        
		        add(la2);
		        add(pf);
		        add(p);
		               	                
		   }
		
	
	@Override
	protected void paintComponent(Graphics g) {    //g ���� ���� �����ϴ�.  // paintComponent������ â���� ��Ų ������.
		 //������ Ŭ�� = SOURCE => COMPONANT -> PAINTCOMPONANT @Override �����.
		
		
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);      // getWidth(), getHeight() ����ũ��// observer:��� �׸� ���ΰ�? ���⿡.
		
		
		
	}  
  
}
