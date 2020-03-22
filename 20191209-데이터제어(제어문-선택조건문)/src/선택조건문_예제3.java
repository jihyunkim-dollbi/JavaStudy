
public class 선택조건문_예제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//단일 if
		int a = (int)(Math.random()*100)+1;
				//   ============->0~99
		int b = (int)(Math.random()*100)+1;
		//큰값, 작은 값
		System.out.println("a= "+ a+", b= "+b);
		
		
		if(a>b) {
			System.out.println("큰값은 "+ a +"입니다");
			System.out.println("작은 값은 "+ b + "입니다");
		}
		if(a<b) {
			System.out.println("큰값은 " + b + "입니다");
			System.out.println("작은 값은 " + a + "입니다");
		}
		if(a == b) {
			System.out.println("같다.");
		}
		
	    // if문의 경우 경우의 수를 가장 먼저 생각해보고 조건을 주어야한다.	
		
		
	
	}

}
