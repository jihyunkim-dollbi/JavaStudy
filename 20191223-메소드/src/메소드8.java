import java.util.Calendar;
import java.util.Scanner;

public class 메소드8 {
	//오늘 날짜 출력
	static void today() {
		
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
		
		
	}
	//년도 월 입력받기
	
	 static int  input(String msg)  // year 과 month를 둘다 가져올수 없어서 year하나만 받고 그 아래에서 month를 다시 받는다.,
	    {
	    	
	        Scanner scan = new Scanner(System.in);
			
			System.out.println(msg);
			int year = scan.nextInt();
			
			return year;
			
	    }
	    
	
	//요일 구하는
	 
	 static int getWeek(int year, int month)
	 {
		 
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
			
		 
		 
		
		 return week;
		 
	 }
	 
	 
	 
	 //달력 출력
	 
	 
	 static void datePrint(int month, int week)
	 {
		 
		 char[] strWeek = {'일','월','화','수','목','금','토'};	
		 int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
			
			for(int i = 0; i < 7 ; i++)
			{
				System.out.print(strWeek[i] + "\t");
			}
			
			System.out.println("\n");
			
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
	
	// 조립
	static void process() 
	{
		
		today();
		int year=input("년도 입력: ");
		int month=input("월 입력: ");
		System.out.println(year + "년도 " + month + "월");
		
		System.out.println("\n");
		
		int week = getWeek(year, month);
		datePrint(month, week);
		
		
	}
	
   
    
    
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		process();
		
	}

}
