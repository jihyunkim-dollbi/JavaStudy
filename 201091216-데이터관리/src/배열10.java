/*
 * 
 *    1) ����
 *       int a,b,c,d,e =>���� (�Ѱ��� ���ó ó��) => �迭
 *       int max, min ==> �迭�� �ȵɼ��� �ִ�. 
 * 
 * 
 * 
 * 
 */





import java.util.Arrays;
import java.util.Scanner;

public class �迭10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		//�ټ����� ������ �޾Ƽ� �ִ밪�� �ּҰ��� �����.
	
/*
		
		Scanner scan = new Scanner(System.in);
		
		int[] score = new int[5];
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < score.length; i++)
		
		{
			
			System.out.println((i+1) + "��° ������ �Է��ϼ���: ");
			score[i]= scan.nextInt();
			
			if(score[i] > max)
			{
			   max = score[i];
			}
			
			
			else 
				min = score[i];  // else ���� ��������� ó�� ��������.
			
						
			/*
			if else(score[i] < min)   //if else �� ���� �ȸ���.
			{
				min = score[i];
			}
			*/
				
	//	}
		
			
	//	System.out.println("���� ū ��: " + max);
	//	System.out.println("���� ���� ��: " + min);
	
			Scanner scan = new Scanner(System.in);
		
			int[] arr = new int[5];
			
			
			
			
			 for(int i=0; i<5; i++)
			 {
				 
				 arr[i] = (int)(Math.random()*100)+1;
				 		 
			 }
			
            int max = arr[0];    // ������ ��������� �׳� �ƽ��� 100 ���� 0���� �׳� ��Ƶ� �ȴ�.
            int min = arr[0];    // 0�� �����ϰ� �Ǹ� �ƽ��� ���������� min���� ���� ������ ���Ѵ�. ���� ���� ���� ���ϰ� ������ ���ϱ�.

            //�ִ밪, �ּҰ�ó���ϱ� 
            
            //   Arrays.sort(arr);  --> �̷��� ������,���������� ū������ ���´�!
            
            
            
            //ó��
            for(int i:arr)
            {
            	
            	if(max<i)
            		max =i;
            	if(min>i)
            		min =i;
            	            	
            }
            
            // ���
            for(int i:arr)
            {
            	
            	System.out.println(i + "  ");
            }

		  System.out.println();
		  System.out.println("max: " + max);
		  System.out.println("min: " + min);
		  
		  
	}

}
