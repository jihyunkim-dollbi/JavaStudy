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
          <ul class="list-type-ls type-column02">
              <li>
                <a href="/top_lists/2263_pasta2020" target="_blank"
                ===
                           �հ��� ǥ�õ� : ��ũ�±�
                   onclick="trackEvent('CLICK_RELATED_TOPLIST', {&quot;position&quot;:0,&quot;link_name&quot;:&quot;2263_pasta2020&quot;})">
                  <figure class="ls-item">
                    <div class="thumb">
                      <div class="inner">
                        <img class="center-crop portrait lazy"
                             alt="2020 �Ľ�Ÿ �α� ���� TOP 50 ����"
                             data-original="https://mp-seoul-image-production-s3.mangoplate.com/keyword_search/meta/pictures/jgosnw6h5oy6vya9.png?fit=around|738:738&amp;crop=738:738;*,*&amp;output-format=jpg&amp;output-quality=80"
                             data-error="https://mp-seoul-image-production-s3.mangoplate.com/web/resources/kssf5eveeva_xlmy.jpg?fit=around|*:*&amp;crop=*:*;*,*&amp;output-format=jpg&amp;output-quality=80"/>
                      </div>
                    </div>

                    <figcaption class="info">
                    
                      <div class="info_inner_wrap">
                        <span class="title">2020 �Ľ�Ÿ �α� ���� TOP 50</span>
                        <p class="desc">"�����÷���Ʈ�� ������ 2020�⿡ �� ������ �� �Ľ�Ÿ ����"</p>
                        
                        <p class="hash">
                          <span>#2020 �Ľ�Ÿ �α� ���� TOP 50</span>
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
	//�� Ŭ�����δ� �Ұ����ϴ�. �ٸ� Ŭ��������  
	//12�� ������ ���ÿ� ������ ����ϱ�
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
