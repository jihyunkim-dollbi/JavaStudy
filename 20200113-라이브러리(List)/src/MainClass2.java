import java.util.*;
/*
 * Map => 키와 값으로 이루어지고
 * 키=> 중복이 없다.
 * 값=> 중복이 가능.
 * ==============> 저장을 하고, =>put(키, 값) 
 * 					저장된 값을 가져올때 => get(key)
 * 
 * 
 * Map (interface)
 * ===============
 * 구현한 클래스
 * HashTable
 * HashMap ==> HashTable 을 보완한 클래스 
 * 
 * 
 */
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("id","admin");
		map.put("pwd","1234");

		
		System.out.println("ID: "+map.get("id"));
		System.out.println("PASSWORD: "+ map.get("pwd"));
		
	
	}

}
