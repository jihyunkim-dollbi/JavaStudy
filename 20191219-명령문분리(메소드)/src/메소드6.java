// 20191217�� �迭 3�� ������ ==> �Ű������� �̿��ؼ� 1���� �޼ҵ�� �پ��� ������ ��������!
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
 * ������ - �������� ���� ������� ���� ���� �ޱ�. ������?!
 *      - ���������� ���������� ���� ���� �ʿ� ����. 
 *        
 *  �Ű����� ���۹�. ==> ��������
 */





// �����н� --Jsoup ��������
public class �޼ҵ�6 {
	static void siteData(String url) throws Exception
	{
		
		Document doc=Jsoup.connect(url).get();   // ���� ����� ������
		                       //   ====================== + /moviedb/main?movieId=93004  �̷��� �ؾ� ������ ����.
		                       //    ���� �ּҰ� �־�� ���´�. / �ϳ��� https: ���� �ٿ�����, // �ΰ��� �����ּ� ��������
		Elements link=doc.select("div.info_tit a.name_movie");                    
		int k=1;
		
		for(int i=0; i<16; i++)
		{
			
			try {
			
		//	System.out.println(link.get(i).attr("href"));
			String link_data="https://movie.daum.net"+link.get(i).attr("href");
					System.out.println(link_data);
					
					
					
					Document doc2=Jsoup.connect(link_data).get();   //https://movie.daum.net/moviedb/main?movieId=93004  ù��° for���� ������ ù��° ��ȭ. �ּҰ� ���ʷ� ����.
					// �ε��� ��ȣ�� ������ ����� ����.
					/*
					 * <div class="subject_movie">
					 *  ===        ==============
								<strong class="tit_movie">�ܿ�ձ� 2 (2019)</strong>
								========       ==========
								<span class="txt_origin">Frozen II</span><!-- 2016-04-12 �߰� -->
					 * 
					 * 
					 * <a href="/moviedb/grade?movieId=93004" class="raking_grade">
					 * ==                                            ==============       
									<span class="bg_star star_grade"><span class="bg_star inner_star" style="width:74.15000081062317%">����</span></span> <!-- 116px�� 100%, % ��꿡�� width���� ����-->
									<em class="emph_grade">7.4</em><span class="txt_grade">/10</span>
								</a>
					 * 
					 * 
					 * <dl class="list_movie list_main">
								<dt class="screen_out">�帣|����</dt>

																								
								<dd class="txt_main">�ִϸ��̼�/��庥ó/�ڹ̵�/��Ÿ��/������</dd>
					 * 
					 * 
					 * 
					 */
					
					
					Element title_kr=doc2.selectFirst("div.subject_movie strong.tit_movie");
					Element title_en=doc2.selectFirst("div.subject_movie span.txt_origin");
					Element score=doc2.selectFirst("a.raking_grade em.emph_grade");
					Element genre=doc2.select("dl.list_movie dd.txt_main").get(0);    // dl ù��°
					Element regdate=doc2.select("dl.list_movie dd.txt_main").get(1);
					Element grade=doc2.select("dl.list_movie dd").get(3);
					Element director=doc2.select("dl.list_movie dd").get(4);
					Element actor=doc2.select("dl.list_movie dd").get(5);  // dl 5��°
					
					
					
					
					System.out.println(title_kr.text());
					System.out.println(title_en.text());
					System.out.println(score.text());
					System.out.println(genre.text());
					System.out.println(regdate.text());
					System.out.println(grade.text());
					System.out.println(director.text());
					System.out.println(actor.text());
					
					System.out.println("=====================================");
				
				
			}catch(Exception ex ) {k--;}  // try catch�� �ִϱ� ������ �ִ� �κ��� ��ŵ�ϰ� �������� �Ѿ.
		      // https://movie.daum.net/moviedb/main?movieId=135061 �� ��ȭ�� �ֿ��� ���� ���� ������ ������ �߻��߾���.
		}
		
		
		
	}
	
	static void process() throws Exception     // �޴��ϳ��� ���� ���� 1~5�� �����Ͽ� �ϳ��� ������ ȣ���ϱ� ���α׷�.
	{
		Scanner scan = new Scanner(System.in);
		String[] url = {
				
				"https://movie.daum.net/premovie/released",
				"https://movie.daum.net/premovie/scheduled",
				"https://movie.daum.net/boxoffice/weekly",
				"https://movie.daum.net/boxoffice/monthly",
				"https://movie.daum.net/boxoffice/yearly"
		};
		
		
		
		
		while (true)/// while ���� �� ���� 1~5�� �ƴϸ� ����! Ȥ�� 6�� ���Ḧ �ټ��� �ִ�.
		{
			System.out.println("=================");
			System.out.println("1. ����� ��ȭ");
			System.out.println("2. �������� ��ȭ");
			System.out.println("3. �ڽ����ǽ� (�ְ�)");
			System.out.println("4. �ڽ����ǽ� (����)");
			System.out.println("5. �ڽ����ǽ� (�Ⱓ)");
			System.out.println("6. ����");
			System.out.println("=================");
			System.out.print("����> ");
			int no=scan.nextInt();
			//rul�ҷ��� ȭ�鿡 ����ϱ�
			
			
			if(no==6)
			{
					System.out.println("���α׷� ����");
				break;
			}
			siteData(url[no-1]); // 1~5���� �ؾߵǴµ� �迭�� 0���� �����ؼ�
			
			
			
		}
			
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			
			process();
			
			
	}

}
