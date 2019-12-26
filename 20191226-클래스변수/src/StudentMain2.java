import java.util.Scanner;

class StudentVO2{    // 같은 폴더내에서 같은 클래스가 있으면 안됨.

	 String name;
	 int kor;
	 int eng;
	 int math;
	 
	 	
}
public class StudentMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentVO2[] std = new StudentVO2[3];
		
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++)
		{
			StudentVO2 vo = new StudentVO2(); // 주소값이 배열에 한개씩 들어감
			
			System.out.println(vo);
			
			System.out.print("이름: ");
			vo.name = scan.next();
			
			System.out.print("국어: ");
			vo.kor = scan.nextInt();
			
			System.out.print("영어: ");
			vo.eng = scan.nextInt();
			
			System.out.print("수학: ");
			vo.math = scan.nextInt();
			
			
			std[i] = vo;   // vo가 3개씩 따로 생김. 다른 주소값.
			
			
			
		}
		
		
		for(StudentVO2 s: std)
		{
			System.out.println(s.name + " " + s.kor + " " + s.eng + " " + s.math);
		}
		
		
		
	}

}
