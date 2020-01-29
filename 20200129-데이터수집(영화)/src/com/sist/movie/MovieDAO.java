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
	private final String URL="jdbc:oracle:thin@localhost:1521:XE"; //XE�ȿ� ��� ���̺�
	
	//DAO ->1������- arraylist 2.�󼼺��� vo 3. ����, �߰� , ����-
	//����̹� ��� -> �ѹ��� ����
	
	public MovieDAO() {
		
		try
		{
			Class.forName("jdbc:oracle:thin@localhost:1521:XE");
				
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
	
	
	public void movieInser(MovieDAO vo) { // ��� �����Ͱ� �� // ���� ���ö����� ó������..
		
		try
		{
			//����
			getConnection();
			String sql="INSERT INTO movie VALUES("
					+"(SELECT NVL(MAX(mno)+1,1) FROM movie),";
			//NVL(MAX(mno)+1,1) (null���̸�,---�� ���� �ٲپ��)
			// ���� mno�� �ִ񰪿� 1�� ���Ѱ��� null�̸� 1�� ���� �ٲپ��
			// mno�� �ִ�-null���� 1�� ������, 1�� ó���� ���� ��.. 1�� �����ϰ�..
			//������
			ps=conn.prepareStatement(sql);
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
