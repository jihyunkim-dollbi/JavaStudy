import java.util.*;
public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ArrayList<E>  E => Elements => 클래스 타입만 가능! => 매개변수와 리턴형이 모두 바뀜.
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		
		for(int i = 0; i<list.size();i++)
		{	
			int num = list.get(i);
			System.out.println(num);
		//	System.out.println(list.get(i));	
		}
		
		
		
		
		
		
		
	}

}
