import java.util.Scanner;

//// ====> 3명 점수 9개로 만들어보기!!!!!
//국어 영어 수학 점수를 받아서
// 총점, 평균, 학점을 출력하는 메소드 만들기
// 1. 입력
// 2. 총점
// 3. 평균
// 4. 학점
///5. 출력
//=======
// 6. 조립
// 메소드안에 있는 변수는 지역변수이기 떄문에 리턴값을 넘겨줘야 작용한다. 
public class 메소드9 {

	static int[] input()  // 매개변수가 없다.
	{
		
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[3];
		 
		String[] msg = {"국어", "영어", "수학"};
		 
		  for(int i = 0; i < 3; i++)
		  {
			   System.out.println(msg[i] + "점수: ");
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
	
	static void process()  // 한명의 학생의 3가지 점수 정보!
	{
		
		int[] score = input();
		int total = total(score);
		double avg = avg(total);
		char c = hakjum(avg);
		print(score, total, avg, c);
		
	
	}
	
	static void process2()  // 3명의 학생의 3가지 점수 정보
	{
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++)
		{
			/* ==1번 방법 ==바로 아래와 같이 작성해도 가능하고 
			System.out.println((i+1) + "번째 학생 점수 입력하기!");
			int[] score = input();
			int total = total(score);
			double avg = avg(total);
			char c = hakjum(avg);
			print(score, total, avg, c);
			*/
			
			// ==2번 방법 ==바로 아래와 같이 작성해도 가능하고 
			System.out.println((i+1) + "번째 학생 점수 입력하기!");
			process();
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		process2();
		
	}

}
