import java.util.Scanner;

public class �ݺ���5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		int num2 = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		
		do {
			
			if(i == 1)    //do while �ȿ� if �� else�� �� ������  ù��° ������ ù���� �����Է¹ް�, �ι�° ������ �ι�° ������ �Է¹޴´�..
				         // �ݺ���4 ó�� do �ȿ� ���๮�� �ΰ� ������ �Ѳ����� ������ �ΰ��� ���ÿ� ���´�.
			{
				
				System.out.println("ù��° ���� �Է�: ");
				num1 = scan.nextInt();
			}
			else {
				
				
				System.out.println("�ι�° ���� �Է�: ");
				num2 = scan.nextInt();
			}
			
			
			
			i++;
			
		}while(i<=2);
		
		if(num1 > num2)
			
			System.out.println("�ִ밪: " + num1+ ", �ּҰ�: " + num2);
			
		
		else 
			
			System.out.println("�ִ밪: " + num2 + ", �ּҰ�: " + num1);
		
		System.out.println("�ִ밪: " + (num1>num2?num1:num2) + ", �ּҰ�: " + (num1>num2?num2:num1));

		
		System.out.println("�ִ밪: " + (Math.max(num1, num2)) + ", �ּҰ�: " + (Math.min(num1, num2)));
		
		
		/*    "�ݺ���4"���� ó���� �Ǽ��� do �ȿ� �ٷ� ���๮�� ���� ù��° , �ι�° ������ ���ÿ� ������,
        "�ݺ���5"������ if else�� ���� ���๮�� �����ߴ�.-- but �׷��ʿ����
        "�ݺ��� 6"���� �����Է� ���๮�� do �ۿ� ó���� ��� �ξ� �����ϰ� ó���Ͽ���.
        */
		
		
	}

}
