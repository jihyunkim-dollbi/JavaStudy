// ~VO :  �����͸� ��Ƽ� ó���ϴ� Ŭ����(�������� Ŭ����)  ==> ĸ��ȭ  ==> ������ �����ϰ� �������� ��ɸ� ����.
/*
 *  ���� : �б�, ����  = > �޼ҵ�ȭ ó��
 * 
 * 
 * 
 * 
 ��λ� (2019)

����
6.7 /10
���/�׼�
�ѱ� 
2019.12.19 ���� 
128��, 12���̻������ 
(����) ������, �躴�� 
(�ֿ�) �̺���, ������, ������, ������, ���� 
���ż���
���� 1��
�������� 6,789,642��
�����ϱ�
������ 
����
���ѹα� ���� ����� �ִ� �Ը��� ��λ� ���� �߻�.
���۽����� �糭�� �ѹݵ��� ���İ��� �ƺ��ȯ�� �ǰ�,
���� �� ��θ� �����ų �߰� ������ �����ȴ�.
 * 
 */

/*
 * static �������� ������ ȣ������ �ʰ�(static�� �ڵ�����. ��ü�� �������� �ʰ� �׳� .��� ����) static ������� �����ϰ�
 * �ν��Ͻ������� �ַ� ������{}�� �����. than �ν��Ͻ� ��{}
 * 
 * 
 * 
 * 
 */

public class MovieVO {
	// �����ڸ� ���鶧 ���� ���� ���� �ʰ� ���� �ؼ� ��ü�� ����� ������ �ʱⰪ�� ��� ��ü�� �������� �����̴�.
	// ���� Ŭ���� ������ ��밡���ϹǷ� getter/setter�� ����� ����. ==> sourse! => select all!
	// ������ ����, ������ �б�
	
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
