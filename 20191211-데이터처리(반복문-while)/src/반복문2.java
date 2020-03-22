
public class 반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A ~ Z  
		/*
		int i = 1;
		char c ='A';
		
	    while(i<=26){ // 1이 26이 될때까지
	    	
	    	System.out.print(c++ + "\t"); //c에  +1 씩 해
	    	if(i%5 == 0) // 만약 i를 5로 나눴을때 0이라면 
	    		System.out.println(); // 한줄을 띄어
	    	
	    	i++;  // i를 계속 증가해
	    	
	    }
	    
	    */
		
		
	     	 int i = 1;
		 char c ='A';
		 boolean bCheck = true;
		 
		 while(i <= 26){

			 if(bCheck == true)
				 System.out.print(c + "\t"); // 대문자 출력
			 else
				 System.out.print((char)(c+32)+"\t");  // 소문자 출력

			 if(i%5 == 0) // 도는 횟수가 5번이 될때마다, 
			 {
				 System.out.println(); // 한줄을 뛰어 
				 bCheck = !bCheck;  // bCheck는 false를 대입하고! ==> 따라서 System.out.print((char)(c+32)+"\t");
			 }


			 i++; //while이 도는 동안 i를 1씩 증가해
			 c++; //while이 도는 동안 c를 1씩 증가해

		 }
		 
	
	}

}
