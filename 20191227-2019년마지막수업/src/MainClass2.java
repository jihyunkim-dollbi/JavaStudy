/*
 *  ����
 *  
 *  = instance ���� : ���� => new�� �̿��ؼ� �޸𸮸� ���鶧
 *  = static ���� : �������Ҷ�, �ٷ� ���ڸ����� ������. => �޼ҵ忡���� ����� �Ұ��� // Ŭ���� �ȿ����� ����� ����
 *  ==================> �ڵ� �ʱ�ȭ�ȴ�.
 *  = �������� : �޼ҵ� ȣ��� // ���� �޼ҵ� �ȿ����� �Ϲݺ����� ����� �����ϴ�.
 *  ==================> �ݵ�� �ʱ�ȭ�� �Ѵ�.
 * 
 *  ��� Ŭ������ �ʱⰪ�� null �̴�.
 *  // Ŭ���� ������ �����Ҷ��� �ʱⰪ �ο��ȴ�.(�����ص� �ʱⰪ ����.) ==> ���� ���� �ȵ�. new�� �����ǰ� �޸� ũ�Ⱑ �����Ǿ� ������ ��. 
 *  static Ŭ������ ������ ������ Ŭ������ �׻� new�� �����ؾ� �Ѵ�.

 *  ���� �����ϰų�
 *  �ϴ� ������ �ʱⰪ�� ������ ���߿� ���� �ο��ص��ȴ�.
 * 
 */




class Data{   
	
	// Ŭ���� �ȿ����� ���� �� �� �ִ�.(���� => ����ó��, ���, �޼ҵ�ȣ��==> �޼ҵ峪 ���ȿ� ���� ��. { })
	int a = 100;    // 0
	float f;   // 0.0f
	double d;    // 0.0
	boolean boo;  //false
	long l;    // 0L
	char c;    // '\0'
	String s;   // null => "�ּҰ� ����." default��.
	String ss="";
	static int aa;   // new�� �ּҸ� �������ص� �ٷ� �ּҰ��� ������.

}

public class MainClass2 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Data.aa);
	//	System.out.println(Data.ss);   ==> �ν��Ͻ� ������ new�� �����ؾ� �޸� �ּҰ� �־� ������ �� ������ new�� ������ ���� ���߱⶧����, ������ �ּҰ��� ���� �����ؿ� �� ����.
		
		
/*
		 Data dd = new Data();   // dd = Ŭ���� ���� = ��ü(�������� ��Ƴ��� �޸� ���� ���)
		 
		 System.out.println(dd.a);
		 System.out.println(dd.boo);
		 System.out.println(dd.c);
		 System.out.println(dd.d);
		 System.out.println(dd.f);
		 System.out.println(dd.l);
		 System.out.println(dd.ss);
		 System.out.println(dd.s);
		
*/		
	}

}
