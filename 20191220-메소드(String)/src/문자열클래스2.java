

// ++ equals ==> return �� --> (boolean)  // boolean���� �����ϸ� ���� �޼ҵ����  "is"�� �����Ѵ�.!
/*    ����� ���ڿ��� ������ Ȯ��!
 * 		ex) ���â���� ��밡��!
 * 
 * 
 *     equals : ��ҹ��� ���� ��!
 *     equalsIgnoreCase : ��ҹ��� �� ����!
 * 
 *     startsWith : ���۹��ڿ��� ���� ���(true)
 *     endWith : ������ ���ڿ��� ���� ���(true)
 * 	   contains : ���忡 ���ڿ��� ���ԵǾ�����(true)  ���� ���� �� ã�� �Ҷ�!
 *     ex) ������.contains! �� ���ڿ� ã��
 *     
 *     ���� ������ ���ڿ��� ���� �Ѿ�´�!!!!
 *  
 *     static & public  =>  
 *     final => 
 *  
 *     
 * �α��� �ϱ�! true false Ȯ���ϱ�
 */
import java.util.Scanner;
public class ���ڿ�Ŭ����2 {
	
	
	static boolean isLogin(String id, String pwd)
	{
	 //	Integer.MAX_VALUE  ==> F ����� == �빮�� max& min �� �ϱ�! ==> final class! ���� ����!
	 //	Byte.MAX_VALUE ==> ��� ! 
		boolean bCheck = false;
	    final String ID = "admin";
		final String PWD = "1234";
		
		
		
		if(id.equalsIgnoreCase(ID) && pwd.equals(PWD))  //==> ��ҹ��� ���о��� ��!!
		//if(id.equals(ID) && pwd.equals(PWD))    //==> ��ҹ��� ������!
			// �̹����� �����ϸ� return ���� �����ϴ� ��! ����Ʈ�� ��Ƽ� else�� ��� ����.
		{
			bCheck = true; 
			
		}
		
		return bCheck;
	}
	
	static void process()   
	{
		
		Scanner scan = new Scanner(System.in); // while�� ���ʿ��� ���� ���������� ��� �ݺ��������. 
		
		while(true)
		{
			
			System.out.print("ID�� �Է�: ");
			String id = scan.next();
			System.out.print("��й�ȣ �Է�: ");
			String pwd = scan.next();
			
			boolean bCheck = isLogin(id,pwd);
			
			if(bCheck == true)
			{
				System.out.println(id + "�� �α��� �Ǿ����ϴ�.");
				break;
			}
			
			else
			{
				
				System.out.println("���̵� �н����尡 Ʋ���ϴ�. \n �ٽ� �Է����ּ���!");
				
			}
			
		}
	}
	
	public static void main(String[] args) {      // ������ ��� ���α׷��� ù��° Thread!!
		// TODO Auto-generated method stub

		//System.out.println(Thread.currentThread());  // ���� ������� ������� ����? 
		process();
		
	}

}
