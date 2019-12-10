// 사용자의 입력값을(무조건 스캐너) 받아서 (짝수, 홀수) 를 정하기
import java.util.Scanner;
public class 이항연산자_비교연산자2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scan=new Scanner(System.in);
       System.out.println("정수입력:");
       int num=scan.nextInt();
       //짝수, 홀수 두개의 문자이므로 스트링으로 받아야한다.
       
       String result=num%2==00?"짝수":"홀수";
       
       
       
       System.out.println(num+"는 (은)"+result+"입니다.");
	}

}
