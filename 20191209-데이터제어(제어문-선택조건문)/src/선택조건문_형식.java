/*
 *  조건문 : true / false  일때 별도로 처리를 따로 한다
 *    형식)   
 *         if (조건문) 
 *             실행문장 ==> 조건문 true or false
 *         else (조건문)
 *             실행문장 ==> 조건문 false or true
 *              
 *            예) 사용자 => 두개의 정수 입력 => 처리(나누기)
 * 
 *               0/2 == 0
 *               2/0 ==> error(따라서, 0일 경우를 대비하여, 조건을 주어줘야한다.)
 * 			 
 *              쓰임새 ==> if  ==> error 방지, 원하는 데이터
 *                               =========
 *                               실제처리 
 *                       
 *                       보통은 두가지 경우의 수에서 쓰인다. 
 *                       
 *                       
 *                       
 * 
 */
public class 선택조건문_형식 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 나누기 
		 
		int a = 10;
		int b = 0;
		// System.out.println("a/b="+(a/b));
		
		
		if (b == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		else {
			System.out.println("a/b" + (a/b));
		}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
