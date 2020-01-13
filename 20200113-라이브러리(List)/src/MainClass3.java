import java.util.*;
interface I
{
	
	public void display();
	
	
}


class A implements I

{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("A:display.. Call");
	}
	
	
	
}


class B implements I
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("B:display.. Call");
	}
	
	
	
}

class C implements I
{

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("C:display.. Call");
	}
	
	
	
}
public class MainClass3  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		
		map.put("a", new A());
		map.put("b", new B());
		map.put("c", new C());
		
		I i = (I)map.get("a");
		System.out.println("i=" + i);
		i.display();
		
		i = (I)map.get("b");
		i.display();
		
		i = (I)map.get("c");
		i.display();
		
		i = (I)map.get("a");
		System.out.println("i=" + i);
		
		//메모리 주소를 하나를 줄때 => 싱클톤!!(패턴x) 하나의 주소로 클래스를 여러개 사용한다. 
		//한개의 주소를 저장해놓고 모든 클래스 사용.
		
/*
 * 
 *  i=A@7852e922       ========>
	A:display.. Call
	B:display.. Call
	C:display.. Call
	i=A@7852e922    =========> 둘의 주소가 동일.

 * 
 * 
 * 
 * 
 */
		
		
		
	}

}
