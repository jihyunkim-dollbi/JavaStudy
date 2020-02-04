package com.sist.music;
// ����Ŭ ����
import java.sql.*;
import java.util.*;
//�ڵ������� ���� MAX�Լ��� ��� ����! 


public class MusicDAO {

	private Connection conn; /// ����Ŭ ����
	private PreparedStatement ps; // sql���� ����
	
	// SELECT , INSERT, UPDATE, DELETE ==> ����Ŭ���� �ڵ� VS �ڹٿ��� SQL ���� �����
	// ���� ���� �ٸ�
	// SELECT * FROM emp WHERE ename LIKE '%A%'; (X) --> ����Ŭ ������ �ڹٿ��� �״�� ��� X
	// SELECT * FROM emp WHERE ename LIKE '%'||A||'%' (O) --> �ڹٿ��� �̷��� �ؾ� ��� ����!
	
	
	// �������� �ּ� �ʿ�
	private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	
	//����̹� ���
	public MusicDAO()
	{
		try 
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//���÷��� ���! ==> Ŭ������ �̸��� �о�ͼ� �޸� �Ҵ�
		//new �ʿ���̵�, class.forname ==> ����Ŭ ����̹��� �޸� �Ҵ�. ==> spring ���� class���Ӹ� �Ѱ��൵ �޸� �Ҵ� ��
		//��ü . ���ʿ���� �ش� Ŭ���� ���� ��� �޼ҵ带 ����� �� �ֵ�.
		
			
		}catch(Exception ex) 
		{
			
		ex.printStackTrace();	
			
		}
		
		
	}
	
	//����
	public void getConnection()
	{
		
		try
		{
		
			conn=DriverManager.getConnection(URL, "hr", "happy");
			
			
		}catch(Exception ex) {}
		
	}
	
	
	//����
	public void disConnection()
	{
		
		try
		{
			if(ps!=null) ps.close();
			if(conn!=null) conn.close();
			
			
		}catch(Exception ex) {}
		
	}
	
	
	
	//���1 ==> ���� - AUTOCOMMIT(FALSE) ����Ŀ���̶� �ٷιٷ� �����. ==> ���� ����Ŀ���� ����? �ϰ� ���α׷��� ¥����!!
	
	public void musicInsert(MusicVO vo) 
	{
		// vo�Ѱ��� ����=> ���پ� �� ����!!
		// insert�� �ѹ��� ���پ� for������ ���ʷ� �־���??
		// 1 insert, 1 ������(1 vo)
		
		
		
		try 
		{
			//����
			getConnection();
			// ����
			String sql = "INSERT INTO music_genie VALUES("   // music_genie = *   music_genie(mno)
						+"(SELECT NVL(MAX(mno)+1, 1) FROM music_genie),?,?,?,?,?,?,?,?)"; // SUBQUERY
			// (SELECT NVL(MAX(mno)+1, 1) FROM music_genie) ���������� ���� ���� ����ȴ� => ����� �޾Ƽ� �������� �����
			// INSERT INTO music_genie VALUES(        )
			// mno)+1 = null+1�� null ==> null���϶� 1�� �ʱ�ȭ�ض�..
			ps=conn.prepareStatement(sql);
			// insert int ������!!
			// �̸� ������ ����� ���� ���߿� �Ʒ��� ���� ä�￹��
			
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
			// 1���� ù��° ? 2���� �ι�° ?
			// ���� �����Ͽ� ä���.
			ps.setInt(1, vo.getRank());
			ps.setString(2, vo.getTitle());  // set(String)�� �� ������ �ڵ����� ? �յڷ� '' �ٿ��ش�. ���ڴ� x! ���� ���ڴ� �ݵ�� String���� �ؾ��Ѵ�.
			ps.setString(3, vo.getSinger());
			ps.setString(4, vo.getAlbum());
			ps.setString(5, vo.getPoster());
			ps.setInt(6, vo.getIdcliment());
			ps.setString(7, vo.getState());
			ps.setString(8, vo.getKey());
			
			
			//����Ŭ ���� ��û!
			//COMMIT �Լ� ���Ե�
			ps.executeUpdate();
			
			
			
			
		}
		catch(Exception ex) 
		{
			
			ex.printStackTrace(); // ����?
			
		}
		finally
		{
			//�Ź� insert�� ���� 
			// ��¶�� �Ź� �ݾƾ���!!
			disConnection();
			
		}
		
		
		
	}
	
	
	
	
	
	
}
