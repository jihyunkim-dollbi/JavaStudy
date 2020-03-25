//수정 - UTF-8
import java.util.Scanner;

public class 배열2 { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = new int[3];
		                 // ===  : 3의 의미는 칸이 생김!
		                    		
		Scanner scan = new Scanner(System.in);  // 배열 안에 들어가는 값을 키보드로 입력하기.
		
		int max = 0;
		
		for(int i=0; i<arr.length; i++)   // 0부터 시작해서 1,2 까지 총 3번 돌아감 = > 이유는 배열의 3칸을 위에서 선언함!
		{
		
			System.out.println((i+1)+"번째 정수 입력: ");
		   
			arr[i] = scan.nextInt();
			
		    if(arr[i]>max)
			   max=arr[i];
		 
		}
		System.out.println("가장 큰값: "+max);
		
		
		
		 
	}

}
