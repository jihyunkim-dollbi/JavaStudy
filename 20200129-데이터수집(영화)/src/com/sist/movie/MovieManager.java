package com.sist.movie;
//사이트에서 데이터를 긁는 아이!!
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/*
 * 
 * 348줄
 * 	<div class="info_tit">
					<em class="ico_movie ico_15rating">15세이상관람가</em>
					<a href="/moviedb/main?movieId=122091" class="name_movie #title">남산의 부장들</a>
			</div>
 * 
 */



public class MovieManager {

	public ArrayList<MovieVO> movieListData()
	{
		
		ArrayList<MovieVO> list = new ArrayList<MovieVO>();
		
		
		
		try
		{
			//vo가 상세페이지 한개
			//for문 돌려서 값을 모두 넣을 예정
			//3페이지라 3번에서 복사
			
			//생성한 이유는?
			MovieDAO dao = new MovieDAO();
						
			//for(int i=1; i<=6; i++)
			{
				// 해당 페이지의 정보를 가져옴
				Document doc=Jsoup.connect("https://movie.daum.net/boxoffice/yearly").get();
				// 상영예정작으로 바꿔줌..i<=6
				// 현재 상영작 i<=6
				
				
				// tag와tag사이에 값을 가져오려함. 
				// Elememts 안에 여러 Element-arraylist를 넣을 수 있다 ==> 같은 내용의 Element(tag의 값을 모아주는 기능)- vo 를 for문으로 돌려서 25개의  목록을 출력할 수 있다.
				// https://movie.daum.net/premovie/released-347
				//a tag모을 예정..
				//클래스는 . 아이디는 #
				// https://try.jsoup.org/ 여기서 데이터가 제대로 들어오는지 안들어오는지 확인하고 가져오기. - url펫치 후 클래스로 찾기
				// div.wrap_movie span.info_state  ==> 예매율을 구하기 위해 가장 큰 소속을 찾는다. div가 가장 바깥에 있어서 가장 큰 카테고리 안에 span 카테고리의 info_state 클래스에 있다.
				
				Elements link = doc.select("div.info_tit a");  // 주소를 가진 tag //a테그를 모아놓음..
				
				
				/*
				 * <div class="a1">
				 * 			<p> aaa</p>
				 * 			<a href="bbb">ccc</a>
				 * </div>
				 * 
				 * div.a1 p ==> text()==>p와 p사이 값 ==> aaa
				 * div.a1 a ==> attr("href") ==> 속성값구하기 ==>a는 링크테그 ==> bbb
				 * div.a1 		==> text() ==> aaa ccc ==> 문자만 읽어옴
				 * 					html() ==> 	<p> aaa</p>
				 * 								<a href="bbb">ccc</a>
				 * 
				 * 
				 * 
				 */
				for(int j=0;j<link.size();j++)
				{
					
					try // 인셉션에서 regdate의 값이 2개여서 regdate 
					{
					
					
					// 일리먼트 - 원하는 tag 한개씩 가져오기
					Element elem = link.get(j); // tag한개씩 읽어옴
					//System.out.println((i)+"-"+elem.attr("href")); //attr("") ==> 글자를 눌렀을때 링크가 되므로써 안쪽으로 들어가게 하기위함... 이때 attr()사용..
					//System.out.println((i)+"-"+elem.text()); // elem안에 있는 값- 텍스트값 - 영화제목을 가져옴..
					
					String mLink = "https://movie.daum.net"+elem.attr("href");
					// https://movie.daum.net 서버.  /moviedb/main?movieId=127138 이 값만으론 사이트 접속이 불가능..
				
					Document doc2=Jsoup.connect(mLink).get(); //20개의 주소가 들어감..모든 html들어가있음
					//doc2에 get()에 사이트를 연결하여 html소스를 가져와 넣어놓음. 따라서 doc2를 통해 아래 Element의 각각의 값을 가져옴.
					//System.out.println(doc2);
					// 상세보기는 loop를 돌릴필요가 없다 같은 테그가 반복되지 않는다 따라서 element가 필요하다. elements필요x
					
					Element title=doc2.selectFirst("div.subject_movie strong.tit_movie"); //select선택한 테그 가져옴 ,, selectfirst() 첫번째 나타나는 태그값 가져옴  div div strong
					System.out.println(title.text()); // 제목을 출력하라 
					//제목
					
					
					Element score=doc2.selectFirst("div.subject_movie em.emph_grade");
					System.out.println(score.text());
					//평점
					
					
					
					Element genre=doc2.select("dl.list_movie dd.txt_main").get(0); //eq(0) : 값이 여러개일경우 0 ,1 ,2
					System.out.println(genre.text());
					
					
					
					
					Element regdate=doc2.select("dl.list_movie dd.txt_main").get(1);
					System.out.println(regdate.text());
					
					
					Element time=doc2.select("dl.list_movie dd").get(3);
					
					String temp = time.text(); //147분, 12세이상관람가 
					// time을 가져오면 147, 12세이상 관람가 한번에 오기 때문에 끊어주기위해!!
					StringTokenizer st=new StringTokenizer(temp,",");
					String strTime=st.nextToken();
					String strGrade=st.nextToken().trim();
							
					System.out.println(strTime);
					System.out.println(strGrade);
					
					
					
					Element director=doc2.select("dl.list_movie dd.type_ellipsis").get(0);
					System.out.println(director.text());
					Element actor=doc2.select("dl.list_movie dd.type_ellipsis").get(1);
					System.out.println(actor.text());
					
					
					Element story=doc2.selectFirst("div.desc_movie p");  // 첫번째 p값을 줄때first , 두번째도 가져오고 싶으면 select로 0,1,2씩 가져올수 있다.
					System.out.println(story.text());
					
					
					
					MovieVO vo=new MovieVO();
					vo.setTitle(title.text());
					vo.setScore(Double.parseDouble(score.text()));
					vo.setGrade(strGrade);
					vo.setTime(strTime);
					vo.setActor(actor.text());
					vo.setDirector(director.text());
					vo.setGenre(genre.text());
					vo.setRegdate(regdate.text());
					vo.setStory(story.text());
					
					dao.movieInsert(vo); //추가하기
					}catch(Exception ex) {System.out.println(" 으ㅏ아 에러");}
					
					
					
					
				} 
				
				
				
				
			}
			
			System.out.println("DataBase Insert End..."); //얘가 나오면 종료될 것임.
			
		}catch(Exception ex) {}
		
		
		return list;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieManager m=new MovieManager();
		m.movieListData();
		
	}

}
