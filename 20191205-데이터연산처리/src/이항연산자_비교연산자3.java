// 1,2 => ������ �߻���Ŵ => Ȧ�̳� 1, ¦�̳�2

import java.util.Scanner;
public class ���׿�����_�񱳿�����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//(Math.random()  => 0.0~0.99 = > 0.0~1.999 ���ϱ� �Ƹ� �̷��� �����µ� INT�� �ٲ�� ������ 0~1, �׸��� +1 �߰��ؼ� 1~2���̰� ����
       int com=(int)(Math.random()*2)+1;
       Scanner scan=new Scanner(System.in);
       System.out.println("�Է�(Ȧ,¦):");
       String input=scan.next();
       
       String result=com%2==0?"¦":"Ȧ";
       String dap=input.equals(result)?"����":"����";
       //������ �񱳴� == �ƴϰ� equals(�� ������)�� �ؾ��Ѵ�.
       System.out.println("com="+com);
       System.out.println("dap="+dap);
       
       
	}

}
