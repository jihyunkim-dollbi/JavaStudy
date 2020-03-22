/*
 * 
 * ==> 문자 ==> 문자열.charAt(0)   --> 문자열에서 0번째 단어
 * 
 * String s = "abnmddjjdkfkfjjkfkf"  --> 문서에서 원하는 문자 개수 찾을때. while문은 검색엔진. 따라서 숫자 말고 문자열 많이 사용.

 */
public class 반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ss = "안녕하세요!";
		char c = ss.charAt(2);  //ss문자열의 인덱스 2번째 값을 호출
		System.out.println(c); // 결과 : 하
		
		
      		  String s="dskaamapplefjdiaadlfsdlf,<";
        	  System.out.println("s="+s);
        
        	  int i=0;  // --length 해당 문자의 개수 구하기, 따라서 첫번째 개수는 0이 되므로 그것까지 계산해야함. > >= 조절.
        	  int count=0;
        	  while(i < s.length()) {
        	
  	      	  System.out.println((i+1)+"번째 문자: " +s.charAt(i));
        	
        	  char c=s.charAt(i);
        	  if(c == 'a' || c == 'A')
        	  count++;   // 'a'혹은 'A'가 있는 경우 count를 증자시켜라 // 밖에서 count출력하여 확인!!
        	
          	  i++;
        	
                  	
        }
        
        System.out.println("a와 A의 개수는: " + count);		
	}

}
