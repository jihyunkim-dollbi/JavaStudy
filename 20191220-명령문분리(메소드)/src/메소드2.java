/*
 *  �����Է��� 1�� �޾Ƽ� ==> 2 �������� ��� !
 *  10 => 16bit �� ����Ұ���!
 *  0000 0000 0000 1010
 *  
 *  
 *
 *
 * 
 * 
 */
import java.util.Scanner;
public class �޼ҵ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		//  ������ ������ �Ѵ�. 
		//  ��� �ʿ��ұ�? �ΰ��� �ʿ��ϴ�. 16������ ���� �뵵�� ���̴� ���ڵ��̹Ƿ� 0��1�� �迭�� ����! 
		int input = 0; // ����ڰ� �Է��� �� �޴� ����
		
		System.out.println("�����Է�: ");
		input = scan.nextInt();
		
		System.out.println(Integer.toBinaryString(input));
		
		int[] binary = new int[16]; // 0�� �� ä���� ����
		// ���� �ڿ��� ���� ä������ �ִ�. ���� �迭�� �ڿ��� ���� ä�����Ѵ�.
		// �迭�� ��ġ
		int index = 15; // �迭 => ���� �����Ϸ��� => ��ġ�� �����ؾ��� => �� ��(0 ��), �� ��(length-1)
		//  ������� ������ ���������� ��� �ݺ��� ==> ���� �ݺ����� ����Ѵ�. ==> ���ڿ����� Ƚ���� �����ȵǹǷ� while���� ����Ѵ�,
		// ���� Ŀ���� Ŀ������ ������� ���������� ������.
		//0�̳� 1�̳����� break�ɰ� ������ �Ѵ�
		// �������������� ù��° �ι����� ������
		/*
		 *  10%2 =0
		 *  5%2 = 1
		 *  2%2 =0
		 *  1%2=1
		 *  
		 * 
		 * 
		 */
		// ó���ϱ�
		
		while(true)
		{
			
			binary[index]=input%2;    // �ڿ������� �ϳ��� ������ ���������� ������.  - ���Ҹ� ����
									  // 1.�������� �����ϱ�.  
			input = input/2;    // input/=2;
			
			if(input == 0)
				break;
			
			
			index--;
			
		}
		
		
		//���  
		
		for(int i = 0; i<16; i++)
		{
			
			if(i%4 ==0 && i != 0)  // 4�� ������ ������ ��� 
			{
				
				System.out.print(" ");
				
			}
			System.out.print(binary[i]);
				
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
