import java.util.*;

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			ArrayList list = new ArrayList();
			
			
			//이름목록
			list.add("홍길동");  //0
			list.add("심청이");  //1
			/*
			 * 
			 * ==============
			 * add()  // 2번으루!
			 * 
			 */
			list.add("박문수");  //3
			list.add("춘향이");  //4
			list.add("이순신");  //5
			
			//저장된 갯수
			System.out.println("저장된 인원: "+ list.size());  // .size()  ==> 갯수 읽어오기
			
			//출력
			for(int i = 0; i< list.size();i++)
			{
			//	String name = (String)list.get(i);
			//	System.out.println(name);
						
				System.out.println(list.get(i));
				
				//둘다 가능!	
			}
			
			
			System.out.println("=====================================");
			
			
			//추가
			list.add("강감찬");   // just add() => 맨 마지막에 추가됨.
			
			for(int i = 0; i< list.size();i++)
			{
				String name = (String)list.get(i);
				System.out.println(name);
			}
			
			
			
			System.out.println("======================================");
			
			list.add(2, "김두한"); // index 2번 자리에 추가하기
			
			
			for(int i = 0; i< list.size();i++)
			{
				System.out.println(list.get(i));
			}
			
			
			
			System.out.println("======================================");
			
			//삭제하기
			
			list.remove(3); // 3번째 삭제하기
			
			for(int i = 0; i< list.size();i++)
			{
				System.out.println(list.get(i));
			}
			
			
			
			System.out.println("======================================");
			
			//수정하기
			list.set(4, "이순신 수정");
			
			for(int i = 0; i< list.size();i++)
			{
				String name = (String)list.get(i);
				System.out.println(name);			
			}
			
			
			System.out.println("======================================");
			
			//문제발생
			
			list.add(100);   //데이터형이 다르기 때문에 ....따라서, 매개변수를 통일시키기 위해 제네릭 사용한다.
			
			for(int i = 0; i< list.size();i++)
			{
				String name = (String)list.get(i);
				System.out.println(name);	
			}
			
			
			
			
			
			
			
	}

}
