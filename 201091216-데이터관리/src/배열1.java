import java.util.Scanner;

/*  수정 - UTF-8
 *  배열(Array)
 *  
 *  1) 같은형의 데이터를 여러 개 모아서 '한'개의 배열 변수명으로 제어
 *  2) 배열 선언시에 자동으로 연속적인 메모리를 생성시켜줌
 *                     ===========
 *                     => 시작과 끝이 일관적으로 정해져 있다.
 *                     => 0~배열 갯수(반복문 조걸)
 
 *  3) 단점 : 고정적(처음 배열 크기 선언시 정해짐)                     
 *  4) 사용처 = > 관련된 데이터가 3개 이상이면  = > 배열!
 
 
 *  5) 사용
 *      1. 선언
 *         데이터형[] 배열명; //  Java   --> String[] args  
 *         데이터형 배열명[]; //  C 언어
 *         예) 
 *            정수
 *            int[] arr;
 *            실수
 *            double[] arr;
 *            문자
 *            char[] arr;
 *            문자열
 *            String[] arr;
 *            
 *      2. 초기값 설정
 *             int a; => a+=10 ==> error(초기값없이 연산처리x)  --> 따라서 반드시 초기값을 주어야 한다. 지역변수이기 때문에.
 *             
 *             int[] arr={10,20,30,40,50};   ==> 자동으로 배열갯수가 5라고 인식이 된다.
 *             
 *          arr(100)=============================
 *                     10  20   30   40   50 
 *                  ==============================
 *                 100    104   108  112   116번지  -->  int type 이기때문에 4 byte씩 주소가 지정된다.
 *                =====
 *               시작하는 번지를 기준으로 연속적으로 배정됨. 
 *                 
 *     arr(100) ====> 주소를 참조해서 데이터를 관리 ==> 참조변수
 *                    시작위치의 주소값을 가져온다. 이후부터는 데이터형에 따라 연속적으로 배정됨.
 *                    참조형 : 배열, 클래스  
 *                 
 *                 
 *         arr(100)=====================================
 *                     10     20      30      40      50 
 *                 ======================================
 *                  arr[0] arr [1]  arr[2]  arr[3]   arr[4]
 *                 =======
 *                 일반 변수와 동일하게 사용이 가능
 *                 값을 변경 => arr[0]   = 100
 *                          ===  ==
 *                          배열명 첨자(인덱스)
 *                 
 *                              
 *             char 라면 2byte씩 주소가 생성됨    
 *                 
 *              int[] arr = new int[5];
 *              =======================
 *              new       int[5] 
 *              ===       ======
 *             메모리 할당      정수 5개를 저장할 수 있는 공간을 만들어라
 *                        (연속적인 메모리 구조를 만든다.)
 *                 
 *              ++ new를 사용하게되면 초기값이 잡히는데 전체가 (0)이됨    --> 많은 수를 동시에 변경할때
 *              
 *              double[] arr = new double[3];   초기값  = 0.0
 *              String[] arr = new String[3];   초기값  = null(실제 존재하지 않는 값)   
 *              char[] arr = new char[3];       초기값  = '\0'
 *              boolean[] arr = new boolean[3]; 초기값  = false
 *              
 *                 
 *      3. 활용
 *         => 값을 변경할때
 *            첨자를 이용 ==> arr[1]=100, arr[4]=200..
 *                            ==
 *                            첨자:위치값
 *  	   => 출력할때 ==> 배열의 모든 첨자는 0부터 시작 ==> 
 *                       for(int i=0.....)
 * 
 * 
 *     4. 초과하거나 줄일 수 없다 => 에러발생
 *     
 *        ArrayIndexOfBoundsException = > 배열의 범위가 초과됐을때.
 *        
 *     
 *     5. 배열의 갯수를 읽을때는 반드시 배열명을 주고 .length를 붙임   
 *         ==> 배열명.length: 배열의 총갯수 가져올때.
 *   
 */


public class 배열1 {
      int a;  // 전역변수는 자동으로 0 초기값 생성됨
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		// 정수 3개를 입력받아서 
		// 입력받은 데이터를 출력해보기
		
		int a,b,c;   
		// 변수를 처리하기 전에 값을 채우면 ok!
		//      == 연산전에, 출력전에!
		
	      Scanner scan = new Scanner(System.in);
	      System.out.println("첫번째 정수 입력: ");
	      a = scan.nextInt();
	      
	      System.out.println("두번째 정수 입력: ");
	      b = scan.nextInt();
	      
	      System.out.println("세번째 정수 입력: ");
	      c = scan.nextInt();
	      
	      
	      // 제어 ==> a,b,c 중에 가장 큰수를 출력
	      // 아래는 최대값 구하는 공식
	
	      int max = 0;
	      if (a > max)
	    	  max = a;
	      if(b > max)
	    	  max = b;
	      if(c > max)
	    	  max = c;
	      
	      System.out.println("가장 큰 값: " + max);
		
	      // 프로그램이 너무 길다 -> 비효율적. ==> 배열2 페이지에!
		
	}

}
