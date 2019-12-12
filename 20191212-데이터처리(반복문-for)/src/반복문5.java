import java.util.Scanner;

/*
 * 알파벳을 대문자로 입력
 * DDD ==> AAA로 출력되도록!
 * 
 * ZZZ ==> WWW
 * 
 * 시저스암호화
 * 
 * 
 */

public class 반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);  
		
		System.out.println("대문자를 입력하시오: ");   // 입력메시지
		String data = scan.next();      // 문자형 데이터를 입력하는 곳     
		
			
		for(int i = 0; i<data.length(); i++) {   // .length() 에서는 문자열의 길이를 구하는 것이다. 
			                                     //  0부터 시작하기 때문에 ' = ' 을 포함지시지 안아도 된다.
			                                     //
			
			char c = data.charAt(i);   //하나씩 데리고 온다

			System.out.print((char)(c-3));
			
			
		}
		
			
		
		
	}

}
