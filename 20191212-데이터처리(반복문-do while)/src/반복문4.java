import java.util.Scanner;

/*
 *  �ΰ��� ������ �Է� �޾Ƽ�
 *  �ִ밪, �ּҰ�
 *  do-while 
 * 
 * 10 , 30 ==> �ִ��� 30 �ּҰ��� 10!
 * 
 */

import java.util.Scanner;
public class �ݺ���4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int num1 = 0;
		int num2 = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		
		do {
			
			System.out.println("ù��° ���� �Է�: ");
			num1 = scan.nextInt();
						
			System.out.println("�ι�° ���� �Է�: ");
			num2 = scan.nextInt();
			
			if(num1 > num2) {
				
				System.out.println("�ִ밪��: " +num1 + "�ּҰ���: " + num2);
				
			}
			else if(num2 > num1) { 
				
				System.out.println("�ִ밪��: " + num2 + "�ּҰ���: " + num1);
			}
			
		     else {
		    	 
		    	 System.out.println("���� �ٸ� ���� �Է��ϼ���.");
		    	 
		       }
		    
			
		     
			i++;
			
		}while(i <= 2);
			
			
		
		/*  "�ݺ���4"���� ó���� �Ǽ��� do �ȿ� �ٷ� ���๮�� ���� ù��° , �ι�° ������ ���ÿ� ������,
            "�ݺ���5"������ if else�� ���� ���๮�� �����ߴ�.-- but �׷��ʿ����
            "�ݺ��� 6"���� �����Է� ���๮�� do �ۿ� ó���� ��� �ξ� �����ϰ� ó���Ͽ���.
        */
		
		
	}

}
