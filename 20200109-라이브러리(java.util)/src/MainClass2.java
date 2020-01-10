import java.util.*;
//지능형웹 => 데이터분석

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String data = "Java Oracle HTML CSS JavaScript JSP Spring Kotlin";
		StringTokenizer st= new StringTokenizer(data); // 공백대로 잘라줌.
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
			
		}
		
		
		
		
		
	}

}
