/*
 * 
 *   if ���๮���� ����
 *   
 *   if(���ǹ�)
 *      ���๮�� 1   ==> if�� �Ҽӹ���
 *       
 *      ���๮�� 2   ==> if�� ������ ���� ���� -> true/false�� ���þ��� ������ ������ �ϴ� ����
 * 
 *      ==> �ڹٿ��� ��� ����� {}  ����� ���� ��� �� ���常 ����.
 *     
 *     if(���ǹ�)
 *     {  
 *        ���๮�� 1     ==> ������ ����- ��� ����ϱ�
 *      
 *      }
 * 
 *        ���๮�� 2 
 *
 * 
 *     ---> ���� ������(�ּ��ɱ�), ����ȭ�� �߿���( = �����丵), ���̱׷��̼�(Spring -> SpringBoot)
 *     
 *      ex) abc()  ==> add()
 *          def()  ==> minus()
 *     
 *         
 * 
 * 
 */

public class ���_���ǹ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int num = 16;
		
		int a = 10;
		a++;   // ���Կ����ڰ� ���� ��� ������ ������ �ȴ�.
		System.out.println(a);
		
		int b = 100;
		b = a++;  // ���Կ����ڸ� �ϱ� ������ ��ġ���� ��ġ������ ���� ���� �޶���. 
		
		int c = 10;
		c++;
		c++;
		c++;  // 1�� ������ ���� ����.
		c++;
		c++;
		System.out.println("c=" + c);
		
		int d = 10;
		d+=5;    // 2 �̻� �����Ҷ� ����.
		System.out.println("d=" + d);
		
		// �������� ���๮���� ���ÿ� �����Ҷ� ����ϴ� ���ǹ�
		if (num%2 != 0)
		{
			
			System.out.println("b�� " + b + "�Դϴ�");
			System.out.println(num + "��(��) ¦���Դϴ�.");
			System.out.println("���α׷�����");   
		    b++;
		    
		}
		  //  System.out.println(b);   ==> ���� �����⶧���� (b�� ���������̱� ������) ������ ������.
		  //                               �������� - ���ȿ��� ���, ���� ������ �ڵ����� �������.
		  //                               �������� - �� ������ b�� �������ָ� ����.
		 		 
		// if (num%2 != 0)
	//	 {
	//		 System.out.println(num + "��(��) Ȧ���Դϴ�.");
	//	 }
		 
		 
	        System.out.println(b);


	        
		    int ree = a;   // char�� ���������� 
		    System.out.println(ree);
	        
	        
		
		
		
	}

}
