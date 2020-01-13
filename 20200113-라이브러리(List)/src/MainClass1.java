import java.util.*;

import oracle.sql.ARRAY;
	
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<String>();   // 이렇게 타입을 지정하는 것을 제네릭스라고 한다. 이렇게 지정을 하고 가야한다.
						// new ArrayList<String>();
						// new Vector<String>();
						// 동기화, 비동기화(여러개 동시에 읽어오는 것) 다르고, 주소값을 넘겨받는 방식 등등이 다름.
						// 메소드가 동일하기 떄문에 3개 모두 사용 가능
						// array, vector는 제어가 용이함. => ArrayList 가장 많이 사용!
		
		//interface       // 구현된 클래스
		//String[] list
		// 저장 add()
		list.add("홍길동");
		list.add("심청이");
		list.add("박문수");
		
		//중간에 저장
		list.add(1, "춘향이"); 
		
		//출력  ==> for-each 방식=> (배열, 컬렉션 출력시 사용) =>Web
		
		int i=0;
		for(String name:list)
		{
			
			System.out.println(name + ":" + i);
			i++;
		}
		
		System.out.println("==========");
		
		
		//수정 인덱스 or값으로 수정 가능
		list.set(2,"이순신");
		
		for(String name:list)
		{
			System.out.println(name + ":" + i);
			i++;
		}
		
		System.out.println("==========");
		
		//삭제
		list.remove(1);
		for(String name:list)
		{
			System.out.println(name + ":" + i);
			i++;
		}
		
		System.out.println("==========");
		
		//데이터 저장된 갯수
		System.out.println("저장된 갯수: " + list.size());
		
		
	}
	
	

}
