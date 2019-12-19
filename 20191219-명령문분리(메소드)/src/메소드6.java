// 20191217의 배열 3을 가져옴 ==> 매개변수를 이용해서 1개의 메소드로 다양한 페이지 가져오기!
                        // 

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/*
 * 
 *    sort
 *    
 *    void sort()   ==> DESC
 *    {
 *    
 *    
 *    }
 * 
 * 
 * 
 * 리턴형 - 지역변수 값이 사라지기 전에 값을 받기. 리턴형?!
 *      - 전역변수는 리턴형으로 값을 잡을 필요 없다. 
 *        
 *  매개변수 전송법. ==> 전역변수
 */





// 빌드패스 --Jsoup 가져오기
public class 메소드6 {
	static void siteData(String url) throws Exception
	{
		
		Document doc=Jsoup.connect(url).get();   // 다음 현재상영 페이지
		                       //   ====================== + /moviedb/main?movieId=93004  이렇게 해야 페이지 나옴.
		                       //    서버 주소가 있어야 나온다. / 하나면 https: 서버 붙여야함, // 두개면 서버주소 생략가능
		Elements link=doc.select("div.info_tit a.name_movie");                    
		int k=1;
		
		for(int i=0; i<16; i++)
		{
			
			try {
			
		//	System.out.println(link.get(i).attr("href"));
			String link_data="https://movie.daum.net"+link.get(i).attr("href");
					System.out.println(link_data);
					
					
					
					Document doc2=Jsoup.connect(link_data).get();   //https://movie.daum.net/moviedb/main?movieId=93004  첫번째 for문이 들어갔을때 첫번째 영화. 주소가 차례로 들어가봄.
					// 인덱스 번호를 가지고 출력할 예정.
					/*
					 * <div class="subject_movie">
					 *  ===        ==============
								<strong class="tit_movie">겨울왕국 2 (2019)</strong>
								========       ==========
								<span class="txt_origin">Frozen II</span><!-- 2016-04-12 추가 -->
					 * 
					 * 
					 * <a href="/moviedb/grade?movieId=93004" class="raking_grade">
					 * ==                                            ==============       
									<span class="bg_star star_grade"><span class="bg_star inner_star" style="width:74.15000081062317%">평점</span></span> <!-- 116px이 100%, % 계산에서 width값에 적용-->
									<em class="emph_grade">7.4</em><span class="txt_grade">/10</span>
								</a>
					 * 
					 * 
					 * <dl class="list_movie list_main">
								<dt class="screen_out">장르|나라</dt>

																								
								<dd class="txt_main">애니메이션/어드벤처/코미디/판타지/뮤지컬</dd>
					 * 
					 * 
					 * 
					 */
					
					
					Element title_kr=doc2.selectFirst("div.subject_movie strong.tit_movie");
					Element title_en=doc2.selectFirst("div.subject_movie span.txt_origin");
					Element score=doc2.selectFirst("a.raking_grade em.emph_grade");
					Element genre=doc2.select("dl.list_movie dd.txt_main").get(0);    // dl 첫번째
					Element regdate=doc2.select("dl.list_movie dd.txt_main").get(1);
					Element grade=doc2.select("dl.list_movie dd").get(3);
					Element director=doc2.select("dl.list_movie dd").get(4);
					Element actor=doc2.select("dl.list_movie dd").get(5);  // dl 5번째
					
					
					
					
					System.out.println(title_kr.text());
					System.out.println(title_en.text());
					System.out.println(score.text());
					System.out.println(genre.text());
					System.out.println(regdate.text());
					System.out.println(grade.text());
					System.out.println(director.text());
					System.out.println(actor.text());
					
					System.out.println("=====================================");
				
				
			}catch(Exception ex ) {k--;}  // try catch를 주니까 오류가 있는 부분을 스킵하고 다음으로 넘어감.
		      // https://movie.daum.net/moviedb/main?movieId=135061 이 영화는 주연이 따로 없기 때문에 에러가 발생했었음.
		}
		
		
		
	}
	
	static void process() throws Exception     // 메뉴하나를 만들어서 선택 1~5번 선택하여 하나씩 페이지 호출하기 프로그램.
	{
		Scanner scan = new Scanner(System.in);
		String[] url = {
				
				"https://movie.daum.net/premovie/released",
				"https://movie.daum.net/premovie/scheduled",
				"https://movie.daum.net/boxoffice/weekly",
				"https://movie.daum.net/boxoffice/monthly",
				"https://movie.daum.net/boxoffice/yearly"
		};
		
		
		
		
		while (true)/// while 문을 준 이유 1~5번 아니면 종료! 혹은 6번 종료를 줄수도 있다.
		{
			System.out.println("=================");
			System.out.println("1. 현재상영 영화");
			System.out.println("2. 개봉예정 영화");
			System.out.println("3. 박스오피스 (주간)");
			System.out.println("4. 박스오피스 (월간)");
			System.out.println("5. 박스오피스 (년간)");
			System.out.println("6. 종료");
			System.out.println("=================");
			System.out.print("선택> ");
			int no=scan.nextInt();
			//rul불러서 화면에 출력하기
			
			
			if(no==6)
			{
					System.out.println("프로그램 종료");
				break;
			}
			siteData(url[no-1]); // 1~5까지 해야되는데 배열은 0부터 시작해서
			
			
			
		}
			
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			
			process();
			
			
	}

}
