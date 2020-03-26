import java.util.Scanner;

public class 배열8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       		// 3명의 학생 => 국어, 영어, 수학 점수를 입력받는다. => 출력 
		//80 80 80 240 80.0
		//90 90 90 270 90.0
		//70 70 70 210 70.0
		
		Scanner scan = new Scanner(System.in);
		
		
		/*
		 * 
		
		for(int i = 0; i < kor.length; i++)
		{
			
			System.out.println((i+1) + "번째 학생의 점수를 입력하세요: ");
			kor[i] = scan.nextInt();
		}
		
		for(int j = 0; j < eng.length; j++)
		{
			
			System.out.println((j+1) + "번째 학생의 점수를 입력하세요: ");
			eng[j] = scan.nextInt();
		}
		for(int h = 0; h < math.length; h++)
		{
			
			System.out.println((h+1) + "번째 학생의 점수를 입력하세요: ");
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
			
			
			System.out.println((i+1) + "번째 국어 점수를 입력하세요: ");
			kor[i] = scan.nextInt();
			System.out.println((i+1) + "번째 영어 점수를 입력하세요: ");
			eng[i] = scan.nextInt();
			System.out.println((i+1) + "번째 수학 점수를 입력하세요: ");
			math[i]= scan.nextInt();
			
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i] / (int)3.0;
			
		}
		
		  for(int i=0; i<3; i++)
			  
		  {
			  
			  System.out.println(kor[i]+" "+eng[i]+ " " + math[1] + " " + total[i] + " " + avg[i]);
			  
		  }
		
		
		
		//2020 03 26
		
		//다섯명의 학생의 국어,영어,수학 점수를 입력 받고
		//한 학생 당 총합과 평균을 출력한다.
		Scanner scan=new Scanner(System.in);
		
		int[] student=new int[3];
		
		int total=0;
		double avg=0;
		int k=0;
		
		for(int i=1; i <= 3; i++)
		{
			k=0;
		   for(int s:student)
		   {
			   ++k;
			   System.out.println(i + "번째 학생의 " + k +"번째 점수를 입력해주세요: ");
			   s=scan.nextInt();
			   total+=s;
			   avg=total/student.length;
			   
		   }
				
		   System.out.printf(i+"번째 학생의 총 합은 " + total + "점이며, 평균은 " + (int)avg + "점 입니다.");
		   System.out.println();
		   
		}
	}

}
