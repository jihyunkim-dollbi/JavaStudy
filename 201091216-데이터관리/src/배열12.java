import java.util.Scanner;

public class 배열12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 5개의 난수 발행 ==> 배열
		// 50 20 40 50 10 
		//================> 50 40 30 20 10
		// 
		// 30 20 
		
		
		
		 Scanner scan = new Scanner(System.in);
		    
		    int[] score = new int[5];
		  
		    
		    
		    for(int i = 0; i < 5; i++) {
		    	
		    	score[i] = (int)(Math.random()*100)+1;
		    	
		    }
			 
		    
			for(int i = 0; i < 4; i++)
			{
				
				for( int j = (i+1); j < 5; j++)
				{
					
					if(score[i] < score[j]) 
					{
						int temp = score[j];
						score[i]= score[j];
						score[j]=temp;	
					}
					
				}
						
			}
		    
			 for(int i:score)
	         {
	         	
	         	System.out.println(i + "  ");
	         
	         }
			
		
	}

}
