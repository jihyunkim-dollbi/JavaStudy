
public class 반복문6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		// 무한 루프
		/*
		컴퓨터차례
		본인차례
		컴퓨터차례
		본인차례	
		컴퓨터차례
		본인차례
		.
		.
		.
		*/
		boolean bCheck=false;
		
      		while(true) {
        	
        	bCheck=!bCheck; //true를 false에 대입하여 true가 됨. 무한루프 됨
        	if(bCheck == true) { // true라면
        		
        		System.out.println("본인차례");
        	}
        	else {
        		
        		System.out.println("컴퓨터차례");
        	}
        }
        
        
		
		/// 6명이서 같이 게임 - 턴 돌아가는 건 0부터 계속 1씩 증가시키고 6개로 나눈값의 나머지로 순서를 저장할 수 있다.--> 무한루프.
		/*
		
		int i =0;
		
		boolean bCheck = true;
		while(bCheck) {
			
			
		}
		*/
	
		
	}

}
