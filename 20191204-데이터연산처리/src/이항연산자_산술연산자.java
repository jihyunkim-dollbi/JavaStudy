/*
 *  산술연산자 (+,-,/,*,%) : 다른 데이터형을 사용했을 경우
 *      1) int 이하 데이터형(byte, short, char) => 연산처리가 되면 ==> int가 된다
 *      
 *     byte + byte => int
 *     char + byte => int
 *     short+ byte + char => int
 *     
 *     
 *     byte+int => int
 *     short+char+int => int
 *  
 *     short+ char+double => double    => String 이 더 크다.
 *     ""+77 ==> "77"
 *     
 *     ""+7.5  ==>"7.5"
 *     
 *     ""+true ==> "true"
 *     
 *     
 *     
 *     가장 큰 데이터 형 값으로 받아야 한다.
 * 
 * 
 * 789 => 7 8 9
 * 
 */

      
       
public class 이항연산자_산술연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // byte b=127;
         //byte c=10;
         //byte d=byte(b+c);   
  
       byte b=(byte)300;
       
       System.out.println(b);
		
       System.out.println(Integer.toBinaryString(300));
       
       System.out.println(""+true);
       
       
       
       
       
       
       /*300
        * 
        * 100101100  ->  1 자름 00101100
        *                     32 8 4 ==> 44
        *                     
        *                     바이트는 8개의 비트가 있으므로 300은 9개의 비트수이다 . 따라서 뒤에서부터 8개만 잘라서 계산한다.
        *                     byte는 초과시 int로 넘어가므로 int로 잡아줌.
        * 
        */
	}

}
