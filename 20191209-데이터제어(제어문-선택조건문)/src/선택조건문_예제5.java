import java.util.Scanner;
public class 선택조건문_예제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		// 정수 두개와 연산자를 받아서 사칙 연산
		/*
		첫번째 정수 입력 : 10
		두번째 정수 입력 : 20
		연산자 입력 : +    ==> 조건) String op=scan.next()
		                        char c=op.charAt()
		
		==> 10+20 = 30
		/*
		 * 
		 * 
		 */
		
		int firstNum, secondNum;
				
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 입력: ");
		firstNum = scan.nextInt();
		
		System.out.print("두번째 정수 입력: ");
		secondNum = scan.nextInt();
		
		System.out.print("연산자를 입력하세요 : ");
		String op = scan.next();
		char c=op.charAt(0);
		
		if(c == '+'){
			System.out.println(firstNum + "+" + secondNum + "=" + (firstNum + secondNum));
		}
		if(c == '-'){
			System.out.println(firstNum + "-" + secondNum + "=" + (firstNum - secondNum));
		}
		if(c == '/'){
			System.out.println(firstNum + "/" + secondNum + "=" + (firstNum / secondNum));
		}
		if(c == '*'){
			System.out.println(firstNum + "*" + secondNum + "=" + (firstNum * secondNum));
		}
	
		
		//2020 3 22 - 다시 계산기 만들어봄
		
		System.out.println("첫번째 정수를 입력하세요: ");
		int num1=scan.nextInt();
		System.out.println("두번째 정수를 입력하세요: ");
		int num2=scan.nextInt();
		
		System.out.println("+,-,*,/ 중 한개의 사칙 연산을 입력하세요: ");
		String op=scan.next();
		
		if(op.equals("+"))
			System.out.println(num1+num2);
		if(op.equals("-"))
			System.out.println(num1-num2);
		if(op.equals("*"))
			System.out.println(num1*num2);
		if(op.equals("/"))
			System.out.println((int)num1/num2);
		
		
		
		
		
		
	}

}
