import java.util.Scanner;

/*
 * 
 * 구구단 출력
 * 
 * for+while 
 * 
 * 
 * 
 */
public class 이중반목문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1 ; i <= 9; i++)
		{
			
			for(int j=1 ; j <= 9; j++) {
				
				System.out.printf("%2d *%2d = %2d\t" ,j,i,j*i);
				
			}
			
			System.out.println();
			
		}
		
		
		Scanner scan = new Scanner(System.in);
	//	=======================================
		// heap 의 영역	scan. ---> scan 안에 heap 의 영역에 있는 next()를 불러옴	
        // 제어문 안쪽에 들어가면 메모리값이 반복되어 생성됨.
		
		
		int a =1;
    //  =======================================
		// stack 의 영역- 메모리값? 	
	     
    // static --> public ! 공통으로 쓰임@
		
		
		System.out.println("\nfor + while==========");
		
				
		for(int i=1; i<=9; i++) {
			
			int j=1;        // int를 선언하므로써 메모리 값이 형성됨, 메모리값9개.
			while(j<=9) {   // 조건문
				
				System.out.printf("%2d *%2d = %2d\t\n" ,j,i,j*i);
				j++;   // 증감
			}
			
			System.out.println();
		}
		
		
	}

}
