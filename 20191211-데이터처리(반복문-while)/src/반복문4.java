import java.util.Scanner;
public class 반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       		
		// 100에서 999사이에 7의 배수의 개수와
		// 4의 배수가 아닌 수의 개수를 구하라.
		int i = 100; // 루프변수
		int a7 = 0, a4 =0; ///  1로 잡을 경우 0으로 잡을 경우!!??????
		

		
	    while(i<=999) {
	    	
	    	if(i%7 == 0)
	    	   a7++;   // 7의 배수 카운트 변수
	    	if(i%4!=0)
	    	   a4++;   // 4의 배수아 아닌 수 카운트 변수
	    	
	    	i++;
	    	
	    }
	
		System.out.println("7의 배수의 개수:" +a7 );
		System.out.println("4의 배수가 아닌 개수:" + a4);
		
		
		//////////////////////////////
		
		
		
		int i=1;     // 루프변수
		int count=0; // 카운트변수
		int i7=0;    // 7의 배수 변수
		while(i<=100) {
			
			
			if(i%7==0) {
				
				count++;
				System.out.println(count+ "번째 7의 배수는" + (i7=i));
			}
			i++;
		}
		
		
	}

}
