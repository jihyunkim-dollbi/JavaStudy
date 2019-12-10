/*
 * 
 * String : ���ڿ� ����, Ŭ������?
 * ======
 *   ���    ���ϴ� ������ ������ų� �����͸� �Է��Ҷ� ���ϰ� ����ϵ���. ���ڿ� ���͸� ��ɵ�. 
 *   
 *   1) ���ڿ��� �и�      substring()
 *   
 *   2) ���� ã��           indexof() �տ��� ã����, lastIndexof()
 *                   c:\javaDev\javaStudy
 *                   
 *   3) ���� ��            equals()   - ��ҹ��� ����
 *                   equalsIgnoreCase()   - ��ҹ��� ������ ���� ���
 *   
 *   4) ���� ���� ����      trim()
 *   
 *   5) ��ҹ��� ����       toUpperCase, toLowerCase
 *   
 *   6) ��� ���������� ���ڿ��� ���� valueof()
 *   
 *   7) ������ ����         length()
 *   
 *   8) ���� => replace() , replaceAll()

 * 
 * 
 * 
 *    String => char[ ] C���� ����!
 *    
 *    
 *    ��Ʈ���� ���� ä��� ��ŭ�� �޸𸮰��� ��������. 
 *    ��� Ŭ������ 4����Ʈ �޸𸮴�. �ּ��̱� ������. ��� �޼ҵ嵵. �ּҸ� �����.
 */
public class ���ڿ����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String s=" Hello Java!! ";   //���鵵 ���ڴ� ���� 12�� ����
               // 012345678910111213
		System.out.println("���ڼ�:"+s.length());
		//                           ========
		//                           �޼ҵ�
		System.out.println(s.substring(0,9));   // 9�� ����. endindex�� ���ܵ�
		System.out.println(s.replace("l","k")); // s�� ���� ~�ض�
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());     // ������ �״�� �ְ�,����Ҷ��� ����ȴ�.
		System.out.println(s);
	//	System.out.println(s=s.toUpperCase());   // �̷��� s��  ������ �ٲ��� �ʴ� ��  ������ ���� ������ ������ �ٲ��� ����.
		
		System.out.println(s.trim());    //�ǳ��� �� �ո�!���̹��� ���̵���� Ʈ������ �ȵ� , ����Ʈ ���̵������ Ʈ�� �����.	����Ŭ�� ������ �����Ѵ�. ����ڽǼ��� ���� �ʵ��� Ʈ���� �־���
		System.out.println(s.indexOf("hello"));
		System.out.println(s.lastIndexOf("l"));
		
		String s1="Hello";
		String s2="hello";

		String res=s1.equals(s2)?"����":"�ٸ���";
		          // =======
		          //  ��ҹ��� ���� ����		   
		System.out.println(res);
		
		String res1=s1.equalsIgnoreCase(s2)?"����":"�ٸ���";
		
		System.out.println(res1);
			
			
			
			
			
			
	}

}
