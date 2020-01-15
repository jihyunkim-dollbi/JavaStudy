/*
 * 	자바에서 제공하는 라이브러리.
 * => 자바
 *      1) 사용자정의
 *      2) 라이브러리
 *      ===========> 1) + 2) => 조립하기
 * 
 * 		자바 제공 라이브러리
 * 		==============
 * 
 * 		java.lang : import 를 하지 않고 사용한다.
 * 		=String: 문자열과 관련된 클래스(리턴형- 오브젝트)
 *	 
 * 	    1) equals: 문자열비교
 *		2) trim() : 좌우공백제거
 *		3) indexOf(), lastIndexOf()
 *	    4) length()
 *		5) startsWith, endsWith
 *		6) subString()
 * 		7) split()
 * 		8) valueOf()
 * 
 * 		=System: 종료, 입/출력, GC
 * 		1) gc-메모리 
 * 		2) exit()
 * 		3) println()
 * 
 * 		=Object: 모든 클래스의 상위 클래스 => 객체의 생성과 소멸
 * 		1) clone() : 클래스 복제=> 메모리주소는 다르지만 값은 같게 만들어준다. A c = a.clone();
 *        싱글톤 - 하나의 메모리를 사용하는 것. 
 * 		2) finalize() : 소멸자 
 * 		=Math:수학관련
 * 		1) random()
 * 		2) ceil()
 * 		=StringBuffer(속도빠름)
 * 		1) toString() -> 입력된 문자열을 ............. 바꿔줌 " .toString "
 * 		2) append() :문자열 결합
 * 		=Thread
 * 		
 * 		java.util : 유용하게 사용할 수 있는 클래스의 집합
 *		=Scanner
 *		=StringTokenizer
 *		=Collection(배열)
 *		=ArrayList, Vector , LinkedList, Map : 자료구조
 *		===========                     =====
 *		자료구조: 메모리 저장 관리
 *		
 * 		java.io
 * 		=Reader, Writer(2byte)
 * 		=InputStream, OutputStream(1byte) - close()
 * 		=File 
 * 		=ObjectInputStream, ObjectOutputStream
 * 		= BufferReader
 * 
 * 		java.net
 * 		=Socket
 * 		=URL(encoding) encode=> 2byte-> 1byte 변환해줌.
 * 
 * 
 */
class My  // source - overriding => finalize 가져옴.
{
	public My() {
		
		System.out.println("My 생성자 함수 호출(객체 생성)");
	}
	
	
	
	public void display()
	{
		System.out.println("My:display() Call....");
		
	}
	
	
	@Override // 객체에서 메모리가 소멸되는 순간.. 
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("객체 소멸");
	}
	
	
	
	
}
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// 생성 
			My m =new My(); 
		
			// 활용
			m.display();
			
			//소멸시킴
			m=null; // 소멸됐지만 메모리회수 전.  => finalize가 실행 안됨.
			
			System.gc(); // 메모리회수를 시켜줌
			
			// finalize가 실행됨.=> 메모리가 회수되어야 실행이 된다. 
			
			
			
	}

}
