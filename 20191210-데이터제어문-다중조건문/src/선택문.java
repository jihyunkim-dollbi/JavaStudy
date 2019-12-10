import java.util.Scanner;

/*  다중if <==> switch
 *  Servlet <==> JSP  ==> 자바와 HTML 을 분리 -> MVC ==> 틀(SPRING)
 *                                         ======
 *                                         구조, 작동법 스프링기반?
 * 
 *  선택문 : 한 개의 값을 받아서 처리(한 번만 수행 ==> break 걸기)
 *         게임, 네트워크... 
 *  형식)
 *     
 *      switch(값)   ==> 값, 문자, 문자열
 *  	{
 *       case 1:
 *           처리
 *           break;
 *       case 2:
 *           처리
 *       case 3:
 *           처리
 *           break;
 *       =========    
 *       default:(해당되지 않는 값)
 *           처리
 *       =========>  생략가능
 *       
 *     }
 *  
 */
public class 선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("첫번째 정수:");
		int num1 = scan.nextInt();
	    
		System.out.println("두번째 정수:");
		int num2 = scan.nextInt();
 	    
		System.out.println("연산자(+,-,*,/):");
		String op = scan.next();
		
		// 처리 ==> int, char, String
		
		switch(op) {
		case "+":
			System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
			break;
		case "-":
			System.out.printf("%d-%d=%d\n", num1, num2, num1-num2);
			break;
		case "*":
			System.out.printf("%d*%d=%d\n", num1, num2, num1*num2);
			break;
		case "/":
			if(num2 == 0) 
				System.out.println("0으로 나눌 수없습니다");
			
			else
				System.out.printf("%d/%d=%.2f\n", num1, num2, num1/(double)num2);
			break;
			
			default:System.out.println("잘못된 연산자입니다!");
		}
		
		
		
	}

}
