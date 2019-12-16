/*
 * 
 *    1) 변수
 *       int a,b,c,d,e =>값다 (한개로 모아처 처리) => 배열
 *       int max, min ==> 배열이 안될수도 있다. 
 * 
 * 
 * 
 * 
 */





import java.util.Arrays;
import java.util.Scanner;

public class 배열10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		//다섯개의 정수를 받아서 최대값과 최소값을 출력함.
	
/*
		
		Scanner scan = new Scanner(System.in);
		
		int[] score = new int[5];
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < score.length; i++)
		
		{
			
			System.out.println((i+1) + "번째 정수를 입력하세요: ");
			score[i]= scan.nextInt();
			
			if(score[i] > max)
			{
			   max = score[i];
			}
			
			
			else 
				min = score[i];  // else 문을 사용했을때 처리 가능해짐.
			
						
			/*
			if else(score[i] < min)   //if else 를 쓰면 안먹힘.
			{
				min = score[i];
			}
			*/
				
	//	}
		
			
	//	System.out.println("가장 큰 값: " + max);
	//	System.out.println("가장 작은 값: " + min);
	
			Scanner scan = new Scanner(System.in);
		
			int[] arr = new int[5];
			
			
			
			
			 for(int i=0; i<5; i++)
			 {
				 
				 arr[i] = (int)(Math.random()*100)+1;
				 		 
			 }
			
            int max = arr[0];    // 랜덤을 사용했으니 그냥 맥스는 100 민은 0으로 그냥 잡아도 된다.
            int min = arr[0];    // 0을 대입하게 되면 맥스는 가능하지만 min값은 값을 구하지 못한다. 따라서 먼저 값을 구하고 다음에 구하기.

            //최대값, 최소값처리하기 
            
            //   Arrays.sort(arr);  --> 이렇게 했을때,작은값부터 큰값까지 나온다!
            
            
            
            //처리
            for(int i:arr)
            {
            	
            	if(max<i)
            		max =i;
            	if(min>i)
            		min =i;
            	            	
            }
            
            // 출력
            for(int i:arr)
            {
            	
            	System.out.println(i + "  ");
            }

		  System.out.println();
		  System.out.println("max: " + max);
		  System.out.println("min: " + min);
		  
		  
	}

}
