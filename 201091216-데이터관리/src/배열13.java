import java.util.Arrays;
/*
 *  i j-s  j-e js-1=i
 *  0 1   2
 *  1 2   3
 *  2 3   4
 *  3 4   5
 */

// �ߺ��� �ȵǰ� �̱�




public class �迭13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Select Sort!
		
		
		// ��������
         int[] arr = new int[5];
         
		// �ʱⰪ
         for(int i = 0; i < arr.length; i++)
         {
        	 
        	 arr[i] = (int)(Math.random()*100)+1;
        	 
         }
		
		System.out.println("������ : ");
		
		for(int i:arr)
		{
			System.out.print(i+ " ");
		}
		
		
		System.out.println();
		System.out.println("������: ");
		
	//	Arrays.sort(arr);  // asc�� ������
		
		for(int i = 0; i < arr.length-1; i++)    //arr.length-1 �̶� �� �ڸ����� 5���ε� �ڱ� �ڽ��� ������ �����ϱ� -1�� �ؼ� 4���� ���ϰԵ�.
		{
			for(int j=i+1; j < arr.length; j++)   // j=i+1 �� ������ i�� �ڱ��ڽŰ� ���ϰ� ����
			{
			  	if(arr[i]<arr[j])     //  < �������� , > ��������
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					
				}
			  			  	
			}
			
		}
		
		
		for(int i:arr)   
		{
		 System.out.print(i + " ");	
		}
		
		
	}

}
