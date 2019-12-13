/*
 *   이중for -  가장 중요한 것은 두번째 for문의 조건식이 가장 중요하다. 
 *   
 *   형식 - 순서)
 *   
 *      for(초기값;     조건식;    증감식)   - 1차 for   ==> 줄수 (아래로 내려감)
 *      {    1      2-false- 종료시점
 *                   -true▽
 *                   
 *                         
 *        for(초기값;  조건식; 증감식)  - 2차 for       ==> 실제출력 (오른쪽으로 나열됨)
 *             1     2 - false-> 1차의 증감으로
 *        {            - true -> 실해문장 ->2for증감식 ---> 1for증감식
 *           
 *           실행문장 3
 *          
 *        }
 *         
 *         실행문장 -1
 *      }
 * 
 *    ***** =>  single for
 *    
 *    ***** =>  double for
 *    *****
 * 
 * 
 */
public class 이중반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*
      *
     
		for(int i = 1; i <= 5; i++)
		{
			
			for(int j = 0; j <= 2; j++) {
				
				
				System.out.println();
				
			}
				
				System.out.println(i);
			
		}
		
		 */
		
		/*
		for(int i = 1; i <= 5; i++)
		{
		   for( int j=1; j<=6; j++)
		   
		   {
			   
		    System.out.print("A");
			
		}
		
		System.out.println();
		
		}
		*/
		
		
		 
		/* Example 1
		
		for(int i = 1; i <= 5; i++)
		{
		   for( int j=1; j<=5; j++)
		   
		   {
			   
			  if(i == j) {
				  				  
				  System.out.print(i);
				 
			  }else {
					  
					  System.out.print("#");
				  				  
		        	  }
			}
		
		System.out.println();
		
		} 
		*/
		
		
		
		
		
		/*
		Example 2
		
		*
		**
		***
		****
		*****

		for(int i = 1; i <= 5; i++)
		{
		   for( int j = 1; j<=i; j++)
		   
		   {
			   	  System.out.print("*");
				 
	     	}
		
		     System.out.println();
		
		} 
		*/
		
		
		
		
		/*  
		Example3
		
		*****
		****
		***
		**
		*
		1   5
		2   4
		3   3
		4   2
		5   1
		
		i + j = 6
		j = 6 - i
		
		따라서 2차 포문의 개수는 6-i의 개수가 되는 것이다.
       
		
		for(int i = 1; i <= 5; i++)
		{
		   for( int j = 1; j<=6-i; j++)
		   
		   {
			   	  System.out.print("*");
				 
	     	}
		
		     System.out.println();
		
		} 
		*/
		
		
		
		
		/*
		 * Example4
		 * 
		 * i    j   k
 		 * 줄수   공백   별표
		 * 1    4    1
		 * 2    3    2
		 * 3    2    3
		 * 4    1    4
		 * 5    0    5
		 * 
		 *   i+j = 5 ===> 따라서 j=5-1
		 *   i=k
		 */
		 
	    /*
		for(int i = 1; i <= 5; i++)
		{
		   for(int j = 1; j<=5-i; j++)
		   {
			  
			   System.out.print(" ");
		   {
			 for(int k=1; k == i; k++) 
			 
			 
		   }
				
			  System.out.print("*");
			   
		  }
	  		 System.out.println();
	   }
		   
		 */ 
		
		
		
		/*
		 * Example5
		 * 
		 **
         ***
         ****
         *****
         ******
		 // 위 별표 그린것
		 
		 

		for(int i = 1; i <= 5; i++)
		
		{
		   for(int j = 0; j<=i-1; j++)
		   
		   {
			   System.out.print("*");
				
		  }
		   System.out.println();
		
		}
		*/
		
		  /*     Example6 
				 * 구구단  
				 *   
				 *  2*1 = 2 3*1=3 4*1 =4   .....9*1=9
				 *   
				 *  2*9=18                      9*9=81
				 *   
				 *   아래 예제는 큰수에서 작은 수로 곱해본 것이다.
				 	

				for(int i = 9; i >=1; i--)
				
				{
				   for(int j = 8; j>=2; j--)
				   
				   {
					   System.out.printf("%2d *%2d = %2d\t",j,i,j*i );
						
				  }
				   System.out.println();
				
				}
				
				*/
				
		// Example7
		/*
		 *  *1234
		 *  6*789
		 *  1011*1213
		 *  141516*17
		 *  18192021*
		 * 
		 A형 답안: FOR문을 이용하여 구현===============================================
		    int k=1;
		
		    for(int i = 1; i <= 5; i++) {
			
			for(int j =1; j <= 5; j++) {
					
				
		   	    if (i == j) 
						
					{
						System.out.print("*");
					}
		    	    else
		    	    {
		    	    	 System.out.print(k);
		    	    			    	    	  
		    	    }
		    	    
		   	    k++;			  		   
			}
			
			System.out.println();
			
		}
		
		 B형 답안:  ~~~구현===============================================
		*/
		//    *1234 5*678 910*1112 131415*16 17181920*	
		/*
		 * 
		 * 
		 *  
		 *  
		 do-while : 한 번 이상을 수행하는 반복분(빈도 많음!)
 *      
 *       형식 ) 
 *        
 *       초기값 ==> 어디서 부터 시작해야 하는지!
 *       do{
 *       
 *       실행문장 ==> 여러문장을 사용할 수 있다.
 *       증가식 ==> 증감식 (i++; i--, i+=2)
 *       
 *       }while(조건문);
		  
		 */
		/*
		 * 
		     char c = '*';
		     int i = 1;
		     boolean bCheck = true;
		     do {
		    	 
		    	 System.out.print(i);
		    	 i++;
		    	 
		    	 if(i%5 == 0) 
		    	 {
		    	     System.out.println();
		    		 bCheck = !bCheck;
		    		     		 
		    			    	 
		     }while(i<=20);
		   
		     
		     
		    	
		     */    	
		    	
		     
		
		
		
		
		
		
		
		
		/*
		 *    1)
		 *     @@@@@
		 *      @@@
		 *       @
		 *      @@@
		 *     @@@@@
		 *     
		 *   2) 
		 *       
		 *    @   @      
		 *    @   @
		 *    @@ @@
		 *    @@@@@
		 *    @@ @@
		 *    @   @
		 *    @   @
		 *    
		 *    
		 *    3)
		 *    
		 *    
		 *    1 2 3 4 5 
		 *      6 7 8
		 *        9
		 *     10 11 12
		 *  13 14 15 16 17      
		 * 
		 *  ================
		 *  
		 */ 
	  
		
		     
		     
	
		
	}

}
