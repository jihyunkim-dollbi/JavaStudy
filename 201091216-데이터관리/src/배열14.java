import java.util.Scanner;

public class 배열14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		char[] dap = new char[10];
	
		
		for(int i = 0; i < dap.length; i++)
		{
			int k = (int)(Math.random()*2);
			
			if(k==0)
				dap[i] = 'O';
			else
				dap[i] = 'X';
		}
		
		// 출력
		/*
		 for(char c:dap)
		 {
			  System.out.print(c + " ");
		 }
		*/
		Scanner scan = new Scanner(System.in);
		char[] user = new char[10];
		for(int i=0; i<user.length;i++)
		{
			
			String s = scan.next();
			System.out.print((i+1)+ "번째 답 입력(O,X): ");
			user[i]=s.charAt(0);    //   첫글자 가져오기
			
		}
		
		  
		//출력
		  System.out.println("정답: ");
		 for(char c:dap)
		 {
	            System.out.print(c+ " ");
								
		 }
		
			System.out.println("\n사용자 입력값: ");
		  
		  for(char c:user)
		  {
			  System.out.print(c + " ");
		  }
		    System.out.println("\n결과: ");
		  
		    
		  int count = 0;
		  for(int i=0;i<dap.length;i++)
		  {
			  if(dap[i]==user[i])
				  count++;
		   }
		  
		   System.out.println("점수:" + (count*10) + "점");
		
		
		
		
		
	}

}
