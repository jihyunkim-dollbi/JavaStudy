import java.util.Scanner;
public class �迭5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		 
		 int year;
		 int month;  // int[] data = new int[2]
		 
		 System.out.println("�⵵ �Է�: ");
		 year = scan.nextInt();
		 
		 System.out.println("�� �Է�: ");
		 month = scan.nextInt();
		 
		
		 
		 int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};   // �ϰ�ó�� �ϱ� ���� 
				 
		 if((year%4 == 0 && year%100 != 0) || (year%400 == 0))
		      lastday[1] = 29;
		 else 
			 lastday[1] = 28;
		 
		 System.out.println(month + "���� ������ ����" + lastday[month-1]+ "�Դϴ�.");
		 
		
		
		
	}

}
