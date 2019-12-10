import java.util.Scanner;

/*  ����if <==> switch
 *  Servlet <==> JSP  ==> �ڹٿ� HTML �� �и� -> MVC ==> Ʋ(SPRING)
 *                                         ======
 *                                         ����, �۵��� ���������?
 * 
 *  ���ù� : �� ���� ���� �޾Ƽ� ó��(�� ���� ���� ==> break �ɱ�)
 *         ����, ��Ʈ��ũ... 
 *  ����)
 *     
 *      switch(��)   ==> ��, ����, ���ڿ�
 *  	{
 *       case 1:
 *           ó��
 *           break;
 *       case 2:
 *           ó��
 *       case 3:
 *           ó��
 *           break;
 *       =========    
 *       default:(�ش���� �ʴ� ��)
 *           ó��
 *       =========>  ��������
 *       
 *     }
 *  
 */
public class ���ù� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("ù��° ����:");
		int num1 = scan.nextInt();
	    
		System.out.println("�ι�° ����:");
		int num2 = scan.nextInt();
 	    
		System.out.println("������(+,-,*,/):");
		String op = scan.next();
		
		// ó�� ==> int, char, String
		
		switch(op) {
		case "+":
			System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
			break;
		case "-":
			System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);
			break;
		case "*":
			System.out.printf("%d*%d=%d\n", num1, num2, num1*num2);
			break;
		case "/":
			if(num2 == 0) 
				System.out.println("0���� ���� �������ϴ�");
			
			else
				System.out.printf("%d/%d=%.2f\n", num1, num2, num1/(double)num2);
			break;
			
			default:System.out.println("�߸��� �������Դϴ�!");
		}
		
		
		
	}

}
