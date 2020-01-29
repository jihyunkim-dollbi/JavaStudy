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
	private final String URL="jdbc:oracle:thin@localhost:1521:XE"; //XE안에 모든 테이블
	
	//DAO ->1목록출력- arraylist 2.상세보기 vo 3. 수정, 추가 , 삭제-
	//드라이버 등록 -> 한번만 수행
	
	public MovieDAO() {
		
		try
		{
			Class.forName("jdbc:oracle:thin@localhost:1521:XE");
				
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
	
	
	public void movieInser(MovieDAO vo) { // 모든 데이터가 들어감 // 들어가고 나올때마다 처리해줌..
		
		try
		{
			//열기
			getConnection();
			String sql="INSERT INTO movie VALUES("
					+"(SELECT NVL(MAX(mno)+1,1) FROM movie),";
			//NVL(MAX(mno)+1,1) (null값이면,---로 값을 바꾸어라)
			// 따라서 mno의 최댓값에 1을 더한값이 null이면 1로 값을 바꾸어라
			// mno의 최댓값-null값에 1을 더해줌, 1은 처음에 값을 줌.. 1씩 증가하게..
			//보내기
			ps=conn.prepareStatement(sql);
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
