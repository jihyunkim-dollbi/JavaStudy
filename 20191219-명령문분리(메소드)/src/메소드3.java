
public class �޼ҵ�3 {
	static void a()
	{
		System.out.println("a() ���ó��...");
		b();
	}
	
	static void b()
	{
		
		c();
		System.out.println("b() ���ó��...");
		
	}
	
	static void c()
	{
		System.out.println("b() ���ó�� ��...");
		d();
		System.out.println("b() ���ó��...");
	}
	
	static void d()
	{
		System.out.println("d() ���ó��...");
		
	}
	
	static void process()
	{
		System.out.println("a() ȣ����...");
		a();
		System.out.println("a() ȣ���� ...");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();   // Ʈ���̽� : ������� �ɾ� ��� ������ ����ƴ��� �˱�����.
					//	�޼ҵ帶�� �ɱ�-���ʿ� ����Ŭ���ؼ�
					// ������� ������ ������������ �Ѿ�� , ������� ������ �Ѱ��ְ� �Ѿ.
					// �ᱹ � �޼ҵ带 �ѹ� ȣ���ϸ� �� �޼ҵ忡 �ִ� ��ɵ��� �� �����Ѵ�.
		
		
	}

}
