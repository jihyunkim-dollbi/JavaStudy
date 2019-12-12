import java.util.Scanner;

/*
 * for: 반복문(반복횟수가 지정되어있는 경우 많이 쓰임.변수형과 명령문이 같으면 돌릴수있다. 데이터값은 달라도 됨.)
 * ====            <-->  while문은 임의의 수에 쓰임.// 자바에선 -1이 문장의 끝으로 본다. 문자 읽어올때 쓰임.
 *     
 * 
 * 프론트  - for
 * 백엔드  - while
 * 
 * 자바스트립트 라이브러리 - 제이쿼리, 실시간-ajax, 속도 react, Vue
 *  
 * 향상된 for(JDK1.5이상) : 배열, 컬렉션(데이터베이스)-나중에!
 * 
 * 일반 for : 
 *    (형식)
 *         for(초기값;조건식;증가식)
 *             실행문장
 *             
 *             
 *            순서 : 초기값 -> 조건식 -> 실행문장 -> 증가식 -> agian -> 조건식
 *                           true - go on!
 *                           false -stop!
 *            
 *          ** 중요 : 초기값 설정  --> 0부터 시작 or not
 *           		 실행문장 범위 설정
 *                    ===========> 한문장{}(o,x),여러문장{}o
 *                    증가식 ==> 1개씩 이거나 
 *                             변수가 한개이상 이거나
 *                            1. for(int i=0, j=1; i<1 && j>=1; ...)
 *                                     ======================
 *                            2. for(int i=0;......) => 지역변수 i는 for 안에서만 사용!
 *                             
 *                                     	
 *             
 * 
 * 
 * =====
 * 메소드(일반메소드, 람다식(함수포인터):JDK1.8)
 *  
 * 
 * 
 */


public class 반복문1 {

	static public void main(String[] Java) {    /// ->main method-> jvm에서 자동으로 호출시킴.  main->main1로 변경시 저장이 안됨. 실행이 안됨.
		// TODO Auto-generated method stub      /// static과 public은 자리가 바뀌어도 ok!! 
                                                /// void -> 넘겨줄 값이 없을때 기입
		 /// 따라서 메소드를 가져올땐 가져올 값이 있는지 확인해야함 마우스대기! 
        
         Scanner scan = new Scanner(System.in);
         scan.nextInt();  // 더 큰것으로 받을 수도 있다.  --> long으로도 받을 수 있다.!
         scan.nextDouble();   // 더블은 더블루
         scan.nextBoolean();  // 불린은 불린으로
         scan.next();  // 스트링으로 받기!
         
         //  모두 리턴형! 메소드 가져올시 마우스 대고 VOID있는지 없는지 확인!
         int i=1;
         for(i=1; i<=10; i++)
         {
        	 
        	System.out.println("1=" + i);
        	 
         }
         
         System.out.println("i=" + i);
         
        
	}

}
