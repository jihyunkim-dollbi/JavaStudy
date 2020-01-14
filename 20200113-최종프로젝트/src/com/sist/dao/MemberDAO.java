package com.sist.dao;
/*
 * 1. �����͸����� Ŭ����
 * 2. ������ �����ϴ� �Լ��� ���� THIS CLASS
 *  - ����Ŭ ����
 */
import java.sql.*;


public class MemberDAO {

	private Connection conn; //����Ŭ ���� => Socket
	private PreparedStatement ps; // BuffferedReader, OutputStream
	private final String URL="jdbc:oracle:thin:@localhost:1521:XE";   // �����̰Ϳ� ����.
	//����Ŭ ���� �ּ�
	// 1. ����̹� ��� => �����ڿ��� �ѹ��� ����
	public MemberDAO()
	{
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
		}catch(Exception ex) {
			
			System.out.println(ex.getMessage());
			
		}
		
		
	}
	// 2. ����-����
	public void getConnection()
	{
		try
		{
			conn = DriverManager.getConnection(URL, "hr", "happy"); //��������, �н����� conn hr/happy
			
			
		}catch(Exception ex) {}
		
		
	}
	// 3. ��������-�ݱ�-finally����..
	public void disConnection()
	{
		try
		{
			if(ps !=null) ps.close();
			if(conn != null) conn.close();  //���� ���� ������ ��� Ŀ�ؼ��� ���� �� �ִ�. �ݵ�� ���� �ݰ� ������Ѵ�.
			//exit
			
		}catch(Exception ex) {}
		
		
	}
	// 4. ���ó��
	public String isLogin(String id, String pwd)
	{
		String result = "";
		try
		{
			//����
			getConnection();
			//����Ŭ�� ��û
			String sql = "SELECT COUNT(*) FROM member WHERE id=?";
			// ���̵��� ������ �?  0=> ���̵� Ʋ���Ű� 1=> ���̵� ���� ==> ������ ���� 
			ps=conn.prepareStatement(sql); //����Ŭ�� ����
			// ?�� ���� ä���
			ps.setString(1, id);
			//�����û
			ResultSet rs=ps.executeQuery(); //rs�� ���� ������ ����.
			rs.next(); //���� �����ġ�� Ŀ���� �ø��� => 
			int count=rs.getInt(1); // 1����ġ�� id ,2 - pwd ,3 - �̸�, 4 - sex // ����number��(���� +�Ǽ�)-INT, DOUBLE , ���ڿ� -VARCHAR , DATa? 3������ ����Ѵ�.
			rs.close();
			
			// 3���� ����� �� 
			if(count==0)
			{
				result="NOID";
				
			}
			else
			{
				//��û // * ��� ���� �����ö�?   // ?=> ���߿� ���� ä��ڴ�...
				sql="SELECT * FROM member WHERE id=?";
				ps=conn.prepareStatement(sql);
				ps.setString(1, id); // �������� ?�� ���� ä���
				rs=ps.executeQuery(); //����
				rs.next(); //Ŀ�� ��ġ ����
				
				//���� �޴´�
				String mid=rs.getString(1);
				String mpwd=rs.getString(2);
				String name=rs.getString(3);
				String sex=rs.getString(4);
				
			//	System.out.println(name);
				
				rs.close();
				
				
				if(mpwd.equals(pwd))
				{
					//�α��� ����
					result=id+"|"+name+"|"+sex;
					//StringTokenizer�� �ڸ���
					
				}
				else
				{
					//��� Ʋ������
					result="NOPWD";
				}
				
				/*// ���ڿ� ���ڿ� ���̿��� ���� ����ǥ �־����
				 * String name="";
				 * String sex="";
				 * String id="";
				 * int age=10;
				 * VARCHAR - CHAR
				 * sql="INSERT INTO member VALUES('"+name+"','"+sex+"','"+id+'","+age+")"
				 * 
				 * sql="INSERT INTO member VALUES(?,?,?,?)"  ==> prepared statement==> sql������ ����� ���� ���߿� ä��ڴ�. 
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
