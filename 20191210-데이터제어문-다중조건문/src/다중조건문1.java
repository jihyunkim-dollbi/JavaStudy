/*
 *     다중조건문 : 여러개의 조건을 제시하고, 해당 조건 1개만 수행이 되게 만든다.
 
 *     1) 형식 
 *          if(조건문)
 *             실행문장1      ==> true => 실행문장1을 수행하고 종료!
 *             					flase=> 바로 밑에 조건문으로 이동!
 *		    else if(조건문)
 * 				실행문장2
 * 			else if(조건문)
 * 				실행문장3
 * 			==============
 * 		 	else
 * 				실행문장4 => 위에 해당하는 조건이 없는 경우에 처리(생략처리)
 * 

 */
import java.util.Scanner;
public class 다중조건문1 {   // 접근지정 : public - 공공  // private --> 캡슐화방식 - 나만 쓸수있는!
	                                              // protect? --> 정해진 사람만 쓰게함. 상속!

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // 성적처리
		// 3개의 점수를 받아서 => 총점을 출력, 평균을 출력, 학점을 출력
		// 필요한 변수를 선언하기!
		
		int kor, eng, math, total, temp; // temp 임시변수(정수형으로 구해보기- 학점구할 '/10')
		double avg;
		char score;
		//사용하기 전에 초기값을 가지고 있어야한다. 보통 0 or  " ",  ' ' 으로 초기화 
		
		// 입력받기
		Scanner scan = new Scanner(System.in);  //system-> static(공통)
		// new : 메모리 할당(has 주소)
		// Scanner(System.in) : 변수에 대한 초기화(생성자)
		// Class => 사용자 정의 데이터형 (우리가 원하는 메모리 크기를 만들어줌)(변수+메소드) 
		
		System.out.println("국어점수: ");
		kor = scan.nextInt();
		
		System.out.println("영어점수: ");
		eng = scan.nextInt();
		
		
		System.out.println("수학점수: ");
		math = scan.nextInt();
		
		
		//총점
		total  = kor + eng + math;
		//평균
		avg = total / 3.0;
		
		temp=(int)avg; // total/3
		
		//학점
		
		if(temp >= 90)
			score = 'A';
		else if(temp <= 80)
		    score = 'B';
		else if(temp >= 70)
			score = 'C';
		else if(temp >= 60)
			score = 'D';
		else
			score = 'F';
		
		System.out.println("총점: "+ total);
		System.out.printf("평균:%.2f\n", avg);
		System.out.println("학점 :" + score);
		

		
	}

}
