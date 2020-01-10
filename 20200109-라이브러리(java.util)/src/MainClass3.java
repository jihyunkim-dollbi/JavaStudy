import java.util.*;
import java.text.*;


public class MainClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//시스템의 시간 읽기 : Date
		
		Date date = new Date();
		System.out.println(date);
		//2020/01/09
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d");  //월: MM 대문자 ,  분: mm 소문자    hh mm ss 시분초
		System.out.println(sdf.format(date));
		
	    
		StringTokenizer st = new StringTokenizer(sdf.format(date),"-");
		String year = st.nextToken();
		String month = st.nextToken();
		String day = st.nextToken();
		
		System.out.println("년도:"+year);
		System.out.println("월:" + month);
		System.out.println("일:" + day);
		
		
		
		
	}

}
