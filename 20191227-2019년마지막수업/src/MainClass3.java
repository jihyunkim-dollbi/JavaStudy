class Sawon{   // (1)먼저 s1의 4바이트 공간에 주소가 들어가고(Sawon s1) (2)두번째로, new가 메모리 크기를 계산해 메모리를 생성한다.
	
	
	int sabun;
	String name;
	String dept;
	String loc;
	long pay;
	static String company; //공통변수
	
	
// 생성자는 자동으로 추가시켜준다...........................................................................

//    Sawon s1                          = new Sawon();
//                                        (3)=========> 빈공간에 생성자를 넣어 name과 dept, loc등등을 넣어줌.
//=========                               ===========
// 접근할 주소                                                     실제 데이터가 들어가는 곳
//			                              heap: (GC있음)
//stack: 블록을 벗어나면 자동으로 사라지기 때문에       
// static String company는 위의 s1,s2와 다른 영역에 메모리가 생성됨.
/*
 * 
 * 
 * 
 * 
 * 
 * <메모리 영역>
 *  1. 0.5 - method   ||   0.5 - static변수 (static 변수: 필기체로 되어있음)
 *  2. stack (지역변수-갈색)
 *  3. heap - 인스턴스 변수는 - 파란색
 * 
 * =======================================================
 * 
 * 변수의 우선순위 => 1순위. 지역변수(지역변수, 매개변수) {}이 종료되면 사라지는 변수들.
 * 
 * 
 */
	
/*
Sawon(){
	
	int sabun = 10;
  //sabun = sabun;  //==>지역변수와 클래스변수와 이름이 같아도 된다. 변수가 같을때는 지역변수가 우선순위이다. ==> 메소드 안에서는 지역변수가 우선순위이다.
	this.sabun = sabun;  // ==> 사원 자신이 가지고 있는 값.  
	
}
*/	
	
}  

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sawon s1 = new Sawon();
		
		s1.sabun = 1;
		s1.name = "홍길동";
		s1.dept = "개발부";
		s1.loc = "서울";
		s1.pay = 3500;
		s1.company = "SIST";
		
		Sawon s2 = new Sawon();    // s2이 선언이 되었다면 다른 인스턴스 값들은 null값이고 company만 "SIST"값을 가지고 있다. 
									// company를 어떤 객체에서 변경하든 모든 객체에서 변경이됨.
		s2.company = "SIST2";
		Sawon.company="SIST3"; // static 변수는 최종적으로 나온 값이 고정된다.  
							   // 클래스명 과 객체를 통해 접근 가능하다.
		System.out.println("s1: " + s1.sabun);
		System.out.println("s2: " + s2.sabun);
		System.out.println(s1.company);
		System.out.println(s2.company);
		System.out.println(Sawon.company);
		
		
		
	}

}
