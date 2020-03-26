import java.util.Arrays;
/*
 *  i j-s  j-e js-1=i
 *  0 1   2
 *  1 2   3
 *  2 3   4
 *  3 4   5
 */

// 중복이 안되게 뽑기




public class 배열13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Select Sort!
		
		
		// 정수저장
         int[] arr = new int[5];
         
		// 초기값
         for(int i = 0; i < arr.length; i++)
         {
        	arr[i] = (int)(Math.random()*100)+1; 
         }
		
		System.out.println("정렬전 : ");
		
		for(int i:arr)
		{
			System.out.print(i+ " ");
		}
		
		
		System.out.println();
		System.out.println("정렬후: ");
		
	//	Arrays.sort(arr);  // asc만 제공됨
		
		for(int i = 0; i < arr.length-1; i++)    //arr.length-1 이란 총 자릿수가 5개인데 자기 자신은 비교하지 않으니까 -1을 해서 4번만 비교하게됨.
		{
			for(int j=i+1; j < arr.length; j++)   
			{ //
			  // j=i+1 인 이유는 i가 자기자신과 비교하고 나면
			  // 	
				
				
			  	if(arr[i]<arr[j])     //  < 오름차순 , > 내림차순
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
