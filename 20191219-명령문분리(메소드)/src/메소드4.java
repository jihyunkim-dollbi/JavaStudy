/*   =======================
 *   1. 메소드 호출
 *   2. 메소드 블럭으로 접근
 *   3. 블럭안에 있는 모든 문장을 수행
 *   4. 메소드 호출한 위치로 돌아감
 *   ========================
 *      
 *   마지막 바람............................
 *   
 *   리턴형: 사용자가 요청한 값.
 *   매개변수: 사용자 입력 값.
 *   
 *   
 *  ** 메소드 찾기 메뉴, 버튼, 이미지
 *           주메뉴 - 클래스
 *           부메뉴 - 메소드
 *   
 *   게시판     +++원래 있던 페이지로 돌아가면 void!
 *   
 *    1.목록출력  - 데이터값이 있어야 한다. 리턴형이 있다.
 *    2.내용보기  - 수정하기 - 목록으로 VOID  - 매개변수 많음!
 *             - 답변하기
 *             - 삭체하기 - 목록으로 VOID - 비번만 String으로!
 *             - 찾기    -  
 *    
 *    글쓰기--> VOID 글을 쓰고 목록으로 돌아감 - 매개변수 많음!
 *    
 *    
 *    페이지는 매개변수O 메소드X
 *    페이지를 넘겨줄때 주소가 있으면 모두 매개변수!
 *    
 *    
 *    
 *    **** 기능찾기 중요!!!
 *    
 *    
 *    로그인 - 둘다 맞을때
 *    	         아이디가 틀릴때   ==> 리턴값은 " 아이디가 맞지 않습니다 "  따라서 String으로! 
 *    	         비번 틀릴때          
 *    아이디 중복체크 - 중복 체크 메소드 - 매개변수 string
 *                               리턴형 boolean , 경우의 수 많은 경우 string!     
 *    
 *    메소드를 만들때 주의!
 *    
 *    1. 값을 넣고 세팅을 한다. ==> + (.set)   --> 값을 넣기만 하고 출력! --> void
 *    2. 값을 가져오고 싶다.   ==> +(.get)   --> 리턴형 있다!
 *    3. 존재 한다 안한다.  ==> +(.is) ==> boolean
 *    
 *    따라서 실행후 다시 값을 쓰느냐 안쓰느냐에 따라 다르다!
 *    
 *     = -> process 함수!
 *     
 *              
 *              
 *              
 *              
 */



import java.util.Scanner;
public class 메소드4 {

	static void gugudan (int dan)
	{
		for(int i = 1; i <=9; i++)
		{
			
			System.out.printf("%d*%d=%d\n", dan,i,dan*i);
		}
		
		
	}
	
/*	
	static String gugudan2 (int dan)  // 매개변수가 틀리면 다른 매소드이다. 하나의 메소드안에 여러 매개변수가 있는 것:오버로딩
	{	String result="";
		for(int i = 1; i <=9; i++)
		{
			
			result+=dan+"*"+i+"="+dan*i + "\n";  // 문자열 결합
		}
		return result;
		
	}
	
	
	*/
	
	static void process() 
	
	
	{
		
		Scanner scan= new Scanner(System.in);
		System.out.println(" 단 입력: ");
	 	int dan = scan.nextInt();
	 	// 구구단
	 	
	 	gugudan(dan);
	 	
       /*
	 	String res = gugudan2(dan);
	 	System.out.println(res);
	 	
	 	*/
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		process();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
