import java.util.Scanner;

// 사직연산
// + - * /
// char c를 배열로 받아서 편리하게 for문으로 연산값 설정하기. 
//1. char 배열로 받기 만들고!
//2. 연산하기 for믄으로 돌리고
//3. 연산결과는 double로 void로 만들기
//4. print void로 출력하기!!
public class 메소드11 {
/*	
	static int[] input()
	{
		
		int[] arr = new int[2];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하세요: ");
		arr[0] = scan.nextInt();
		
		System.out.println("두번째 정수를 입력하세요: ");
		arr[1] = scan.nextInt();
		
		
		return arr;
		
	}
	
	
	static char[] input2()    // 스캐너로 입력받는 것은 매개변수가 아니므로==> 일단 스트링으로 받고, 리턴형과 결과값은  char로 동일하게 맞추었다.
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("(+,-,*,/)연산자를 입력하세요: ");
		
		String op = "";
		
		op = scan.next();
		char[] c = op.toCharArray(); 
				
		return c;
	}
	
	
	static void calc(int[]arr, char[] c)
	{
	 
		int a = arr[0];
		int b = arr[1];
		
		
		
	   if (c == '+')
	   {
		   
		   System.out.println(a+b);
	   }
			   
	   else if(c == '-')
	   {
		   
		   System.out.println(a-b);
	   }
	   else if(c == '*')
	   {
		   System.out.println(a*b);
	   }
	   else if(c == '/')
	   {
		   if(b == 0)
		   {
			   System.out.println("0으로 나눌 수 없습니다.");
		   }
		   else
			   System.out.println((int)a/b);    // 만약 더 큰수로 나누면 값이 0이 나온다! 왜냐하면 int 이기때문에 소수점값은 모두 버려지기 떄문에!
		   
	   }
	   else
	   {
		   System.out.println("연산자를 다시 입력해주세요.");
	   }
	   	   
	}
	
	
	
	
	
/*	
	static double result(int[]arr, char c)
	{
		int aa = arr[0];
		int bb = arr[1];
		
		double d = arr[0]
			
		
		return 
	}
*/	
	
/*	
	static void print(int[] arr, char c)
	{
		
		System.out.printf("%d %c %d = %.1f",arr[0], c, arr[1], calc() );
		
		
	}
	
*/
	/*
	static void process() 
	{
		int[] num = input();
		  char[] c = input2();
		   calc(num, c);      //calc(arr,c) 를 대입했을떈 arr에서 error 발생. arr을 넣은 이유는 calc에서 arr배열을 넣어줬기 떄문에!!
		
	}
	
*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

	
}
