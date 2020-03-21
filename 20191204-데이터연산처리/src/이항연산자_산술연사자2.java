import java.util.*;// Scanner => scanf (c)
/*수정 UTF-8
 * 자바 / C
 * 
 * 자바 => 클래스
 * C => 함수단위
 * 
 * 
 */


public class 이항연산자_산술연사자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 변수 => 값을 설정 => 직접입력  int a=10
		/*
		 * int a; //  선언
		   a=10   // 초기화
				
		 * int a=10; //선언과 동시에 값을 대입
		 * 
		 * 입력한 값을 받아서 저장
		 * 랜덤(난수) => 임의의 수를 저장
		 * 
		 */
		/*
         int a=(int)(Math.random()*100)+1;
         // Math.random() => 0.0 ~ 0.99 ==> 0.0 ~99.0   => 정수형  0~99 + 1 ==> 1~100
         System.out.println("a="+a);
 
         
         // System.in => 키보드 입력값을 받는다.
         Scanner scan=new Scanner(System.in);
         System.out.print("정수 입력:");
         int b=scan.nextInt();   //int b=scan.nextdouble();
         System.out.println("b="+b);
         
      
          */
         
        // 산술연산자==> +, /
		// 국어, 영어, 수학 점수를 받아서 총점 , 평균=> 소수점 두자리 출력
		
		int kor,eng,math,total;
		double avg;
		// 선언하고 저장공간을 미리 만들어놓음
		
		//입력할 수 있는 기능의 클래스 가지고 온다.
		
		  Scanner scan=new Scanner(System.in); // scanner 객체 생성!
		  
		  System.out.print("국어점수:");
		  kor=scan.nextInt();
		
		  System.out.print("영어점수:");
		  eng=scan.nextInt();
				  
		  System.out.print("수학점수:");
		  math=scan.nextInt();
		  
		  // 총점
		  
		  total=kor+eng+math;
		  
		  //평균
		  
		  avg=total/3.0;
		  
		  
		  // 결과출력
		 System.out.println("국어점수:"+kor);
		 System.out.println("영어점수:"+eng);
		 System.out.println("수학점수:"+math);
		 System.out.println("총점:"+total);
		 System.out.printf("평균:%.2f",avg);
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
