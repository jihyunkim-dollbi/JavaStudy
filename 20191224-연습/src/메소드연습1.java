
public class 메소드연습1 {

	static int arr (int a)
	{
		int total =20;
		a = a*50;
		
		return a;

	}
	
	static double arr (double a)
	{
		double total;
		total = a + 1;
		
		return total;
	}
	
	
	
	
	
	static void process()
	{
		
		int  aaa = arr(20);
	// 데이터형은 반드시 맞추고
	// 변수명은 바꿔도 상과 없다.
	// 리턴값이 있는 경우 왼쪽에 형과 명을 주고 오른쪽에 메소드 명시.
		double bbb = arr(50);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	   double d = 30.5;
	   System.out.println(arr(d));
	   
	   
	   
	}

}
