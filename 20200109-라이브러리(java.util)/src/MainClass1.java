/*
 * StringTokenizer
 * ===============> 문자열 나눠줄때 사용하는 클래스
 * 1) 객체단위로 전송
 * 2) 문자열(0)
 *   id|pw|avata
 *   == == =====> 토큰들! 문자열 대로 자름.
 *   
 *   split 단점 => 정규식 별로 자름.
 * 
 *    1.hasMoreTokens() - 'or 몇개인지' 모를때 개수만큼 잘라줌
 *    2.nextToken() - 
 *    
 *  
 *  
 *    
 *    
 *    
 *    
 * 
 */
import java.util.*;
class Info{
	
	String id;
	String name;
	String sex;
	String pwd;
	String addr;
	String tel;

}

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String data = "admin|홍길동|1234|남자|서울|1111-1111";
			
			StringTokenizer st = new StringTokenizer(data,"|");   // ,"|"
	/*
			String id = st.nextToken(); //첫번째 admin이 잘림
			String name = st.nextToken();
			String pwd = st.nextToken();
			String sex = st.nextToken();
			String addr = st.nextToken();
			String tel = st.nextToken();
			
			System.out.println("ID:" + id );		
			System.out.println("이름:" + name);
			System.out.println("PASSWORD:" + pwd);
			System.out.println("성별:" + sex);
			System.out.println("Address:" + addr);
			System.out.println("번호:" + tel);
		*/	
			Info info = new Info();
			
			while(st.hasMoreTokens())
			{
				System.out.println(st.nextToken());	
			}
	}

}
