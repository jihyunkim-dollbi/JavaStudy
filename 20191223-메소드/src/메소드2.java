import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import org.jsoup.select.Elements;
/*
 *   <td class="info">
                          <a href="#" class="title ellipsis" title="재생" onclick="fnPlaySong('89741945','1');return false;">
                                        
                                               다시는 사랑하지 않고, 이별에 아파하기 싫어</a>
 * 
 * 
 * 
 */
public class 메소드2 {
	static String[] getMusicTitle() throws Exception   //노래 제목만 가져오는 메소드
	{
		String[] list = new String[50];    // 스트링 리턴형과 return list(결과값) ==> 일치해야함. 
		Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements title = doc.select("td.info a.title");   // td =>데이터출력 테그 , a => 링크테그(클릭하면 들어가는!) = > 타이틀에 링크가 걸림.

		for(int i = 0; i<50; i++) 
		
		{
				list[i] = title.get(i).text();
		}
		return list;
    }
	
	
// 가수명과 앨범명 가져오기. 한개씩 가져오려함.(한개 번호당 한개 자료) 링크를 매칭시켜서. 0번 -->! 1번 ==>! 따라서 번호를 넘겨줘야 받을 수있음.
// 사용자가 번호 하나를 선택할 것이므로 매개변수가 되고 -> 가수명과 앨범명을 가져오기. ==> 따라서 리턴값은 하나여야 한다. 
// => 배열로 안하려면(데이터형들이 모두 다르므로!) 이럴경우, String 문자열로  '+' 하여 붙인다음, 문자를 substring으로 다시 자려르함. 
// 1|제목|가수명|앨범|100(히트수) ==> 이렇게 붙인다음 'or 별로' 자른다 ==> split 메소드를 사용하면 된다. 
//모바일!/웹!네트워크는 문자열로 전송이 기본이다. ==>따라서 String 메소드 모두  중요!	
// 클레스에서 중요한 메소드는 equals와 clone 단지 두가지!
/* 클릭  - 하나를 가져옴 -> 출력! -==> 매개변수가 있다는 것임. => 배열의 번호 한개가 넘어감 
 * 전체페이지 가져옴 ==> 배열을 가져옴! ==> 매개변수 필요 없다. 
 * 전체데이터 가져오기
 * 

                                        <a href="#" class="artist ellipsis" onclick="fnViewArtist('14936387');return false;">백지영</a>
                                        
                                        <div class="toggle-button-box" >
                                            <button type="button" class="btn artist-etc" onclick="fnRelationArtistList('89741945');">외</button>
                                            <ul class="list" id="RelationArtist_89741945"></ul>
                                        </div>
                                        
                                        <i class="bar">|</i>
                                        <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer('81337060');return false;">다시는 사랑하지 않고, 이별에 아파하기 싫어</a>
                                </td>
                                
                                    
                                        <td class="btns"><a href="#" class="btn-basic btn-listen" title="재생" onclick="fnPlaySong('89741945;' ,'1'); return false;">듣기</a></td>
                                        <td class="btns"><a href="#" class="btn-basic btn-add" title="추가" onclick="fnPlaySong('89741945;' ,'3'); return false;">재생목록에 추가</a></td>
                                    
                                    
                                
                                <td class="btns"><button type="button" class="btn-basic btn-album" songId="89741945" id="add_my_album_89741945" onclick="fnAddMyAlbumForm('#add_my_album_89741945' , '89741945' ,10, 10);return false;">플레이리스트에 담기</button></td>
                                
                                    
                                        <td class="btns"><a href="#" class="btn-basic btn-down" title="다운" onclick="fnDownSong('89741945');return false;">다운로드</a></td>
     
 */
	// 데이터를 긁는게 가장 먼저
	// 번호에 해당하는 번호 하나만 고르기  // 싱어랑 앨범 가져올것1
	
	static String getMusicInfo(int no) throws Exception     
	{
		
		String res = "";
		
		   // 스트링 리턴형과 return list(결과값) ==> 일치해야함. 
		Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements singer = doc.select("td.info a.artist");   // td =>데이터출력 테그 , a => 링크테그(클릭하면 들어가는!) = > 타이틀에 링크가 걸림.
		Elements album = doc.select("td.info a.albumtitle");
		
		for(int i = 0; i<50; i++) 
		{
			 
			if(i==(no-1))   // 스트링 타이틀 배열이 0부터 시작하기 때문에..?
					{
				      res = singer.get(i).text()+"|"+album.get(i).text();
				
					}
		}
		
		return res;	
	}
	
		
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String[] title = getMusicTitle();
		System.out.println("=======지니뮤직 top 50 =========");
		
		for(String s:title)   // 50개의 제목을 출력  (for-each 문으로 대부분 출력사용!)  --> 스트링으로 받음
		{
			
			System.out.println(s);
		}
		
		System.out.println("==============================");
		
		
		Scanner scan = new Scanner(System.in);   // new +cntl space
		
	/*	System.out.print("제목 입력: "); // 검색어 입력
		String name = scan.next();  // 데이터 받기
		
		for(String s: title)   // 제목 가져오기
		{
			
			if(s.contains(name))   // - 검색을 위해 -  문자가 포함된 문자열 찾기 
			{
				
				System.out.println(s);    //포함이 됐다면 s값을 출력해라.
			}
			
		}
			
	*/	
		
		System.out.print("상세볼 뮤직번호 입력(1~50): ");
		int no = scan.nextInt();
		String detail=getMusicInfo(no);
		// aaaaaaa|bbbbbbb
		// 0 --- 7 
		// $ , . , ^ , | , ?
		String[] value=detail.split("\\|");     // 실제데이터를 가져올때 \\를 써야 한다. 
		// StringTokenizer
		System.out.println("가수명: " + value[0]);
		System.out.println("앨범: "+ value[1]);
		
		
		
		
	}

}
