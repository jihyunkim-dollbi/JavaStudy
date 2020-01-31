package com.sist.movie;
/*
 * 1) ����̹� ��� ==> Class.forName("oracle.jdbc.driver.OracleDriver"); => ����Ŭ���� �ٿ�ε�(ojdbc6.jar)
 * 
 * 2) ����Ŭ ���� ==> Connection
 * 					==>getConnection(URL, username, password)
 * 					==> conn hr/happy
 * 3) ���ó�� => SQL 
 * 			=> SQL ������ ����Ŭ�� ����==> Statement class
 * 				1. executeUpdate() ==> �����͸� ����(���� INSERT, UPDATE, DELETE)�Ҷ� ==> COMMIT()�ؾ���
 * 				������ ResultSet 2. executeQuery() ==> SELECT �Ҷ� ==> AUTOCOMMIT 
 * 4) ����Ŭ ���� => close()
 * 
 * myBtis => �����Ϳ���..���α׷�..
 *  
 *  Statement))
 * 	String sql="INSERT INTO movie VALUES("+mno+",'"+title+"',"+score+",'"+genre+"','"+regdate+"','"+time+"'...)"; �ȿ� ������ �ְ� ���� ������.
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
 
public class MovieDAO { //����Ŭ�� �����ϴ� Ŭ���� 

	
	
	private Connection conn; // Socket������� 
	private PreparedStatement ps;// ������, OutputStream ������, ������ BufferedReader�������, ���� �ְ� ������ �ʿ���.
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE"; //XE�ȿ� ��� ���̺� // �ּ�..
	
	//DAO ->1������- arraylist 2.�󼼺��� vo 3. ����, �߰� , ����-
	//����̹� ��� -> �ѹ��� ����
	
	public MovieDAO() {
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); // ����̹� 
				
		}catch(Exception ex) 
		{
			ex.printStackTrace();
			
		}
		
	}
	
	//����Ŭ ����
	
	public void getConnection(){
		
		
		try
		{
			conn=DriverManager.getConnection(URL,"hr","happy");
			
		}catch(Exception ex) {}
		
		
	}
	
	//����Ŭ ����
	
	public void disConnection()
	{
		
		try
		{
			
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			
			
		}catch(Exception ex) {}
		
		
	}
	
	
	
	//��� ó�� => �߰� ==> CURD 
	
	public void movieInsert(MovieVO vo) { // ��� �����Ͱ� �� // ���� ���ö����� ó������..
		
		try
		{
			
			//����
			getConnection();
			String sql="INSERT INTO movie VALUES(" // ���� ���̺� �ȿ� ���ٸ� �־��..insert�� ���� �� �� ==> for������ ����.
					+"(SELECT NVL(MAX(mno)+1,1) FROM movie),?,?,?,?,?,?,?,?,?,5)"; // ��ȣ �ߺ� ������ ����.
			// 1�� �������
			//2�� �󿵿�����
			// �ϳ��� �����ذ� �ٲ㵵 ��
			//,?,?,?,?,?,?,?,?,?,1 ==> 9���� ��
			// �÷� type -  ����� �� �ִ� ��� �ڷ��� type�� 1,  �ְ�-3 ����-4 �Ⱓ-5
			
			// ���� ������ ����� �� ���� ��Ƽ� ��ƾ���..
			//��¥ ���̺�, �������� ���̺�, ���  �ٸ� ���̺�� �����..������ �ϱ����� join�Ͽ� ���� ���̺� ���.
			
			
			//NVL(MAX(mno)+1,1) (null���̸�,---�� ���� �ٲپ��)
			// ���� mno�� �ִ񰪿� 1�� ���Ѱ��� null�̸� 1�� ���� �ٲپ��
			// null���϶��� 1�� ��ȯ�ǰ� �� ���Ŀ� ���� �ִ� ���� nvl�Լ��� ������ �ȵȴ�.
			// mno�� �ִ�-null���� 1�� ������, 1�� ó���� ���� ��.. 1�� �����ϰ�..
			
		
			
			//������
			ps=conn.prepareStatement(sql); // �� ������ �ݵ�� ���� �Ʒ��� ���� ����Ѵ�.
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
			// ?�� ���� ���⼭ ��.
			
			
			
			
			
			
			
			
			ps.executeUpdate();
			
			
			
		}
		catch(Exception ex) 
		{
			ex.printStackTrace(); //����
			
		}finally
		
		{	
			//�ݱ�
			disConnection();
			
		}
		
		
	}
	
	
	
}
