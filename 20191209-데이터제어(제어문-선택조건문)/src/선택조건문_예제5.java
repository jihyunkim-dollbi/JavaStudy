import java.util.Scanner;
public class �������ǹ�_����5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// ���� �ΰ��� �����ڸ� �޾Ƽ� ��Ģ ����
		/*
		ù��° ���� �Է� : 10
		�ι�° ���� �Է� : 20
		������ �Է� : +    ==> ����) String op=scan.next()
		                        char c=op.charAt()
		
		==> 10+20 = 30
		/*
		 * 
		 * 
		 */
		
		int firstNum, secondNum;
				
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° ���� �Է�: ");
		firstNum = scan.nextInt();
		
		System.out.print("�ι�° ���� �Է�: ");
		secondNum = scan.nextInt();
		
		System.out.print("�����ڸ� �Է��ϼ��� : ");
		String op = scan.next();
		char c=op.charAt(0);
		
		if(c == '+'){
			System.out.println(firstNum + "+" + secondNum + "=" + (firstNum + secondNum));
		}
		if(c == '-'){
			System.out.println(firstNum + "-" + secondNum + "=" + (firstNum - secondNum));
		}
		if(c == '/'){
			System.out.println(firstNum + "/" + secondNum + "=" + (firstNum / secondNum));
		}
		if(c == '*'){
			System.out.println(firstNum + "*" + secondNum + "=" + (firstNum * secondNum));
		}
	
		
		
		
		
		
	}

}
