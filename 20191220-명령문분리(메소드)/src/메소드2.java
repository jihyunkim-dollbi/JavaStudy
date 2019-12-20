/*
 *  정수입력을 1개 받아서 ==> 2 진법으로 출력 !
 *  10 => 16bit 로 출력할것임!
 *  0000 0000 0000 1010
 *  
 *  
 *
 *
 * 
 * 
 */
import java.util.Scanner;
public class 메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		//  변수가 잡혀야 한다. 
		//  몇개가 필요할까? 두개가 필요하다. 16진수는 같은 용도로 쓰이는 숫자들이므로 0과1은 배열로 잡음! 
		int input = 0; // 사용자가 입력한 값 받는 변수
		
		System.out.println("정수입력: ");
		input = scan.nextInt();
		
		System.out.println(Integer.toBinaryString(input));
		
		int[] binary = new int[16]; // 0이 다 채워진 상태
		// 값이 뒤에서 부터 채워지고 있다. 따라서 배열을 뒤에서 부터 채워야한다.
		// 배열의 위치
		int index = 15; // 배열 => 값을 변경하려면 => 위치를 지정해야함 => 맨 앞(0 번), 맨 뒤(length-1)
		//  나누기와 나누고 나머지값이 계속 반복됨 ==> 따라서 반복분을 써야한다. ==> 숫자에따라 횟수가 지정안되므로 while문을 써야한다,
		// 값이 커지면 커질수록 나누기와 나머지값이 많아짐.
		//0이나 1이나오면 break걸고 나오게 한다
		// 나머지값저장이 첫번째 두번쨰가 나누기
		/*
		 *  10%2 =0
		 *  5%2 = 1
		 *  2%2 =0
		 *  1%2=1
		 *  
		 * 
		 * 
		 */
		// 처리하기
		
		while(true)
		{
			
			binary[index]=input%2;    // 뒤에서부터 하나씩 나누고 나머지값을 저장함.  - 감소를 해줌
									  // 1.나머지값 저장하기.  
			input = input/2;    // input/=2;
			
			if(input == 0)
				break;
			
			
			index--;
			
		}
		
		
		//출력  
		
		for(int i = 0; i<16; i++)
		{
			
			if(i%4 ==0 && i != 0)  // 4로 나누고 공백을 줘라 
			{
				
				System.out.print(" ");
				
			}
			System.out.print(binary[i]);
				
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
