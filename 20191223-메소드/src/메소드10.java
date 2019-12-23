import java.util.Scanner;

// 정수 입력 ==> 출력

// 입력
// 출력
// 조립

public class 메소드10 {

	static int input()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int num = scan.nextInt();
		
		return num;
	}
	
	static void print(int num)   // 매개변수로 받을 떄는 반드시 데이터형과 함께 변수명을 같이 적는다.
	{
	  System.out.println(num);
		
	}
	
	static void process() 
	{
		int num = input();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
	}

}
