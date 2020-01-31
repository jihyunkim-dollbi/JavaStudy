package com.sist.movie;
/*
 * 1) 드라이버 등록 ==> Class.forName("oracle.jdbc.driver.OracleDriver"); => 오라클에서 다운로드(ojdbc6.jar)
 * 
 * 2) 오라클 연결 ==> Connection
 * 					==>getConnection(URL, username, password)
 * 					==> conn hr/happy
 * 3) 기능처리 => SQL 
 * 			=> SQL 문장을 오라클에 전송==> Statement class
 * 				1. executeUpdate() ==> 데이터만 갱신(변경 INSERT, UPDATE, DELETE)할때 ==> COMMIT()해야함
 * 				리턴형 ResultSet 2. executeQuery() ==> SELECT 할때 ==> AUTOCOMMIT 
 * 4) 오라클 해제 => close()
 * 
 * myBtis => 데이터연결..프로그램..
 *  
 *  Statement))
 * 	String sql="INSERT INTO movie VALUES("+mno+",'"+title+"',"+score+",'"+genre+"','"+regdate+"','"+time+"'...)"; 안에 쿼리를 넣고 값을 전송함.
 *  
 *  PreparedStatement))
 *  String sql="INSERT INTO movie VALUES(?,?,?,?,?,?...)";
 *  
 *  
 * 
 * 
 */

import java.util.*;



import java.sql.*;
 
public class MovieDAO { //오라클에 연결하는 클래스 

	
	
	private Connection conn; // Socket들어있음 
	private PreparedStatement ps;// 보낼때, OutputStream 들어가있음, 읽을때 BufferedReader들어있음, 값을 주고 받을때 필요함.
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE"; //XE안에 모든 테이블 // 주소..
	
	//DAO ->1목록출력- arraylist 2.상세보기 vo 3. 수정, 추가 , 삭제-
	//드라이버 등록 -> 한번만 수행
	
	public MovieDAO() {
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 
				
		}catch(Exception ex) 
		{
			ex.printStackTrace();
			
		}
		
	}
	
	//오라클 연결
	
	public void getConnection(){
		
		
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
			
		}catch(Exception ex) {}
		
		
	}
	
	//오라클 해제
	
	public void disConnection()
	{
		
		try
		{
			
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			
			
		}catch(Exception ex) {}
		
		
	}
	
	
	
	//기능 처리 => 추가 ==> CURD 
	
	public void movieInsert(MovieVO vo) { // 모든 데이터가 들어감 // 들어가고 나올때마다 처리해줌..
		
		try
		{
			
			//열기
			getConnection();
			String sql="INSERT INTO movie VALUES(" // 무비 테이블 안에 한줄만 넣어라..insert한 문장 한 줄 ==> for문으로 돌림.
					+"(SELECT NVL(MAX(mno)+1,1) FROM movie),?,?,?,?,?,?,?,?,?,5)"; // 번호 중복 방지를 위함.
			// 1번 현재상영작
			//2번 상영예정작
			// 하나씩 저장해고 바꿔도 됨
			//,?,?,?,?,?,?,?,?,?,1 ==> 9개의 값
			// 컬럼 type -  현재상영 에 있는 모든 자료의 type은 1,  주간-3 월간-4 년간-5
			
			// 뉴스 페이지 출력은 또 따로 잡아서 모아야함..
			//날짜 테이블, 극장정보 테이블, 등등  다른 테이블로 만들고..예약을 하기위해 join하여 여러 테이블 사용.
			
			
			//NVL(MAX(mno)+1,1) (null값이면,---로 값을 바꾸어라)
			// 따라서 mno의 최댓값에 1을 더한값이 null이면 1로 값을 바꾸어라
			// null값일때만 1로 변환되고 그 이후에 값이 있는 경우는 nvl함수는 적용이 안된다.
			// mno의 최댓값-null값에 1을 더해줌, 1은 처음에 값을 줌.. 1씩 증가하게..
			
		
			
			//보내기
			ps=conn.prepareStatement(sql); // 이 다음에 반드시 값을 아래와 같이 줘야한다.
			/*
			 * private String title;
				private double score;
	private  String genre;
	private String regdate;
	private String time;
	private String grade;
	private String director;
	private String actor;
	private String story;
			 * 
			 * 
			 */
		
			
			ps.setString(1,vo.getTitle());
			ps.setDouble(2,vo.getScore());
			ps.setString(3,vo.getGenre());
			ps.setString(4,vo.getRegdate());
			ps.setString(5,vo.getTime());
			ps.setString(6,vo.getGrade());
			ps.setString(7,vo.getDirector());
			ps.setString(8,vo.getActor());
			ps.setString(9,vo.getStory());
			// ?의 값을 여기서 줌.
			
			
			
			
			
			
			
			
			ps.executeUpdate();
			
			
			
		}
		catch(Exception ex) 
		{
			ex.printStackTrace(); //복구
			
		}finally
		
		{	
			//닫기
			disConnection();
			
		}
		
		
	}
	
	
	
}
