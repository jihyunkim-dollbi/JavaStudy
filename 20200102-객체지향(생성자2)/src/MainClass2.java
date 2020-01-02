// 메인클래스와 여타 다른 클래스는 반드시 다른 java 파일로 만든다. 한 파일에 한 클래스만 만든다. 
// 캡슐화 코딩


/*
 *    	1. 데이터의 초기화할 수 있는 경우
 *      	= 생성자(한번 초기화 하면 수정 불가능->(값을 고정해야 하는 경우 사용한다.) 생성자를 또 만들어야 하는데 ..new를 만들고 주소값이 모두 달라짐)
 *          = setter(원하면 언제든지 값을 변경 가능)
 * 
 *  	
 * 
 */
class Music{   
	
  public Music(int mno, String title, String singer) { 
	  
	  // 생성자 만듬=> 오른쪽 클릭=> source => constructor using field.
      // 특별한 경우(윈도우에서 일단 화면 출력시..etc)가 아닌 이상 setter를 이용한다. 
        super();
		this.mno = mno;
		this.title = title;
		this.singer = singer;
	}
  
  
  
//	Movie m = new Movie(); //==> 같은 src 폴도에 있기때문에 public으로 안했어도 가져올수 있다. 한 글래스파일에 한개의 public만 하용된다.

  	private int mno;  
  	private String title;
  	private String singer;
  	
  	
  	//데이터는 감추었지만 데이터 읽기 쓰기 모두 가능해짐. 데이터를 감추고 메소드를 통해서 데이터를 읽고 쓰기가 가능해짐.
  	// 오른쪽 클릭 = >SOURCE => GET/SET => 변수 클릭.

  	// 모든 메소드는 public .. 
  	
  	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
  	
  	
  	
  	
}

public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Music music = new Music (100, "나의 오랜 연인에게", "다비치");
		//private 변수들이라 getter, setter
		
	/*	
		//저장- 값을 줌
		music.setMno(100);
		music.setTitle("나의 오랜 연인에게");
	    music.setSinger("다비치");
		*/
		
		
	   //읽기
	    System.out.println(music.getMno());
	    System.out.println(music.getTitle());
	    System.out.println(music.getSinger());
	    
	    //위에 값은 모두 사라짐=> 새로운 주소값이 만들어짐.
	    // 따라서, setter를 이용해서 값을 계속 제어가능하다.
	    music = new Music (100, "나의 오랜 연인에게", "다비치1");
	    		
	}

}
