/*
 * 	  클래스의 구성요소
 *   =============
 * 	 A. 변수(전역변수, 멤버변수)
 * 	 ==> 다른 클래스에서 사용이 가능하다.
 *   ==> 메모리에서 해제되는 시점이 프로그램 종료시
 *       (메모리 => heap 영역)
 *   =============
 *   B. 생성자(메소드):멤버변수에 대한 초기화 담당 ==>메모리 저장후 가장 먼저 호출이 되는 것. 생성자!(사용처: 윈도우 프로그램(일단 시작한다.)) 
 *	  특징)
 *   	1. 클래스 명과 동일
 *   	2. 리턴형이 없다(void는 리턴형이다.) -> void 붙이지 않는다.
 *   	3. 생성자는 여러개를 만들 수 있고, 생성하지 않을 수도 있다. ==>JVM 이 자동 생성함.   
 *   	4. 오버로딩을 지원한다.
 *   	   =====(중복메소드)
 *   	   1) 한개의 클래스 안에서 같은 이름의 메소드를 여러개 사용
 *   	   2) 매개변수가 다른다(매개변수의 데이터형이 다르거나, 갯수가 다르면 다른 메소드로 인식함.)
 *   	   3) 리턴형은 관계없다.
 *   		  void display()
 *   		  int display()
 *   			==> 같은 메소드이다. () 과 메소드명 동일.! 리턴형은 상관 없다.1
 *   
 *   		  void display()
 *   		  int display(int a)
 *    			==> 다른 메소드 ==> 오버로딩!
 *    
 *    		4) 기능이 같다.  
 *    		   ex) println, printf
 *    		   plus(int a, int b)
 *    		   plus(double d1, double d2)
 *    		   
 *    	5. 상속의 예외 조건(생성자, static- 상속은 안되지만 사용은 가능하다.)
 *    	 	   상속의 개념은 혼자만 쓸 수 있는 것.so, static 은 안된다.
 *      6. 생성자 와 메소드를 다르게 사용하는 경우
 *         생성자 사용 경우 ==> 상속이 안되니까 여기서만 사용할 경우. 수정 x,서버는  무조건 생성자부터 읽어드린다. 매개변수있는 생성자 있음............
 *         메소드 사용 경우 ==> 재사용이 필요한 경우. 수정 O
 *         
 *         
 *   ==============
 *   C. <메소드>
 *   
 *   ==> 명령문의 집합 ==> 관련된 명령을 모아서 처리(구조적 프로그램)
 *   메소드 : 멤버변수를 활용 => 기능, 작동을 담당한다.
 *    		연산처리 = 제어문 사용
 *    		==> 사용자 요청을 처리하는 곳. ex) id는 브라우저를 끄기 전까지 가지고 있어야함 => 멤버변수 -=> 서버저장=> session program. 
 *    									password는 지역변수()
 *   
 *   ==============
 * 
 *   주메뉴 - 클래스
 *   부메뉴 - 메소드........... 상세보기(메소드)
 *   
 * 
 * 
 * 
 * 
 */
public class MainClass {
	//필드는 속성을 선언만 한다. 값을 주지 않는다. 이후에 여러 객체를 생성하여 자유자재로 값을 넣어줄 것이기 떄문에.
	String name;
	String sex ; 
	int age;
	
	//초기화하기(초기값주기.) ==> 생성자! ==> MainClass mc = new MainClass() ==> 일단 { }  있다면 구현이 된것이다. 메모리에 저장이 된다.
	//{} 이 없는 상태는 선언. 
	public MainClass() {
		
		// 초기화 ==> 외부에서 값을 가져올때 위에서 값을 주지 않고 따로 선언만 하고 생성자에서 값을 준다.
		// 생성자 주 사용처 : 윈도우, 네트워크, 데이터베이스
		name = "심청이";
		sex = "여자";
		age = 25;
		
	}
	
   //  this.name = "";  ==> this는 메소드 안에서만 구현가능함.
	
	//매개변수를 가지고 있는 생성자
	public MainClass(String name, String sex, int age) {  // 객체 생성시 값을 넣어주면서 객체를 생성해야한다.
		
		// 지역변수(인스턴스)가 우선순위 => 멤버변수(static)은
		// 지역변수, 멤버변수가 동일할때 ==> 지역변수가 우선 적용됨. => this. 을 사용한다.==> mc1.mc2,mc3 객체가 모두 this를 갖고 있다.
		// 모든 클래스는 생성자 자동생성, this함수를 갖고 있다. ==> this는 static 이다. 		
		System.out.println("this =" + this);
		
		this.name = name;    // 클래스 변수가 갖고 있는 값을 가져올때. ==> 클래스가 갖고 있는 변수. & this가 아닌것은 지역변수이다!!
		this.sex = sex;
		this.age = age;
		
		// this => 클래서 안에서 this사용 x =>this 는 자신의 객체의 주소 => 반드시 메소드 안에서 사용 가능.
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		MainClass mc = new MainClass();  // 반드시 객체를 생성하여 메모리 공간을 만든후에 class를 사용할 수 있다.
										 // static이 아닌 변수는 저장공간을 별도로 만들어서 저장해야 한다.(+new) 
										 // 생성자 호출 시에는 new를 사용!
										 // 디폴트 생성자.
		new MainClass();  //생성자 자체만 호출
		
		System.out.println(mc.name);
		System.out.println(mc.sex);
		System.out.println(mc.age);
		
		     결과값
		     심청이
		     여자
		   25
		 */
		
		
		//매개 변수를 가지고 있는 생성자를 객체를 만들 수도 있다.
		//모든 메소드는 모두 퍼블릭으로 해줘야 어떤 위치에서든 사용가능하다.
		//디폴트 생성자는 따로 값을 주어야한다.
		
		/*
		 * this가 생성되는 시점은 new로 객체가 생성될때 this가 함께 생성됨.
		 * this값은 계속 변경됨.=> 객체마다 갖고 있다. class에서는 한개. 객체에서는 각각.
		 * 객체 현재의 데이터값을 this가 읽어들임.
		 */
		
		
		
		MainClass mc1 = new MainClass("이순신", "남자", 31);  // ==> null값이 나온다!
		System.out.println(mc1.name);
		System.out.println(mc1.sex);
		System.out.println(mc1.age);
		
		MainClass mc2= new MainClass("심청이", "여자", 32);
		System.out.println(mc2.name);
		System.out.println(mc2.sex);
		System.out.println(mc2.age);
		
		MainClass mc3 = new MainClass("강갑찬", "남자", 33);
		System.out.println(mc3.name);
		System.out.println(mc3.sex);
		System.out.println(mc3.age);
				
	
		
		System.out.println();
		mc2.name = "apple";
		
		System.out.println(mc2.name); // this값이 변경됨.
		
		
		// 이렇게 사용하면 안됨.주소를 저장하지 않은 상태, 주소값이 없다.==> 호출하고 활용이 없을떄 사용!
		System.out.println(new MainClass("박문수","남자", 10).name);
		System.out.println(new MainClass("박문수","남자", 10).sex);
		System.out.println(new MainClass("박문수","남자", 10).age);
		
		
		
		// 윈도우 ROM - 절대 안지워짐.
		// 다른 프로그램 RAM... -> 주소값의 충돌로 BLUESCREEN ..발생., 쓰레드 충돌로 .
		
		
		
		
		
	}

}
