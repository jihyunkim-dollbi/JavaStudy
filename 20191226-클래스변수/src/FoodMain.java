import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
// Jsoup =>html 파서기=>https://mvnrepository.com/search?q=Jsoup
// 카테고리 분류 ex) 망고 -> 대분류 1개 - "믿고 보는 맛집 리스트" -> 안에 중분류- "2020 제주 인기 맛집 TOP 60" -> 소분류-"남양수산 4.7"
//중분류 만들기 - 카테고리 넘버(제목)- 숨겨진 변수 ..., 사진, 제목, 부제목 => 4개의 변수 필요. 
/*
 * 		member(
 * 
 * 		id=================> 서로 참조되도록 만들어야함 
 * 		pwd
 * 		name
 * 		sex
 * 		birth
 * 		addr
 * 		tel	
 * 
 *      )
 * 
 * 		예매(
 * 
 * 		id =================> 위에서 id를 참조해와야한다. 관계형..,..
 * 		movie title
 * 		theater
 * 		date
 * 		time
 * 		seat
 * 
 * 		)
 * 
 * 		캡슐화 => 데이터, 변수는 private으로 감추고 메소드로 통신함.
 * 		 private 변수=> get method, set method 만들어 메소드를 통해 통신. 
 * 		 ==> 롬복? ==> 자동으로 get/set 메소드 만들어줌.  ==> 이클립스 기능 있음.
 * 	 
 */ 
class Category {  
	
	int cateno;  //cno 카테고리넘버- 숨겨진 변수 -primary key - 중복이 없는 
	//카테고리의 진짜 변수.
	String poster;
	String title;
	String subTitle;
	String link;
	
}
/*
 * 마구로쇼쿠도 4.5 
한국직영점

리뷰쓰기
가고싶다
301,868 191 8,121 
주소
제주 제주시 이도이동 1063-6
전화번호
064-726-5242
음식 종류
회 / 스시 
가격대
만원-2만원
주차
주차공간없음 
영업시간
11:00 - 15:00
휴일
화
메뉴 하브동 (소) 16,000원, 육회동 (소)10,500원, 데카동 (소) 10,500원, 도로도로동 (소) 26,000원,  마구로카츠동 9,800원
 
 
전체 191 ->  1. 맛있다 146 => int good; 
           2. 괜찮다 31 => int soso;  
           3. - 별로 14
 * 
 * 
 * 
 */
class Food {
	
	int cateno;  //fall in key? 중복 있되............ 클래스끼리는 연결되는 변수가 있을수 있는것.
	int no;   // 소분류자체 넘버
	String[] poster = new String[4];  // 모든 소분류 사진개수가 동일하게 4개==> 고정 가능함
	String title;
	double score;
	String addr;
	String tel;
	String type;
	String price;
	String parking;
	String time;
//  String[] menu;==> 소분류마다 메뉴 개수가 달라서 배열로 잡을수가 없다.
	String menu;
	int good;
	int soso;
	int bad;
	
}
/*
 * 
 * 
          <ul class="list-type-ls type-column02">
              <li>
                <a href="/top_lists/2263_pasta2020" target="_blank"
                ===
                           손가락 표시됨 : 링크태그
                   onclick="trackEvent('CLICK_RELATED_TOPLIST', {&quot;position&quot;:0,&quot;link_name&quot;:&quot;2263_pasta2020&quot;})">
                  <figure class="ls-item">
                    <div class="thumb">
                      <div class="inner">
                        <img class="center-crop portrait lazy"
                             alt="2020 파스타 인기 맛집 TOP 50 사진"
                             data-original="https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/jgosnw6h5oy6vya9.png?fit=around|738:738&amp;crop=738:738;*,*&amp;output-format=jpg&amp;output-quality=80"
                             data-error="https://mp-seoul-image-production-s3.mangoplate.com/web/resources/kssf5eveeva_xlmy.jpg?fit=around|*:*&amp;crop=*:*;*,*&amp;output-format=jpg&amp;output-quality=80"/>
                      </div>
                    </div>

                    <figcaption class="info">
                    
                      <div class="info_inner_wrap">
                        <span class="title">2020 파스타 인기 맛집 TOP 50</span>
                        <p class="desc">"망고플레이트가 선정한 2020년에 꼭 가봐야 할 파스타 맛집"</p>
                        
                        <p class="hash">
                          <span>#2020 파스타 인기 맛집 TOP 50</span>
                        </p>
                      </div>
                    </figcaption>
                  </figure>
                </a>
              </li>
              <li>
 * 
 * 
 */
public class FoodMain {
	//한 클래스로는 불가능하다. 다른 클래스에서  
	//12개 데이터 동시에 가져와 출력하기
	Category[] foodCategoryData() throws Exception
	{
		Category[] cate= new Category[12];
		Document doc = Jsoup.connect("http://www.mangoplate.com/").get();  //서버로 부터 정보 가져오기
		
     // 데이터 4개 가져오기 /  tag여러개 돌릴때 Elements 사용
		Elements title = doc.select("div.info_inner_wrap span.title");
		Elements poster = doc.select("ul.list-toplist-slider img");
		Elements sub = doc.select("div.info_inner_wrap p.desc");
		Elements link = doc.select("ul.list-toplist-slider a");   // 링크를 알아야 클릭해서 들어감.
		
		for(int i = 0; i < 12; i++)      //12개의 카테고리가 필요함. 1바퀴마다 4개의 데이터 가져오기.
		{
		  Category g = new Category();     /// ==> 새로운 객체를 생성하고 =>  한 클래스를 12번 for문을 돌린다...배열 dont need  
		  g.cateno = i+1;   //첫번째 카테고리
		  g.title = title.get(i).text(); // 12개의 카테고리 안으로 제목이 하나씩 박힘. // <span(글자크기)~ /span>tag의 처음과 끝 사이에 있으면 ==>tag값 :사이의 텍스트는 text, 테그 안쪽에 주소값은(속성값) ==> attr로 읽는다.<"속성값">
		  g.subTitle = sub.get(i).text();
		  g.poster = poster.get(i).attr("data-lazy");
		  g.link = link.get(i).attr("href");
		  cate[i] = g;
	
		}
				
		return cate;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	}

}
