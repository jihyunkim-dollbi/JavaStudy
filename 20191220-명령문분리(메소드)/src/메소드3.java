import java.util.Scanner;
//�Է��� ���� �������� �ȴ� . �Ű����� ����.
public class �޼ҵ�3 {
	// �Է�
	static int userInput()  //�Ű������� ���� ����̴�. ������ scan ���� �Է��� �ޱ� ������!
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("�����Է�:");
		int input = scan.nextInt();
		return input;
		
	}
	
	//������ ó��   // �Է¹��� ���� ������� 2�������� ����� ����
	static int[] toBinary(int input)  // ������ ���Ϲ��� input ���� �Ű������� ���!  
	{
		
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
		return binary;   
		
		
	}
	
	
	//��� // ��¸� �Ҷ� void
	static void print(int[] binary)
	{
		
		for(int i = 0; i<16; i++)
		{
			
			if(i%4 ==0 && i != 0)  // 4�� ������ ������ ��� 
			{
				
				System.out.print(" ");
				
			}
			System.out.print(binary[i]);
				
		}
		
		
		
	}
	
	
	//����
	static void process()
	
	{
		
		
		int input = userInput();
	    int[] binary=toBinary(input);
	    print(binary);
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		process();
		
		 
		 
		 
	}

}
