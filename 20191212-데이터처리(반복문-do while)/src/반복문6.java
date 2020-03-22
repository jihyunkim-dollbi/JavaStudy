import java.util.Scanner;

public class 반복문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		int num2 = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		

		System.out.println("첫번째 정수 입력: ");
		num1 = scan.nextInt();
		
		System.out.println("두번째 정수 입력: ");
		num2 = scan.nextInt();
		
		do {
			
			if(num1 > num2)
				
				System.out.println("최대값: " + num1+ ", 최소값: " + num2);
				
			
			else 
				
				System.out.println("최대값: " + num2 + ", 최소값: " + num1);
			
			System.out.println("최대값: " + (num1>num2?num1:num2) + ", 최소값: " + (num1>num2?num2:num1));

			
			System.out.println("최대값: " + (Math.max(num1, num2)) + ", 최소값: " + (Math.min(num1, num2)));
			
			
			i++;
			
		}while(i<=1);   // 1로 바꿔주었다.  2로 실행했을경우 두번을 실행하여 6줄의 문장이 나옴.
		
		 /*    "반복문4"에서 처음의 실수는 do 안에 바로 실행문을 쓰니 첫번째 , 두번째 정수가 동시에 나오고,
                "반복문5"에서는 if else를 만들어서 실행문을 적용했다.-- but 그럴필요없이
                "반복문 6"에서 정수입력 실행문을 do 밖에 처음에 적어서 훨씩 간결하게 처리하였다.
         */
	
	}

}
