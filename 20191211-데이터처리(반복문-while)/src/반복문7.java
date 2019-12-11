import java.util.Scanner;
import org.jsoup.Jsoup;     // import 붙이기 --> Scan 아래에 쓰고->  ctrl+space
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;



public class 반복문7 {

	public static void main(String[] args) throws Exception {  //throws Exception 예외처리
		// TODO Auto-generated method stub
		
        Scanner scan = new Scanner(System.in);
        System.out.println("검색어 입력: ");
        String fd = scan.next();  //find data
        
        
        int k=1;
        while(k<=4) {
        	
        
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20191211&hh=15&rtm=Y&pg="+k).get();
		
		// System.out.println(doc);
		
		Elements title=doc.select("td.info a.title");   // 타이틀이 들어간 Tag를 불러옴   // td.info는  
		Elements singer=doc.select("td.info a.artist");
		
		int i = 0;
		while(i<title.size())  /// ?? 
		{
			String data=title.get(i).text(); // 가져온 노래들 안에 내가 검색한 노래가 있나? -> 한두글자만 써도 아래에 미리보기 뜨게 하려고.
			//if(data.contains(fd))   // 이 노래 안에 내가 입력한 번호가 포함되어있나?
				 ///contains 는 boolean 이기때문에 있으면 true 없으면 false 로 기능한다.
			//{
				
			
			  //(i+1)+"."앞에 넘버링 붙
			System.out.println((i+1)+"."+singer.get(i).text());
			System.out.println(data);
			System.out.println("--------------------------------\n");
			//}
			
			i++;
		
		}
		
		 k++;
        }
	}

}
