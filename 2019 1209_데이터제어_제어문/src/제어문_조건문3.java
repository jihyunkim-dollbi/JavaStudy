/*
 * 알파벳 => 저장 => 대문자? or 소문자? 구하기 프로그램!
 */
public class 제어문_조건문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        char alpha = 'a';
        char beta = 'A';
		
        // 사이, 기간 ==> && 를 이용! 
		
        // 연산자 => char는 모든 연산시==> 정수변환(자동형변환), 굳이 정수로 변환해서 써 놓을 필요 없다.
		
        if(beta >= 'A' && beta <='Z')  // beta가 A와 Z 사이에 있다면
        	System.out.println(beta + "는(은) 대문자입니다.");
        		
        if(alpha >= 'a' && alpha <= 'z') // alpha가 a 와 z 사이에 있다면
        	System.out.println(alpha + "는(은) 소문자입니다.");
        	
        ////////////////////////////////////////////////
        
        // if, if, if~~~ 다중조건문을 사용할 경우 모든 경우의 수를 거치기 때문에 모든 경우에 수를 만족할 경우에 여러개의 실행문장을 처리할 수 있다.
	// but if, else if, else if , else~  선택조건문의 경우 여러 조건문중 일치하는 단 한개의 조건문만 실행을 한다!
	int value = 150;

	if(value > 200) {
		System.out.println("value is bigger than 200");
	}
	else if (value >= 50 && value < 200 ) {
		System.out.println("value is between 50 to 200");
	}
	else {
		System.out.println("value is less50");
	}
		
		
		
		
    }       

}
