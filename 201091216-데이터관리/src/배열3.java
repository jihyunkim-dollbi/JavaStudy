//수정 - UTF-8
public class 배열3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int com = (int)(Math.random()*3); // 0 , 1 , 2 가위 바위 보
		
/*		if (com == 0)
		{
			System.out.println("가위");
		}
		else if(com == 1)
		{
			System.out.println("바위");
		}
		else if(com == 2)
		{
			System.out.println("보");
		}
*/		
		
		// 위의 코딩을 아래 처럼 줄여보았다.
		
		String[] res = {"가위", "바위", "보"};
		System.out.println(res[com]);
		                 //========> res 의 com 번째!
		
		// 어떨때 줄이는가? 어떤 데이터가 0부터 시작할때, 입력하는 값이 많을때 for문을 돌려서 배열 사용하기.
		
		
		int user = (int)(Math.random()*5); //0*5 ~ 0.99*5 ==> 0~4.999 ==>정수로 받는다 => 0~4까지 => 0,1,2,3,4
		                                   //따라서 Math.random 메소드를 사용했을때, 곱한 값 5 와 동일한 배열 개수를 언음.
		
	}

}
