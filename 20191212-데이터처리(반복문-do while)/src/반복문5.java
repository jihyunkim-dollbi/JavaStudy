import java.util.Scanner;

public class 반복문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		int num2 = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		
		do {
			
			if(i == 1)    //do while 안에 if 와 else를 준 이유는  첫번째 바퀴에 첫번 정수입력받고, 두번째 바퀴에 두번째 정수를 입력받는다..
				         // 반복문4 처럼 do 안에 실행문에 두개 정수를 한꺼번에 적으면 두개가 동시에 나온다.
			{
				
				System.out.println("첫번째 정수 입력: ");
				num1 = scan.nextInt();
			}
			else {
				
				
				System.out.println("두번째 정수 입력: ");
				num2 = scan.nextInt();
			}

			i++;
			
		}while(i<=2);
		
		if(num1 > num2)
			
			System.out.println("최대값: " + num1+ ", 최소값: " + num2);
			
		
		else 
			
			System.out.println("최대값: " + num2 + ", 최소값: " + num1);
		
		System.out.println("최대값: " + (num1>num2?num1:num2) + ", 최소값: " + (num1>num2?num2:num1));

		
		System.out.println("최대값: " + (Math.max(num1, num2)) + ", 최소값: " + (Math.min(num1, num2)));
		
		
		/*    "반복문4"에서 처음의 실수는 do 안에 바로 실행문을 쓰니 첫번째 , 두번째 정수가 동시에 나오고,
        "반복문5"에서는 if else를 만들어서 실행문을 적용했다.-- but 그럴필요없이
        "반복문 6"에서 정수입력 실행문을 do 밖에 처음에 적어서 훨씩 간결하게 처리하였다.
        */
		
		
	}

}
