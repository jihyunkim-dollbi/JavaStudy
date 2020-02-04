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

// ¿©·¯±ºµ¥¼­ µ¥ÀÌÅÍ ±Ü¾î¿À´Â ¿¬½À


// ¿ÜºÎ¿¡¼­ ÀÚ·á °¡Á®¿Ã°ÍÀÓ// ±Ü±â
public class MusicManager {
	
	
	

	
	public ArrayList<MusicVO> musicAllData()  // vo°¡ 200°³ ÀÌ±â ¶§¹®¿¡.. ÇÑÁÙ¸¸ °¡Á®¿À¸é ³ª¸ÓÁö 199´Â µ¿ÀÏÇÏ°Ô °¡Á®¿Ã °ÍÀÓ..
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
			// ÆÄÀÏÀ» 4°³¸¦ °¡Á®¿Í¾ßÇÔ..
			
			int rank =1; //1ºÎÅÍ 200±îÁö °¥ °ÍÀÓ
			
			
			MusicDAO dao=new MusicDAO();
			
			
			
			
			
			for(int i=1; i<= 4; i++)  // ÆäÀÌÁö´ç °¡Á®¿À·ÁÇÔ
			{
				
				
				try
				{
				
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd="+sdf.format(date)+"&hh=10&rtm=Y&pg="+i).get();
				// doc => htmlÀ» ¸ðµÎ °¡Áö°í ÀÖÀ½ ==>.get(); -==> ±×Áß¿¡ tag¸¦ ¹ÞÀ¸·ÁÇÔ
				// System.out.println(doc.toString());
				
				
				// element ´Â tagÇÑ°³ °¡Á®¿Ã¶§
				// elements´Â tag¸¦ ¿©·¯°³ °¡Á®¿Ã¶§
				
				Elements title=doc.select("tr.list td.info a.title");// 50°³ µ¿½Ã¿¡ ÀÐÀ»‹š
				Elements singer=doc.select("tr.list td.info a.artist");
				Elements album=doc.select("tr.list td.info a.albumtitle");
				Elements poster=doc.select("tr.list td a.cover img");
				Elements temp = doc.select("tr.list span.rank");
				
				for(int j=0; j<title.size();j++)
				{
					System.out.println("¼øÀ§: " +rank);
					System.out.println("Á¦¸ñ: " + title.get(j).text());  // getÀº ÇÑ°³¾¿ °¡Á®¿Ã¶§ 
					System.out.println("°¡¼ö: " + singer.get(j).text());
					System.out.println("¾Ù¹ü: " + album.get(j).text());
					System.out.println("ÀÌ¹ÌÁö: " + poster.get(j).attr("src"));  // tag»çÀÌÀÇ °ªÀ» °¡Á®¿Ã¶§!
					// System.out.println("±âÅ¸: " + temp.get(j).text()); // 21ÇÏ°­ , 6»ó½Â
					
					
					// 21ÇÏ°­¿¡¼­ »ó½Â°ú 21À» µû·Î °¡Á®¿À±â À§ÇÑ ÀÛ¾÷...
					String s=temp.get(j).text(); // temp°ªÀ» s¿¡ ³Ö¾îÁÜ
					//System.out.println("s: "+ s);
					String ss=s.replaceAll("[^°¡-ÆR]", ""); // ÇÑ±ÛÀ» •û°í ´Ù °ø¹éÀ» ÁÖ¾î¶ó..¼ýÀÚ¸¦ Áö¿ò : 21ÇÏ°­=> ÇÏ°­
					//System.out.println("ss: " + ss);
					String id=""; // ¼ýÀÚ
					String idcliemt="";
					String state="";
					
					//[0-9]{1,3} => 0~9±îÁöÀÇ ¼ýÀÚ 3ÀÚ¸® ¼ö				
					// ¿©±â±îÁö°¡ vo ÇÑ°³!!
					
					
					if(ss.equals("»ó½Â")) // À§¿¡¼­ replaceAllÀÌ¿ëÇÏ¿© ÇÑ±Û¸¸ Àß¶ó³¿
					{
						
					idcliemt=s.replaceAll("[^0-9]", "");	// ¼ýÀÚ»©°í ¸ðµÎ °ø¹éÀ» ÁÖ¾î¶ó
					// [0-9]¸ðµç ¼ýÀÚ [^A-Za-z]¸ðµç ¾Ë¹ÙÆê »©°í [^°¡-ÆR] ¸ðµç ÇÑ±Û »©°í ==> ^[0-9]=> ¼ýÀÚ·Î ½ÃÀÛÇÏ´Â!! ==> regx?Á¤±Ô½Ä..
					// s=21»ó½Â ÀÌ¶ó¸é ¼ýÀÚ ¸¸ ³²±â°í ¸ðµÎ °ø¹éÀ¸·Î ¹Ù²ï´Ù. ±×°ªÀ» idclient¿¡ ³ÖÀ½.
					state=ss;
						
					}
					else if(ss.equals("ÇÏ°­"))
					{
						idcliemt=s.replaceAll("[^0-9]", "");
						state=ss;
						
					}
					else
					{
						idcliemt = "0";
						state="À¯Áö";	
					
					}
					
					
					System.out.println("µîÆø: "+state);
					System.out.println("º¯°æ°ª: " + idcliemt);
				//	System.out.println("µ¿¿µ»óÅ°: " + youtubekeyData(title.get(j).text()));
							
					// 20ÇÏ°­-rank-down
					System.out.println("=================================");
					
					MusicVO vo=new MusicVO();
					vo.setRank(rank);
					vo.setTitle(title.get(j).text());
					vo.setSinger(singer.get(j).text());
					vo.setAlbum(album.get(j).text());
					vo.setPoster(poster.get(j).attr("src"));
					vo.setState(state);
					vo.setIdcliment(Integer.parseInt(idcliemt)); // ¼ýÀÚ°¡ µé¾î°¡¾ßÇÑ´Ù!!
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
		
		
		return list;  // void°¡ ¾Æ´Ï±â ¶§¹®¿¡ ¸®ÅÏ°ª ÇÊ¿ä..
	}
	
	public String youtubekeyData(String title)   //°¡Á®¿À´Â »çÀÌÆ®°¡ ´Ù¸£±â ¶§¹®¿¡  µÎ°³ÀÇ ¸Þ¼Ò¸¦ ¸¸µë À§¿¡¼­ Á¤º¸¸¦ ¹Þ¾Æ¿Í title¿¡ ³ÖÀ¸¸é ¿©±â¼­ ¿µ»óÁ¤º¸ °¡Á®¿È
	{ //3
		
		String key = "";
		
		try
		{
			
			Document doc = Jsoup.connect("https://www.youtube.com/results?search_query="+title).get();
			Pattern p=Pattern.compile("/watch\\?v=[^°¡-ÆR]+");  // ? ±âÈ£ÀÌ±â ¶§¹®¿¡ ¾Õ¿¡ \\¸¦ Áà¾ßÇÑ´Ù. ex) & . ^ ? ¾Õ¿¡´Â ÀÚÃ¼ ¹®ÀÚÀÌ±â ¶§¹®¿¡ ÀÌ·±°Íµé ¾Õ¿¡´Â \\¸¦ ¸ðµÎ ºÙ¿©¾ßÇÔ
			Matcher m= p.matcher(doc.toString()); // ÀÌ doc ¾È¿¡ ¾ê p¸¦ Æ÷ÇÔÇÑ°É ´Ù ´Þ¶ó
			
			//Ã£±â
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
