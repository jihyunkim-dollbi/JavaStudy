//메소드만 갖고 있는 역할의 클래스
//데이터를 활용하는 클래스
//생성자 - 윈도우 처음(속도 빠름, DB를 거치지 않고 메모리에서 바로 가져옴.)부터 종료시까지 계속 값을 유지함.
/*
 * 변수 초기화
 * 
 *  
 * 모두  {}을 갖고 있어서 그 안에서 구현이 가능하다. 일반 클래스 안에서는 구현이 불가능하여 값을 읽을 수 없기때문에.
 * 
 * 1) 생성자 (그때그때 초기화 가능 ==> 그때 그때 객체를 만들면서 초기화해옴.)
 * 2) 초기화 블럭 -(딱 한번 초기화후에 계속 읽어들일 수 있다.) 인스턴스(일반멤버변수?) 변수에 대한 초기화 + {}, static 변수는 static + {} 를 해준다. 
 *              ==> static으로 한 개를 만들어 놓으면 객체를 더이상 생성할 필요 x
 *              
 *              static 변수는 static {} 안에 모두 초기값 주는 것 가능
 *              instance 변수는 instance {} 안에 모두 초기값 주는 것 가능
 *          
 * 3) setter(저장하되 내가 필요한 것만 낱게로 저장 가능)
 * 
 * 
 * 		
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */

public class MovieManager {

	public MovieVO[] movieAllData()
//        데이터형(class)=> MovieVO클래스를 배열 객체를 만듬
	{
		MovieVO[] vos = new MovieVO[3];	
		return vos; // 배열 객체 반환
	}
	
	public MovieVO movieDetailData(int index)
//        데이터형(class) ==> MovieVO 클래스를 이용한 메소드 => MovieVO 객체를 만듬.
	{
		MovieVO vo = new MovieVO();
		return vo;   // 객체 반환
	}
	
	
	
}
