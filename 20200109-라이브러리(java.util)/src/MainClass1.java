/*
 * StringTokenizer
 * ===============> ���ڿ� �����ٶ� ����ϴ� Ŭ����
 * 1) ��ü������ ����
 * 2) ���ڿ�(0)
 *   id|pw|avata
 *   == == =====> ��ū��! ���ڿ� ��� �ڸ�.
 *   
 *   split ���� => ���Խ� ���� �ڸ�.
 * 
 *    1.hasMoreTokens() - 'or �����' �𸦶� ������ŭ �߶���
 *    2.nextToken() - 
 *    
 *  
 *  
 *    
 *    
 *    
 *    
 * 
 */
import java.util.*;
class Info{
	
	String id;
	String name;
	String sex;
	String pwd;
	String addr;
	String tel;

}

public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String data = "admin|ȫ�浿|1234|����|����|1111-1111";
			
			StringTokenizer st = new StringTokenizer(data,"|");   // ,"|"
	/*
			String id = st.nextToken(); //ù��° admin�� �߸�
			String name = st.nextToken();
			String pwd = st.nextToken();
			String sex = st.nextToken();
			String addr = st.nextToken();
			String tel = st.nextToken();
			
			System.out.println("ID:" + id );		
			System.out.println("�̸�:" + name);
			System.out.println("PASSWORD:" + pwd);
			System.out.println("����:" + sex);
			System.out.println("Address:" + addr);
			System.out.println("��ȣ:" + tel);
		*/	
			Info info = new Info();
			
			while(st.hasMoreTokens())
			{
				System.out.println(st.nextToken());	
			}
	}

}
