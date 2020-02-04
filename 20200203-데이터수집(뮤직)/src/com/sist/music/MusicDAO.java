package com.sist.music;
// 오라클 연결
import java.sql.*;
import java.util.*;
//자동증가를 위해 MAX함수를 사용 예정! 


public class MusicDAO {

	private Connection conn; /// 오라클 연결
	private PreparedStatement ps; // sql문장 전송
	
	// SELECT , INSERT, UPDATE, DELETE ==> 오라클에서 코딩 VS 자바에서 SQL 문장 만들기
	// 둘이 조금 다름
	// SELECT * FROM emp WHERE ename LIKE '%A%'; (X) --> 오라클 쿼리는 자바에서 그대로 사용 X
	// SELECT * FROM emp WHERE ename LIKE '%'||A||'%' (O) --> 자바에서 이렇게 해야 사용 가능!
	
	
	// 연결위해 주소 필요
	private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	
	//드라이버 등록
	public MusicDAO()
	{
		try 
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//리플렉션 기능! ==> 클래스와 이름을 읽어와서 메모리 할당
		//new 필요없이도, class.forname ==> 오라클 드라이버에 메모리 할당. ==> spring 에서 class네임만 넘겨줘도 메모리 할당 됨
		//객체 . 할필요없이 해당 클래스 안의 모든 메소드를 사용할 수 있따.
		
			
		}catch(Exception ex) 
		{
			
		ex.printStackTrace();	
			
		}
		
		
	}
	
	//연결
	public void getConnection()
	{
		
		try
		{
		
			conn=DriverManager.getConnection(URL, "hr", "happy");
			
			
		}catch(Exception ex) {}
		
	}
	
	
	//해제
	public void disConnection()
	{
		
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			
			
		}catch(Exception ex) {}
		
	}
	
	
	
	//기능1 ==> 저장 - AUTOCOMMIT(FALSE) 오토커밋이라 바로바로 저장됨. ==> 따라서 오토커밋을 해제? 하고 프로그램을 짜야함!!
	
	public void musicInsert(MusicVO vo) 
	{
		// vo한개가 한줄=> 한줄씩 들어갈 예정!!
		// insert는 한번에 한줄씩 for믄으로 차례로 넣어줌??
		// 1 insert, 1 데이터(1 vo)
		
		
		
		try 
		{
			//열기
			getConnection();
			// 전송
			String sql = "INSERT INTO music_genie VALUES("   // music_genie = *   music_genie(mno)
						+"(SELECT NVL(MAX(mno)+1, 1) FROM music_genie),?,?,?,?,?,?,?,?)"; // SUBQUERY
			// (SELECT NVL(MAX(mno)+1, 1) FROM music_genie) 서브쿼리는 가장 먼저 수행된다 => 결과값 받아서 메인쿼리 수행됨
			// INSERT INTO music_genie VALUES(        )
			// mno)+1 = null+1은 null ==> null값일때 1초 초기화해라..
			ps=conn.prepareStatement(sql);
			// insert int 까지만!!
			// 미리 문장을 만들어 놓고 나중에 아래서 값을 채울예정
			
		/*
		    private int rank;
			private String title;
			private String singer;
			private String album;
			private String poster;
			private int idcliment;
			private String state;
			private String key;

		 */
			// 1번이 첫번째 ? 2번이 두번째 ?
			// 값을 전송하여 채우기.
			ps.setInt(1, vo.getRank());
			ps.setString(2, vo.getTitle());  // set(String)을 준 이유는 자동으로 ? 앞뒤로 '' 붙여준다. 숫자는 x! 따라서 문자는 반드시 String으로 해아한다.
			ps.setString(3, vo.getSinger());
			ps.setString(4, vo.getAlbum());
			ps.setString(5, vo.getPoster());
			ps.setInt(6, vo.getIdcliment());
			ps.setString(7, vo.getState());
			ps.setString(8, vo.getKey());
			
			
			//오라클 실행 요청!
			//COMMIT 함수 포함됨
			ps.executeUpdate();
			
			
			
			
		}
		catch(Exception ex) 
		{
			
			ex.printStackTrace(); // 복구?
			
		}
		finally
		{
			//매번 insert후 닽고 
			// 어쨋드 매번 닫아야함!!
			disConnection();
			
		}
		
		
		
	}
	
	
	
	
	
	
}
