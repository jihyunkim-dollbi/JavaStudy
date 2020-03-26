/* 메소드
 * 자바(객체지향) - 클래스 
 *               === : 변수
 *                     메소드(제어문 연산자)
 * 
 * 오버라이딩 - 라이브러리 수정 / 오버로딩 - 직접 코딩
 * 
 * 매개변수? , 리턴형?
 * 
 * 
 * 호출된 지점으로 다시 돌아가서 실행을 하면서 돌아온다.
 * 
 * 한번 부르면 처음부터 다시 시작한다. 
 * 
 * 따라서 메인에서는 시작점만 잡으면 된다. 메소드들의 순서만 나열 하면된다.
 * 
 *  
 *  형식)    
 *  
 *     리텬형명시    형      메소드명(매개변수...)
 *     ======= ===== =======
 *     static   int    plus (int a, int b)
 *     {
 *        구현부
 *     
 *     }
 *  
 *    
 *  
 *      리텬형(처리결과값) 메소드명(매개변수...1개 or 여러개 or zero!) -==> 선언부
 *      =============  =====
 *      기본형으로 나오거나   약속사항:모든 매소드명은 소문자로 한다.(헝가리언식:getText(), nextInt()) 두번째 단어의 첫글자만 대문자.
 *      =============
 *      배열형으로 나오거나
 *      클래스형으로 나오거나
 *      ==============> 결과값 여러개 나올때
 *      
 *      
 *      {
 *      
 *       ==> 구현부
 *           연산처리
 *           제어문
 *      
 *           return  결과값-> 반드시 한개!
 *           =====
 *           VOID일때 리턴값 생략가능! JVM에서 자동으로 생성해줌!
 *       }
 * 
 *  	*** 리턴값은 1개만 설정할 수 있다.
 *          따라서 여러개일 경우 묶어서 보내준다!
 *      *** 모든 메소드는 return이 있으면 종료한다. -> 보통 사용자입력값이 이상할 수 있는 경우 리턴을 주고 종료하고 다시 메소드를 호출하라는 상황!
 *      									  리턴하여 다시 처음부터 시도하라는 뜻.
 *      
 *      -----------------------------------
 *      *** 결과값? 
 *          결과값을 뭐로 줄건지 고민하자.
 *      *** 사용자가 요청한 값이 뭘까?
 *      	이것에 대한 처리결과값이 뭘까?
 *      
 *      *** 호출을 어느시기에 어느 위치에서 할 것인지
 *      -----------------------------------
 *      
 *      사용자가 입력한 값 4 개 , 몇칸 ==> 리턴값은 
 *      
 *            
 *       모바일 ip, web ip 
 *      
 *      메소드는 세로모양으로 위에서 아래로 차례로 한개씩 실행이 되지만
 *      쓰레드는 동시에 여러 실행이 가능하다 가로모양.
 * 
 */
import java.util.Scanner;
public class 메소드1 {
	
	// +
	static int plus(int a, int b)   // 무한루프가 돌아가면 다음 실행을 할 수가 없다. call stack
	{
		
		return a+b;
		
	}
	
   // -
	static int minus(int a, int b)
	{
		
		return a-b;
	}
	
   // *
	static int gop(int a, int b)
	{
		
		return a*b;
	}
	
   // /
	static double div(int a, int b)   //리턴형과 결과값이 동일해야 하기 때문에 double로 결과값을 바꿔줌.
	{
		
		return a/(double)b;
	}
	
  //계산기 
	static void process()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("첫번재 정수 입력: ");
		int a=scan.nextInt();
		
		System.out.println("두번재 정수 입력: ");
		int b=scan.nextInt();
		
		System.out.println("연산자(+,-,*,/) 입력: ");
		String op = scan.next();
		
		
		
		switch(op)
		{
		
		case "+":
		{	int res=plus(a,b); //리턴값
			System.out.printf("%d%s%d\t%d\n", a,op,b,res);
		}	
		break;
		
		
		case "-":
		{	int res=minus(a,b); //리턴값
			System.out.printf("%d%s%d%d\n", a,op,b,res);
		}	
		break;
		
		case "*":
		{	int res=gop(a,b); //리턴값
			System.out.printf("%d%s%d%d\n", a,op,b,res);
		}	
		break;
		
		
		case "/":
		{	
			double res=div(a,b); //리턴값
			System.out.printf("%d%s%d%f\n", a,op,b,res);  // 더블형이기 때문에 %f로 바꿔줌
		}   
		break;
		
		}
		
	}
	
	public static void main(String[] args) {      
		// TODO Auto-generated method stub

		// return;(생략가능) // VOID이기 때문에 리턴값을 줘야하지만 JVM에서 자동으로 해결해줌. return안해줘도 ok!
		// java.lang(생략가능)
		// 예외처리(생략가능기능 자동으로 되었음)

		
		// 사칙연산 하는 프로그램 만들기
		
		  Scanner scan = new Scanner(System.in);
		  while(true)
		  {
			  
			  process();
			  System.out.print("y|n 입력: ");
			  String ex=scan.next();
			  switch(ex)
			  {
			  case "y":
				  System.exit(0);
				  break;
			  case "n":
				  break;
			  }
		  }
		  
		  
	//  process();  // 자기자신이 메소드 이기 때문에 메소드명 생략가능하고 process();가능!
		   
		
	}

}
