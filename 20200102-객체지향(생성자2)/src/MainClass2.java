// ����Ŭ������ ��Ÿ �ٸ� Ŭ������ �ݵ�� �ٸ� java ���Ϸ� �����. �� ���Ͽ� �� Ŭ������ �����. 
// ĸ��ȭ �ڵ�


/*
 *    	1. �������� �ʱ�ȭ�� �� �ִ� ���
 *      	= ������(�ѹ� �ʱ�ȭ �ϸ� ���� �Ұ���->(���� �����ؾ� �ϴ� ��� ����Ѵ�.) �����ڸ� �� ������ �ϴµ� ..new�� ����� �ּҰ��� ��� �޶���)
 *          = setter(���ϸ� �������� ���� ���� ����)
 * 
 *  	
 * 
 */
class Music{   
	
  public Music(int mno, String title, String singer) { 
	  
	  // ������ ����=> ������ Ŭ��=> source => constructor using field.
      // Ư���� ���(�����쿡�� �ϴ� ȭ�� ��½�..etc)�� �ƴ� �̻� setter�� �̿��Ѵ�. 
        super();
		this.mno = mno;
		this.title = title;
		this.singer = singer;
	}
  
  
  
//	Movie m = new Movie(); //==> ���� src ������ �ֱ⶧���� public���� ���߾ �����ü� �ִ�. �� �۷������Ͽ� �Ѱ��� public�� �Ͽ�ȴ�.

  	private int mno;  
  	private String title;
  	private String singer;
  	
  	
  	//�����ʹ� ���߾����� ������ �б� ���� ��� ��������. �����͸� ���߰� �޼ҵ带 ���ؼ� �����͸� �а� ���Ⱑ ��������.
  	// ������ Ŭ�� = >SOURCE => GET/SET => ���� Ŭ��.

  	// ��� �޼ҵ�� public .. 
  	
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

		Music music = new Music (100, "���� ���� ���ο���", "�ٺ�ġ");
		//private �������̶� getter, setter
		
	/*	
		//����- ���� ��
		music.setMno(100);
		music.setTitle("���� ���� ���ο���");
	    music.setSinger("�ٺ�ġ");
		*/
		
		
	   //�б�
	    System.out.println(music.getMno());
	    System.out.println(music.getTitle());
	    System.out.println(music.getSinger());
	    
	    //���� ���� ��� �����=> ���ο� �ּҰ��� �������.
	    // ����, setter�� �̿��ؼ� ���� ��� ������ϴ�.
	    music = new Music (100, "���� ���� ���ο���", "�ٺ�ġ1");
	    		
	}

}
