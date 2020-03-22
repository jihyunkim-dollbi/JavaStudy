/*
 * 
 *   if 수행문장의 범위
 *   
 *   if(조건문)
 *      실행문장 1   ==> if의 소속문장
 *       
 *      실행문장 2   ==> if와 관련이 없는 문장 -> true/false와 관련없이 무조건 실행을 하는 문장
 * 
 *      ==> 자바에서 모든 제어문은 {}  블록이 없는 경우 한 문장만 수행.
 *     
 *     if(조건문)
 *     {  
 *        실행문장 1     ==> 가독성 좋음- 블록 사용하기
 *      
 *      }
 * 
 *        실행문장 2 
 *
 * 
 *     ---> 따라서 가독성(주석걸기), 최적화가 중요함( = 리펙토링), 마이그레이션(Spring -> SpringBoot)
 *     
 *      ex) abc()  ==> add()
 *          def()  ==> minus()

 */

public class 제어문_조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int num = 16;
		
		int a = 10;
		a++;   // 대입연산자가 없을 경우 모조건 연산은 된다.
		System.out.println(a);
		
		int b = 100;
		b = a++;  // 대입연산자를 하기 때문에 전치인지 후치인지에 따라서 값이 달라짐. 
		
		int c = 10;
		c++;
		c++;
		c++;  // 1씩 증가할 때만 쓰임.
		c++;
		c++;
		System.out.println("c=" + c);
		
		int d = 10;
		d+=5;    // 원하는 값만큼 증가할때 쓰임.
		System.out.println("d=" + d);
		
		// 여러개의 실행문장을 동시에 제어할때 사용하는 조건문 {안에 여러 실행문을 넣으면 된다.}
		if (num%2 != 0)
		{
			
			System.out.println("b는 " + b + "입니다");
			System.out.println(num + "은(는) 홀수입니다.");
			System.out.println("프로그램종료");   
		    b++;
		    
		}
		  //  System.out.println(b);   ==> 블럭이 끝났기때문에 (b는 지역변수이기 때문에) 실행할 수없다.
		  //                               지역변수 - 블럭안에서 사용, 블럭이 끝나면 자동으로 사라진다.
		  //                               전역변수 - 블럭 위에서 b를 선언해주면 가능.
		 		 
		// if (num%2 != 0)
	//	 {
	//		 System.out.println(num + "은(는) 홀수입니다.");
	//	 }
		 
		 
	        System.out.println(b);

		    int ree = a;   // char는 예외적으로 
		    System.out.println(ree);
	     
		
	}

}
