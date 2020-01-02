// ~VO :  데이터를 모아서 처리하는 클래스(데이터형 클래스)  ==> 캡슐화  ==> 변수를 저장하고 가져오는 기능만 가짐.
/*
 *  변수 : 읽기, 쓰기  = > 메소드화 처리
 * 
 * 
 * 
 * 
 백두산 (2019)

평점
6.7 /10
드라마/액션
한국 
2019.12.19 개봉 
128분, 12세이상관람가 
(감독) 이해준, 김병서 
(주연) 이병헌, 하정우, 마동석, 전혜진, 수지 
예매순위
예매 1위
누적관객 6,789,642명
예매하기
갤러리 
독점
대한민국 관측 역사상 최대 규모의 백두산 폭발 발생.
갑작스러운 재난에 한반도는 순식간에 아비규환이 되고,
남과 북 모두를 집어삼킬 추가 폭발이 예측된다.
 * 
 */

/*
 * static 변수들은 생성자 호출하지 않고(static은 자동저장. 객체를 생성하지 않고 그냥 .찍고 블러옴) static 블럭사용이 용이하고
 * 인스턴스변수는 주로 생성자{}를 사용함. than 인스턴스 블럭{}
 * 
 * 
 * 
 * 
 */

public class MovieVO {
	// 생성자를 만들때 값을 따로 주지 않고 선언만 해서 객체를 만드는 이유는 초기값을 계속 객체가 가져가기 때문이다.
	// 여기 클래스 에서만 사용가능하므로 getter/setter를 사용할 것임. ==> sourse! => select all!
	// 통으로 저장, 통으로 읽기
	
	private String title;
	private double score;
	private String genre;
	private String regdate;
	private int time;
	private String grade;
	private String director;
	private String actor;
	private int showUser;
	private String story;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public int getShowUser() {
		return showUser;
	}
	public void setShowUser(int showUser) {
		this.showUser = showUser;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}

	
	
	
	
	
}
