import java.util.Scanner;

public class �迭6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// 5���� �̸��� �Է¹޾Ƽ� �����ϰ� => ����ϴ� ���α׷��� �ۼ�
		
		
		String[] names = new String[5];
		
		Scanner scan = new Scanner(System.in);
		
				
		for(int i = 0; i<names.length; i++)
		
			
		{
			System.out.println((i+1) + "��° �̸� �Է�:");
			names[i] = scan.next();
		}
		
		/*
		 *  ���
		 *  for each => �迭, ����ü(collection)
		 *   int[] data= {1,2,3,4,5}
		 *   {
		 *   
		 *   System.out.println(data[i])
		 * 
		 *   }
		 * 
		 *   for(int i:data)
		 *   {
		 *      System.out.println(i)
		 *   }
		 * 
		 * 
		 */
		for(String name:names)
		{
			
			System.out.println(name);
		}

		
		
		
		

	}

}
