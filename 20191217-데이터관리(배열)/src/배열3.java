/*
 * 클래스나 배열을 만들때 고유번호를 주고 한번에 가져옴.
 *
 * 
 * 	<div class="wrap_movie">
			<div class="info_tit">
			 ===        ========           
						<em class="ico_movie ico_12rating">12세이상관람가</em>
							<a href="/moviedb/main?movieId=124806" class="name_movie #title">82년생 김지영</a>
							==                                            ===========
								</div>
								
 *  
 */

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.*;
import org.jsoup.select.Elements;

public class 배열3 {

	public static void main(String[] args) throws Exception	{
		// TODO Auto-generated method stub
        // 무비 클래스를 만들어서 가져오기
		// 배열
		
		Movie[] m=new Movie[16];
			
		
		Document doc=Jsoup.connect("https://movie.daum.net/premovie/released").get();   // 다음 현재상영 페이지
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
			/*		
					System.out.println("count: " + (k));
					
					System.out.println(title_kr.text());
					System.out.println(title_en.text());
					System.out.println(score.text());
					System.out.println(genre.text());
					System.out.println(regdate.text());
					System.out.println(grade.text());
					System.out.println(director.text());
					System.out.println(actor.text());
					
					
					System.out.println("=====================================");
			*/	
					
					// 배열 m안에 다 채우기
					m[i]= new Movie(); // 이 문구가 필요한 이유는 클래스에 메모리에 실제로 저장하시 시작하기 위해.
					m[i].title_kr=title_kr.text();
					m[i].title_en=title_en.text();
					m[i].score=Double.parseDouble(score.text()); //스트링을 더블로 바꿈
					m[i].grade=grade.text();
					m[i].genre=genre.text();
					m[i].regdate=regdate.text();
					m[i].director=director.text();
					m[i].actor=actor.text();
					
					k++;
			}catch(Exception ex ) {k--;}  // try catch를 주니까 오류가 있는 부분을 스킵하고 다음으로 넘어감.
		      // https://movie.daum.net/moviedb/main?movieId=135061 이 영화는 주연이 따로 없기 때문에 에러가 발생했었음.
		}
		
		
	/*	Scanner scan = new Scanner(System.in);
		System.out.print("영화번호 선택(0~15): ");
		int index=scan.nextInt();
		System.out.println("============결과 출력 ===========");
        System.out.println("영화명: " + m[index].title_kr);
        System.out.println("감독: " + m[index].director);
        System.out.println("출연: " + m[index].actor);
        System.out.println("개봉일: " + m[index].regdate);
        System.out.println("장르: " + m[index].genre);
	*/	
		
		
		/*  for(int i:m.score)
          {
          	
          	if(max<m.score)
          		max =m.score;
         
          	            	
          }
          
          // 출력
          for(int i:m.score)
          {
          	
          	System.out.println(i + "  ");
          }
		*/
		
		
		
		
		
		
		  double max=0.0;
		   for(int i = 0; i<m.length; i++)
		   {
			   if(m[i]!=null)
			   {
			   
			   
			   if(max < m[i].score)
			   {
				   max=m[i].score;
			   }
			   
			
		   }
		
	
		
		   }
		   
		   
		   
		 
		   for(int i=0;i<m.length;i++)
		   {
			   if(m[i]!=null)
			   {
				   
				   if(m[i].score == max)
				   {
					   System.out.println(m[i].title_kr);
				   }
				   
			   }
		   }
		
	}

}
