import java.awt.FlowLayout;

import javax.swing.*;

//JFrame ==> ����     ex) �α��λ����������� --> ���ڿ��� �ٲ㼭 �׶��׶� �ν��ؾ���. 
//��/���� ==> ����,�Ǽ� ���� ==> ������ String���� ��ȯ�ؾ���!!

public class �޼ҵ�Ȱ�� extends JFrame{
	JLabel la=new JLabel("����");
	JTextField tf = new JTextField();
	�޼ҵ�Ȱ��()
	{
		
		setLayout(new FlowLayout());
		add(la);
		add(tf);
		tf.setText(String.valueOf(100));
		
		setSize(350,80);
		setVisible(true);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new �޼ҵ�Ȱ��();
	}

}
