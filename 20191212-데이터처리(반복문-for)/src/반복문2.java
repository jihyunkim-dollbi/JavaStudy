/*
 * 1-2+3-4+5.......-10
 * 
 * 액터 = 1. user
 *       2. manager  // 관리자페이지 유저 페이지 따로 있다.
 * 
 * 2019 0.5
 * 2020 1
 * 2021 0.5
 * 2022
 * 
 * 
 */
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int sum=0;
		for(int i=1;i<=10;i++) {
			
			
			if(i%2 ==0)
				sum-= i;  // '-'를 붙여줌 
			else
				sum+=i;   // '+'를 붙여줌
			
		}
        	System.out.println("sum=" + sum);
	}

}
