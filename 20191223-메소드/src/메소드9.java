import java.util.Scanner;

//// ====> 3�� ���� 9���� ������!!!!!
//���� ���� ���� ������ �޾Ƽ�
// ����, ���, ������ ����ϴ� �޼ҵ� �����
// 1. �Է�
// 2. ����
// 3. ���
// 4. ����
///5. ���
//=======
// 6. ����
// �޼ҵ�ȿ� �ִ� ������ ���������̱� ������ ���ϰ��� �Ѱ���� �ۿ��Ѵ�. 
public class �޼ҵ�9 {

	static int[] input()  // �Ű������� ����.
	{
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[3];
		 
		String[] msg = {"����", "����", "����"};
		 
		  for(int i = 0; i < 3; i++)
		  {
			   System.out.println(msg[i] + "����: ");
			   arr[i] = scan.nextInt();
			   
		   }
		   
		 return arr;
	}
	
	
	static int total(int[] score)
	{
		
	 return score[0]+score[1] + score[2];
		
	}
	
	
	static double avg(int total)
	{
		
		return total/3.0;
		
	}
	
	
	static char hakjum(double avg)
	{
		char c = 'A';
		switch ((int) (avg/10))
		{
		case 10 : case 9 : c='A'; break;
		case 8 : c = 'B'; break;
		case 7 : c = 'C'; break;
		case 6 : c = 'D'; break;
		default : c = 'F';
		
		}
		return c;
		
	}
	

	static void print(int[] score, int total, double avg, char c)
	{
		System.out.printf("%d %d %d %d %.2f %c\n", score[0], score[1], score[2],total, avg, c);
		
		
		
	}
	
	static void process()  // �Ѹ��� �л��� 3���� ���� ����!
	{
		
		int[] score = input();
		int total = total(score);
		double avg = avg(total);
		char c = hakjum(avg);
		print(score, total, avg, c);
		
	
	}
	
	static void process2()  // 3���� �л��� 3���� ���� ����
	{
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++)
		{
			/* ==1�� ��� ==�ٷ� �Ʒ��� ���� �ۼ��ص� �����ϰ� 
			System.out.println((i+1) + "��° �л� ���� �Է��ϱ�!");
			int[] score = input();
			int total = total(score);
			double avg = avg(total);
			char c = hakjum(avg);
			print(score, total, avg, c);
			*/
			
			// ==2�� ��� ==�ٷ� �Ʒ��� ���� �ۼ��ص� �����ϰ� 
			System.out.println((i+1) + "��° �л� ���� �Է��ϱ�!");
			process();
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		process2();
		
	}

}
