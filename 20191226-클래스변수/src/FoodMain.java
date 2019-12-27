import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
// Jsoup =>html �ļ���=>https://mvnrepository.com/search?q=Jsoup
// ī�װ� �з� ex) ���� -> ��з� 1�� - "�ϰ� ���� ���� ����Ʈ" -> �ȿ� �ߺз�- "2020 ���� �α� ���� TOP 60" -> �Һз�-"������� 4.7"
//�ߺз� ����� - ī�װ� �ѹ�(����)- ������ ���� ..., ����, ����, ������ => 4���� ���� �ʿ�. 
/*
 * 		member(
 * 
 * 		id=================> ���� �����ǵ��� �������� 
 * 		pwd
 * 		name
 * 		sex
 * 		birth
 * 		addr
 * 		tel	
 * 
 *      )
 * 
 * 		����(
 * 
 * 		id =================> ������ id�� �����ؿ;��Ѵ�. ������..,..
 * 		movie title
 * 		theater
 * 		date
 * 		time
 * 		seat
 * 
 * 		)
 * 
 * 		ĸ��ȭ => ������, ������ private���� ���߰� �޼ҵ�� �����.
 * 		 private ����=> get method, set method ����� �޼ҵ带 ���� ���. 
 * 		 ==> �Һ�? ==> �ڵ����� get/set �޼ҵ� �������.  ==> ��Ŭ���� ��� ����.
 * 	 
 */ 
class Category {  
	
	int cateno;  //cno ī�װ��ѹ�- ������ ���� -primary key - �ߺ��� ���� 
	//ī�װ��� ��¥ ����.
	String poster;
	String title;
	String subTitle;
	String link;
	
}
/*
 * �����μ��� 4.5 
�ѱ�������

���侲��
����ʹ�
301,868 191 8,121 
�ּ�
���� ���ֽ� �̵��̵� 1063-6
��ȭ��ȣ
064-726-5242
���� ����
ȸ / ���� 
���ݴ�
����-2����
����
������������ 
�����ð�
11:00 - 15:00
����
ȭ
�޴� �Ϻ굿 (��) 16,000��, ��ȸ�� (��)10,500��, ��ī�� (��) 10,500��, ���ε��ε� (��) 26,000��,  ������ī���� 9,800��
 
 
��ü 191 ->  1. ���ִ� 146 => int good; 
           2. ������ 31 => int soso;  
           3. - ���� 14
 * 
 * 
 * 
 */
class Food {
	
	int cateno;  //fall in key? �ߺ� �ֵ�............ Ŭ���������� ����Ǵ� ������ ������ �ִ°�.
	int no;   // �Һз���ü �ѹ�
	String[] poster = new String[4];  // ��� �Һз� ���������� �����ϰ� 4��==> ���� ������
	String title;
	double score;
	String addr;
	String tel;
	String type;
	String price;
	String parking;
	String time;
//  String[] menu;==> �Һз����� �޴� ������ �޶� �迭�� �������� ����.
	String menu;
	int good;
	int soso;
	int bad;
	
}
/*
 * 
 * 
            <a class="inbound_banner only-mobile is_background" href="https://www.mangoplate.com/eat_deals" onclick="common_ga(&#39;PG_MAIN&#39;, &#39;CLICK_SALES_LOCAL&#39;)" style="background-image: url(https://mp-seoul-image-production-s3.mangoplate.com/web/resources/zanmofgd-kuncgxq.png)"></a>

        <section class="module popular_top_list_wrap">
  <div class="module_title_wrap">
    <h2 class="title">�ϰ� ���� ���� ����Ʈ</h2>
      <a class="module_more" href="/top_lists"
         onclick="trackEvent('CLICK_TOPLIST_LIST', {&quot;section_position&quot;:0,&quot;section_title&quot;:&quot;�ϰ� ���� ���� ����Ʈ&quot;,&quot;more_link&quot;:&quot;/top_lists&quot;,&quot;more_label&quot;:&quot;����Ʈ ������&quot;})">
        ����Ʈ ������
      </a>
  </div>
  <div class="slider-container toplist-slider">
    <button class="btn-nav prev"></button>
    <button class="btn-nav next"></button>

    <div class="top_list_slide">
        <ul class="list-toplist-slider" style="width: 531px;">
            <li>
              <img class="center-croping" alt="2020 ���� �α� ���� TOP 60 ����"
                   data-lazy="https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/7zsdxmpu4kauzpk7.jpg?fit=around|600:400&amp;crop=600:400;*,*&amp;output-format=jpg&amp;output-quality=80"/>

              <a href="/top_lists/2264_jeju2020"
                 onclick="trackEvent('CLICK_TOPLIST', {&quot;section_position&quot;:0,&quot;section_title&quot;:&quot;�ϰ� ���� ���� ����Ʈ&quot;,&quot;position&quot;:0,&quot;link_key&quot;:&quot;PQQTL_E&quot;});">
                <figure class="ls-item">
                  <figcaption class="info">
                    <div class="info_inner_wrap">
                      <span class="title">2020 ���� �α� ���� TOP 60</span>
                      <p class="desc">"������ �α� ������ ��� ��� ��Ҵ�!"</p>
                      <p class="hash">
                          <span>#���ֵ� </span>
                          <span>#���� </span>
                          <span>#�������� </span>
                          <span>#���ֽ� </span>
                          <span>#���ֿ��� </span>
                          <span>#���ָ��� </span>
                          <span>#��ⱹ�� </span>
                          <span>#������� </span>
                          <span>#����� </span>
                          <span>#����ȸ </span>
                          <span>#��ġȸ </span>
                          <span>#���� </span>
                          <span>#����� </span>
                      </p>
                    </div>
                  </figcaption>
                </figure>
              </a>
            </li>
 * 
 * 
 */
public class FoodMain {
	//�� Ŭ�����δ� �Ұ����ϴ�. �ٸ� Ŭ��������  
	//12�� ������ ���ÿ� ������ ����ϱ�. 1���� �ۺ� Ŭ������ �־�� �Ѵ�.
	Category[] foodCategoryData() throws Exception
	{
		Category[] cate= new Category[12];
		Document doc = Jsoup.connect("http://www.mangoplate.com/").get();  //������ ���� ���� ��������
		
     // ������ 4�� �������� /  tag������ ������ Elements ���
		Elements title = doc.select("div.info_inner_wrap span.title");
		Elements poster = doc.select("ul.list-toplist-slider img");
		Elements sub = doc.select("div.info_inner_wrap p.desc");
		Elements link = doc.select("ul.list-toplist-slider a");   // ��ũ�� �˾ƾ� Ŭ���ؼ� ��.
		
		for(int i = 0; i < 12; i++)      //12���� ī�װ��� �ʿ���. 1�������� 4���� ������ ��������.
		{
		  Category g = new Category();     /// ==> ���ο� ��ü�� �����ϰ� =>  �� Ŭ������ 12�� for���� ������...�迭 dont need  
		  g.cateno = i+1;   //ù��° ī�װ�
		  g.title = title.get(i).text(); // 12���� ī�װ� ������ ������ �ϳ��� ����. // <span(����ũ��)~ /span>tag�� ó���� �� ���̿� ������ ==>tag�� :������ �ؽ�Ʈ�� text, �ױ� ���ʿ� �ּҰ���(�Ӽ���) ==> attr�� �д´�.<"�Ӽ���">
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
