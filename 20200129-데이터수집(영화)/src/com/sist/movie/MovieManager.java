package com.sist.movie;
//����Ʈ���� �����͸� �ܴ� ����!!
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
/*
 * 
 * 348��
 * 	<div class="info_tit">
					<em class="ico_movie ico_15rating">15���̻������</em>
					<a href="/moviedb/main?movieId=122091" class="name_movie #title">������ �����</a>
			</div>
 * 
 */



public class MovieManager {

	public ArrayList<MovieVO> movieListData()
	{
		
		ArrayList<MovieVO> list = new ArrayList<MovieVO>();
		
		
		
		try
		{
			//vo�� �������� �Ѱ�
			//for�� ������ ���� ��� ���� ����
			//3�������� 3������ ����
			
			//������ ������?
			MovieDAO dao = new MovieDAO();
						
			//for(int i=1; i<=6; i++)
			{
				// �ش� �������� ������ ������
				Document doc=Jsoup.connect("https://movie.daum.net/boxoffice/yearly").get();
				// �󿵿��������� �ٲ���..i<=6
				// ���� ���� i<=6
				
				
				// tag��tag���̿� ���� ����������. 
				// Elememts �ȿ� ���� Element-arraylist�� ���� �� �ִ� ==> ���� ������ Element(tag�� ���� ����ִ� ���)- vo �� for������ ������ 25����  ����� ����� �� �ִ�.
				// https://movie.daum.net/premovie/released-347
				//a tag���� ����..
				//Ŭ������ . ���̵�� #
				// https://try.jsoup.org/ ���⼭ �����Ͱ� ����� �������� �ȵ������� Ȯ���ϰ� ��������. - url��ġ �� Ŭ������ ã��
				// div.wrap_movie span.info_state  ==> �������� ���ϱ� ���� ���� ū �Ҽ��� ã�´�. div�� ���� �ٱ��� �־ ���� ū ī�װ� �ȿ� span ī�װ��� info_state Ŭ������ �ִ�.
				
				Elements link = doc.select("div.info_tit a");  // �ּҸ� ���� tag //a�ױ׸� ��Ƴ���..
				
				
				/*
				 * <div class="a1">
				 * 			<p> aaa</p>
				 * 			<a href="bbb">ccc</a>
				 * </div>
				 * 
				 * div.a1 p ==> text()==>p�� p���� �� ==> aaa
				 * div.a1 a ==> attr("href") ==> �Ӽ������ϱ� ==>a�� ��ũ�ױ� ==> bbb
				 * div.a1 		==> text() ==> aaa ccc ==> ���ڸ� �о��
				 * 					html() ==> 	<p> aaa</p>
				 * 								<a href="bbb">ccc</a>
				 * 
				 * 
				 * 
				 */
				for(int j=0;j<link.size();j++)
				{
					
					try // �μ��ǿ��� regdate�� ���� 2������ regdate 
					{
					
					
					// �ϸ���Ʈ - ���ϴ� tag �Ѱ��� ��������
					Element elem = link.get(j); // tag�Ѱ��� �о��
					//System.out.println((i)+"-"+elem.attr("href")); //attr("") ==> ���ڸ� �������� ��ũ�� �ǹǷν� �������� ���� �ϱ�����... �̶� attr()���..
					//System.out.println((i)+"-"+elem.text()); // elem�ȿ� �ִ� ��- �ؽ�Ʈ�� - ��ȭ������ ������..
					
					String mLink = "https://movie.daum.net"+elem.attr("href");
					// https://movie.daum.net ����.  /moviedb/main?movieId=127138 �� �������� ����Ʈ ������ �Ұ���..
				
					Document doc2=Jsoup.connect(mLink).get(); //20���� �ּҰ� ��..��� html������
					//doc2�� get()�� ����Ʈ�� �����Ͽ� html�ҽ��� ������ �־����. ���� doc2�� ���� �Ʒ� Element�� ������ ���� ������.
					//System.out.println(doc2);
					// �󼼺���� loop�� �����ʿ䰡 ���� ���� �ױװ� �ݺ����� �ʴ´� ���� element�� �ʿ��ϴ�. elements�ʿ�x
					
					Element title=doc2.selectFirst("div.subject_movie strong.tit_movie"); //select������ �ױ� ������ ,, selectfirst() ù��° ��Ÿ���� �±װ� ������  div div strong
					System.out.println(title.text()); // ������ ����϶� 
					//����
					
					
					Element score=doc2.selectFirst("div.subject_movie em.emph_grade");
					System.out.println(score.text());
					//����
					
					
					
					Element genre=doc2.select("dl.list_movie dd.txt_main").get(0); //eq(0) : ���� �������ϰ�� 0 ,1 ,2
					System.out.println(genre.text());
					
					
					
					
					Element regdate=doc2.select("dl.list_movie dd.txt_main").get(1);
					System.out.println(regdate.text());
					
					
					Element time=doc2.select("dl.list_movie dd").get(3);
					
					String temp = time.text(); //147��, 12���̻������ 
					// time�� �������� 147, 12���̻� ������ �ѹ��� ���� ������ �����ֱ�����!!
					StringTokenizer st=new StringTokenizer(temp,",");
					String strTime=st.nextToken();
					String strGrade=st.nextToken().trim();
							
					System.out.println(strTime);
					System.out.println(strGrade);
					
					
					
					Element director=doc2.select("dl.list_movie dd.type_ellipsis").get(0);
					System.out.println(director.text());
					Element actor=doc2.select("dl.list_movie dd.type_ellipsis").get(1);
					System.out.println(actor.text());
					
					
					Element story=doc2.selectFirst("div.desc_movie p");  // ù��° p���� �ٶ�first , �ι�°�� �������� ������ select�� 0,1,2�� �����ü� �ִ�.
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
					
					dao.movieInsert(vo); //�߰��ϱ�
					}catch(Exception ex) {System.out.println(" ������ ����");}
					
					
					
					
				} 
				
				
				
				
			}
			
			System.out.println("DataBase Insert End..."); //�갡 ������ ����� ����.
			
		}catch(Exception ex) {}
		
		
		return list;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MovieManager m=new MovieManager();
		m.movieListData();
		
	}

}
