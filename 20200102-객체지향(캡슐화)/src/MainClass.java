class Data{
	
	String title;
	static String poster;
	
/*	
	public Data() { //생성자 - 그때그때 내용이 달라질때, 
		
		title = "홍길동전";
		poster = "hong.png";
		
		
	}
	
*/
	
	static { // 초기화 블럭 = 대용량, data base를 사용할때.
		
		poster = "1.png";
		
	}
	
	public Data() { // 생성자 
		
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
		
		
		//따라서 생성자는 데이터값이 다를때마다 객체를 계속 만들어낸다.... but, 초기화 블럭{}은 한번만 읽어서 계속 사용가능함.
		Data d2 = new Data();
		System.out.println(d2.title);
		System.out.println(d2.poster);		
		
	}

}
