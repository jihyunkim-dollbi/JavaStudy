/*
 * ���ĺ� => ���� => �빮��? or �ҹ���?
 * 
 * 
 * 
 * 
 * 
 * 
 * 

 * 
 * 
 */
public class ���_���ǹ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char alpha = 'a';
        char beta = 'A';
        // ����, �Ⱓ ==> &&
        // ������ => char�� ��� ������ �Ǹ� ==> ������ȯ(�ڵ�����ȯ), ���� ������ ��ȯ�ؼ� �� ���� �ʿ� ����.
        if(beta >= 'A' && beta <='Z') 
        	System.out.println(beta + "��(��) �빮���Դϴ�.");
        		
        if(alpha >= 'a' && alpha <= 'z')
        	System.out.println(alpha + "��(��) �ҹ����Դϴ�.");
        	
        ////////////////////////////////////////////////
        
        
        int value = 150;
        
        if(value < 200) {
        	System.out.println("value is less than 200");
        }
        else if (value >= 50 && value <= 200) {
        	System.out.println("value is between 50 to 200");
        }
        
        System.out.println("value is less50");
        
        
        
        
        
      
	    
	}       

}