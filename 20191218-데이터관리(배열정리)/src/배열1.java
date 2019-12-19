import java.util.Scanner;

/*
 * 	  1.묶어서 사용하는 것(데이터)
 * 
 * 
 * 		배열 => 클래스 =>패키지 = > 라이브러리		
 * 			
 * 
 *   	 프로그램 :
 *   	 데이터 + 명령문 (메소드) =>클래스
 *  	============
 *   	여러개  --> 조립(자바 - CBD)
 *          
 *          
 *    2. 자바 => 오라클 = > html(CSS, JavaScript) -> JSP => MVC = > Spring => Kotlin(모바일) ==> 웹앱
 *                      ============================    ===============
 *                      		Front End 				   Back End     
 *    
 *    배열의 단점 : 고정적  ==> 가변형으로 만들어가는 것.
 * 	  ========  같은 데이터형만 가능 
 *              선언시 => 메모리 크기를 결정
 *              ====================
 *              1) 선언
 *                 int[] arr;
 *                 ===   === 배열명 (실제 저장된 데이터의 주소)
 *                 데이터형                   =======> heap == > stack
 *                 
 *              2) 초기화 - 지역변수는 초기화 항상 필요
 *                 arr  = {1,2,3,4,5}
 *                 arr = new int[5] ==> 메모리 공간 할당 => 나중에 데이터저장!
 *              3) 값을 읽기, 쓰기  ==> 인덱스
 *                 int [] arr= {10,20,30,40,50}
 *                 
 *                 
 *   							arr[0] = 10  arr[0]=20 --> 일반변수처럼 사용 가능             
 *                    arr		arr[0]  arr[1]     2     3     4   ==> 연속적... for
 *                    ===       ================================
 *                    100			 10    20    30    40    50
 *                    ===       ================================
 *								 100    104    108    112    116   주소값!                 
 *                 
 *              
 * 
 *   클래스
 *   1. 데이터형 클래스
 *   2. 액션 클래스(메소드 모음)
 *   3. 혼합형 클래스
 *   
 *   
 *   3 morning  선생님 복습
 *   3 night   책정리
 *   1 come 코드복습
 *   1 go  코드복습
 *   1 break time
 *   9 x 5 = 45
 *   
 *   13 x 2 =26
 *   3 x 2 = 6
 *    
 *   
 *   
 *   
 *   
 */
import java.util.*;
import java.text.*;

public class 배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		// 달력 만들기
/*       1) 년, 월, 일 입력 받는다.
 *       2) 1일자의 요일을 알고 있어야 한다.
 *       3) 마지막 날의 숫자
 *       4) 출력하기.(오늘 날짜의 색 다르게)
 */
		
		
	
		 
	/*
		while(true)
		{
			
			
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:dd");   ==> 시스템의 날짜를 읽어들이는 메소드.
			System.out.println(sdf.format(date));
			try {
				
				Thread.sleep(1000);
			
			}catch(Exception ex) {
		 
				}
				
		}
		
		*/
		
		// MONTH ->0 부터 시작해서 + 1 해줘야함
		// DAY OF WEEK
		Calendar cal = Calendar.getInstance();
		int y = cal.get(cal.YEAR);
		int m = cal.get(cal.MONTH)+1;
		int d = cal.get(cal.DATE);
		int w = cal.get(cal.DAY_OF_WEEK);
				
		char[] strWeek = {'일','월','화','수','목','금','토'};		
	/*	System.out.println(cal.get(cal.YEAR));
		System.out.println(cal.get(cal.MONTH));
		System.out.println(cal.get(cal.DATE));
		System.out.println(cal.get(cal.DAY_OF_WEEK));*/
		System.out.println("=====" + y + "년도" + m + "월" + d + "일" + strWeek[w-1] + "요일" + "======");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("년도 입력: ");
		int year = scan.nextInt();
		
		System.out.println("월 입력: ");
		int month = scan.nextInt();
		
		System.out.println(year + "년도 " + month + "월");
			
		System.out.println("\n");
	/*	
		System.out.print("일\t");
		System.out.print("월\t");
		System.out.print("화\t");
		System.out.print("수\t");
		System.out.print("목\t");
		System.out.print("금\t");
		System.out.print("토\t");
	*/	
		
		
		
		
		for(int i = 0; i < 7 ; i++)
		{
			System.out.print(strWeek[i] + "\t");
		}
		
		// 1일자의 요일을 구한다.
		// 전년도의 12/31까지의 총 합을 구한다
		int total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;   // 전년도
		
		
		// 전달까지의 합을 구한다.
		
		int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if((year%4 == 0 && year%100 != 0) ||year%400 ==0)
		   lastDay[1] = 29;
		else
			lastDay[1] = 28;
		
		for(int i = 0; i< month-1; i++)
		{
			
			total+=lastDay[i];
		}
		
		
		
		
		// +1 ===> %7 == 요일을 구한다.
		total++;   // 각 달의 1일자
		
		
		
		int week =total%7;  // 일요일의 인덱스  일요일은 0, 월요일은 1, 화요일은 2 // 요일별 인덱스 준 곳.
		 // 마지막 날짜를 배열로 잡는다.
		System.out.println();
		for(int i = 1; i <=lastDay[month-1]; i++)  // 1일부터 시작할때 첫째줄이다. 따라서 week만큼 공백을 띄어라.
		{
			
			if(i == 1)
			{
				for(int j = 0; j < week; j++)
				{
					
					System.out.print("\t");
				}
				
				
			}
			
			System.out.printf("%2d\t", i);
			week++;
			if(week>6)
			{
				
				week = 0;    
						System.out.println();
				
			}
			
			
		}
		
		
		
		
	}

}
