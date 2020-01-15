// 인스턴스 변수는 값이 변하기 때문에 객체를 그때그때 생성하는 생성자를 이용하고
// static 변수는  값이 고정이고 생성자를 사용하지 않기 때문에 "static 초기화 블럭"을 이용한다.

class MyData{
	
	int[] arr = new int[6];
//	인스턴스 변수 = > 객체만이 가지고 있는 변수  <=> static 변수: 객체와 상관없이 저장됨.
	// int a = 10; 선언 ok
	// a = 20;  구현 x , 다른 값을 대입 = 구현 // ===> 블럭을 사용해 구현한다.
	
	
	{ // 초기화블럭 : 구현 가능해짐 // 자동으로 인식되어 객체를 생성할 필요 x
		
		for(int i = 0; i<6; i++) 
		{
			arr[i]= (int)(Math.random()*100)+1;
		}
		
	}
	
}

/*
 * 변수 초기화 방법
 * ========
 * 
 * 선언과 동시에 초기화
 * int a = 10;
 * a = 100(x) 구현 하면 안됨. 
 *
 * ====================> 초기화 블럭(맴버변수의 초기화)
 * {
 *    a = 100;  ==> 가능
 * }
 * ====================> 
 * 클래스명()
 * {
 *    a = 200;
 * }
 * ====================> static 초기화 블럭(맴버변수(static)초기화)
 * 
 *  새로고침시에 값이 계속 남아 있다면 같은 주소값을 가지고 있는 것이며,
 *  메인화면에서 '다음'을 클릭했을때 값이 계속 변하는 것은 값이 변하는 것이다. ==>값이 변해도 같은 주소를 사용하게 함 => single 톤 패턴? 같은 메모리주소 사용!
 *  새로고침 할 때 마다 그 전에 있던 메모리는 즉각 회수된다.  
 *  
 *   static 변수 값은 마지막 객체 생성되어 가장 마지막으로 저장된 값이 static 값이 된다. 바뀔 수 있고, 마지막으로 바뀐 값이 최종값이 된다.static 변수이다!!! 상수x
 *   
 *   인스턴스 vs static
 *   맴버변수 & 지역변수 & 전역변수
 *   
 *   
 *   
 *   ++++
 *   
 *   1. 초기값을 어떻게 줄 것인가?  String => 초기값을 주어야 null로 안됨. , 지역 변수는 활용전에 초기값을 반드시 주어야한다. 멤버변수는 기본 초기값을 가지고 있다?
 *    
 *   
 *   
 */

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		MyData m1 = new MyData();
		
		for(int i = 0; i <6 ; i++)
		{
			System.out.print(m1.arr[i] + " ");
			
		}
		
		System.out.println("\n====================");

		MyData m2 = new MyData();
		
		for(int i = 0; i <6 ; i++)
		{
			System.out.print(m2.arr[i] + " ");
			
		}
/*27 34 22 62 84 53 
====================
  47 4 82 82 24 98 
 * 
 * 값이 계속 변함.
 */
		/*
		for(int i = 0; i <6 ; i++)
		{
			System.out.print(MyData.arr[i] + " ");
		}
		*/
		
		MyData m1 = new MyData();
		MyData m2 = new MyData();
		MyData m3 = new MyData();
		MyData m4 = new MyData();
		MyData m5 = new MyData();
		MyData m6 = new MyData();
		MyData m7 = new MyData();
		
	}

}
