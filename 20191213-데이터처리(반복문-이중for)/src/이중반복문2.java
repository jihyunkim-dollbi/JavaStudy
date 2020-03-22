/*
 * 정보처리, 코딩테스트 ==> double for statement
 * 
 * //break    : 반복을 중단할때
 *   for(int i=1; i<=10;i++)    ==> 1 2 3 4 까지 하고 break 걸리고 증가로 가지만 증가할 수 없어서 끝!
 *   {
 *   
 *   if(i == 5)
 *     break;   ==> 따라서 여기서 종료하라.
 *     System.out.println(i);
 *   
 *   }
 *   
 *      
 * //continue : 특정부분을 제외 할때
 *  for(int i=1; i<=10;i++)    ==>  1 2 3 4 6 7 8 9 10 ==> 5를 제외하고 출력
 *   {
 *   
 *   if(i == 5)
 *     continue;   ==> 5를 빼고 증가한 다음 다시 시작하라.   ex) 단어찾을때?
 	
 *     System.out.println(i);
 *   
 *   }
 * 
 * 
 */
 
 
public class 이중반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			
			if(i == 5)
				break;   
				System.out.println(i);
				
		}
			
			System.out.println("===continue===");
			
			for(int i=1; i<=10; i++) {
				
				if(i%2 != 0 )     // 홀수일때를 빼고 출력하라???????????????????????????????????
					continue;   
					System.out.println(i);
			}		
			
	}

}
