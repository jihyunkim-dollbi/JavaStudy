/*
 * 자동 형변환
 *   => int + double =double
 *      ===
 *      double로 만들어놓고 연산.
 *    
 *   => char + int = int
 *      ===
 *      int로 바꾸고 연산
 *      
 *         
 *         
 *      ==> char c='A'
 *      c>='A' && C<='Z'
 *         ==        ==
 *         65        90   => char 는 모든 연산 => int변경
 *         
 *         **int 이하는 계산한 후 값은 무조건 int 가 됨.
 *         ==>byte+byte = int
 *         ==>short+short = int
 *         ==>char+char = int
 *      
 *      *      
 *      
 * 강제 형변환 : cast 연산자    - 등급을 구하거나 A급 B급 C급 등등 int로 형변환을 시켜서 잡아줌!!!!!!!!!!!!!!
 * =========downcasting
 * 
 * int ==> char
 * 
 *  ===> int a=65 ==> char b=(char)a;
 *  ===> char c=65; O char만 예외로 int 변수값을 넣을 수 있다. because char는 정수 값을 가지고 있어서.
 *       int a=10.7; x
 *       float f=10.7; x----------------------이유는 10.7은 f를 추가 안했기 때문에 컴퓨터가 double로 인식하므로 float는 f를 추가해야한다.
 *       
 *       // 자동형변환
 *       double d='A'; O
 *       따라서 왼쪽의 변수형이 항상 커야한다.  
 *     
 *       char c=(char&int)65.0 o
 *  
 *  
 * double==> int
 * 
 * 
 *  
 */
public class 형변환정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
