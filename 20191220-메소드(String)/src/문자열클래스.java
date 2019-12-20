import java.util.Scanner;

/*
 *   String = ���ڿ��� �����Ҷ� ���
 *   
 *   java.lang ==> import ��������
 *   
 *   ���ڿ��� �����ϴ� ���
 *      1) String ������ = "Hello Java"; 
 *      2) String ������ = new String ('Hello Java') // ���� ���ڿ� => ������ ����
 *                      =====
 *                      ���ο� �޸𸮿� ������ �϶�.
 *                      
 *      
 *   String ���� �����ϴ� ��� 
 *   
 *   1) equals : ����� ���ڿ��� ������ ���θ� Ȯ��(true/ false)
 *               ID, PWD => �α���(��ҹ��� ����) 
 *    			 ���ڿ��� ( == )(X)
 *    
 *			String s = "Hello";  ==> s,s1 
 *			String s1 = "Hello";
 *			if(s == s1)  true  ==> ���ڿ���
 *			String s2 = new String("Hello")  ==> s2 - 
 *			if(s.equals(s2)) false!   ==> �ּҰ� ��
 *    			
 *    
 *       ==>  ����
 *          (������) boolean equals(String data)
 *            
 *   2) substring : ���ڿ��� �ڸ���  
 *      			Strings="01234567";
 *                  substring(3) ==> "34567" ==> ���� 3�ڸ��� ���ְ� �������� �����Ͷ�
 *                  String s="112��,15���̻������" 
 *                  substring(0,3) ==> "112"  --> �ᱹ 012�� �����Ͷ� ==> ���� 0,4�� �ϸ� 112���� �ǰ� ������ �ƴϱ� ������ ����.
 *                             ==
 *                             end-1
 *                             ex) Ȯ���ڰ� java�ΰ͸� �����Ͷ�.!
 *                             
 *    			    substring(int start)
 *   				substring(int start, in end)
 *   
 *   3) length : ���ڿ� ����
 *      String s=" Hello ȫ�浿"; -> 9 ��
 *      ex) �������Ҷ�, ���ڰ����� ���⶧!
 *      
 *            
 *   4) trim : �¿��� ���鹮�� ����
 *       String s=" Hello Java ";
 *       ==>s.length ==>12
 *       ===>s.trim().length ==>10  ==> �յ��� ��� ������ ����, �߰��� ������ ���� ����
 *       
 *       ex) ����ڷα��ν� spaceŰ �� --> �������ְ� -> ������� ���� ��������
 *            --> �޼ҵ�! ������ ������ trim�� ���.
 *           
 *       
 *   5) startsWith, endsWith :  �ΰ��� ���ÿ� ���� �ܾ ���Ե� ���ڸ� �����Ͷ�.
 *      (�ձ��ڷ� ã��)( ���ڸ��� ã��) 
 *       ==========  =========
 *      
 *       starsWith("�ڹ�")
 *       endsWith(" ")	
 *   
 *   
 *   
 *    	ex)�˻��� ���鶧 ���!
 *   
 *   
 *   6) indexOf, lastIndexOf(���� ���ϴ� �ܾ ���ڿ� ã����) : 
 *   	������ ��ġ(indexOf : �տ���, lastIndexOf: �ڿ���)
 *   	String s="hello java";
 *                0123456789
 *   	s.indexOf('a') ==> 7
 *   	s.lastIndexOf('a')  ==> 9  --> Ȯ���� ã����,
 *   
 *      ex) substring�� �Բ� ���� ����.
 *   
 *   7) split : 
 *      String s= "�̺���, ������, ������, ������, ����";
 *                 
 *      ,���� �߶� �迭�� ��������.
 *      
 *      String[] name = s.split(",");  , ���� �ڸ�
 *      String[] name = s.split(" "); ���� ���� �ڸ�
 *      ���Խ� --> �������� ���� ���� �� ã�ƶ�
 *      ====
 *      211.238.142.181
 *      211.238.142.1
 *      211.238.142.23
 *      211.238.142.0
 *      211.238.1.1 
 *      [0-9] {1,3}\\. [0-9] {1,3}\\. [0-9] {1,3}\\. [0-9] {1,3} ==> �������� ��.
 *      ���� 0���� 9 ���̿� 1�ڸ����� 3�ڸ����� �ִ�.
 *   
 *       \\�߰� .���� ã��?
 *   
 *   8) toUpperCase, toLowerCase : 
 *      �빮�ڷ� ��ȯ      �ҹ��ڷ� ��ȯ
 *      
 *      String s="Hello";
 *      s.toUpperCase() ==> HELLO
 *      s.toLowerCase() ==> hello
 *      
 *      
 *   9) replace, replaceAll : 
 *      ======   ============> �ڿ��� ���Խ� ����.
 *       		String s="113��"
 *       		s.replaceAll("[^0-9]","") ==>113
 *                             =====
 *                             ��� ����
 *              s.replaceAll("^[0-9]","") ==> �ٱ��� ^ ���� ~�����ϴ� ��� ��! 
 *              s.replaceAll("^[0-9]$","") ==> ~�� ������ ��� ����!
 *              s.replaceAll("[^��-�R]","")   ==> �ѱە��� �� ������
 *              s.replaceAll("[^A-Za-z]","")  ==> �������� �� ������
 *      
 *      
 *      
 *      
 *       ���� ==> String s="Hello Java"
 *               s.replace('a','b') ==> Hello jbvb
 *                         ========
 *                         ��� a�� b�� �ٲٽÿ�!
 *
 *	10) contains() : ���ڿ� �ȿ� ���Ե� ���ڸ� ã�� ��� 
 *  			
 *                 	 
 *
 *
 */
// �˻� �ڵ��ϼ���ɰ� ����ϰ� �˻��ϸ� ���� �ܾ� ��� ã�ƿ��� �����
public class ���ڿ�Ŭ���� {

	
	static String[] autoComplate(String data)
	
	{
		
		String[] ss = 
			
			{
				
				"�ڹٿ� JSP","�ڹ� ���α׷���","������5","Ajax�� JSP","�������� ����Ʈ","�ڹ� ����Ŭ","MVC ����",
				"��Ʋ���� �ȵ���̵�","��Ʋ�� ���α׷�","������ ������","ȥ�ڹ��� �ڹ�","�������� ���α׷���","�����α׷�",
				"�ڹ� �����α׷�","����Ŭ �ڹ�"
	        };
		
		String[] findData = new String[10];
		int j = 0;
		for(int i =0; i<ss.length; i++)
		{
			
			if(ss[i].contains(data))  // data�� ���Ե� ��� ���ڸ� ã�ƶ�.
			//if(ss[i].startsWith(data))  // data�� �����ϴ� ���ڸ� ã�ƶ�.
			{
				
				findData[j] = ss[i];
				j++;
				
			 }
		}
		return findData;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�˻��� �Է�: ");
		String data = scan.next();
		
		String[] fd = autoComplate(data);
		for(int i = 0; i<fd.length; i++)
		{
			
			if(fd[i] != null)
			{
				
				System.out.println(fd[i]);
			}
			
		}
		
		
		
	}

}
