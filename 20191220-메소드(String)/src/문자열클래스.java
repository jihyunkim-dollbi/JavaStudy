import java.util.Scanner;

/*
 *   String = 문자열을 제어할때 사용
 *   
 *   java.lang ==> import 생략가능
 *   
 *   문자열을 저장하는 방법
 *      1) String 변수명 = "Hello Java"; 
 *      2) String 변수명 = new String ('Hello Java') // 같은 문자열 => 별도로 저장
 *                      =====
 *                      새로운 메모리에 저장을 하라.
 *                      
 *      
 *   String 에서 제공하는 기능 
 *   
 *   1) equals : 저장된 문자열이 같은지 여부를 확인(true/ false)
 *               ID, PWD => 로그인(대소문자 구문) 
 *    			 문자열은 ( == )(X)
 *    
 *			String s = "Hello";  ==> s,s1 
 *			String s1 = "Hello";
 *			if(s == s1)  true  ==> 문자열비교
 *			String s2 = new String("Hello")  ==> s2 - 
 *			if(s.equals(s2)) false!   ==> 주소값 비교
 *    			
 *    
 *       ==>  원형
 *          (리턴형) boolean equals(String data)
 *            
 *   2) substring : 문자열을 자를때  
 *      			Strings="01234567";
 *                  substring(3) ==> "34567" ==> 앞의 3자리를 없애고 나머지를 가져와라
 *                  String s="112분,15세이상관람가" 
 *                  substring(0,3) ==> "112"  --> 결국 012만 가져와라 ==> 만약 0,4를 하면 112분이 되고 정수가 아니기 떄문에 오류.
 *                             ==
 *                             end-1
 *                             ex) 확장자가 java인것만 가져와라.!
 *                             
 *    			    substring(int start)
 *   				substring(int start, in end)
 *   
 *   3) length : 문자열 갯수
 *      String s=" Hello 홍길동"; -> 9 개
 *      ex) 디자인할때, 글자개수를 맞출때!
 *      
 *            
 *   4) trim : 좌우의 공백문자 제거
 *       String s=" Hello Java ";
 *       ==>s.length ==>12
 *       ===>s.trim().length ==>10  ==> 앞뒤의 모든 공백을 제거, 중간의 공백은 제거 안함
 *       
 *       ex) 사용자로그인시 space키 값 --> 제거해주고 -> 사용자의 오류 방지해줌
 *            --> 메소드! 공백이 있으면 trim을 써라.
 *           
 *       
 *   5) startsWith, endsWith :  두개를 동시에 쓰면 단어가 포함된 문자를 가져와라.
 *      (앞글자로 찾기)( 뒷자리로 찾기) 
 *       ==========  =========
 *      
 *       starsWith("자바")
 *       endsWith(" ")	
 *   
 *   
 *   
 *    	ex)검색기 만들때 사용!
 *   
 *   
 *   6) indexOf, lastIndexOf(내가 원하는 단어나 문자열 찾을때) : 
 *   	문자의 위치(indexOf : 앞에서, lastIndexOf: 뒤에서)
 *   	String s="hello java";
 *                0123456789
 *   	s.indexOf('a') ==> 7
 *   	s.lastIndexOf('a')  ==> 9  --> 확장자 찾을때,
 *   
 *      ex) substring과 함께 많이 쓰임.
 *   
 *   7) split : 
 *      String s= "이병현, 하정우, 마동석, 전혜진, 수지";
 *                 
 *      ,별로 잘라서 배열에 저장해줌.
 *      
 *      String[] name = s.split(",");  , 별로 자름
 *      String[] name = s.split(" "); 공백 별로 자름
 *      정규식 --> 이형식을 가진 것을 다 찾아라
 *      ====
 *      211.238.142.181
 *      211.238.142.1
 *      211.238.142.23
 *      211.238.142.0
 *      211.238.1.1 
 *      [0-9] {1,3}\\. [0-9] {1,3}\\. [0-9] {1,3}\\. [0-9] {1,3} ==> 패턴으로 들어감.
 *      숫자 0에서 9 사이에 1자리에서 3자리까지 있다.
 *   
 *       \\추가 .까지 찾기?
 *   
 *   8) toUpperCase, toLowerCase : 
 *      대문자로 변환      소문자로 변환
 *      
 *      String s="Hello";
 *      s.toUpperCase() ==> HELLO
 *      s.toLowerCase() ==> hello
 *      
 *      
 *   9) replace, replaceAll : 
 *      ======   ============> 뒤에도 정규식 붙음.
 *       		String s="113분"
 *       		s.replaceAll("[^0-9]","") ==>113
 *                             =====
 *                             모든 숫자
 *              s.replaceAll("^[0-9]","") ==> 바깥의 ^ 뜻은 ~시작하는 모든 것! 
 *              s.replaceAll("^[0-9]$","") ==> ~로 끝나는 모든 문자!
 *              s.replaceAll("[^가-힣]","")   ==> 한글뺴고 다 지워라
 *              s.replaceAll("[^A-Za-z]","")  ==> 영문빼고 다 지워라
 *      
 *      
 *      
 *      
 *       변경 ==> String s="Hello Java"
 *               s.replace('a','b') ==> Hello jbvb
 *                         ========
 *                         모든 a를 b로 바꾸시오!
 *
 *	10) contains() : 문자열 안에 포함된 문자를 찾는 경우 
 *  			
 *                 	 
 *
 *
 */
// 검색 자동완성기능과 비슷하게 검색하면 포함 단어 모두 찾아오기 만들기
public class 문자열클래스 {

	
	static String[] autoComplate(String data)
	
	{
		
		String[] ss = 
			
			{
				
				"자바와 JSP","자바 프로그래밍","스프링5","Ajax와 JSP","리덕스와 리액트","자바 오라클","MVC 구조",
				"코틀린과 안드로이드","코틀린 프로그램","스프링 데이터","혼자배우는 자바","지능형웹 프로그래밍","웹프로그램",
				"자바 웹프로그램","오라클 자바"
	        };
		
		String[] findData = new String[10];
		int j = 0;
		for(int i =0; i<ss.length; i++)
		{
			
			if(ss[i].contains(data))  // data가 포함된 모든 문자를 찾아라.
			//if(ss[i].startsWith(data))  // data로 시작하는 문자를 찾아라.
			{
				
				findData[j] = ss[i];
				j++;
				
			 }
		}
		return findData;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     
		Scanner scan = new Scanner(System.in);
		
		System.out.print("검색어 입력: ");
		String data = scan.next();
		
		String[] fd = autoComplate(data);
		for(int i = 0; i<fd.length; i++)
		{
			
			if(fd[i] != null)
			{
				
				System.out.println(fd[i]);
			}
			
		}
		
		
		
	}

}
