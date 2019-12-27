/*
 * 
 * 	자바(클래스가 여러개) == > 한파일 안에 여러 클래스 만들기, 별도로 파일을 만들어서 사용
 * 	한개의 파일에서 사용할때는
 * 	==================
 * class A
   class C
   class D
   public class B ==> B.java
   					  public 클래스는 한개만 존재
   					  public class의 저장명이 클래스 명이 되어야 한다. 
   
   class A   
   class B
 * =========> 저장명은 클래스 명과 같아야 한다. 둘중 아무 이름이나 상관없다. 메인이 있는 클래스를 주로 선택됨.

 * 
 * 
 */
//News 데이터형 & instance 변수들. ==> new로 생성될 때마다 복사되는 변수들
// 클래스 안에서 for문 & 연산자 ==> 구현은 할 수 없다. ==> 선언만 할 수 있다. 값을 지정. 
// 생성자에서 보통 구현을 한다.==> 생성자는 블럭안에서 구현할 수 있는 것. 생성자를 초기화하여 구현블럭 만들수도 있다.
class News{
	
	 String title;
	 String content;   
	 String author;
	 String regdate;
	
//   static String site;  // ==> 변하지 않는 값. new로 생성될때도 항상 같은 값으로 가져옴.
//  static 변수와 instance변수를 통칭하여 전역번수.
// 메소드에서 지역변수를 클래스에서 사용하고 싶다면 리턴값을 주고 가져오면 된다.
	
}


public class MainClass { // 메인이 들어간 곳이 조립하는 곳! 모든 클래스를 모아서!

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 저장 => 통으로 저장
		// 메모리 만들기
		News n1 = new News();  //n1번 안에 4개의 메모리가 생성됨
		n1.title ="\"8일째 1위\"..'백두산', 450만명 돌파..'천문' 개봉 첫날 14만 흥행 2위.. ";
		n1.content="[OSEN=하수정 기자] 영화 '백두산'이 성탄절에 이어 문화의 날에도 흥행 정상을 지켰고, '천문: 하늘에 묻는다'가 첫날 2위에 오르며   박스오피스 판도가 또 바뀌었다. 27일 영화진흥위";
		n1.author="OSEN";
		n1.regdate="19.12.27";
		
	 //  n1 = new News();	 ==> n1번(주소100)이 4개가 생성이 됐었고, 두번째 만든 n1(주소200)은 주소가 달라지고 n1의 위의 title(주소 100), contents(주소 100)는 더이상 쓸모가 없어진다. 
	 //  배열로 사용하여, 주소값을 저장해 놓으면 데이터가 사라지지 않는다.
		
		
		News n2 = new News();  //n1번 안에 4개의 메모리가 생성됨
		n2.title ="진선규·성유빈 영화 '카운트' 캐스팅";
		n2.content="배우 진선규와 성유빈이 영화 ‘카운트’에서 호흡을 맞춘다고 배급사 CJ엔터테인먼트가 27일 전했다. 금메달리스트 출신 골칫덩이 체육선생(진선규)과 주먹 하나는 타고난 반항아";
		n2.author="아시아경제";
		n2.regdate="19.12.27";
		
		
		//출력
		System.out.println(n1.title);
		System.out.println(n2.title);
		
		
		
		
		
		
	}

}
