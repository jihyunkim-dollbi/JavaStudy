/*
 * 가위 바위 보  == 5번!
 * ==> 1승, 3패 , 1무
 * 
 *   
 */
import java.util.Scanner;
public class 반복문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int i = 1;
		int win=0, lose=0, same=0;
		 
		// com-user  
		// com 가위  -0,-1,2
		//     바위  1,0,-1
		//     보     2,1,0
		
		
		// 사용자 이길경우=> -1,2
		// com =>1,-2
		Scanner scan = new Scanner(System.in);
		while(i<=5) {
			
			// 가위바위보 게임
			// 컴퓨터 => 가위바위보
			int com=(int)(Math.random()*3);
			// 사용자=> 입력
			System.out.print("가위(0)바위(1)보(2):");
			
			int user = scan.nextInt();
			//비교
			
			int res = com-user;
			
			switch(res) {
			
					
			
			/*if (res == -1 || res == 2) {
				// 사용자 win
				win++;
				
			}else if(res == 1 || res == -2) {
				// 컴퓨터 win
				lose++;
				
			}
			else {
				 same++;
			*/
				
			
			case -1:
			case 2:
				win++;
				break;
			case 1:
			case -2:
				lose++;
				break;
			default: same++;
			
			
			}
			i++;
		}
			
		// 승 무 패
		
		System.out.println("사용자 정적:"+ win+ "승 "+ same + "무" + lose+ "패");
		
		
	}

}
