import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class 메소드5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String data = "버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기";
		
		//문자갯수 확인하기 ==> 공백도 포함
		System.out.println("문자의 갯수: " +data.length());
/*		
		System.out.println("버섯단어의 갯수: ");
		int count = 0;
		Pattern p = Pattern.compile("버섯");
		Matcher m = p.matcher(data);
		while(m.find())
		{
			count++;		
		}
		
		System.out.println(count);
*/		
		// substring(0)- 시작점부터 끝까지 자르기, substring(2,3)
		System.out.println("++++++++");
		int n = data.indexOf("!");  // 내가 찾는 문자를 넣기// 인덱스 자리찾기!
		System.out.println(n);
		System.out.println("+++++++");
		String fData = data.substring(0,data.indexOf("!"));  // 0부터 15까지 가져오기 - 16은 포함 안됨! 매번 글자를 셀수 없다-> 인덱스필요!
		System.out.println(fData);							// !앞에서 자름
		
		String lData = data.substring(data.indexOf("!")+1);  //18부터 끝까지 가져오기.  +1을하면 ()안 문자 뒤에서 자름!=>! 뒤에서부터 가져오기! 
		System.out.println(lData.trim());  // 공백제거
		                 // =====
		                 //  변수로 접근한 메소드 =인스턴스 
		
		int a = 10;
		int b =  20;
		double d = 10.5;
		// 102010.5 붙이기 하려함 ==> 번호 ==>201912231 , 201912232 => 날짜+가입순 ==> 가입자 많은 날 알수도 있다. 따라서 문자열 결합필요.
		
		String sss = a+""+b+""+d;
		System.out.println(sss);
		
		sss=String.valueOf(a) + String.valueOf(b) + String.valueOf(d); 
		   //=====
		   //클래스 이름으로 접근 ==>  static method
		   //valueOf() ==> 모든 데이터형을 문자열로 바꿈
		System.out.println(sss);
		
		
		
		
		
	}

}
