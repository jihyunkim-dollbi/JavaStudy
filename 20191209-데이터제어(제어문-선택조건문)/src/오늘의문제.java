/*
 * 1. if~else
 *    정수를 한개 입력받아서 짝수/홀수
 *    
 * 2. 임의의 알파벳을 받아서 대문자인지, 소문자인지 (if~else)
 *    ====
 *    char a = 'A'
 *    
 * 3. 정수 3개를 입력받아서 평균을 내고, 평균이 90 이상이면 'A'
 *                                  80 이상이면 'B'
 *                                  70 이상이면 'C'
 *                                  60 이상이면 'D'
 * 									이하면         'F'
 * 
 * 
 */
import java.util.Scanner;
public class 오늘의문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		
	//   1번 예제.
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하시오: ");
      	int a = scan.nextInt();
      	
      	if(a%2 == 0) {
      		System.out.println("짝수입니다.");
      	}
      	else
      		System.out.println("홀수입니다");
      	
      	// 2번 예제.
      	
      	System.out.println("알파벳을 입력하시오: ");
      	
      	String op = scan.next();
		char c=op.charAt(0);
      	
      	if(c >= 'A' && c <= 'Z') {
      		System.out.println(c + "는 대문자입니다.");
      	}
      	if(c >= 'a' && c <= 'z') {
      		System.out.println(c + "는 소문자입니다.");
      	}
      	
		
      	
      	// 3번 예제.
      	
      	int first = 0, second = 0, third = 0;
      	int ave = (first+second+third)/3;
      
      	
      	System.out.println("첫번째 정수를 입력하시오 : ");
      	first = scan.nextInt();
      	
      	System.out.println("두번째 정수를 입력하시오 : ");
      	second = scan.nextInt();
      	
      	System.out.println("세번째 정수를 입력하시오 : ");
      	third = scan.nextInt();
      	
      	if(ave >= 90 && ave <= 100 ){
      		System.out.println("A");
      	}
      	if(ave >= 80 && ave <= 89) {
      		System.out.println("B");
      	}
      	if(ave >= 70 && ave <= 79) {
      		System.out.println("C");
      	}
      	if(ave >= 60 && ave <= 69) {
      		System.out.println("D");
      	}
      	if(ave < 60) {
      		System.out.println("F");
      	}
      	
	}

}
