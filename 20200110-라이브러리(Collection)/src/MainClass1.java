/*
 * �÷���
  ======
  		�����͸� �޸𸮿� �����ϴ� ���, ǥ��ȭ�� �Ǵ� ����
  		 						=====>�������̽�
  		 ������ �����͸� ���� ��� ����
  		 ���� �迭 => ������ ������ Ŭ�������� ����� ��
  
 * 		* ���� : ���� �ٸ� ������Ÿ���� ���� �� �� �ִ�.=> ������Ÿ���� ���Ͻ�Ű�� ����=> ���׸�Ÿ�� ����!
 * 											  ===========
 * 											  <> �̿�!=> <data type>
 * 											  =====================
 * 											  <int> (x)
 * 											  <Integer> (O) => Wrapper Class ���!
 * 		  *** ����=> ���� ���������� �����ϴ� ���� �����ϱ� ���ϴ�.
 * 		
 * 
 * 
 * 		����
 * 				Collection
 * 				==========
 * 			 		|       ============> Queue, Stack
 * 			=================================
 * 			list          set            map   (interface)
 * 			  |				|
 * 		=============	============     ===          ===>  (interface�� ������ Ŭ����)
 * 		ArrayList		  HashSet       HashTable
 * 		Vector			  TreeSet		HashMap: HashTable ����(***)
 *      LinkedList						==> key, value => ������ ����.
 *      =============    ===========        key => �ߺ� ������� �ʴ´�.
 *      *������ ������ �ִ�      * ������ ���� x		value => �ߺ��� ���
 *      *�ߺ� �����͸� ���      * �ߺ� ���� x
 * 		*�ε�����ȣ               * �����Ͱ� ��
 * 
 *      ============================================================================
 *      
 *      �ڷᱸ�� : �޸𸮿� ����� �����͸� ����
 *      					=========
 *      					�б�, ����, �˻�, ����, ����
 *      					======================
 *      					�޼ҵ� => ���� =>   add(������) �����
 *      						    	   	add(index, ������)
 *      							�б� =>   get() , get(index)
 *      							���� =>   set(index, new������)
 *      							���� =>   remove(index) 
 *      									remove(������)
 *      							 primary key ->  �ߺ��� �ȵǴ� �����͸� ����� ���´�.(�ߺ��Ǵ� �����Ͱ� �ֱ� ������ primary key�� ����)
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
		
		//�߰�
		list.add("ȫ�浿");
		list.add(30);
		list.add("����");
		list.add("1111-1111");
		list.add(180.5);
		list.add("A");
		//  loop �Ұ���
		
		
		//������ �б�
		String name= (String)list.get(0);      // ArrayList �� �������� object -> ����ȯ �ʿ�
		int age = (int)list.get(1);
		String addr = (String)list.get(2);
		String tel = (String)list.get(3);
		double ki = (double)list.get(4);
		String aa = (String)list.get(5);
		
		//���
		System.out.println("Name: " + name);
		System.out.println("Age:" + age);
		System.out.println("Address: " + addr);
		System.out.println("Tel: " + tel);
		System.out.println("Height:" + ki);
		System.out.println("Blood type: " + aa);
		
		System.out.println(list.get(2));    //����
		System.out.println(list.add("A"));  //true
		
		
		
	}

}
