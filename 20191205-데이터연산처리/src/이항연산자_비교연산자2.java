// ������� �Է°���(������ ��ĳ��) �޾Ƽ� (¦��, Ȧ��) �� ���ϱ�
import java.util.Scanner;
public class ���׿�����_�񱳿�����2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("�����Է�:");
       int num=scan.nextInt();
       //¦��, Ȧ�� �ΰ��� �����̹Ƿ� ��Ʈ������ �޾ƾ��Ѵ�.
       
       String result=num%2==00?"¦��":"Ȧ��";
       
       
       
       System.out.println(num+"�� (��)"+result+"�Դϴ�.");
	}

}
