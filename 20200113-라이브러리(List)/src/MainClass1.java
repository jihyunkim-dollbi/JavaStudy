import java.util.*;

import oracle.sql.ARRAY;
	
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new LinkedList<String>();   // �̷��� Ÿ���� �����ϴ� ���� ���׸������ �Ѵ�. �̷��� ������ �ϰ� �����Ѵ�.
						// new ArrayList<String>();
						// new Vector<String>();
						// ����ȭ, �񵿱�ȭ(������ ���ÿ� �о���� ��) �ٸ���, �ּҰ��� �Ѱܹ޴� ��� ����� �ٸ�.
						// �޼ҵ尡 �����ϱ� ������ 3�� ��� ��� ����
						// array, vector�� ��� ������. => ArrayList ���� ���� ���!
		
		//interface       // ������ Ŭ����
		//String[] list
		// ���� add()
		list.add("ȫ�浿");
		list.add("��û��");
		list.add("�ڹ���");
		
		//�߰��� ����
		list.add(1, "������"); 
		
		//���  ==> for-each ���=> (�迭, �÷��� ��½� ���) =>Web
		
		int i=0;
		for(String name:list)
		{
			
			System.out.println(name + ":" + i);
			i++;
		}
		
		System.out.println("==========");
		
		
		//���� �ε��� or������ ���� ����
		list.set(2,"�̼���");
		
		for(String name:list)
		{
			System.out.println(name + ":" + i);
			i++;
		}
		
		System.out.println("==========");
		
		//����
		list.remove(1);
		for(String name:list)
		{
			System.out.println(name + ":" + i);
			i++;
		}
		
		System.out.println("==========");
		
		//������ ����� ����
		System.out.println("����� ����: " + list.size());
		
		
	}
	
	

}
