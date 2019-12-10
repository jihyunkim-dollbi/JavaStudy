/*
 * ===================
 * method 공간(static)
 * ===================
 * stack => 메모리 관리({} 이 끝나면 저장으로 회수 - 현재 상용하는 공간 -> 지역변수 - 메인지역
 * ===================
 * heap => 사용자가 관리 => 가비지컬렌션이 회수 ->멤버변수(전역변수)
 * ====================
 * 
 * 
 * 
 */
public class 단항연산자_증감연산자 {
  // int a=10 전역변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// --, --
		int a=10;
		a--; // 후치연산 => a=a+1  => a=10+1
		a--;
		a--;
		System.out.println("a="+a);
		
		int b=10;
		--b;
		--b;
		--b;
		System.out.println("b="+b);
		
		int c=10;
	    int d=c--;   // 따라서 대입먼저 다음 증가 , d=10 , c=9
	    System.out.println("c="+c);
	    System.out.println("d="+d);
		
		
	    int e=10;
	    int g=--e;   // e값을 먼저 증가하고 증가된 값을 g에 대입   e=9 , g=9  ***** edit -> find/replace  
	    System.out.println("e="+e);		
	    System.out.println("g="+g);
	}

}
