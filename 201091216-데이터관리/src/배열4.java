import java.util.Scanner;

/*
 * 이름 성별 나이 주소 전화번호 입력할때 ==> 이 경우 클래스로 잡는 것이 좋다.
 * 국어 점수 10명 관리 ==> 배열로 처리 편리.
 * 
 * 따라서 배열은 같은 카테고리와 데이터형을 가진 값들의 모음.
 * 
 * 배열은 사용자 정의다.
 * 내가 원하는 바이트만큼 직접 만들 수 있다.
 * 참조변수 :  맨앞에 시작하는 메모리 주소로 시작하고, 인덱스 번호를 연속적으로 붙여 공간이 나열된다.
 * 
 * 모든 클래스도 배열로 만들 수 있다.
 */
public class 배열4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 년도 월을 입력받아서  ==> 월의 마지막날은 몇일?
		// 배열 = > 일괄처리 가능한 것들을 모으는 것이다.
		// 이 경우 마지막 날짜들을 모아서 배열로 만들어 놓음
		// 1,3,5,7,8,10,12 = 31
		// 2-29,2-28       = 28,29
		// 4,6,9,11        = 30
		
		 Scanner scan = new Scanner(System.in);
		 
		 int year;
		 int month;  // int[] data = new int[2]
		 
		 System.out.println("년도 입력: ");
		 year = scan.nextInt();
		 
		 System.out.println("월 입력: ");
		 month = scan.nextInt();
		 
		 int lastday = 0;
/*		 
		 if(month == 4 || month == 6 || month == 9 || month == 11)
		 {
			 lastday = 30;
		  }
		 else if(month == 2) {
			 
			  if((year%4 == 0 && year%100 != 100) || year%400 == 0)
					{ 
						lastday = 29;
					}
					else 
						lastday = 28;
	
	      }
		  else
		  {
			  lastday = 31;
		  }
		  
		  
		  
		  
		  // 아래는 스위치 케이스로 다시 코딩해보았다.
*/
/*		 
		 switch(month)
		 {
		 case 4:
		 case 6:
		 case 9:
		 case 11:
			 lastday = 30;
			 break;
		 case 2:
			 if((year%4 == 0 && year%100 != 100) || year%400 == 0)
				{ 
					lastday = 29;
				}
				else
				{
					lastday = 28;
				}
			 break;
	    default:
	    	lastday = 31;
		 
		 }
		 
		 System.out.println(month + "월의 마지막 날은" + lastday + "까지 요일이 있습니다.");
		 
		 
*/
		 
		 
		
	}

}
