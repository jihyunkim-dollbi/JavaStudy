import java.util.Scanner;

/*
 * �̸� ���� ���� �ּ� ��ȭ��ȣ �Է��Ҷ� ==> �� ��� Ŭ������ ��� ���� ����.
 * ���� ���� 10�� ���� ==> �迭�� ó�� ��.
 * 
 * ���� �迭�� ���� ī�װ��� ���������� ���� ������ ����.
 * 
 * �迭�� ����� ���Ǵ�.
 * ���� ���ϴ� ����Ʈ��ŭ ���� ���� �� �ִ�.
 * �������� :  �Ǿտ� �����ϴ� �޸� �ּҷ� �����ϰ�, �ε��� ��ȣ�� ���������� �ٿ� ������ �����ȴ�.
 * 
 * ��� Ŭ������ �迭�� ���� �� �ִ�.
 */
public class �迭4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �⵵ ���� �Է¹޾Ƽ�  ==> ���� ���������� ����?
		// �迭 = > �ϰ�ó�� ������ �͵��� ������ ���̴�.
		// �� ��� ������ ��¥���� ��Ƽ� �迭�� ����� ����
		// 1,3,5,7,8,10,12 = 31
		// 2-29,2-28       = 28,29
		// 4,6,9,11        = 30
		
		 Scanner scan = new Scanner(System.in);
		 
		 int year;
		 int month;  // int[] data = new int[2]
		 
		 System.out.println("�⵵ �Է�: ");
		 year = scan.nextInt();
		 
		 System.out.println("�� �Է�: ");
		 month = scan.nextInt();
		 
		 int lastday = 0;
/*		 
		 if(month == 4 || month == 6 || month == 9 || month == 11)
		 {
			 lastday = 30;
		  }
		 else if(month == 2) {
			 
			  if((year%4 == 0 && year%100 != 100) || year%400 == 0)
					{ 
						lastday = 29;
					}
					else 
						lastday = 28;
	
	      }
		  else
		  {
			  lastday = 31;
		  }
		  
		  
		  
		  
		  // �Ʒ��� ����ġ ���̽��� �ٽ� �ڵ��غ��Ҵ�.
*/
/*		 
		 switch(month)
		 {
		 case 4:
		 case 6:
		 case 9:
		 case 11:
			 lastday = 30;
			 break;
		 case 2:
			 if((year%4 == 0 && year%100 != 100) || year%400 == 0)
				{ 
					lastday = 29;
				}
				else
				{
					lastday = 28;
				}
			 break;
	    default:
	    	lastday = 31;
		 
		 }
		 
		 System.out.println(month + "���� ������ ����" + lastday + "���� ������ �ֽ��ϴ�.");
		 
		 
*/
		 
		 
		
	}

}
