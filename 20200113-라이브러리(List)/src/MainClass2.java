import java.util.*;
/*
 * Map => Ű�� ������ �̷������
 * Ű=> �ߺ��� ����.
 * ��=> �ߺ��� ����.
 * ==============> ������ �ϰ�, =>put(Ű, ��) 
 * 					����� ���� �����ö� => get(key)
 * 
 * 
 * Map (interface)
 * ===============
 * ������ Ŭ����
 * HashTable
 * HashMap ==> HashTable �� ������ Ŭ���� 
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
