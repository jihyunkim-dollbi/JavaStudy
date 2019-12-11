import java.util.Scanner;
public class 반복문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 100에서 999사이에 7의 배수의 개수와
		//   4의 배수가 아닌 수의 개수를 구하라.
		int i = 100; // 루프변수
		int a7 = 0, a4 =0; ///  1로 잡을 경우 0으로 잡을 경우!!??????
		

		
	    while(i<=999) {
	    	
	    	if(i%7 == 0)
	    	   a7++;
	    	if(i%4!=0)
	    		a4++;
	    	
	    	i++;
	    	
	    }
	
		System.out.println("7의 배수의 개수:" +a7 );
		System.out.println("4의 배수가 아닌 개수:" + a4);
		
	}

}
