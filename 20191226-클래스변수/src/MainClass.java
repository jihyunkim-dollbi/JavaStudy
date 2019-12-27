/*
 * 
 *  변수의 발전 사항 => 클래스(변수, 변수+메소드, 메소드)
 *  ===========   (=========)
 *   			  ~VO,~DTO
 *   			  ~Manager, ~Service, ~DAO
 *  
 *  
 *  변수 => 배열의 필요성 => (구조체(자바x)) => 클래스 => 파일(Package) = > RDBMS(오라클)
 *  =======================================================================> 데이터베이스, 관계형 데이터베이스..?
 *  
 *  비정형화 데이터 ==> 정형화 데이터로 바꾸는 것 : 빅데이터 프로그램
 *  데이터 수집 = 분석 = 출력.
 *  
 *  시나리오..클라우드
 * 
 *  자바 클래스 구조 : 하나의 기능(게시판) - 여러 메소드를 넣는다.(글쓰기, 수정하기, 내용보기, 덧글)
 *  					  (회원가입) 컴포넌트 안에 => 여러가지 메소드(주소, 아이디, 비번 기능....)
 *    
 *  => Component Base => 여러개의 기능이 모여 사용됨. 여러 컴포넌트를 만들어 사용.
 *  
 *  	예) 컴퓨터 구조
 *  	    CPU(통신변수, 통신메소드 가지고 있어 다른 기능들과 통신, 지시 가능.), 메모리, 하드디스크, 사운드 카드.....  ==> MainBoard(CPU) 에서 모여서 처리됨.
 *  		
 *  
 *  자바 클래서 구성 요소 : 변수 + 생성자 + 메소드
 *  변수로 사용이 가능한 것 : 1)단일 변수 => int(data type) year;
 *  				   2)클래스(참조형-주소) => String(data type) name... 
 *  						   JBotton b1,b2
 *  					메모리 접근 지정 연산자 => . 을 이욯해 주소를 참조해옴.
 *  
 *  				 ** 멤버변수.. (static 안붙은 모든 변수)인스턴스!!!! 저장된 데이터(인스턴스화)따로따로 저장!!객체에서만 사용. 클래스 안에서 작동,
 *  				 ** 공유변수 static 변수는 다른 클래스에도 영향줌.
 *  				     
 *  					3)배열(참조형-주소) 
 *  					4)라이브러리
 *  
 *                     data type : 1. 기본 형(제공됨)
 *                     			   2. 사용자정의 data type(class, 배열)	
 *  
 *  class ClassName
 *  {
 *      ======== ClassName 클래스만 가지고 있는 변수=========> 전역변수(다른 클래스에서도 사용이 가능, 클래스끼리 통신 가능)
 *      												: 클래스끼리 변수를 끌어 쓸수 있도록 변수를 설정하는 것.
 *      	
 *     	++ 접근지정을 하여 전체 혹은 특정 범위에서 사용 가능하게 함. PUBLIC(다른 폴더 PACKAGE에서도 사용 가능) VS PRIVATE (DEFAULT:같은 폴더(PACKAGE)내에서A만 통신)
 *     												(EX. MAIN)PUBLIC(접근가능) STATIC(자동저장) VOID(리턴값X)  
 *      											달력에서 MONTH 와 YEAR를  전역변수로 잡고 메소드에서 리턴 하지 않아도 되도록 만들기
 *      클래스는 {} 블럭 안에서 설정하기.
 *      
 *      == > 메모리에 따로 저장되는 변수(instance변수) - new를 이용해 여러 저장공간 생성 가능- 클래스 내에서 개별적으로 사용.
 *      == > 공유하는 변수(static 변수) = > 메모리 공간이 한개(주의!) 
 *      
 *      ++ 전체 범위 설정에 따라 static과 instance의 관점이 달라질 수 있다.
 *    
 *      ================================================
 *      
 *    	생성자 함수 : 전역변수의 초기화 = > 한번만 호출 가능, 객체생성될때 처음으로 호출(저장될때 한번만!)  
 *      
 *      위도우, 네트워크, 데이터베이스
 *      클래스 명과 동일해야하고, 리턴형이 없다.
 *      
 *      ==> 만약에 생성자가 없는 경우에는 JVM이 자동으로 만들어 준다.(default 생성자)
 *        JVM이 자동 제공해주는 기능!
 *       1) import java.lang 
 *       2) 리턴 => 자동void해줌
 *       3) 생성자는 자동생성해줌
 *      
 *      ================================================
 *      
 *      메소드 : 기능 수행(여러개 가능)
 *    
 *      ================================================
 *  }
 * 
 *      
 *      클래스명 ===> MovieVO ->포함: 클래스(String, 배열,  
 *      			MusicVO
 *      			RecipeVO
 *      			FoodHouseVO
 *      			===========> 따로 저장	
 * 
 * 					Class FoodHouseVO {
 * 
 * 					String[] poster;
 * 					String[] addr, tel, ... ;
 * 					String[] menu;
 * 					String[] reply;
 * 					배열 혹은 다른 클래스도 가능.
 * 
 * 					}
 * 
백두산 (2019)
평점 6.9/10
드라마/액션
2019.12.19 개봉 
128분, 12세이상관람가 
(감독) 이해준, 김병서 
(주연) 이병헌, 하정우, 마동석, 전혜진, 수지 -> 링크 걸림-> 낱개로 해야함 -> 배열로 잡기
 *
 * 
 */// 한 파일 안에 여러가지 클래스. 퍼블릭 클래스는 한번만 쓴다. 저장명 클래스만 퍼블릭 쓴다.
// 다른 데이터 형을 한번에 한 클래스로 모을 수 있다. ==> 아래는  instance변수
/*   
 *   	 class MovieVO
 *   
 *   	
 *   	=> int a, double d
 *         ===============> 컴퓨터가 메모리크기 자동 인식함
 *         
        => 사용자가 만든 데이터형
        => MovieVO vo
        => 사용자정의 데이터형은 new를 사용해서 메모리를 생성, 크기를 할당한다.  
           ===============> 메모리 크기를 알 수 없다.
                                                 메모리 크기 확인 => 메모리를 생성, 할당함
							==============================> new
         
         
         
        	클래스 연결 - 연산자와 메소드를 통해...



*/

class MovieVO{
	
	// instance변수 => 메모리에 저장되는 시점 ==>new(새로운 메모리 생성) =>  new를 쓸때마다 메모리 공간이 생김.
	
	String title;
	double score;
	String genre;
	String regdate;
	int time;
	String grade;
	String director;
	String actor;
	
	// 4바이트 x 7 + 8 바이트 => 총 36바이트 => new가 메모리 생성, 주소과 크기를 확보해주고 => . 을 이용해 접근한다. 
	// Q. TITLE 50개 뿌리는 법.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//불러오기
		//메모리에 저장 => 호출 연습
		MovieVO m1 = new MovieVO();          
		           //new ===> 메모리 만들고 주고까지 받아옴.					
		//리턴형은 int형. 몰록? 크기를 몰록이라는 함수를 사용했었고, 몰록이 없어지고 new라는 연산자가 생김.
		// new 메모리생성, 메모리크기확보
		//모든 클래스는 4byte.
		// . (메모리 주소 접근 연산자)
		
		
		m1.title="백두산(2019)";
		
		
		MovieVO m2 = new MovieVO();
		m2.title="천문: 하늘에 묻는다 (2018)";
		
		
		MovieVO m3 = new MovieVO();
		m3.title="캣츠 (2019)";
		
		
		MovieVO m4 = m3;
		m4.title = "시동 (2019)";
		
		System.out.println("m1: " +m1);
		System.out.println("m2: " +m2);
		System.out.println("m3: " +m3);
	//	System.out.println("m4: " +m4);   ==> m3과 m4는 같은 메모리 주소가 됨.
		
		
		
		/*
		 * m1: MovieVO@15db9742
		   m2: MovieVO@6d06d69c    ==> 주소값 다름.
           m3: MovieVO@7852e922
		
		 */
		
		System.out.println("저장된 영화 제목");
		System.out.println(m1.title);
		System.out.println(m2.title);
		System.out.println(m3.title);
		System.out.println(m4.title);
		
/*
		      저장된 영화 제목
			백두산(2019)
			천문: 하늘에 묻는다 (2018)
			시동 (2019)
			시동 (2019)   ==> m3과 m4는 같은 값을 갖게 됨. 
*/
		
		
/*	        MovieVO [] vo = new MovieVO[3];
	             클래스를 배열로 만들어서 사용하면 유용하다. ==> 1개의 영화 => 여러개 30개의 영화를 저장해야 할때.
	        class data type. 
	        
*/
		
		   System.out.println("=====클래스 배열======");
		   
		   MovieVO [] vo = {m1,m2,m3,m4};
		   
		   for(int i = 0; i < vo.length; i++)
		   {
			  System.out.println(vo[i].title); 
		   }
		
				
	}

}
