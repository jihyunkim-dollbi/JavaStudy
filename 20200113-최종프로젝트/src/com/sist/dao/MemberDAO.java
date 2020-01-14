package com.sist.dao;
/*
 * 1. 데이터모으는 클래스
 * 2. 데이터 연결하는 함수들 모음 THIS CLASS
 *  - 오라클 연결
 */
import java.sql.*;


public class MemberDAO {

	private Connection conn; //오라클 연결 => Socket
	private PreparedStatement ps; // BuffferedReader, OutputStream
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";   // 재혁이것에 연결.
	//오라클 연결 주소
	// 1. 드라이버 등록 => 생성자에서 한번만 수행
	public MemberDAO()
	{
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
		}catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			
		}
		
		
	}
	// 2. 연결-열기
	public void getConnection()
	{
		try
		{
			conn = DriverManager.getConnection(URL, "hr", "happy"); //유저네임, 패스워드 conn hr/happy
			
			
		}catch(Exception ex) {}
		
		
	}
	// 3. 연결해제-닫기-finally에서..
	public void disConnection()
	{
		try
		{
			if(ps !=null) ps.close();
			if(conn != null) conn.close();  //열고 닫지 않으면 계속 커넥션이 끊길 수 있다. 반드시 열고 닫고 해줘야한다.
			//exit
			
		}catch(Exception ex) {}
		
		
	}
	// 4. 기능처리
	public String isLogin(String id, String pwd)
	{
		String result = "";
		try
		{
			//연결
			getConnection();
			//오라클에 요청
			String sql = "SELECT COUNT(*) FROM member WHERE id=?";
			// 아이디의 개수가 몇개?  0=> 아이디가 틀린거고 1=> 아이디가 맞음 ==> 갯수를 통해 
			ps=conn.prepareStatement(sql); //오라클로 전송
			// ?에 값을 채운다
			ps.setString(1, id);
			//실행요청
			ResultSet rs=ps.executeQuery(); //rs가 값을 가지고 있음.
			rs.next(); //실제 출력위치에 커서를 올리기 => 
			int count=rs.getInt(1); // 1번위치는 id ,2 - pwd ,3 - 이름, 4 - sex // 숫자number형(정수 +실수)-INT, DOUBLE , 문자열 -VARCHAR , DATa? 3가지만 취급한다.
			rs.close();
			
			// 3개의 경우의 수 
			if(count==0)
			{
				result="NOID";
				
			}
			else
			{
				//요청 // * 모든 정보 가져올때?   // ?=> 나중에 값을 채우겠다...
				sql="SELECT * FROM member WHERE id=?";
				ps=conn.prepareStatement(sql);
				ps.setString(1, id); // 실행전에 ?에 값을 채운다
				rs=ps.executeQuery(); //실행
				rs.next(); //커서 위치 변경
				
				//값을 받는다
				String mid=rs.getString(1);
				String mpwd=rs.getString(2);
				String name=rs.getString(3);
				String sex=rs.getString(4);
				
			//	System.out.println(name);
				
				rs.close();
				
				
				if(mpwd.equals(pwd))
				{
					//로그인 상태
					result=id+"|"+name+"|"+sex;
					//StringTokenizer로 자르기
					
				}
				else
				{
					//비번 틀린상태
					result="NOPWD";
				}
				
				/*// 숫자외 문자열 사이에는 작은 따옴표 주어야함
				 * String name="";
				 * String sex="";
				 * String id="";
				 * int age=10;
				 * VARCHAR - CHAR
				 * sql="INSERT INTO member VALUES('"+name+"','"+sex+"','"+id+'","+age+")"
				 * 
				 * sql="INSERT INTO member VALUES(?,?,?,?)"  ==> prepared statement==> sql문장을 만들어 놓고 나중에 채우겠다. 
				 * 
				 */
			}
			
			
			
		}catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			
		}finally
		{
			disConnection();
			
		}
		return result;
		
		
		
	}
	
	
	
	
}
