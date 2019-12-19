
public class 메소드3 {
	static void a()
	{
		System.out.println("a() 기능처리...");
		b();
	}
	
	static void b()
	{
		
		c();
		System.out.println("b() 기능처리...");
		
	}
	
	static void c()
	{
		System.out.println("b() 기능처리 전...");
		d();
		System.out.println("b() 기능처리...");
	}
	
	static void d()
	{
		System.out.println("d() 기능처리...");
		
	}
	
	static void process()
	{
		System.out.println("a() 호출전...");
		a();
		System.out.println("a() 호출후 ...");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();   // 트레이스 : 디버깅을 걸어 어디서 문제가 발행됐는지 알기위해.
					//	메소드마다 걸기-왼쪽에 더블클릭해서
					// 결과값이 없으면 다음문장으로 넘어가고 , 결과값이 있으면 넘겨주고 넘어감.
					// 결국 어떤 메소드를 한번 호출하면 그 메소드에 있는 기능들을 다 수행한다.
		
		
	}

}
