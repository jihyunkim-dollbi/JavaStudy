/*
 *    ���� �Է� => ������ ���� �������� Ȯ���� ���ִ� ���α׷�!
 *    
 *    
 *	  31 28(29) 31 30 31 30
 *    31 31 30 31 30 31        
 *    
 *    1 3 5 7 8 10 12 --> 31  --> ������ ���� �����ϱ� else �� ó���Ѵ�. ����Ʈ�� 31�� ���!
 *    4 6 9 11 , 2(28,29)        --> 30
 *    
 *    ==> �Ѻ����� 3����. ��,��,��.==> ���Ҽ� �ִ¼�.
 */


import java.util.Scanner;
public class �������ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�⵵ �Է�:");
		int year = scan.nextInt();  // ������
		
		System.out.println("�� �Է�:");
		int month = scan.nextInt(); // ������ ��¥?
		
		int lastday = 0; // �ʱ�ȭ
		
		
		
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			lastday = 30;
		}
		else if (month == 2) {
			if((year%4 == 0 && year%100 !=0) || (year%400 == 0))
              lastday =29;
              else
            	  lastday =28;
		}
		else {
			lastday = 31;
		}
		
		// ���
		System.out.println(year +"��" + month + "���� " + lastday+ "�ϱ��� �ֽ��ϴ�.");
		
		
		
		
	}

}
