import java.util.Scanner;

/*
 * Wrapper Ŭ����
 * =======
 * �⺻��(int, long.. ) ���� ���� �� �� �ְ� ������� Ŭ����
 * 
 * int ==> Integer   ==> BOXING, AUTOBOXING
 * Integer ii = new Integer(10);
 * int i = ii.valueOf(); => i=10       ==> static �޼ҵ� => �޸��Ҵ� ���� ��밡��!
 * 
 * int i=ii;
 * Integer ii=10;
 * Ŭ�������� �Ϲ� ��������ó�� ���. =>   BOXING
 * 
 * AUTOBOXING =>�ݴ�� �������
 * 
 * 
 * 
 * 
 * double ==> Double
 * byte ==> Byte
 * long = > Long....     ==> static �޼ҵ�s => �޸��Ҵ� ���� ��밡��!
 * boolean ==> Boolean
 * 
 *
 * ==> String s = "100";
 * int i= (int)s;
 * 
 *  
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer ii = new Integer(100);
		int i=ii;
		int k=1000;
		Integer kk=k;
		System.out.println(kk);
	/*	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("�����Է�: "); 
		String no1=scan.next();
		
		
		System.out.println("�����Է�: ");
		String no2=scan.next();
		
	*/
	//	System.out.println(Integer.parseInt(no1)+Integer.parseInt(no2));
		
		String s="true";
		if(Boolean.parseBoolean(s) == true) // boolean ������ ����   or s.equals("true")
		{
			System.out.println("���");	
		}
		
		String ss="false";
		if(Boolean.parseBoolean(s)) // boolean ������ ����   
		{
			System.out.println("���");	
		}
		
		String score="4.5";
		System.out.println(score);
		
		System.out.println(Double.parseDouble(score)+1);
		
		boolean b = true;
		System.out.println(String.valueOf(b));   // ==> ��� ���������� ���ڿ��� �ٲܶ�.
		// .valueOf()  ==> static method! not instance method!
	
		
		
		
	}

}
