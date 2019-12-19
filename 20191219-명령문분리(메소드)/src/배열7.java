// 3 개의 메소드 안에 각각 들어있는 변수들!
// 매개변수 전송법
// 콜바이 레퍼런스 , 콜바이벨류!   
// ==> 배열/클래스는 주소로..... 
public class 배열7 {
	static void getData2(int a)
	{
		
		a=500;
	}
	static void getData(int[] arr)
	{
		for(int i=0;i <arr.length; i++)
		{
			
			arr[i]= (int)(Math.random()*100)+1;
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			String a="Java";          //스트링으 일반변수취급이기때문에(콜바이벨류타입) 메소드에서 값을 지정해줘도 지역변수값으로 나온다 
			getData2(a);
			System.out.println(a);    // 아직 500 이다.
			
		*/	
			int a=100;          //스트링으 일반변수취급이기때문에(콜바이벨류타입) 메소드에서 값을 지정해줘도 지역변수값으로 나온다 
			getData2(a);
			System.out.println(a);    // 아직 500 이다.
			
			
			
			
		
			int[] arr = new int[5]; // 모두 0값!
			
			for(int i:arr)
			{
				
				System.out.println(i);   // 여기까지 0값
			}
			getData(arr);
			
			for(int i:arr)
			{
				
				System.out.println(i);  // 
			}
			
			  
	}

}
