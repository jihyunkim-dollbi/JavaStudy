/*
 * while / if / for 
 * 쉬프트 연산자 사용빈도 낮으나 사용자는 있다 -> 속도가 빠름.
 * 비트 연산자 -> 그림비교시, 보안(암호화시)
 * 
 *  1. 분야 :데이터베이스 - 웹  
 *     sql, 쿼리... 조인...정규화? 쉽게 수정하도록 묶어두는 것. 하나를 바꾸면 모두가 바뀌어 쉽게 수정 가능...-> 객체지향
 *  2. 분야 :네트워크 - 스마트폰
 *         ======
 *         
 *       tool 사용!!
 *       이클립스 사용법.
 *       캡슐화 - 데이터는 감추되 모두가 메소드를 사용할 수 있게 하는 것.
 *       켓터 / 셋터
 *       public / private
 *       OOP : Object Oriented Program
 *       컴포넌트
 *       모듈화
 *        
 *        
 *       <초기값> :  C/C++/C#/JAVA => 0부터 시작 (문자열, 자료구조(LIST, TREE(SET), MAP), 배열)
 *                 오라클 => 1
 *                 정보처리 => 1
 *        
 *        
 * do-while : 한 번 이상을 수행하는 반복분(빈도 많음!)
 *      
 *       형식 ) 
 *        
 *       초기값 ==> 어디서 부터 시작해야 하는지!
 *       do{
 *       
 *       실행문장 ==> 여러문장을 사용할 수 있다.
 *       증가식 ==> 증감식 (i++; i--, i+=2)
 *       
 *       }while(조건문);
 *         
 *            
 * 
 *  
 *  
 * 
 */

public class 반복문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
		
		
		
		int i = 1;  //(1~10 : 루프변수)
		
		do {
			
			System.out.println("i=" + i);
			i++;
			
		}while(i<=10);
		 
		    System.out.println("10~1");
		  
		    
		    do {          //  한번의 do while 문을 다 끝내고 다시 do while 을 시작한 것이다.
		    	          // do while의 특성은 일단 do가 시작되면 실행을 한번은 해야되고 그다음 조건을 따지므로.
		    	          // 두번째 do 문장에서 11을 출력하고 -1씩 감소를 하고 --> 조건문에 해당될떄까찌 반복한다. 
		    	
		    	System.out.println("i=" + (i-1));
		    	i--;
		    	
		    }while(i>1);
		    
		    
		     System.out.println(" * 연산자 사용");
		    
		    do {
		    	
		    	System.out.println(i+2);
		    	i *= 2;
		    	
		    }while(i<=20);
		    
		    	
		    	
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
