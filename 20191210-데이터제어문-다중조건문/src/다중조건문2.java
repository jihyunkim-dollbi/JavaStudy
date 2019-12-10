/*
 *    월을 입력 => 마지막 날이 몇일인지 확인을 해주는 프로그램!
 *    
 *    
 *	  31 28(29) 31 30 31 30
 *    31 31 30 31 30 31        
 *    
 *    1 3 5 7 8 10 12 --> 31  --> 조건이 가장 많으니까 else 로 처리한다. 디폴트로 31일 잡기!
 *    4 6 9 11 , 2(28,29)        --> 30
 *    
 *    ==> 총변수는 3가지. 연,월,일.==> 변할수 있는수.
 */


import java.util.Scanner;
public class 다중조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("년도 입력:");
		int year = scan.nextInt();  // 윤년계산
		
		System.out.println("월 입력:");
		int month = scan.nextInt(); // 마지막 날짜?
		
		int lastday = 0; // 초기화
		
		
		
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			lastday = 30;
		}
		else if (month == 2) {
			if((year%4 == 0 && year%100 !=0) || (year%400 == 0))
              lastday =29;
              else
            	  lastday =28;
		}
		else {
			lastday = 31;
		}
		
		// 결과
		System.out.println(year +"년" + month + "월은 " + lastday+ "일까지 있습니다.");
		
		
		
		
	}

}
