/*
 * 컬렉션
  ======
  		데이터를 메모리에 저장하는 방법, 표준화가 되는 상태
  		 						=====>인터페이스
  		 여러개 데이터를 쉽게 제어가 가능
  		 가변 배열 => 데이터 갯수를 클래스에서 제어가능 함
  
 * 		* 단점 : 서로 다른 데이터타입을 저장 할 수 있다.=> 데이터타입을 통일시키기 위해=> 제네릭타입 등장!
 * 											  ===========
 * 											  <> 이용!=> <data type>
 * 											  =====================
 * 											  <int> (x)
 * 											  <Integer> (O) => Wrapper Class 사용!
 * 		  *** 저장=> 같은 데이터형을 저장하는 것이 제어하기 편리하다.
 * 		
 * 
 * 
 * 		종류
 * 				Collection
 * 				==========
 * 			 		|       ============> Queue, Stack
 * 			=================================
 * 			list          set            map   (interface)
 * 			  |				|
 * 		=============	============     ===          ===>  (interface를 구현한 클래스)
 * 		ArrayList		  HashSet       HashTable
 * 		Vector			  TreeSet		HashMap: HashTable 보완(***)
 *      LinkedList						==> key, value => 순서는 없다.
 *      =============    ===========        key => 중복 허용하지 않는다.
 *      *순서를 가지고 있다      * 순서가 존재 x		value => 중복을 허용
 *      *중복 데이터를 허용      * 중복 혀용 x
 * 		*인덱스번호               * 데이터값 有
 * 
 *      ============================================================================
 *      
 *      자료구조 : 메모리에 저장된 데이터를 관리
 *      					=========
 *      					읽기, 쓰기, 검색, 수정, 삭제
 *      					======================
 *      					메소드 => 쓰기 =>   add(데이터) 사용多
 *      						    	   	add(index, 데이터)
 *      							읽기 =>   get() , get(index)
 *      							수정 =>   set(index, new데이터)
 *      							삭제 =>   remove(index) 
 *      									remove(데이터)
 *      							 primary key ->  중복이 안되는 데이터를 만들어 놓는다.(중복되는 데이터가 있기 때문에 primary key를 붙임)
 *       							 
 *      
 *      
 *      
 *      
 * 
 * 
 * 
 */
import java.util.*;  //has collection
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		
		//추가
		list.add("홍길동");
		list.add(30);
		list.add("서울");
		list.add("1111-1111");
		list.add(180.5);
		list.add("A");
		//  loop 불가능
		
		
		//데이터 읽기
		String name= (String)list.get(0);      // ArrayList 의 리턴형은 object -> 형변환 필요
		int age = (int)list.get(1);
		String addr = (String)list.get(2);
		String tel = (String)list.get(3);
		double ki = (double)list.get(4);
		String aa = (String)list.get(5);
		
		//출력
		System.out.println("Name: " + name);
		System.out.println("Age:" + age);
		System.out.println("Address: " + addr);
		System.out.println("Tel: " + tel);
		System.out.println("Height:" + ki);
		System.out.println("Blood type: " + aa);
		
		System.out.println(list.get(2));    //서울
		System.out.println(list.add("A"));  //true
		
		
		
	}

}
