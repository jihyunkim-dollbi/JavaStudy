// ? :
// (조건문?값1:값2)  --> 웹(React =>삼항연산자)에서 많이 쓰임.
// 조건 (true) => 값1
// 조건 (false) => 값2
/*
 *   
 * 
 * 
 * 
 * 
 */


import java.util.Scanner;
//국어, 영어, 수학 점수를 입력받아서 평균 -> 평균이 60 이상이면 true, false

// 나이를 입력 ==> 15세 이상이면 (영화관람가능) / 이하 (영화관람불가)

public class 이항연산자_삼항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        
        /*
         * 
         *  ------------------------------------------------------------------------
         * 
         * scanner 함수를 쓸때, 1. import java.util.Scanner; public 위에 적어준다. 클래스 만들어주기? 
         *                   2. Scanner scan=new Scanner(System.in);  적는다. 메인 안에!
         *                   
         *                   3. System.out.println("국어점수:"); 적는다. ---  화면에 미리 출력됨.
         *                   4. int kor=scan.nextInt(); 적는다.        ---  우리가 원하는 정보를 적는 공간! 원하는 점수를 입력한다.
         *                      ===              ===
         *                      정수  -----------> 정수   ==> 맞춰줘야한다.
         *                   
         *                   
         *                      System.out.println("수학점수:");-     ------ 위에 3 &4 번 반복!
         *                      int math=scan.nextInt();
         *                   
         *                   
         *                   6.  int avg=(kor+math)/2;               ------ 평균값을 int로 구해준다. 이유는 평균값을 변수로 잡아놓아야 60점 이상, 이하인지를 조건문으로 판별하기 위해.   
         *                    
         *                   7.  String result=avg>=60?"Pass":"Nonpass"; --- 6번에서 구한 평균값이 60보다 크면 pass 낮으면 nonpass 로 출력하기 위해  논리연산자를 사용했음
         *                   
         *                   8.  System.out.println("결과:"+result);    ----- 마지막으로 println 을 이용해 7번의 결과값이 60보다 크면  pass 낮으면 nonpass나 나타난다.
         *  
         * ---------------------------------------------------------------------------
         *                   
         * 
        System.out.println("국어점수:");
        
        
        int kor=scan.nextInt();
        //
        
        System.out.println("영어점수:");
        int eng=scan.nextInt();
        System.out.println("수학점수:");
        int math=scan.nextInt();
        
        int evg=(kor+eng+math)/3;
        
        
        String result=evg>=60?"Pass":"Nonpass";
        System.out.println("결과:"+result);
        
        */
        
      
        System.out.println("나이:");

        int age=scan.nextInt();
        
        String result=age>=15?"관람가능":"관람불가";
        System.out.println(result);
        
        
        // 좌석 => 1 2 3 4 5 => 1,2,4 => 좌석예매 불가능 , 3,5 = > 좌석예매가능
        
        
        System.out.println("좌석예매:"+result);
        System.out.println("좌석을 입력하세요(1~5)?");
        int seat=scan.nextInt();
        
     //   String result=(seat==1 || seat==2 || seat==4)?"불가능":"가능";
        result=(seat==3||seat==5)?"예매가능":"불가능";
        
        System.out.println(result);
        
        
        
        
        
        
        
        
        
	}

}
