import java.util.Scanner;

public class �迭7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// �ټ����� ������ �Է� �޾Ƽ� => 5���� ������ ���.==> ���� ���, ��� ���
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];    //5���� �迭 ���� �������
		
		int total = 0; 
		double avg = 0.0;          //������ ����� �ϰ�ó��(�迭
		
		for( int i = 0; i<num.length; i++) 
		
		{
			
			System.out.println((i+1) + "��° ������ �Է��ϼ���: ");
			
			num[i] = scan.nextInt();
		

		}
		// ��� 
		for(double score:num)   // double�� ������ ���� �� Ŀ���Ѵ�. num���� ����� �Ѱ��� ���̱� ������.
		{
			total+=score;
			System.out.println(score);
		}

	    avg=total/(double)num.length;
	      
		System.out.println("����: " + total);
		System.out.printf("���: %.1f\n", avg);
		
	}

}
