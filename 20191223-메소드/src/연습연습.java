import java.util.Scanner;

public class 연습연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("(+,-,*,/)연산자를 입력하세요: ");
		
		String op = "";
		
		op = scan.next();
		char[] c = op.toCharArray(); 
		
		System.out.println(c);
		
	}

}
