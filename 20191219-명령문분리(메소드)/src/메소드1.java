/* �޼ҵ�
 * �ڹ�(��ü����) - Ŭ���� 
 *               === : ����
 *                     �޼ҵ�(��� ������)
 * 
 * �������̵� - ���̺귯�� ���� / �����ε� - ���� �ڵ�
 * 
 * �Ű�����? , ������?
 * 
 * 
 * ȣ��� �������� �ٽ� ���ư��� ������ �ϸ鼭 ���ƿ´�.
 * 
 * �ѹ� �θ��� ó������ �ٽ� �����Ѵ�. 
 * 
 * ���� ���ο����� �������� ������ �ȴ�. �޼ҵ���� ������ ���� �ϸ�ȴ�.
 * 
 *  
 *  ����)    
 *  
 *     ���������    ��      �޼ҵ��(�Ű�����...)
 *     ======= ===== =======
 *     static   int    plus (int a, int b)
 *     {
 *        ������
 *     
 *     }
 *  
 *    
 *  
 *      ������(ó�������) �޼ҵ��(�Ű�����...1�� or ������ or zero!) -==> �����
 *      =============  =====
 *      �⺻������ �����ų�   ��ӻ���:��� �żҵ���� �ҹ��ڷ� �Ѵ�.(�밡�����:getText(), nextInt()) �ι�° �ܾ��� ù���ڸ� �빮��.
 *      =============
 *      �迭������ �����ų�
 *      Ŭ���������� �����ų�
 *      ==============> ����� ������ ���ö�
 *      
 *      
 *      {
 *      
 *       ==> ������
 *           ����ó��
 *           ���
 *      
 *           return  �����-> �ݵ�� �Ѱ�!
 *           =====
 *           VOID�϶� ���ϰ� ��������! JVM���� �ڵ����� ��������!
 *       }
 * 
 *  	*** ���ϰ��� 1���� ������ �� �ִ�.
 *          ���� �������� ��� ��� �����ش�!
 *      *** ��� �޼ҵ�� return�� ������ �����Ѵ�. -> ���� ������Է°��� �̻��� �� �ִ� ��� ������ �ְ� �����ϰ� �ٽ� �޼ҵ带 ȣ���϶�� ��Ȳ!
 *      									  �����Ͽ� �ٽ� ó������ �õ��϶�� ��.
 *      
 *      -----------------------------------
 *      *** �����? 
 *          ������� ���� �ٰ��� �������.
 *      *** ����ڰ� ��û�� ���� ����?
 *      	�̰Ϳ� ���� ó��������� ����?
 *      
 *      *** ȣ���� ����ñ⿡ ��� ��ġ���� �� ������
 *      -----------------------------------
 *      
 *      ����ڰ� �Է��� �� 4 �� , ��ĭ ==> ���ϰ��� 
 *      
 *            
 *       ����� ip, web ip 
 *      
 *      �޼ҵ�� ���θ������ ������ �Ʒ��� ���ʷ� �Ѱ��� ������ ������
 *      ������� ���ÿ� ���� ������ �����ϴ� ���θ��.
 * 
 */
import java.util.Scanner;
public class �޼ҵ�1 {
	
	// +
	static int plus(int a, int b)   // ���ѷ����� ���ư��� ���� ������ �� ���� ����. call stack
	{
		
		return a+b;
		
	}
	
   // -
	static int minus(int a, int b)
	{
		
		return a-b;
	}
	
   // *
	static int gop(int a, int b)
	{
		
		return a*b;
	}
	
   // /
	static double div(int a, int b)   //�������� ������� �����ؾ� �ϱ� ������ double�� ������� �ٲ���.
	{
		
		return a/(double)b;
	}
	
  //���� 
	static void process()
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("ù���� ���� �Է�: ");
		int a=scan.nextInt();
		
		System.out.println("�ι��� ���� �Է�: ");
		int b=scan.nextInt();
		
		System.out.println("������(+,-,*,/) �Է�: ");
		String op = scan.next();
		
		
		
		switch(op)
		{
		
		case "+":
		{	int res=plus(a,b); //���ϰ�
			System.out.printf("%d%s%d\t%d\n", a,op,b,res);
		}	
		break;
		
		
		case "-":
		{	int res=minus(a,b); //���ϰ�
			System.out.printf("%d%s%d%d\n", a,op,b,res);
		}	
		break;
		
		case "*":
		{	int res=gop(a,b); //���ϰ�
			System.out.printf("%d%s%d%d\n", a,op,b,res);
		}	
		break;
		
		
		case "/":
		{	
			double res=div(a,b); //���ϰ�
			System.out.printf("%d%s%d%f\n", a,op,b,res);  // �������̱� ������ %f�� �ٲ���
		}   
		break;
		
		}
		
	}
	
	public static void main(String[] args) {      
		// TODO Auto-generated method stub

		// return;(��������) // VOID�̱� ������ ���ϰ��� ��������� JVM���� �ڵ����� �ذ�����. return�����൵ ok!
		// java.lang(��������)
		// ����ó��(�������ɱ�� �ڵ����� �Ǿ���)

		
		// ��Ģ���� �ϴ� ���α׷� �����
		
		  Scanner scan = new Scanner(System.in);
		  while(true)
		  {
			  
			  process();
			  System.out.print("y|n �Է�: ");
			  String ex=scan.next();
			  switch(ex)
			  {
			  case "y":
				  System.exit(0);
				  break;
			  case "n":
				  break;
			  }
		  }
		  
		  
	//  process();  // �ڱ��ڽ��� �޼ҵ� �̱� ������ �޼ҵ�� ���������ϰ� process();����!
		   
		
		
		
		
		
		
		
		
		
		 
		
		
 
		
		
	}

}
