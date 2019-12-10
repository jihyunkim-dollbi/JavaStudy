package 데이터저장;

		// TODO Auto-generated method stub
		/*
		 *  프로그램 언어 = java, c/c++, c#, kotlin
		 *             ======           =========
		 *             
		 *             => 데이터저장   ======>데이터 제어 ====== 화면출력
		 *                                               DOS, WINDOW : APPLICATION
		 *                                               BROWSER : WEB APPLICATION
		 *                                               SMART PHONE : MOBILE
		 *                =======저장기술
		 *                1)변수:한개의 데이터 저장하는 공간
		 *                2)배열: 같은 유형의 데이터를 여러개 저장하는 공간
		 *                3)클래스:다른 유형의 데이터를 여러개 저장하는 공간
		 *                ======여기까지메모리저장기술
		 *                4)파일
		 *                5)RDBMS(오라클)
		 *                
		 *                1.  변수
		 *                    1) 저장공간의 크기
		 *                       = 자료형(데이터형)
		 *                         정수저장
		 *                          Byte=> (1byte) => -128~127
		 *                          ==> 100 50 90 120 38   --> 4조각 내고  -> 속도 느려짐 -> 따라서 int에 한번에 넣는게 빠름 , int 에 넣을땐 8개씩 자름, why long is not? , and 건축은 double쓴다 소서점.때문
		 *                          short=> (2byte)=>-32768~32767
		 *                          ===========================(c/c++호환성)
		 *                          int => (4byte) => -21억 4천~21억 4천
		 *                          long = > (8byte)
		 *                          =====================
		 *                          변수설정 => 데이터저장-- 변수- 변하는 수 - 최종 저장값이 변수. 바뀔수있음.
		 *                          메모리크기 변수명=값;
		 *                          ==========
		 *                          byte(데이터형/메모리크기 주기) b=10
		 *                          ====
		 *                          int kor=90 (값) ==> 변경해서 사용이 가능(변수)
		 *                          === === 별칭
		 *                          데이터 크기 지정
		 *                          *********int  /  long  구분
		 *                                  ====     ====
		 *                                  10,20..  10L, 20L , 20l
		 *                                  long a=10L
		 *                                  LONG B=10  ==>   INT => LONG
		 *                                  INT c='A'  ==> char => int
		 *                                     ===
		 *                                     65
		 *                         실수저장
		 *                            float  (4 byte 메모리)  소수점 6자리
		 *                            double (8  byte) => default =>  소수점 15
		 *                               float vs double
		 *                               float f=10.5 => (error
		 *                               ====    ===== 8byte
		 *                              
		 *                               4byte
		 *                               
		 *                               float f=10.5f => 10.5f, 10.5F
		 *                               DOUBLE  D=10.5  => 10.5D, 10.5d
		 *                               ==>  실수형을 정수로 변환  => 소수점 이하는 제외
		 *                                    (int) 10.55 ==> 10
		 *                                    
		 *                                    (int) 10.5+(int)20.5  ==> 30
		 *                                    (int)(10.5+20.5)  ==> 31
		 *                               
		 *                               
		 *                               
		 *                         문자저장
		 *                         
		 *                         char (2byte) => 0~65535 (각국의 모든 국어 저장
		 *                         ===>   '', 'A'   '한' ==? 한글자씩==? 문자  , char c="기호"
		 *                         홍길동 => Char[], STRING =>""  ==> 문자열
		 *                               
		 *                         TRUE/FALSE
		 *                         boolean = > boolean b=true
		 *                                     boolean b=false
		 *                                     
		 *                         ******** 참조형
		 *                                   String => 문자열 (문자 여러개를 저장할 경우, 주소나 긴 문자열,02-2222-2222 )
		 *                                   String name="홍길동"        
		 *                                     
		 *                                     오라클 영구저장 & 모두 공유 가능!! 
		 *                                     
		 *                                     
		 *                    2) 메모리의 이름 부여
		 *                       = 문법(식별자)
		 *                       = 글자수는 제한이 없다(3~7)
		 *                       1. 알파벳, 한글로 시작(단, 알파벳은 대소문자 구분)
		 *                          영어점수  => engScore, eng_score
		 *                       2. 숫자사용이 가능
		 *                       (단 앞에 사용이 불가능)
		 *                       kor2, eng2, a1b
		 *                       3. 특수문자 ( _ , $) 보통 많이 사용 _
		 *                       - 단어가 여러개일 경우
		 *                       file_name, fine_size, first_name, second_name
		 *                       ********* 임시파일
		 *                                 _Hello
		 *                       4. 예약어(자바에서 사용한느 단어)
		 *                          int int_value 가능 , int int (불가능)
		 *
		 */
		public class 자료형 {
			public static void main(String[] args) {
		//변수 => 프로그램에 필요한 한 개의 데이터를 저장하는 메모리 이름
			//               ==========
			
			/*
			 * 값을 설정 => 형식
			 * 1)정수
			 * ===> 10진법 int a=10
			 *      2진법 int b=0b1010
			 *                ==
			 *      8진법 int c=012
			 *                =
			 *      16진법 int d=0xFF
			 *                 ==
			 * byte b=10 (127)
			 * short s=100(32767
			 * int i=100
			 * long l=100l
			 * 2) 실수
			 * float f=10.5f
			 * double d=10.5
			 * 3)문자
			 * char c='A'
			 * 4) 논리형
			 * boolean b=true, b=false
			 * 5)문자열
			 * String s="Hello Java"
			 * 
			 * 27  => 2,8,16
			 * 
			 * 16 8 4 2 0(1)
			 *   11 / 011
			 *   
			 *   49 =>110 / 001
			 *         8진법 => 61
			 *         16진법  0011 / 0001   ==> 0x31
			 * 
			 * 
			 * 
			 *             32  16  8  0(1)
			 */
		
		
		
		
        // 1. 4byte 크기의 메모리를 만들어라
		//이 메모리의 이름 => a
		// a라는 메모리에 10울 저장해라
		int c=0xA;     // 16 진법 - 숫자 앞에 0과 x를 붙임  
		int a=10;      // 10 진법 - 숫자 앞에 아무것도 붙이지 않음
		int b=012;     //  8 진법 - 숫자 앞에 0을 붙임  -->  07은 괜찮은데 08,09는 문제가 됨. 11~괜찮음.--> 따라서 숫자를 쓸때 0을 먼저 붙이지 않고 날짜를 쓰거나 해야함. 2019년 8월 8일
  		int d=0b1010;  //  2 진법 - 숫자앞에 0과 b를 붙임
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		
		float f=10.555555f;
		// 4=8
		System.out.println("f="+f);
		
		double d2=10.5;
		System.out.println("d="+d2);
		
		//   +산술연산자
		//   + 문자열결함
		//   7+""+7   => 결함
        //   7+7  => 14		  문자열은 숫자를 서로 붙여줌 ex) 계산기
		// 77+""+77+""+7+1   --> 777771
		// 77+""+77+""+(7+1)   --> 77778
		
		
		boolean bcheck=false;
		System.out.println(bcheck);
		

        int t=14, y=25;
        boolean w=t<y;
        System.out.println(w);
		
        
		char ch='K';
		System.out.println("CHAR="+ch);
		
		
		String name="홍길동";
		System.out.println(name+"\t"+6+3);
		System.out.println(6+name+"\n");
		
		System.out.println(name+7+6+8+11+"겨울"+8/2);
		System.out.println(7*3+"여름"+8/2+name);
		
		byte bb0=127;
		byte bb=Byte.MAX_VALUE;
		
		short ss0=32767;
		short ss=Short.MAX_VALUE;
		
		int ii0=2145555555;
		int ii=Integer.MAX_VALUE;
	
		long ll=Long.MAX_VALUE;
		
		System.out.println("byte0="+bb0);
		System.out.println("byte="+bb);
		System.out.println("Short0="+ss0);
		System.out.println("Short="+ss);
		System.out.println("Int0="+ii0);
		System.out.println("Int="+ii);
		System.out.println("Long="+ll);
	


	}

}

