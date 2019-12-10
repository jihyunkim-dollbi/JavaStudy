/*
 * 입력(정수) => 년도 윤년 구하기. 맞다 아니다.
 *             조건  1. 4년마다 
  *                2. 100년마다는 제외
  *                3. 400년에 한씩은 무조건 윤년이다.
 *                 ========================== 로마시대(윤년)
 *                 2019
 *                 year%4 == 0
 *                 year%100 != 0
 *                 year%400 == 0
 *                 
 *                 
 * 
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;
public class 제어문_조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan = new Scanner(System.in);
       
       System.out.println("년도 입력: ");
       int year = scan.nextInt();
       // 윤년조건
       if((year%4 == 0) && (year%100 != 0) || year%400 == 0) {
    	   
    	  System.out.println(year + "년도는 윤년입니다."); 
    	       	   
       }
        if(!((year%4 == 0) && (year%100 != 0) || year%400 == 0))
            	   
    	   System.out.println(year + "년도는 윤년이 아닙니다.");
        
        
        
	}

}
