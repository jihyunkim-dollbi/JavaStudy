import java.util.Scanner;

public class �迭8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 3���� �л� => ����, ����, ���� ������ �Է¹޴´�. => ��� 
		//80 80 80 240 80.0
		//90 90 90 270 90.0
		//70 70 70 210 70.0
		
		Scanner scan = new Scanner(System.in);
		
		
		/*
		 * 
		
		for(int i = 0; i < kor.length; i++)
		{
			
			System.out.println((i+1) + "��° �л��� ������ �Է��ϼ���: ");
			kor[i] = scan.nextInt();
		}
		
		for(int j = 0; j < eng.length; j++)
		{
			
			System.out.println((j+1) + "��° �л��� ������ �Է��ϼ���: ");
			eng[j] = scan.nextInt();
		}
		for(int h = 0; h < math.length; h++)
		{
			
			System.out.println((h+1) + "��° �л��� ������ �Է��ϼ���: ");
			math[h]= scan.nextInt();
		}
		 */
		

		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		
		int[] total = new int[3];
		double[] avg = new double[3];
		
		for(int i = 0; i < 3; i++)
		{
			
			
			System.out.println((i+1) + "��° ���� ������ �Է��ϼ���: ");
			kor[i] = scan.nextInt();
			System.out.println((i+1) + "��° ���� ������ �Է��ϼ���: ");
			eng[i] = scan.nextInt();
			System.out.println((i+1) + "��° ���� ������ �Է��ϼ���: ");
			math[i]= scan.nextInt();
			
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i] / (int)3.0;
			
		}
		
		  for(int i=0; i<3; i++)
			  
		  {
			  
			  System.out.println(kor[i]+" "+eng[i]+ " " + math[1] + " " + total[i] + " " + avg[i]);
			  
		  }
		
		
		
		
	}

}
