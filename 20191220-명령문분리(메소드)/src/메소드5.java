
public class 메소드5 {

	static int[] getRand()
	{
		
		int[] com = new int[6];
		 
		 // 난수와 배열안에 같은수가 있는지 비교해봄
		 int su = 0;
		 boolean bCheck = false;
		 
		 
		 //처리
		 for(int i = 0 ; i< 6; i++)
		 {
			  bCheck = true;
			  
			  while(bCheck)
			  {
				  su = (int)(Math.random()*45)+1;
				  bCheck = false;
				  
				  for(int j=0; j<i; j++)
				  {
					  
					  if(com[j] == su)
					  {
						  bCheck = true;
						  break;
					  }
					  
				  }
				  
			  } 
			  
			  com[i] = su; 
		 }
		 
		
		return com;
	}
	
	
	static void print(int[] com)
	
	{
		 for(int i:com) // 저장된 데이터 한개씩 읽어온다.(for-each)
		 {
			System.out.print(i +  " ");
		 }
			
	}
	
	
	static void process()    // 이소스 전체를 받고 싶어서 process를 만들어 놓음!
	{
		int[] com = getRand();
		print(com);
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
		
		
		
		
		
	}

}
