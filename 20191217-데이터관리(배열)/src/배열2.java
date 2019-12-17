/*
 *   중복이 없는 난수
 *   => 배열
 *   ===========
 *   
 *   난수 발생 시킴-> 중복이 없는 수가 나올때까지-> 중복이 없는 수가 나오면 다시 저장
 *   
 *   for문을 난수개수만큼 돌린다. 난수발생부분에 while돌아감 난수 발생 -> for문으로 난수비교하기 -> if문으로 선택가능
 *   
 *   
 *   
 *   
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class 배열2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] com = new int[9];
		
		int su=0; // 난수 발생시 저장할 넘버(com 넘버와 비교하여 중복이 아닐시 저장될 것임.) 
		boolean bCheck=false; // 중복여부 확인 중복;true 중복 아닐시;false 나옴
		
		for(int i=0; i<com.length;i++)
		{
			bCheck=true;
			
			//==========================중복안된 난수발생
			  while(bCheck)
			  {
				  // 난수 발생
				  su=(int)(Math.random()*9)+1;
				  bCheck=false;
				  // 중복여부 확인 i는 저장된 개수, i가 3개 검색하면 3개만 검색하면 됨, < 이유는 첫번째 것은 검색할 필요 x
				  for(int j=0; j<i; j++)
				  {
					  if(com[j] == su)   // else를 여기서 걸면 안되는 이유는 for믄이라는 것은 항상 0부터 시작하기 때문에.
						                 // 어떤 수가 나왔을때 그 인덱스 자리의 숫자와만 맞혀보고 맞으면 끝난다. 그렇기 때문에 맨 위에 주어야한다. 
					  {
						  bCheck = true;
						  break;
					  }
				  }
				  
				  
				  
			  }
			//========================== 
	        com[i]=su;
		}
		
		   // 출력
			for(int i:com)
			{
				System.out.print(i + " ");
			}
		
		
		
		
		
		
		
	}

}
