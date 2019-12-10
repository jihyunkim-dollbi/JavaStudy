import java.util.Scanner;
public class 선택조건문_예제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int year = 0;
		int month = 0;
		int day = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("년도를 입력해주세요 : ");
		year = scan.nextInt();
		
		System.out.println("월을 입력해주세요 : ");
	    month = scan.nextInt();
		
		System.out.println("일을 입력해주세요 : ");
		day = scan.nextInt();
		
				
		// 2018 년도까지 합.
		 int total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;
        			
	    //전달까지의 함
		 
		int[] lastDay={31,28,31,30,31,30,31,31,30,31,30,31};
		
		if((year%4 == 0) && (year%100 != 0) || (year%400 == 0))
			lastDay[1]=29;
		else
			lastDay[1]=28;
		for(int i = 0; i<month-1;i++)
		{
			total+=lastDay[i];
			
		}
		total+=day;
		int week = total%7;
		
		char strWeek ='월';
		 if(week == 0)
			    strWeek='일';
		 if(week == 1)
				strWeek='월';
		 if(week == 2)
				strWeek='화';
		 if(week == 3)
				strWeek='수';
		 if(week == 4)
				strWeek='목';
		 if(week == 5)
				strWeek='금';
		 if(week == 6)
				strWeek='토';
		 
		System.out.println(year + "년도" + month + "월" + day + "일은" + strWeek + "요일입니다.");
		
	}

}
