import java.util.Scanner;

public class �迭14 {

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
		
		// ���
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
			System.out.print((i+1)+ "��° �� �Է�(O,X): ");
			user[i]=s.charAt(0);    //   ù���� ��������
			
		}
		
		  
		//���
		  System.out.println("����: ");
		 for(char c:dap)
		 {
	            System.out.print(c+ " ");
								
		 }
		
			System.out.println("\n����� �Է°�: ");
		  
		  for(char c:user)
		  {
			  System.out.print(c + " ");
		  }
		    System.out.println("\n���: ");
		  
		    
		  int count = 0;
		  for(int i=0;i<dap.length;i++)
		  {
			  if(dap[i]==user[i])
				  count++;
		   }
		  
		   System.out.println("����:" + (count*10) + "��");
		
		
		
		
		
	}

}
