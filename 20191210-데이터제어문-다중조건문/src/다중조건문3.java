/*
 *    ���� 2���� �Է� �޾Ƽ� ==> ������ 1�� ==> ��Ģ����
 *    
 *    �ڹ� => �Է� �޴� ��쿡 => char x ==> ������ String���� �޾ƾ��Ѵ�.
 * 		
 *     String ==> == (x), ==> equals�� �����.    
 * 
 * 
 */
import java.util.Scanner;
public class �������ǹ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String s1 = new String("hello");
	    String s2 = new String("hello");
	    
	    if(s1.equals(s2)) {
	    	System.out.println("s1 == s2");
	    }
	    else {
	    	System.out.println("s1 != s2");
	    }
	    
	     */
	     // Integer.parseInt("10")  // ���ڳ����� ����ȯ �����Ѵ�. ���������� �ٲٷ��� Ư�� Ŭ������ �˰��־����.
		 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù��° ����:");
		int num1 = scan.nextInt();
	    
		System.out.println("�ι�° ����:");
		int num2 = scan.nextInt();
 	    
		System.out.println("������(+,-,*,/):");
		String op =scan.next();// ������ - ���� �����ְ� �ٽ� ����. 
	    
		//ó��
		// ����� ���	
		
		if(op.equals("+")) {
			System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
			
		}
		else if(op.equals("-")) {
			System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);
		}
		else if(op.equals("*")) {
			System.out.printf("%d*%d=%d\n", num1, num2, num1*num2);
		}
		else if(op.equals("/")) {
			if(num2 == 0) 
				System.out.println("0���� ���� �������ϴ�");
			
			else
				System.out.printf("%d/%d=%.2f\n", num1, num2, num1/(double)num2);
		}
		else {
			System.out.println("�߸��� �������Դϴ�!");  //����Ʈ���� ������ֱ�
		}
			
	}

}
