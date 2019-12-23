import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import org.jsoup.select.Elements;
/*
 *   <td class="info">
                          <a href="#" class="title ellipsis" title="���" onclick="fnPlaySong('89741945','1');return false;">
                                        
                                               �ٽô� ������� �ʰ�, �̺��� �����ϱ� �Ⱦ�</a>
 * 
 * 
 * 
 */
public class �޼ҵ�2 {
	static String[] getMusicTitle() throws Exception   //�뷡 ���� �������� �޼ҵ�
	{
		String[] list = new String[50];    // ��Ʈ�� �������� return list(�����) ==> ��ġ�ؾ���. 
		Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements title = doc.select("td.info a.title");   // td =>��������� �ױ� , a => ��ũ�ױ�(Ŭ���ϸ� ����!) = > Ÿ��Ʋ�� ��ũ�� �ɸ�.

		for(int i = 0; i<50; i++) 
		
		{
				list[i] = title.get(i).text();
		}
		return list;
    }
	
	
// ������� �ٹ��� ��������. �Ѱ��� ����������.(�Ѱ� ��ȣ�� �Ѱ� �ڷ�) ��ũ�� ��Ī���Ѽ�. 0�� -->! 1�� ==>! ���� ��ȣ�� �Ѱ���� ���� ������.
// ����ڰ� ��ȣ �ϳ��� ������ ���̹Ƿ� �Ű������� �ǰ� -> ������� �ٹ����� ��������. ==> ���� ���ϰ��� �ϳ����� �Ѵ�. 
// => �迭�� ���Ϸ���(������������ ��� �ٸ��Ƿ�!) �̷����, String ���ڿ���  '+' �Ͽ� ���δ���, ���ڸ� substring���� �ٽ� �ڷ�����. 
// 1|����|������|�ٹ�|100(��Ʈ��) ==> �̷��� ���δ��� 'or ����' �ڸ��� ==> split �޼ҵ带 ����ϸ� �ȴ�. 
//�����!/��!��Ʈ��ũ�� ���ڿ��� ������ �⺻�̴�. ==>���� String �޼ҵ� ���  �߿�!	
// Ŭ�������� �߿��� �޼ҵ�� equals�� clone ���� �ΰ���!
/* Ŭ��  - �ϳ��� ������ -> ���! -==> �Ű������� �ִٴ� ����. => �迭�� ��ȣ �Ѱ��� �Ѿ 
 * ��ü������ ������ ==> �迭�� ������! ==> �Ű����� �ʿ� ����. 
 * ��ü������ ��������
 * 

                                        <a href="#" class="artist ellipsis" onclick="fnViewArtist('14936387');return false;">������</a>
                                        
                                        <div class="toggle-button-box" >
                                            <button type="button" class="btn artist-etc" onclick="fnRelationArtistList('89741945');">��</button>
                                            <ul class="list" id="RelationArtist_89741945"></ul>
                                        </div>
                                        
                                        <i class="bar">|</i>
                                        <a href="#" class="albumtitle ellipsis" onclick="fnViewAlbumLayer('81337060');return false;">�ٽô� ������� �ʰ�, �̺��� �����ϱ� �Ⱦ�</a>
                                </td>
                                
                                    
                                        <td class="btns"><a href="#" class="btn-basic btn-listen" title="���" onclick="fnPlaySong('89741945;' ,'1'); return false;">���</a></td>
                                        <td class="btns"><a href="#" class="btn-basic btn-add" title="�߰�" onclick="fnPlaySong('89741945;' ,'3'); return false;">�����Ͽ� �߰�</a></td>
                                    
                                    
                                
                                <td class="btns"><button type="button" class="btn-basic btn-album" songId="89741945" id="add_my_album_89741945" onclick="fnAddMyAlbumForm('#add_my_album_89741945' , '89741945' ,10, 10);return false;">�÷��̸���Ʈ�� ���</button></td>
                                
                                    
                                        <td class="btns"><a href="#" class="btn-basic btn-down" title="�ٿ�" onclick="fnDownSong('89741945');return false;">�ٿ�ε�</a></td>
     
 */
	// �����͸� �ܴ°� ���� ����
	// ��ȣ�� �ش��ϴ� ��ȣ �ϳ��� ����  // �̾�� �ٹ� �����ð�1
	
	static String getMusicInfo(int no) throws Exception     
	{
		
		String res = "";
		
		   // ��Ʈ�� �������� return list(�����) ==> ��ġ�ؾ���. 
		Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		Elements singer = doc.select("td.info a.artist");   // td =>��������� �ױ� , a => ��ũ�ױ�(Ŭ���ϸ� ����!) = > Ÿ��Ʋ�� ��ũ�� �ɸ�.
		Elements album = doc.select("td.info a.albumtitle");
		
		for(int i = 0; i<50; i++) 
		{
			 
			if(i==(no-1))   // ��Ʈ�� Ÿ��Ʋ �迭�� 0���� �����ϱ� ������..?
					{
				      res = singer.get(i).text()+"|"+album.get(i).text();
				
					}
		}
		
		return res;	
	}
	
		
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String[] title = getMusicTitle();
		System.out.println("=======���Ϲ��� top 50 =========");
		
		for(String s:title)   // 50���� ������ ���  (for-each ������ ��κ� ��»��!)  --> ��Ʈ������ ����
		{
			
			System.out.println(s);
		}
		
		System.out.println("==============================");
		
		
		Scanner scan = new Scanner(System.in);   // new +cntl space
		
	/*	System.out.print("���� �Է�: "); // �˻��� �Է�
		String name = scan.next();  // ������ �ޱ�
		
		for(String s: title)   // ���� ��������
		{
			
			if(s.contains(name))   // - �˻��� ���� -  ���ڰ� ���Ե� ���ڿ� ã�� 
			{
				
				System.out.println(s);    //������ �ƴٸ� s���� ����ض�.
			}
			
		}
			
	*/	
		
		System.out.print("�󼼺� ������ȣ �Է�(1~50): ");
		int no = scan.nextInt();
		String detail=getMusicInfo(no);
		// aaaaaaa|bbbbbbb
		// 0 --- 7 
		// $ , . , ^ , | , ?
		String[] value=detail.split("\\|");     // ���������͸� �����ö� \\�� ��� �Ѵ�. 
		// StringTokenizer
		System.out.println("������: " + value[0]);
		System.out.println("�ٹ�: "+ value[1]);
		
		
		
		
	}

}
