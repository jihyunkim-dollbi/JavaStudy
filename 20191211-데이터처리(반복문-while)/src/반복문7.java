 /*  while  형식
 *  ==========
 *  
 *  초기값 // 변수 선언+초기값설정
 *  while(조건문) ~가 될때까지, ~인 동안
 *  {
 *    ============
 *     반복 실행문장
 *     
 *    ============
 *     증감식 
 *    ===========
 */   



import java.util.Scanner;
import org.jsoup.Jsoup;     // import 붙이기 --> Scan쓰고->  ctrl+space 하면 import효과!
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class 반복문7 {

	public static void main(String[] args) throws Exception {  //throws Exception 예외처리
		// TODO Auto-generated method stub
		
       Scanner scan = new Scanner(System.in);
	        System.out.println("검색어 입력: ");
	        String fd = scan.next();  //find data
	        
	       try { 
	    	   
	        int k=1; // 페이지 루프 변수
	        while(k<=4) { // 
	        	
	        // 해당 웹사이트의 k번째 페이지에서 얻는 모든 정보를 doc에 저장!
			Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20200322&hh=18&rtm=Y&pg="+k).get();
			
			// System.out.println(doc);
			
			//doc에서 제목과 가수의 정보를 가진tag를 title, singer에 저장!
			Elements title=doc.select("td.info a.title");   // 제목 정보 들어간 Tag를 불러옴    
			Elements singer=doc.select("td.info a.artist");  // 가수 정보 들어간 Tag를 불러옴
			
			int i = 0; //루프 변수
			while(i<title.size())  // 가져온 제목을 문자열 길이만큼 읽는다
			{
				String data=title.get(i).text(); 
				//가져온 노래들 안에 내가 검색한 노래가 있나? -> 한두글자만 써도 아래에 미리보기 뜨게 하려고.
				if(data.contains(fd))   
				//이 노래 안에 내가 입력한 번호가 포함되어있나?
				//contains는 boolean 이기때문에 있으면 true 없으면 false 로 기능한다.
				{
					
				
				  //(i+1)+"."앞에 넘버링 붙
				System.out.println((i+1)+"."+singer.get(i).text());
				System.out.println(data);
				System.out.println("--------------------------------\n");
				}
				
				i++;
			
			 }
			
			 k++;
	        }
		
	       }catch(Exception ex) {}
		
		
	}

}
