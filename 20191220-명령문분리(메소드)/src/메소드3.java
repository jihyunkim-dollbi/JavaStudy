import java.util.Scanner;
//입력한 값만 가져오면 된다 . 매개변수 없음.
public class 메소드3 {
	// 입력
	static int userInput()  //매개변수가 없는 경우이다. 이유는 scan 으로 입력을 받기 때문에!
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수입력:");
		int input = scan.nextInt();
		return input;
		
	}
	
	//이진법 처리   // 입력받은 값을 보내줘야 2진법으로 계산을 해줌
	static int[] toBinary(int input)  // 위에서 리턴받은 input 값을 매개변수로 사용!  
	{
		
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
		return binary;   
		
		
	}
	
	
	//출력 // 출력만 할때 void
	static void print(int[] binary)
	{
		
		for(int i = 0; i<16; i++)
		{
			
			if(i%4 ==0 && i != 0)  // 4로 나누고 공백을 줘라 
			{
				
				System.out.print(" ");
				
			}
			System.out.print(binary[i]);
				
		}
		
		
		
	}
	
	
	//조립
	static void process()
	
	{
		
		
		int input = userInput();
	    int[] binary=toBinary(input);
	    print(binary);
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		process();
		
		 
		 
		 
	}

}
