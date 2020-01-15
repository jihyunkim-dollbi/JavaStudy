/*
 * A ~ Z  5줄씩
 * 
 * 
 * 
 * 
 */
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A ~ Z  5줄씩
		/*
		int i = 1;
		char c ='A';
		
	    while(i<=26) {
	    	
	    	System.out.print(c++ + "\t");
	    	if(i%5 == 0)
	    		System.out.println();
	    	
	    	i++;
	    	
	    }
	    */
		
		//  1 대 2 소 3대
	    
 		int i = 1;
		char c ='A';
	    boolean bCheck = true;
	    while(i <= 26) {
	    	
	    	
	    	if(bCheck == true)
	    	System.out.print(c + "\t");
	    	else
	    		System.out.print((char)(c+32)+"\t");
	    	if(i%5 == 0)
	    	{
	    		System.out.println();
	    	    bCheck = !bCheck;
	    	}
	    		
	    	    	
	    	i++;
	    	c++;
	    
	    }
	
	}

}
