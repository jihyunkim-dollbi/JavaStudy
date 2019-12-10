/*
 * 변수 값 표현
 * char ==> ' '
 * int ==> 10-10진법 ,  010-8 , 0x12-16 , 0b1010101-2 (4가지) 
 * long ==> 10L , 10l
 * float ==> 10.5F , 10.5f
 * boolean ==> true , false
 * String ==> " "
 * 
 * 비교연산자 => 결과값 (boolean) : true , false
 * ========
 *   1) ==: 같다   6==7 (false) 6==6 (true)
 *   2) != :같지않다  6!=7 (true)  6!=6(false)
 *   3) < 작다 : 6<5 (false) 6<7 (true)
 *   4) > 크다 : 6>5 (true)
 *   5) <=작거나같다 : 6<=6
 *                  ====
 *                  6<6 || 6++ ==> ||(한쪽이 true => true)
 *   6) >=크거나 같다 : 6>=6 (true)
 *   =======================================if, while, for에서 주로 사용
 *   **if => 조건문, 
 *   **while , for => 반복문
 *   
 *   
 * java.util.별? 클래스명, 하나하나씩 써주면 로딩이 빠름. scanner로 씀
 * 
 * 
 */  
import java.util.Scanner;
public class 이항연산자_비교연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean b1=10==11;
        System.out.println("b1="+b1);
        
        b1=10!=11;
        System.out.println("b1="+b1);
        
        b1=10<11;
        System.out.println("b1="+b1);
        
        b1=10>11;
        System.out.println("b1="+b1);
        // char => 모든 연산에서 정수로 변경됨
        b1=65<='A'; 
        
        System.out.println("bi="+b1);
        
        b1=65>='B';
        System.out.println("b1="+b1);
        
        // char => 번호로 바뀐다  -> 형변환 알아보기 위함 -> ASC 코드값
        System.out.println((int)'A'); 
        System.out.println((int)'0'); // 문자 '0'--> 48   '1' => 49
        System.out.println((int)'a'); // 
        
        
        
        
        // 두개의 정수를 받아서 큰값을 출력하라
        
        Scanner scan=new Scanner(System.in);
        //new => 메모리에 저장, 생성자(new~in)까지) ==> 초기값 부여
        /*
         *   scan.nextInt()  ==> int
         *   scan.nextDouble()  ==> double
         *   scan.next()  ==> String
         *   scan.nextBoolean()  ==> boolean
         *   
         *   ==> char (x)
         */
        
        // 정수 두개 받기
        // 1. 받아서 저장할 변수
        int num1,num2;
        System.out.print("첫번째 정수 입력:");
        //입력을 하고 = > enter ==> num1에 저장
        num1=scan.nextInt();
        
        System.out.println("두번째 정수 입력:");
        num2=scan.nextInt();
        // ?  : 피연산자 3개 삼항 연산자
        int result=num1<num2?num2:num1;
        //                  참출력:거짓출력
        
        System.out.println("큰값은"+result+"입니다");
        
        
        
        
        
        
        
        
        
        
	}

}
