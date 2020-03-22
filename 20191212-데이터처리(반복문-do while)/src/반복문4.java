import java.util.Scanner;

/*
 *  두개의 정수를 입력 받아서
 *  최대값, 최소값
 *  do-while 
 * 
 * 10 , 30 ==> 최대합 30 최소값은 10!
 * 
 */

import java.util.Scanner;
public class 반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int num1 = 0;
		int num2 = 0;

		Scanner scan = new Scanner(System.in);
		
		int i = 1;
		
		do {
			
			System.out.println("첫번째 정수 입력: ");
			num1 = scan.nextInt();
						
			System.out.println("두번째 정수 입력: ");
			num2 = scan.nextInt();
			
			if(num1 > num2) {
				
				System.out.println("최대값은: " +num1 + "최소값은: " + num2);
				
			}
			else if(num2 > num1) { 
				
				System.out.println("최대값은: " + num2 + "최소값은: " + num1);
			}
			
		     else {
		    	 
		    	 System.out.println("서로 다른 값을 입력하세요.");
		    	 
		       }
		   
			i++;
			
		}while(i <= 2);
			
		///////////////////////////
		
		
		Scanner scan = new Scanner(System.in);
		
		
			Scanner scan = new Scanner(System.in);
		int num1=0;
		int num2=0;
		
		int i=1;
		do{
			
			if(i==1) {
			System.out.println("첫번째 수를 입력하세요");
			num1=scan.nextInt();
			}else {
			System.out.println("두번째 수를 입력하세요.");
			num2=scan.nextInt();
			}
			

			i++;
			
		}while(i<=2);
		
		String result=num1>num2?num1+"이 더 큽니다.":num2+"가 더 큽니다.";
		System.out.println(result);		
		
		/*  "반복문4"에서 처음의 실수는 do 안에 바로 실행문을 쓰니 첫번째 , 두번째 정수가 동시에 나오고,
            "반복문5"에서는 if else를 만들어서 실행문을 적용했다.-- but 그럴필요없이
            "반복문 6"에서 정수입력 실행문을 do 밖에 처음에 적어서 훨씩 간결하게 처리하였다.
        */
		
		
	}

}
