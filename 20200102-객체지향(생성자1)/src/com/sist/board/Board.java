package com.sist.board;   // 패키지를 만들어서 어느 폴더에 클래스가 들어가 있는지 알수 있음.(분업화 기능, 기능별로 나눌수 있다.)==> 게시판 클래스로 만들것임.
/*
 * java. 
 * javax.
 * src에 있을땐 같은 class로 취급되어 import를 할 수 없다.
 * 따라서 src안에 패키지를 만들어 패키지에서 패키지로 클래스를 재사용할때는  import할 수 있다.
 * 
 * 따라서 모든 메소드는 public=> 조립할것임., 모든 데이터는 private 으로 할 것임.
 * 
 * public getter - 변수값 가져올떄  ==> getId => 
 * public setter - 변수값을 지정할떄 ==> setId => Id를 저장해라
 * 
 * private변수는 반드시 메소드를 이요해서 가져올 수 있다. get(), set() ==> 다른 클래스에서 갖다 쓸때,
 * ==> 캡슐화 코딩! = > 데이터는 감추고=> 메소드를 이용해서 데이터를 주고 받는!
 * 
 * 변수를 잡을떈, 주로 private or default로 잡는다.
 * 생성자, 메소드 => public으로 잡는다.
 * 
 * 
 * 
 */

public class Board {
	
	// 맴버변수, 전역변수
	int no;
	String name;
	String regdate;   // 디폴트 변수 ==> 같은 폴더안에서만 가능. ==> 인스턴스 변수? 
	
	// 생성자1
	public Board(int no, String name, String regdate) // 지역변수들.
	{	
		this.no=no; // ==> int no; 에 값을 대입하겠다는 의미. no 전역변수를 사용가능함.
		this.name=name;
		this.regdate=regdate;	
	}
	
	public Board() // 지역변수들.
	{	
	
		System.out.println("jello");
		
	}
	
	
	// 메소드1
	public void boardList()  // public으로 클래스를 만들어야 다른 클래스에서 사용 가능하다. 
	{
		System.out.println("번호: " + no);
		System.out.println("이름: " + name);
		System.out.println("등록일: " + regdate);
	}

}
