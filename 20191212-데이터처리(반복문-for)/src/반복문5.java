import java.util.Scanner;

/*
 * ���ĺ��� �빮�ڷ� �Է�
 * DDD ==> AAA�� ��µǵ���!
 * 
 * ZZZ ==> WWW
 * 
 * ��������ȣȭ
 * 
 * 
 */

public class �ݺ���5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);  
		
		System.out.println("�빮�ڸ� �Է��Ͻÿ�: ");   // �Է¸޽���
		String data = scan.next();      // ������ �����͸� �Է��ϴ� ��     
		
			
		for(int i = 0; i<data.length(); i++) {   // .length() ������ ���ڿ��� ���̸� ���ϴ� ���̴�. 
			                                     //  0���� �����ϱ� ������ ' = ' �� ���������� �ȾƵ� �ȴ�.
			                                     //
			
			char c = data.charAt(i);   //�ϳ��� ������ �´�

			System.out.print((char)(c-3));
			
			
		}
		
			
		
		
	}

}
