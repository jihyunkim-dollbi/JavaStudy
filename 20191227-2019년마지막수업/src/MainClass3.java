class Sawon{   // (1)���� s1�� 4����Ʈ ������ �ּҰ� ����(Sawon s1) (2)�ι�°��, new�� �޸� ũ�⸦ ����� �޸𸮸� �����Ѵ�.
	
	
	int sabun;
	String name;
	String dept;
	String loc;
	long pay;
	static String company; //���뺯��
	
	
// �����ڴ� �ڵ����� �߰������ش�...........................................................................

//    Sawon s1                          = new Sawon();
//                                        (3)=========> ������� �����ڸ� �־� name�� dept, loc����� �־���.
//=========                               ===========
// ������ �ּ�                                                     ���� �����Ͱ� ���� ��
//			                              heap: (GC����)
//stack: ����� ����� �ڵ����� ������� ������       
// static String company�� ���� s1,s2�� �ٸ� ������ �޸𸮰� ������.
/*
 * 
 * 
 * 
 * 
 * 
 * <�޸� ����>
 *  1. 0.5 - method   ||   0.5 - static���� (static ����: �ʱ�ü�� �Ǿ�����)
 *  2. stack (��������-����)
 *  3. heap - �ν��Ͻ� ������ - �Ķ���
 * 
 * =======================================================
 * 
 * ������ �켱���� => 1����. ��������(��������, �Ű�����) {}�� ����Ǹ� ������� ������.
 * 
 * 
 */
	
/*
Sawon(){
	
	int sabun = 10;
  //sabun = sabun;  //==>���������� Ŭ���������� �̸��� ���Ƶ� �ȴ�. ������ �������� ���������� �켱�����̴�. ==> �޼ҵ� �ȿ����� ���������� �켱�����̴�.
	this.sabun = sabun;  // ==> ��� �ڽ��� ������ �ִ� ��.  
	
}
*/	
	
}  

public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sawon s1 = new Sawon();
		
		s1.sabun = 1;
		s1.name = "ȫ�浿";
		s1.dept = "���ߺ�";
		s1.loc = "����";
		s1.pay = 3500;
		s1.company = "SIST";
		
		Sawon s2 = new Sawon();    // s2�� ������ �Ǿ��ٸ� �ٸ� �ν��Ͻ� ������ null���̰� company�� "SIST"���� ������ �ִ�. 
									// company�� � ��ü���� �����ϵ� ��� ��ü���� �����̵�.
		s2.company = "SIST2";
		Sawon.company="SIST3"; // static ������ ���������� ���� ���� �����ȴ�.  
							   // Ŭ������ �� ��ü�� ���� ���� �����ϴ�.
		System.out.println("s1: " + s1.sabun);
		System.out.println("s2: " + s2.sabun);
		System.out.println(s1.company);
		System.out.println(s2.company);
		System.out.println(Sawon.company);
		
		
		
	}

}
