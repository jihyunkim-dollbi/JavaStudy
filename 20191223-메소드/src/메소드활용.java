import java.awt.FlowLayout;

import javax.swing.*;

//JFrame ==> 윈도     ex) 로그인상태유지때는 --> 문자열로 바꿔서 그때그때 인식해야함. 
//웹/윈도 ==> 정수,실수 없다 ==> 무조건 String으로 변환해야함!!

public class 메소드활용 extends JFrame{
	JLabel la=new JLabel("나이");
	JTextField tf = new JTextField();
	메소드활용()
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
		new 메소드활용();
	}

}
