

// ++ equals ==> return 형 --> (boolean)  // boolean으로 시작하면 보통 메소드명은  "is"로 시작한다.!
/*    저장된 문자열이 같은지 확인!
 * 		ex) 댓글창에서 사용가능!
 * 
 * 
 *     equals : 대소문자 구분 비교!
 *     equalsIgnoreCase : 대소문자 비교 없이!
 * 
 *     startsWith : 시작문자열이 같은 경우(true)
 *     endWith : 끝나는 문자열이 같은 경우(true)
 * 	   contains : 문장에 문자열이 포함되었을때(true)  가장 많이 씀 찾기 할때!
 *     ex) 마동석.contains! 로 문자열 찾기
 *     
 *     웹은 무조건 문자열로 값이 넘어온다!!!!
 *  
 *     static & public  =>  
 *     final => 
 *  
 *     
 * 로그인 하기! true false 확인하기
 */
import java.util.Scanner;
public class 문자열클래스2 {
	
	
	static boolean isLogin(String id, String pwd)
	{
	 //	Integer.MAX_VALUE  ==> F 상수다 == 대문자 max& min 이 니까! ==> final class! 변경 못함!
	 //	Byte.MAX_VALUE ==> 상수 ! 
		boolean bCheck = false;
	    final String ID = "admin";
		final String PWD = "1234";
		
		
		
		if(id.equalsIgnoreCase(ID) && pwd.equals(PWD))  //==> 대소문자 구분없이 비교!!
		//if(id.equals(ID) && pwd.equals(PWD))    //==> 대소문자 구분함!
			// 이문장을 수행하면 return 값을 수행하는 것! 디폴트로 잡아서 else를 사용 안함.
		{
			bCheck = true; 
			
		}
		
		return bCheck;
	}
	
	static void process()   
	{
		
		Scanner scan = new Scanner(System.in); // while문 안쪽에서 만들어서 맞을때까지 계속 반복해줘야함. 
		
		while(true)
		{
			
			System.out.print("ID를 입력: ");
			String id = scan.next();
			System.out.print("비밀번호 입력: ");
			String pwd = scan.next();
			
			boolean bCheck = isLogin(id,pwd);
			
			if(bCheck == true)
			{
				System.out.println(id + "님 로그인 되었습니다.");
				break;
			}
			
			else
			{
				
				System.out.println("아이디나 패스워드가 틀립니다. \n 다시 입력해주세요!");
				
			}
			
		}
	}
	
	public static void main(String[] args) {      // 메인은 모든 프로그램의 첫번째 Thread!!
		// TODO Auto-generated method stub

		//System.out.println(Thread.currentThread());  // 현재 사용중인 쓰레드는 무엇? 
		process();
		
	}

}
