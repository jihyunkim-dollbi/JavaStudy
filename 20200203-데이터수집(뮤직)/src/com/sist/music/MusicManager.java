package com.sist.music;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

// 여러군데서 데이터 긁어오는 연습


// 외부에서 자료 가져올것임// 긁기
public class MusicManager {
	
	
	public ArrayList<MusicVO> musicAllData()  // vo가 200개 이기 때문에.. 한줄만 가져오면 나머지 199는 동일하게 가져올 것임..
	{
		
		ArrayList<MusicVO> list = new ArrayList<MusicVO>();   //1
		
		try
		{
			/*
			private String title;
			private String singer;
			private String album;
			private String poster;
			private int idcliment;
			private String state;
			private String key;
			*/
			
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
			System.out.println(sdf.format(date));
			// 파일을 4개를 가져와야함..
			
			int rank =1; //1부터 200까지 갈 것임
			
			MusicDAO dao=new MusicDAO();
			
			
			
			for(int i=1; i<= 4; i++)  // 페이지당 가져오려함
			{
				
				
				try
				{
				
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd="+sdf.format(date)+"&hh=10&rtm=Y&pg="+i).get();
				// doc => html을 모두 가지고 있음 ==>.get(); -==> 그중에 tag를 받으려함
				// System.out.println(doc.toString());
				
				
				// element 는 tag한개 가져올때
				// elements는 tag를 여러개 가져올때
				
				Elements title=doc.select("tr.list td.info a.title");// 50개 동시에 읽을떄
				Elements singer=doc.select("tr.list td.info a.artist");
				Elements album=doc.select("tr.list td.info a.albumtitle");
				Elements poster=doc.select("tr.list td a.cover img");
				Elements temp = doc.select("tr.list span.rank");
				
				for(int j=0; j<title.size();j++)
				{
					System.out.println("순위: " +rank);
					System.out.println("제목: " + title.get(j).text());  // get은 한개씩 가져올때 
					System.out.println("가수: " + singer.get(j).text());
					System.out.println("앨범: " + album.get(j).text());
					System.out.println("이미지: " + poster.get(j).attr("src"));  // tag사이의 값을 가져올때!
					// System.out.println("기타: " + temp.get(j).text()); // 21하강 , 6상승
					
					
					// 21하강에서 상승과 21을 따로 가져오기 위한 작업...
					String s=temp.get(j).text(); // temp값을 s에 넣어줌
					//System.out.println("s: "+ s);
					String ss=s.replaceAll("[^가-힣]", ""); // 한글을 뺴고 다 공백을 주어라..숫자를 지움 : 21하강=> 하강
					//System.out.println("ss: " + ss);
					String id=""; // 숫자
					String idcliemt="";
					String state="";
					
					//[0-9]{1,3} => 0~9까지의 숫자 3자리 수				
					// 여기까지가 vo 한개!!
					
					
					if(ss.equals("상승")) // 위에서 replaceAll이용하여 한글만 잘라냄
					{
						
					idcliemt=s.replaceAll("[^0-9]", "");	// 숫자빼고 모두 공백을 주어라
					// [0-9]모든 숫자 [^A-Za-z]모든 알바펫 빼고 [^가-힣] 모든 한글 빼고 ==> ^[0-9]=> 숫자로 시작하는!! ==> regx?정규식..
					// s=21상승 이라면 숫자 만 남기고 모두 공백으로 바뀐다. 그값을 idclient에 넣음.
					state=ss;
						
					}
					else if(ss.equals("하강"))
					{
						idcliemt=s.replaceAll("[^0-9]", "");
						state=ss;
						
					}
					else
					{
						idcliemt = "0";
						state="유지";	
					
					}
					
					
					System.out.println("등폭: "+state);
					System.out.println("변경값: " + idcliemt);
				//	System.out.println("동영상키: " + youtubekeyData(title.get(j).text()));
							
					// 20하강-rank-down
					System.out.println("=================================");
					
					MusicVO vo=new MusicVO();
					vo.setRank(rank);
					vo.setTitle(title.get(j).text());
					vo.setSinger(singer.get(j).text());
					vo.setAlbum(album.get(j).text());
					vo.setPoster(poster.get(j).attr("src"));
					vo.setState(state);
					vo.setIdcliment(Integer.parseInt(idcliemt)); // 숫자가 들어가야한다!!
					vo.setKey(youtubekeyData(title.get(j).text()));
					
					list.add(vo);
					
					dao.musicInsert(vo);	
					
					rank++;
					
					
				}
				//	Elements idcliement=doc.select("tr.list td.info a.artist");
				//	Elements state=doc.select("tr.list td.info a.artist");
				
				// tr class="list"
				
				
				
				}
				catch(Exception ex) 
				{
					ex.printStackTrace();
					
				}
				
	
			}
			
			
		}catch(Exception ex) 
		{
			ex.printStackTrace();
			
		}
		
		
		return list;  // void가 아니기 때문에 리턴값 필요..
	}
	
	public String youtubekeyData(String title)   //가져오는 사이트가 다르기 때문에  두개의 메소를 만듬 위에서 정보를 받아와 title에 넣으면 여기서 영상정보 가져옴
	{ //3
		
		String key = "";
		
		try
		{
			
			Document doc = Jsoup.connect("https://www.youtube.com/results?search_query="+title).get();
			Pattern p=Pattern.compile("/watch\\?v=[^가-힣]+");  // ? 기호이기 때문에 앞에 \\를 줘야한다. ex) & . ^ ? 앞에는 자체 문자이기 때문에 이런것들 앞에는 \\를 모두 붙여야함
			Matcher m= p.matcher(doc.toString()); // 이 doc 안에 얘 p를 포함한걸 다 달라
			
			//찾기
			while(m.find())
			{
				String temp=m.group();
				key=temp.substring(temp.indexOf("=")+1, temp.indexOf("\""));
				break;
				
				// System.out.println("temp: "+ temp);

			}
			
			
		}
		catch(Exception ex) 
		{
			
			ex.printStackTrace();
		}
		
		
		
		return key;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MusicManager m = new MusicManager();  //2
		MusicDAO dao = new MusicDAO();
		
		ArrayList<MusicVO> list = m.musicAllData();
		
	/*	
		for(MusicVO vo:list)
		{
			dao.musicInsert(vo);	
		}
    */	
	
	}

}
