/*
 * 1. if~else
 *    ������ �Ѱ� �Է¹޾Ƽ� ¦��/Ȧ��
 *    
 * 2. ������ ���ĺ��� �޾Ƽ� �빮������, �ҹ������� (if~else)
 *    ====
 *    char a = 'A'
 *    
 * 3. ���� 3���� �Է¹޾Ƽ� ����� ����, ����� 90 �̻��̸� 'A'
 *                                  80 �̻��̸� 'B'
 *                                  70 �̻��̸� 'C'
 *                                  60 �̻��̸� 'D'
 * 									���ϸ�         'F'
 * 
 * 
 */
import java.util.Scanner;
public class �����ǹ��� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		
	//   1�� ����.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������ �Է��Ͻÿ�: ");
      	int a = scan.nextInt();
      	
      	if(a%2 == 0) {
      		System.out.println("¦���Դϴ�.");
      	}
      	else
      		System.out.println("Ȧ���Դϴ�");
      	
      	// 2�� ����.
      	
      	System.out.println("���ĺ��� �Է��Ͻÿ�: ");
      	
      	String op = scan.next();
		char c=op.charAt(0);
      	
      	if(c >= 'A' && c <= 'Z') {
      		System.out.println(c + "�� �빮���Դϴ�.");
      	}
      	if(c >= 'a' && c <= 'z') {
      		System.out.println(c + "�� �ҹ����Դϴ�.");
      	}
      	
		
      	
      	// 3�� ����.
      	
      	int first = 0, second = 0, third = 0;
      	int ave = (first+second+third)/3;
      
      	
      	System.out.println("ù��° ������ �Է��Ͻÿ� : ");
      	first = scan.nextInt();
      	
      	System.out.println("�ι�° ������ �Է��Ͻÿ� : ");
      	second = scan.nextInt();
      	
      	System.out.println("����° ������ �Է��Ͻÿ� : ");
      	third = scan.nextInt();
      	
      	if(ave >= 90 && ave <= 100 ){
      		System.out.println("A");
      	}
      	if(ave >= 80 && ave <= 89) {
      		System.out.println("B");
      	}
      	if(ave >= 70 && ave <= 79) {
      		System.out.println("C");
      	}
      	if(ave >= 60 && ave <= 69) {
      		System.out.println("D");
      	}
      	if(ave < 60) {
      		System.out.println("F");
      	}
      	
	}

}
