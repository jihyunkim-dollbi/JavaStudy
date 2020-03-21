/*utf-8
 * &&   => 직렬처리 all true-> true
 * ||   => 병렬처리 one of true -> true
 * 
 * 용도파악!!
 * 
 * 문법형식
 *   (조건) && (조건) 범위 안에 있느냐.- 범위를 지정할때. 90보다 크고 100보나 작을때.!, 맞을때,  좌표점을 지정해주고 범위 안에 있을때 터져라! ()
 *   => score>=90 && score<=100
 *   (조건) || (조건) 범위를 벗어났을때. (오류처리) 비번만들때- 길이, 조건등등 , 틀릴때.
 *   => score<0 || score>100
 *   
 *   ID 와 password
 *   
 *   ID=="" && PWD=1234
 *   !(ID!="" || PWD!="")
 *   
 *  이미지 기본 24 프레임! 
 *   
 *  =============================
 *                  &&      ||
 *  =============================
 *  true true      true    true  
 *  =============================
 *  true false     false   true
 *  =============================
 *  false true     false   true
 *  =============================
 *  false false    false   false
 *  =============================
 *   *** 효율적 연산
 *   && => 왼쪽 조건이 false => 오른쪽은 연산에서 제외          false일 경우가 많은것을 왼쪽에 써라.
 *   || => 왼쪽 조건이 true => 오른쪽은 연산에서 제외           true일 경우가 많은 경우를 왼쪽에 써라.
 *   
 *   
 * 
 * 
 */
public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 알파벳을 저장 후에 소문자, 대문자
		char c='A';
		
		
		
	//	String result=(c>='a' && c<='z')?"대문자":"소문자";
      //  System.out.println(c+"는(은)"+"result");
		
		
		// A(65) a(97) ==> 32
		
	//  대문자면 소문자 ==> 소문자 ==> 대문자 변경 
		char result=(c>='A' && c<='Z')?(char)(c+32):(char)(c-32);
	    System.out.println(c+"는(은)"+result);	
		
	}

}
