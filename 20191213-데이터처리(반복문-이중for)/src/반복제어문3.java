/* < 반복문에만 쓰이는 기능>  --> ((if문에서는 return을써서 프로그램 종료가능!))
 * break 
 * continue
 * ========   본인의 반복문만 제어(해당 블럭 안에서만 쓰임)
 *            break  == > for, do~while, while, switch case
 *            continue => for, do~while, while
 *            return  ==> 모든 제어문에 사용 가능
 *  
 */
public class 반복제어문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i = 1; i <= 3; i++)
		{
			if(i == 2)  // i에서 2를 제외하고 나머지 계속 실행
			continue;   // 2nd for 문 밖에 넣어주기. 위/아래 위치 중요. 아래 continue 실행시 실행 안됨.따라서 2nd for에 내려가기 전에 걸어주어야함.
			
			for(int j = 1; j <= 3; j++)
			{
				//if(j == 2)
				//	break;   // 2부터 break 되어 2와 3모두 안나옴
			
				//if(j == 2)
				//continue; // 2만 못하고 1과 3은 실행 가능   
				System.out.println("i=" + i +" j="+ j);
				
			}
			// break; // 이 경우에는 i의 2,3 모두 사용 안됨.
			
			}
		
		
		
		
		
		
	}

}
