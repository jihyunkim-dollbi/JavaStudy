package 데이터저장;

public class 변수문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String 요리사="Travel HEY";
	    String 제목="먹어도 맛있는 수육";
	    String 소제목="\"잡내없이 삶는 팁\"";
	    int 량=4;
	    String 시간="60";
	    String 난이도1="아무나";
	    
	    
	    /*
	     * 
	     * 1) "    출력 =>     \"  \"  앞뒤로 붙이기  => 인용부호
	     * 2) 다음줄 출력 => \n  =>  new line
	     * 3) 일정간격  =>  \t     =>   tab
	     * 
	     * 
	     */
        System.out.println("a"+"\n");
        
	    
	    System.out.println("Chef:"+요리사);
	    System.out.println("Title:"+제목);
	    System.out.println("Subtitle:"+소제목);
	    System.out.println("인분:"+량+"명\t");
	    System.out.println("소요시간:"+시간+"분\t");
	    System.out.println("난이도\t:\t"+난이도1);
	    
	}

}
