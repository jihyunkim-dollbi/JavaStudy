import java.util.Scanner;

public class 배열11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 정수 5개를 입력 - 랜덤으로 받아서 등수를 출력해서 나타내기!
		
	    Scanner scan = new Scanner(System.in);
	    
	    int[] score = new int[5];
	    int[] rank = new int[5];
	    
	    for(int i = 0; i < 5; i++) 
	    {
	     	score[i] = (int)(Math.random()*100)+1;
	    }
		
	    
		for(int i = 0; i < 5; i++)
		{
			rank[i] = 1;
			for(int j = 0; j < 5; j++)
			{
								
				if(score[i] < score[j])
				
				{
						rank[i]++;
				}
			
			}
					
		}
		
		
		 for(int i:score)
          {
          	   System.out.print(i + "  ");
          }
		
		     System.out.println();
		 
			for(int i:rank)
             {
  				
              	System.out.print( i + " 위 ");
          
             }
		
		

		
	}

}
