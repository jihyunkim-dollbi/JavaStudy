import java.util.Scanner;

/*
 * Wrapper 클래스
 * =======
 * 기본형(int, long.. ) 쉽게 제어 할 수 있게 만들어진 클래스
 * 
 * int ==> Integer   ==> BOXING, AUTOBOXING
 * Integer ii = new Integer(10);
 * int i = ii.valueOf(); => i=10       ==> static 메소드 => 메모리할당 없이 사용가능!
 * 
 * int i=ii;
 * Integer ii=10;
 * 클래스지만 일반 데이터형처럼 사용. =>   BOXING
 * 
 * AUTOBOXING =>반대로 만들어줌
 * 
 * 
 * 
 * 
 * double ==> Double
 * byte ==> Byte
 * long = > Long....     ==> static 메소드s => 메모리할당 없이 사용가능!
 * boolean ==> Boolean
 * 
 *
 * ==> String s = "100";
 * int i= (int)s;
 * 
 *  
 */
public class MainClass4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer ii = new Integer(100);
		int i=ii;
		int k=1000;
		Integer kk=k;
		System.out.println(kk);
	/*	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("정수입력: "); 
		String no1=scan.next();
		
		
		System.out.println("정수입력: ");
		String no2=scan.next();
		
	*/
	//	System.out.println(Integer.parseInt(no1)+Integer.parseInt(no2));
		
		String s="true";
		if(Boolean.parseBoolean(s) == true) // boolean 값으로 변경   or s.equals("true")
		{
			System.out.println("출력");	
		}
		
		String ss="false";
		if(Boolean.parseBoolean(s)) // boolean 값으로 변경   
		{
			System.out.println("출력");	
		}
		
		String score="4.5";
		System.out.println(score);
		
		System.out.println(Double.parseDouble(score)+1);
		
		boolean b = true;
		System.out.println(String.valueOf(b));   // ==> 모든 데이터형을 문자열로 바꿀때.
		// .valueOf()  ==> static method! not instance method!
	
		
		
		
	}

}
