/*
 *   ����for -  ���� �߿��� ���� �ι�° for���� ���ǽ��� ���� �߿��ϴ�. 
 *   
 *   ���� - ����)
 *   
 *      for(�ʱⰪ;     ���ǽ�;    ������)   - 1�� for   ==> �ټ� (�Ʒ��� ������)
 *      {    1      2-false- �������
 *                   -true��
 *                   
 *                         
 *        for(�ʱⰪ;  ���ǽ�; ������)  - 2�� for       ==> ������� (���������� ������)
 *             1     2 - false-> 1���� ��������
 *        {            - true -> ���ع��� ->2for������ ---> 1for������
 *           
 *           ���๮�� 3
 *          
 *        }
 *         
 *         ���๮�� -1
 *      }
 * 
 *    ***** =>  single for
 *    
 *    ***** =>  double for
 *    *****
 * 
 * 
 */
public class ���߹ݺ���1 {

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
		
		���� 2�� ������ ������ 6-i�� ������ �Ǵ� ���̴�.
       
		
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
 		 * �ټ�   ����   ��ǥ
		 * 1    4    1
		 * 2    3    2
		 * 3    2    3
		 * 4    1    4
		 * 5    0    5
		 * 
		 *   i+j = 5 ===> ���� j=5-1
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
		 // �� ��ǥ �׸���
		 
		 

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
				 * ������  
				 *   
				 *  2*1 = 2 3*1=3 4*1 =4   .....9*1=9
				 *   
				 *  2*9=18                      9*9=81
				 *   
				 *   �Ʒ� ������ ū������ ���� ���� ���غ� ���̴�.
				 	

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
		 A�� ���: FOR���� �̿��Ͽ� ����===============================================
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
		
		 B�� ���:  ~~~����===============================================
		*/
		//    *1234 5*678 910*1112 131415*16 17181920*	
		/*
		 * 
		 * 
		 *  
		 *  
		 do-while : �� �� �̻��� �����ϴ� �ݺ���(�� ����!)
 *      
 *       ���� ) 
 *        
 *       �ʱⰪ ==> ��� ���� �����ؾ� �ϴ���!
 *       do{
 *       
 *       ���๮�� ==> ���������� ����� �� �ִ�.
 *       ������ ==> ������ (i++; i--, i+=2)
 *       
 *       }while(���ǹ�);
		  
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
