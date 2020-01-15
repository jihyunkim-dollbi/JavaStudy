/*
 *    정수 2개를 입력 받아서 ==> 연산자 1개 ==> 사칙연산
 *    
 *    자바 => 입력 받는 경우에 => char x ==> 무조건 String으로 받아야한다.
 * 		
 *     String ==> == (x), ==> equals를 써야함.    
 * 
 * 
 */
import java.util.Scanner;
public class 다중조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String s1 = new String("hello");
	    String s2 = new String("hello");
	    
	    if(s1.equals(s2)) {
	    	System.out.println("s1 == s2");
	    }
	    else {
	    	System.out.println("s1 != s2");
	    }
	    
	     */
	     // Integer.parseInt("10")  // 숫자끼리만 형변환 가능한다. 문자형으로 바꾸려면 특정 클래스를 알고있어야함.
		 
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 정수:");
		int num1 = scan.nextInt();
	    
		System.out.println("두번째 정수:");
		int num2 = scan.nextInt();
 	    
		System.out.println("연산자(+,-,*,/):");
		String op =scan.next();// 리턴형 - 값을 보내주고 다시 받음. 
	    
		//처리
		// 결과값 출력	
		
		if(op.equals("+")) {
			System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
			
		}
		else if(op.equals("-")) {
			System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);
		}
		else if(op.equals("*")) {
			System.out.printf("%d*%d=%d\n", num1, num2, num1*num2);
		}
		else if(op.equals("/")) {
			if(num2 == 0) 
				System.out.println("0으로 나눌 수없습니다");
			
			else
				System.out.printf("%d/%d=%.2f\n", num1, num2, num1/(double)num2);
		}
		else {
			System.out.println("잘못된 연산자입니다!");  //디폴트문장 만들어주기
		}
			
	}

}
