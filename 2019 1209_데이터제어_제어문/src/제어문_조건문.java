/*
 *   조건문
 *       = 단일조건문
 *          1) 형식
 *          if (조건문)
 *             실행문장
 *             {
 *           if (조 - )   ==> 1개 이상이 실행문장이 있는 경우 ({})
 *              실행문장1
 *              실행문장2
 *              }  
 *     //----------------------------------------------------------
 *     
 *             if(조건문)
 *               실행문장1 ==> if 소속문장
 *               실행문장2 ==> if 와 관련없는 문장
 *         
 *           2) 조건문 처리 방법
 *             ======
 *              true/false => 부정 연산자 ! , 비교 < >, 논리 && ||
 *              
 *           3) 실행 => 조건이 true =>문장수행
 *                         false => 문장수행x
 *                         
 */
import java.util.Scanner;   // 두개 이상의 클래스를 쓸때 * 붙이기.
//import java.util.Map;
//import java.util.ArrayList;
//import java.util.StringTokenizer;

//CBD 프로그램 - 실무에서는 CLASS를 COMPONANT BASE 라고 한다.
//조립식 프로그램

public class 제어문_조건문 {    //두개의 클래스 1. Scanner 2. public class

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* 1) 자바에서 생략이 가능한 부분은
		 *    1. import : 라이브러리에서 클래스 불러올때, 이미 만들어진 CLASS를 불러올때.
		 *                 java.lang(uage) (패키지)생략가능
		 *                 ==========
		 *                 1. System(out,in), String, Math(randon,.. etc), Scanner etc..
		 *    2. return : 모든 메소드는 return을 가지고 있다. 
		 		   따라서 생략가능(단, 메소드 상에 void기입) 가상머신에서 추가로 해줌. 
		 *    3. 상속(Extends) : 모든 클래스(사용자정의- 우리가 직접 만든 것.)는 object형을 상속한다.
		 		  Object를 superclass(부모클래스)로 받음  (라이브러리는 이미 만들어진것)
				  
				  수퍼클래스 = 상위클래스(=부모클래스)
				  서브클래스 = 하위클래스(=자식클래스)
				  
		 *    4. 예외처리 : 모든 클래스는 예외처리를 가지고 있다.
		 *       ======
		 *       비정상 종료를 방지하고 정상상태를 유지함(미리 에러를 방지하는 프로그램)
		 *       사용자 입력값을 미리 생각해서 예외처리를 해주어야한다. 오류처리하기! 리스크 예상. 

		 * 
		 */
	 	 
		
		 //예제 1. 
	         //정수를 입력 받아서 홀수/짝수  - 키보드 입력값 받기(scanner 필요) - 유틸 안에 있다.
		 //키보드입력
		 Scanner scan = new Scanner(System.in);  //키보드 입력값을 scan객체에 저장했다가 출력함
		 System.out.println("정수를 입력: ");
		 
		 //scan객체에서 입력받은 값을 num에 대입!
		 int num = scan.nextInt();  // 키보드 입력하기 가능.
		 
		 // 짝수조건
		 if(num%2 == 0) {
			 System.out.println(num + "는(은) 짝수입니다.");
		 }
		 // 홀수조건 필요
		 if(num%2 == 1) {   // if(num%2 != 0) 도 가능!
			 System.out.println(num + "는(은) 홀수입니다.");
		 }
		 
		
		 System.out.println("3의 배수를 적으시오: ");
		 int num1 = scan.nextInt();
		 
		 if(num1%3 == 0) {
			 System.out.println(num1 + "는(은) 3의 배수입니다.");
		 }
		 if(num1%3 != 0) {
			 System.out.println(num1 + "는(은) 3의 배수가 아닙니다");
		 }
	}

}
