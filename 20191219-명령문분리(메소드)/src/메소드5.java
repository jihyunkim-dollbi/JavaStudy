/*
 *   메소드의 목적: 1. 재사용!(1메소드 1기능!) 2. 반복을 제어하기 위해 메소드화 함!!(똑같은 문장이 반복됐을 때!)
 *   =========
 *   
 *   
 * 
 * 
 * 
 * 
 * 
 */
public class 메소드5 {

	
	static void star()   // 메소드는 안에 모든 실행문을 모두 실행함
	
	{
		
		System.out.println("*");
		System.out.println("**");
		System.out.println("***");
		System.out.println("****");
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i=0; i<10; i++)
         {
    	     star();
          }

	
	
	
	
	
	}

}
