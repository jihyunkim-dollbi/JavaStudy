class Data{
	
	String title;
	static String poster;
	
/*	
	public Data() { //������ - �׶��׶� ������ �޶�����, 
		
		title = "ȫ�浿��";
		poster = "hong.png";
		
		
	}
	
*/
	
	static { // �ʱ�ȭ �� = ��뷮, data base�� ����Ҷ�.
		
		poster = "1.png";
		
	}
	
	public Data() { // ������ 
		
		title = "bbb";
		poster = "2.png";
		
	}
	
	
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Data d1 = new Data();
		System.out.println(d1.title);
		System.out.println(d1.poster);
		
		
		//���� �����ڴ� �����Ͱ��� �ٸ������� ��ü�� ��� ������.... but, �ʱ�ȭ ��{}�� �ѹ��� �о ��� ��밡����.
		Data d2 = new Data();
		System.out.println(d2.title);
		System.out.println(d2.poster);		
		
	}

}
