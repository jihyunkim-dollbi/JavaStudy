import java.util.Scanner;

public class 배열7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 다섯개의 정수를 입력 받아서 => 5개의 정수를 출력.==> 합을 출력, 평균 출력
		
		Scanner scan = new Scanner(System.in);
		
		int[] num = new int[5];    //5개의 배열 방을 만들어줌
		
		int total = 0; 
		double avg = 0.0;          //총점과 평균은 일괄처리(배열
		
		for( int i = 0; i<num.length; i++) 
		
		{
			
			System.out.println((i+1) + "번째 정수를 입력하세요: ");
			
			num[i] = scan.nextInt();
		

		}
		// 출력 
		for(double score:num)   // double의 데이터 형이 더 커야한다. num값을 더블로 넘겨줄 것이기 때문에.
		{
			total+=score;
			System.out.println(score);
		}

	    avg=total/(double)num.length;
	      
		System.out.println("총점: " + total);
		System.out.printf("평균: %.1f\n", avg);
		
	}

}
