/*
 *  변수
 *  
 *  = instance 변수 : 생성 => new를 이용해서 메모리를 만들때
 *  = static 변수 : 컴파일할때, 바로 그자리에서 생성됨. => 메소드에서는 사용이 불가능 // 클래스 안에서만 사용이 가능
 *  ==================> 자동 초기화된다.
 *  = 지역변수 : 메소드 호출시 // 따라서 메소드 안에서는 일반변수와 상수만 가능하다.
 *  ==================> 반드시 초기화를 한다.
 * 
 *  모든 클래스의 초기값은 null 이다.
 *  // 클래스 변수로 선언할때는 초기값 부여된다.(선언만해도 초기값 생김.) ==> 아직 저장 안됨. new가 생성되고 메모리 크기가 생성되야 저장이 됨. 
 *  static 클래스를 제외한 나머지 클래스는 항상 new로 생성해야 한다.

 *  값을 지정하거나
 *  일단 지정된 초기값을 가지고 나중에 값을 부여해도된다.
 * 
 */




class Data{   
	
	// 클래스 안에서는 선언만 할 수 있다.(구현 => 연산처리, 제어문, 메소드호출==> 메소드나 블럭안에 들어가야 함. { })
	int a = 100;    // 0
	float f;   // 0.0f
	double d;    // 0.0
	boolean boo;  //false
	long l;    // 0L
	char c;    // '\0'
	String s;   // null => "주소가 없다." default값.
	String ss="";
	static int aa;   // new로 주소를 생성안해도 바로 주소값이 생성됨.

}

public class MainClass2 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Data.aa);
	//	System.out.println(Data.ss);   ==> 인스턴스 변수로 new를 생성해야 메모리 주소가 있어 참조할 수 있지만 new로 생성을 아직 안했기때문에, 참조할 주소값이 없어 참조해올 수 없다.
		
		
/*
		 Data dd = new Data();   // dd = 클래스 변수 = 객체(여러개를 모아놓은 메모리 저장 장소)
		 
		 System.out.println(dd.a);
		 System.out.println(dd.boo);
		 System.out.println(dd.c);
		 System.out.println(dd.d);
		 System.out.println(dd.f);
		 System.out.println(dd.l);
		 System.out.println(dd.ss);
		 System.out.println(dd.s);
		
*/		
	}

}
