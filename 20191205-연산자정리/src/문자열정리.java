/*
 * utf-8
 * String : 문자열 저장, 클래스다
 * ======
 *   기능    원하는 정보를 끌어오거나 데이터를 입력할때 편리하게 사용하도록. 문자열 필터링 기능들. 
 *   
 *   1) 문자열을 분리      substring()
 *   
 *   2) 문자 찾기           indexof() 앞에것 찾을때, lastIndexof()
 *                   c:\javaDev\javaStudy
 *                   
 *   3) 문자 비교            equals()   - 대소문자 구분
 *                   equalsIgnoreCase()   - 대소문자 구분이 없는 경우
 *   
 *   4) 공백 문자 제거      trim()
 *   
 *   5) 대소문자 변경       toUpperCase, toLowerCase
 *   
 *   6) 모든 데이터형을 문자열로 변경 valueof()
 *   
 *   7) 문자의 갯수         length()
 *   
 *   8) 변경 => replace() , replaceAll()

 * 
 * 
 * 
 *    String => char[ ] C에는 없다!
 *    
 *    
 *    스트링은 내가 채우는 만큼만 메모리값이 정해진다. 
 *    모든 클래스는 4바이트 메모리다. 주소이기 때문에. 모든 메소드도. 주소만 저장됨.
 */
public class 문자열정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String s=" Hello Java!! ";   //공백도 문자다 따라서 0~13개 글자
               // 012345678910111213
		
		System.out.println("글자수:"+s.length());  
		//                           ========
		//                           메소드
		System.out.println(s.substring(0,9));   // 9는 제외. endindex는 제외됨
		System.out.println(s.replace("l","k")); // s의 값 중 l을 k으로 바꾸어라
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());     // 원본은 그대로 있고,출력할때만 변경된다.
		System.out.println(s);
	//	System.out.println(s=s.toUpperCase());   // 이렇게 s를  완전히 바꾸지 않는 한  저장해 놓지 않으면 원본은 바뀌지 않음.
		
		System.out.println(s.trim());    
		// 맨끝과 맨 앞만!네이버는 아이디란에 트림적용 안됨 , 네이트 아이디란에는 트림 적용됨. 
		// 오라클은 공백을 허용안한다. 사용자 실수로 되지 않도록 트림을 넣어줌
		System.out.println(s.indexOf("hello"));  // 문자열 안에 hello가 있는지 찾아줌 없으면 -1 출력!
		System.out.println(s.indexOf("lo"));     // 4 => lo가 있는 인덱스 출력함!
		System.out.println(s.lastIndexOf("l"));  //  여러 l중 가장 마지막에 있는 인덱스 출력해줌!
		
		String s1="Hello";
		String s2="hello";

		String res=s1.equals(s2)?"같다":"다르다";
		          // =======
		          //  대소문자 구분 가능		   
		System.out.println(res);
		
		String res1=s1.equalsIgnoreCase(s2)?"같다":"다르다";
		
		System.out.println(res1);
			
			
			
			
			
			
	}

}
