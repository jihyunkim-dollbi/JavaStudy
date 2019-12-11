/*
 *  1. 반복문
 *  
 *  while
 *  =======
 *    형식) 선조건-> 실행이 안될수도있다.
 *       초기값                1
 *       while(조건문)  2
 *       {
 *         반복 실행문장    3
 *         증가식            4  -> 2로 가서 false가 될떄까지.
  *       }
 *        
 *        ex)
 *         
 *        1~10
 *        int i = 1;
 *        while(i<=10)  
 *        {
 *         System.out.println(i);
 *         i++;
 *        }
 *  
 *  do while
 *  =========
 *       형식) 후조건 - 한번이상은 반드시 수행
 *          초기값                1
 *          do
 *          {
 *            실행문장          2
 *            증가식            3
 *         
 *          }while(조건문); 4
 *         
 *        ex)
 *        
 *         int i=1;
 *         do
 *         {
 *         
 *         System.out.println(i);  // 일단 출력
 *         i++; // 출력후 증가됨. 10이 될떄까지 출력.
 *         }while(i<=10)  -> 증가된값을 비교.
 * 
 *   for
 *   ======
 *        형식) 1    2     4
 *        for(초기값;조건식;증가식)
 *        {
 *            실행문장   3
 *        }
 * 
 *         ex) 
 *         for(int i = 1; i<=10; i++)
 *           {
 *              System.out.println(i);
 *           }
 * 
 *    출력 방향(왼쪽 -> 오른쪽/ 위-> 아래x)
 *    =========>
 *    =========>
 *    =========>
 *    
 * 
 *   1부터 10까지 출력 한줄에 3개씩
 * 
 * 
 */
public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int i = 1;
		while(i<=10) {
			
			
			System.out.print(i + "\t");
			
			if(i%3 == 0)
			System.out.println();
			i++;
			
			
			
			
			System.out.println("\ndo~while");
		
	      	i = 1;  //초기값주기
	      		      			    
	      	do {
	      		
	      		System.out.print(i + "\t");
				
				if(i%3 == 0)
				System.out.println();
				i++;
	      		
	      	}while(i<=10);
		
		
		     System.out.println("\nfor");
		     
		    
		     for(i=1; 1<=10; i++)
		     {
		    	 System.out.print(i + "\t");
					
					if(i%3 == 0)
					System.out.println();
					
		     }
			
		}
		
		
	}

}
