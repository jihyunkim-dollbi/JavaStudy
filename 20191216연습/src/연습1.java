
public class ����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		   String s="dskaamapplefjdiaadlfsdlf,<";
	        System.out.println("s="+s);
	        
	        int i=0;  // --length �ش� ������ ���� ���ϱ�, ���� ù��° ������ 0�� �ǹǷ� �װͱ��� ����ؾ���. > >= ����.
	        int count=0;
	        while(i < s.length()) {
	        	
	        	System.out.println((i+1)+"��° ����: " +s.charAt(i));
	        	
	        	char c=s.charAt(i);
	        	if(c == 'a' || c == 'A')
	        	count++;
	        	
	        	i++;
	        	
	                  	
	        }
	        
	        System.out.println("a�� A�� ������: " + count);		
    
		
		
		
		
		
		
		
		
		
	}

}
