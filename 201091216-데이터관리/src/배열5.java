import java.util.Scanner;
public class 배열5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner(System.in);
		 
		 int year;
		 int month;  // int[] data = new int[2]
		 
		 System.out.println("년도 입력: ");
		 year = scan.nextInt();
		 
		 System.out.println("월 입력: ");
		 month = scan.nextInt();
		 
		
		 
		 int[] lastday= {31,28,31,30,31,30,31,31,30,31,30,31};   // 일괄처리 하기 위해 
				 
		 if((year%4 == 0 && year%100 != 0) || (year%400 == 0))
		      lastday[1] = 29;
		 else 
			 lastday[1] = 28;
		 
		 System.out.println(month + "달의 마지막 날은" + lastday[month-1]+ "입니다.");
		 
		
		
		
	}

}
