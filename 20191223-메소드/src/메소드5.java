import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class �޼ҵ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = "�������� ���� ���� ���� ���! �����̹���������ͱ��� �����";
		
		//���ڰ��� Ȯ���ϱ� ==> ���鵵 ����
		System.out.println("������ ����: " +data.length());
/*		
		System.out.println("�����ܾ��� ����: ");
		int count = 0;
		Pattern p = Pattern.compile("����");
		Matcher m = p.matcher(data);
		while(m.find())
		{
			count++;		
		}
		
		System.out.println(count);
*/		
		// substring(0)- ���������� ������ �ڸ���, substring(2,3)
		System.out.println("++++++++");
		int n = data.indexOf("!");  // ���� ã�� ���ڸ� �ֱ�// �ε��� �ڸ�ã��!
		System.out.println(n);
		System.out.println("+++++++");
		String fData = data.substring(0,data.indexOf("!"));  // 0���� 15���� �������� - 16�� ���� �ȵ�! �Ź� ���ڸ� ���� ����-> �ε����ʿ�!
		System.out.println(fData);							// !�տ��� �ڸ�
		
		String lData = data.substring(data.indexOf("!")+1);  //18���� ������ ��������.  +1���ϸ� ()�� ���� �ڿ��� �ڸ�!=>! �ڿ������� ��������! 
		System.out.println(lData.trim());  // ��������
		                 // =====
		                 //  ������ ������ �޼ҵ� =�ν��Ͻ� 
		
		int a = 10;
		int b =  20;
		double d = 10.5;
		// 102010.5 ���̱� �Ϸ��� ==> ��ȣ ==>201912231 , 201912232 => ��¥+���Լ� ==> ������ ���� �� �˼��� �ִ�. ���� ���ڿ� �����ʿ�.
		
		String sss = a+""+b+""+d;
		System.out.println(sss);
		
		sss=String.valueOf(a) + String.valueOf(b) + String.valueOf(d); 
		   //=====
		   //Ŭ���� �̸����� ���� ==>  static method
		   //valueOf() ==> ��� ���������� ���ڿ��� �ٲ�
		System.out.println(sss);
		
		
		
		
		
	}

}
