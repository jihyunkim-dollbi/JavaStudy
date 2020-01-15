/*
 * 난수 = > 컴퓨터에서 임의의 수를 추출 하는 것.
 * 
 * 
 */
public class 선택조건문_예제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = (int)(Math.random()*101);  // 0~100
		// 0.0~0.99 = > 0.99 *101 ==> 100.~
		System.out.println("score = " + score);
		
		//90이상 -> A 80-> B 70 ->C 60 ->D  60 이하는 F 출력.
		
	//	if(score < 60) {
	//		System.out.println("F학점입니다.");
	//	}
	//	else {
	//		if(score >= 90)
	//				System.out.println("A학점");
	//		if(score >= 80)
	//			System.out.println("B학점");
	//		if(score >= 70)
	//			System.out.println("C학점");
	//		if(score >= 60)
	//			System.out.println("D학점");
			
	//	}
		
		/// 위와 같은 방법으로 했을 경우, 70 학점인 사람은 D,C 학점이 모두 나오기 때문에 이경우는 숫자의 범위를 잡아주어야한다.
		
		     if (score >= 90 && score <= 100) {
		    	 System.out.println("A학점");
		     }
		     else 
		     {
		    	 // 중첩 if => 이중 조건문
		    	 // if문 여러개를 사용했을 경우에는 조건 맞는 모든 문장을 수행할 수있다.
		    	 
		    	if(score >= 80 && score < 90)     
		    	 System.out.println("B학점");
		     
		        if (score >= 70 && score < 80)
		    	 System.out.println("C학점");
		     
		        if (score >= 60 && score < 70)
		    	 System.out.println("D학점");
		        if (score <60)
		        	System.out.println("F학점");
		     }
		     
		
		  //   10으로 나눠주고 처리하면 더 편할 수도 있다. 
		  //   조건문 옆에 ; 를 찍으면 실행안됨.
		     
		     
		
		
		
		
		
		
	}

}
