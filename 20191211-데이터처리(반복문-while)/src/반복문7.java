import java.util.Scanner;
import org.jsoup.Jsoup;     // import ���̱� --> Scan �Ʒ��� ����->  ctrl+space
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;



public class �ݺ���7 {

	public static void main(String[] args) throws Exception {  //throws Exception ����ó��
		// TODO Auto-generated method stub
		
        Scanner scan = new Scanner(System.in);
        System.out.println("�˻��� �Է�: ");
        String fd = scan.next();  //find data
        
        
        int k=1;
        while(k<=4) {
        	
        
		Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20191211&hh=15&rtm=Y&pg="+k).get();
		
		// System.out.println(doc);
		
		Elements title=doc.select("td.info a.title");   // Ÿ��Ʋ�� �� Tag�� �ҷ���   // td.info��  
		Elements singer=doc.select("td.info a.artist");
		
		int i = 0;
		while(i<title.size())  /// ?? 
		{
			String data=title.get(i).text(); // ������ �뷡�� �ȿ� ���� �˻��� �뷡�� �ֳ�? -> �ѵα��ڸ� �ᵵ �Ʒ��� �̸����� �߰� �Ϸ���.
			//if(data.contains(fd))   // �� �뷡 �ȿ� ���� �Է��� ��ȣ�� ���ԵǾ��ֳ�?
				 ///contains �� boolean �̱⶧���� ������ true ������ false �� ����Ѵ�.
			//{
				
			
			  //(i+1)+"."�տ� �ѹ��� ��
			System.out.println((i+1)+"."+singer.get(i).text());
			System.out.println(data);
			System.out.println("--------------------------------\n");
			//}
			
			i++;
		
		}
		
		 k++;
        }
	}

}
