import java.util.Scanner;

/*
 * 정수를 입력 받음 => 1,2,3,4
   입력받은 정수에 따라 x, y값을 변경하여 축에서 점을 변경해준다. (속도, 위치 변경 가능 프로그램!)
 */
public class 제어문_조건문5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	// 상수는 대문자로 변수명 설정! --> 변경이 안되는 값 + FINAL 해서 상수로 만들어줌.
		
        final int UP=1;
        final int DOWN=2;
        final int LEFT=3;
        final int RIGHT=4;
        
	// x축 - 가로
        int x = 0;
	// y축 -세로
	int y = 800;   
		
        Scanner scan = new Scanner(System.in);   // ctrl +space  쓰기!
        System.out.println("키보드 입력(위:1, 아래:2, 왼쪽:3, 오른쪽:4):");
        
        int input = scan.nextInt();
        
        if(input == UP) {
        	System.out.println("위쪽으로 올라간다!!");
        	y +=5;
        }
        if(input == DOWN) {
        	System.out.println("아래쪽으로 내려간다!!");
        	y -=5;
        }
        if(input == LEFT) {
        	System.out.println("왼쪽으로 간다!!");
        	x -=5;
        }
         if(input == RIGHT) {
        	 System.out.println("오른쪽으로 간다!!");
        	 x +=5;
         }
        
		
	}

}
