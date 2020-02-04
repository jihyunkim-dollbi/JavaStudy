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

// ���������� ������ �ܾ���� ����


// �ܺο��� �ڷ� �����ð���// �ܱ�
public class MusicManager {
	
	
	

	
	public ArrayList<MusicVO> musicAllData()  // vo�� 200�� �̱� ������.. ���ٸ� �������� ������ 199�� �����ϰ� ������ ����..
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
			// ������ 4���� �����;���..
			
			int rank =1; //1���� 200���� �� ����
			
			
			MusicDAO dao=new MusicDAO();
			
			
			
			
			
			for(int i=1; i<= 4; i++)  // �������� ����������
			{
				
				
				try
				{
				
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd="+sdf.format(date)+"&hh=10&rtm=Y&pg="+i).get();
				// doc => html�� ��� ������ ���� ==>.get(); -==> ���߿� tag�� ��������
				// System.out.println(doc.toString());
				
				
				// element �� tag�Ѱ� �����ö�
				// elements�� tag�� ������ �����ö�
				
				Elements title=doc.select("tr.list td.info a.title");// 50�� ���ÿ� ������
				Elements singer=doc.select("tr.list td.info a.artist");
				Elements album=doc.select("tr.list td.info a.albumtitle");
				Elements poster=doc.select("tr.list td a.cover img");
				Elements temp = doc.select("tr.list span.rank");
				
				for(int j=0; j<title.size();j++)
				{
					System.out.println("����: " +rank);
					System.out.println("����: " + title.get(j).text());  // get�� �Ѱ��� �����ö� 
					System.out.println("����: " + singer.get(j).text());
					System.out.println("�ٹ�: " + album.get(j).text());
					System.out.println("�̹���: " + poster.get(j).attr("src"));  // tag������ ���� �����ö�!
					// System.out.println("��Ÿ: " + temp.get(j).text()); // 21�ϰ� , 6���
					
					
					// 21�ϰ����� ��°� 21�� ���� �������� ���� �۾�...
					String s=temp.get(j).text(); // temp���� s�� �־���
					//System.out.println("s: "+ s);
					String ss=s.replaceAll("[^��-�R]", ""); // �ѱ��� ���� �� ������ �־��..���ڸ� ���� : 21�ϰ�=> �ϰ�
					//System.out.println("ss: " + ss);
					String id=""; // ����
					String idcliemt="";
					String state="";
					
					//[0-9]{1,3} => 0~9������ ���� 3�ڸ� ��				
					// ��������� vo �Ѱ�!!
					
					
					if(ss.equals("���")) // ������ replaceAll�̿��Ͽ� �ѱ۸� �߶�
					{
						
					idcliemt=s.replaceAll("[^0-9]", "");	// ���ڻ��� ��� ������ �־��
					// [0-9]��� ���� [^A-Za-z]��� �˹��� ���� [^��-�R] ��� �ѱ� ���� ==> ^[0-9]=> ���ڷ� �����ϴ�!! ==> regx?���Խ�..
					// s=21��� �̶�� ���� �� ����� ��� �������� �ٲ��. �װ��� idclient�� ����.
					state=ss;
						
					}
					else if(ss.equals("�ϰ�"))
					{
						idcliemt=s.replaceAll("[^0-9]", "");
						state=ss;
						
					}
					else
					{
						idcliemt = "0";
						state="����";	
					
					}
					
					
					System.out.println("����: "+state);
					System.out.println("���氪: " + idcliemt);
				//	System.out.println("������Ű: " + youtubekeyData(title.get(j).text()));
							
					// 20�ϰ�-rank-down
					System.out.println("=================================");
					
					MusicVO vo=new MusicVO();
					vo.setRank(rank);
					vo.setTitle(title.get(j).text());
					vo.setSinger(singer.get(j).text());
					vo.setAlbum(album.get(j).text());
					vo.setPoster(poster.get(j).attr("src"));
					vo.setState(state);
					vo.setIdcliment(Integer.parseInt(idcliemt)); // ���ڰ� �����Ѵ�!!
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
		
		
		return list;  // void�� �ƴϱ� ������ ���ϰ� �ʿ�..
	}
	
	public String youtubekeyData(String title)   //�������� ����Ʈ�� �ٸ��� ������  �ΰ��� �޼Ҹ� ���� ������ ������ �޾ƿ� title�� ������ ���⼭ �������� ������
	{ //3
		
		String key = "";
		
		try
		{
			
			Document doc = Jsoup.connect("https://www.youtube.com/results?search_query="+title).get();
			Pattern p=Pattern.compile("/watch\\?v=[^��-�R]+");  // ? ��ȣ�̱� ������ �տ� \\�� ����Ѵ�. ex) & . ^ ? �տ��� ��ü �����̱� ������ �̷��͵� �տ��� \\�� ��� �ٿ�����
			Matcher m= p.matcher(doc.toString()); // �� doc �ȿ� �� p�� �����Ѱ� �� �޶�
			
			//ã��
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
