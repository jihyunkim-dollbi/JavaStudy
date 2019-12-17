
public class 연습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   String s="dskaamapplefjdiaadlfsdlf,<";
	        System.out.println("s="+s);
	        
	        int i=0;  // --length 해당 문자의 개수 구하기, 따라서 첫번째 개수는 0이 되므로 그것까지 계산해야함. > >= 조절.
	        int count=0;
	        while(i < s.length()) {
	        	
	        	System.out.println((i+1)+"번째 문자: " +s.charAt(i));
	        	
	        	char c=s.charAt(i);
	        	if(c == 'a' || c == 'A')
	        	count++;
	        	
	        	i++;
	        	
	                  	
	        }
	        
	        System.out.println("a와 A의 개수는: " + count);		
    
		
		
		
		
		
		
		
		
		
	}

}
