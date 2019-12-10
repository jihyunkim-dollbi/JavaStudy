/*
 * 알파벳 => 저장 => 대문자? or 소문자?
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
public class 제어문_조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char alpha = 'a';
        char beta = 'A';
        // 사이, 기간 ==> &&
        // 연산자 => char는 모든 연산이 되면 ==> 정수변환(자동형변환), 굳이 정수로 변환해서 써 놓을 필요 없다.
        if(beta >= 'A' && beta <='Z') 
        	System.out.println(beta + "는(은) 대문자입니다.");
        		
        if(alpha >= 'a' && alpha <= 'z')
        	System.out.println(alpha + "는(은) 소문자입니다.");
        	
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