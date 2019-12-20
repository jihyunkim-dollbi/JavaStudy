		// 1~45까지 난수 발생 , 중복없이 6개 
		// 배열 ==>6개
		// 난 수 ==> for문 6바퀴  ==> 이 안에서 while문 돌리고(난수발생,배열 저장된 데이터와 난수(같다))
/*
 * 			for(6횟수)
 * 		{
 * 
 *   		while(중복)
 *   		{
 *   		난수발생
 *   		배열 저장된 데이터와 난수(같다)
 *   
 *   		}
 * 
 * 			배열 저장
 * 		}
 * 
 * 
 * 		
 */
		
		
		
		// 처리기능  ->  매개변수 x
		// 출력기능!
        // 혼합 프로세스.
	
public class 메소드4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
			  
			  //배열에 저장
			  com[i] = su;
			  
			  
			  
			  		// 0.0~0.99*45
			        // (int) 0~44
			  		// +1 ->1~45
		 }
		
		//출력- 인덱스가 아닌 데이터를 가져온다.
		 for(int i:com) // 저장된 데이터 한개씩 읽어온다.(for-each)
		 {
			System.out.print(i +  " ");
			 
			 
		 }
		 
		 
		 
		 
		 
		 
		
	}

}
