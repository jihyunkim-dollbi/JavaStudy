package ����������;

		// TODO Auto-generated method stub
		/*
		 *  ���α׷� ��� = java, c/c++, c#, kotlin
		 *             ======           =========
		 *             
		 *             => ����������   ======>������ ���� ====== ȭ�����
		 *                                               DOS, WINDOW : APPLICATION
		 *                                               BROWSER : WEB APPLICATION
		 *                                               SMART PHONE : MOBILE
		 *                =======������
		 *                1)����:�Ѱ��� ������ �����ϴ� ����
		 *                2)�迭: ���� ������ �����͸� ������ �����ϴ� ����
		 *                3)Ŭ����:�ٸ� ������ �����͸� ������ �����ϴ� ����
		 *                ======��������޸�������
		 *                4)����
		 *                5)RDBMS(����Ŭ)
		 *                
		 *                1.  ����
		 *                    1) ��������� ũ��
		 *                       = �ڷ���(��������)
		 *                         ��������
		 *                          Byte=> (1byte) => -128~127
		 *                          ==> 100 50 90 120 38   --> 4���� ����  -> �ӵ� ������ -> ���� int�� �ѹ��� �ִ°� ���� , int �� ������ 8���� �ڸ�, why long is not? , and ������ double���� �Ҽ���.����
		 *                          short=> (2byte)=>-32768~32767
		 *                          ===========================(c/c++ȣȯ��)
		 *                          int => (4byte) => -21�� 4õ~21�� 4õ
		 *                          long = > (8byte)
		 *                          =====================
		 *                          �������� => ����������-- ����- ���ϴ� �� - ���� ���尪�� ����. �ٲ������.
		 *                          �޸�ũ�� ������=��;
		 *                          ==========
		 *                          byte(��������/�޸�ũ�� �ֱ�) b=10
		 *                          ====
		 *                          int kor=90 (��) ==> �����ؼ� ����� ����(����)
		 *                          === === ��Ī
		 *                          ������ ũ�� ����
		 *                          *********int  /  long  ����
		 *                                  ====     ====
		 *                                  10,20..  10L, 20L , 20l
		 *                                  long a=10L
		 *                                  LONG B=10  ==>   INT => LONG
		 *                                  INT c='A'  ==> char => int
		 *                                     ===
		 *                                     65
		 *                         �Ǽ�����
		 *                            float  (4 byte �޸�)  �Ҽ��� 6�ڸ�
		 *                            double (8  byte) => default =>  �Ҽ��� 15
		 *                               float vs double
		 *                               float f=10.5 => (error
		 *                               ====    ===== 8byte
		 *                              
		 *                               4byte
		 *                               
		 *                               float f=10.5f => 10.5f, 10.5F
		 *                               DOUBLE  D=10.5  => 10.5D, 10.5d
		 *                               ==>  �Ǽ����� ������ ��ȯ  => �Ҽ��� ���ϴ� ����
		 *                                    (int) 10.55 ==> 10
		 *                                    
		 *                                    (int) 10.5+(int)20.5  ==> 30
		 *                                    (int)(10.5+20.5)  ==> 31
		 *                               
		 *                               
		 *                               
		 *                         ��������
		 *                         
		 *                         char (2byte) => 0~65535 (������ ��� ���� ����
		 *                         ===>   '', 'A'   '��' ==? �ѱ��ھ�==? ����  , char c="��ȣ"
		 *                         ȫ�浿 => Char[], STRING =>""  ==> ���ڿ�
		 *                               
		 *                         TRUE/FALSE
		 *                         boolean = > boolean b=true
		 *                                     boolean b=false
		 *                                     
		 *                         ******** ������
		 *                                   String => ���ڿ� (���� �������� ������ ���, �ּҳ� �� ���ڿ�,02-2222-2222 )
		 *                                   String name="ȫ�浿"        
		 *                                     
		 *                                     ����Ŭ �������� & ��� ���� ����!! 
		 *                                     
		 *                                     
		 *                    2) �޸��� �̸� �ο�
		 *                       = ����(�ĺ���)
		 *                       = ���ڼ��� ������ ����(3~7)
		 *                       1. ���ĺ�, �ѱ۷� ����(��, ���ĺ��� ��ҹ��� ����)
		 *                          ��������  => engScore, eng_score
		 *                       2. ���ڻ���� ����
		 *                       (�� �տ� ����� �Ұ���)
		 *                       kor2, eng2, a1b
		 *                       3. Ư������ ( _ , $) ���� ���� ��� _
		 *                       - �ܾ �������� ���
		 *                       file_name, fine_size, first_name, second_name
		 *                       ********* �ӽ�����
		 *                                 _Hello
		 *                       4. �����(�ڹٿ��� ����Ѵ� �ܾ�)
		 *                          int int_value ���� , int int (�Ұ���)
		 *
		 */
		public class �ڷ��� {
			public static void main(String[] args) {
		//���� => ���α׷��� �ʿ��� �� ���� �����͸� �����ϴ� �޸� �̸�
			//               ==========
			
			/*
			 * ���� ���� => ����
			 * 1)����
			 * ===> 10���� int a=10
			 *      2���� int b=0b1010
			 *                ==
			 *      8���� int c=012
			 *                =
			 *      16���� int d=0xFF
			 *                 ==
			 * byte b=10 (127)
			 * short s=100(32767
			 * int i=100
			 * long l=100l
			 * 2) �Ǽ�
			 * float f=10.5f
			 * double d=10.5
			 * 3)����
			 * char c='A'
			 * 4) ����
			 * boolean b=true, b=false
			 * 5)���ڿ�
			 * String s="Hello Java"
			 * 
			 * 27  => 2,8,16
			 * 
			 * 16 8 4 2 0(1)
			 *   11 / 011
			 *   
			 *   49 =>110 / 001
			 *         8���� => 61
			 *         16����  0011 / 0001   ==> 0x31
			 * 
			 * 
			 * 
			 *             32  16  8  0(1)
			 */
		
		
		
		
        // 1. 4byte ũ���� �޸𸮸� ������
		//�� �޸��� �̸� => a
		// a��� �޸𸮿� 10�� �����ض�
		int c=0xA;     // 16 ���� - ���� �տ� 0�� x�� ����  
		int a=10;      // 10 ���� - ���� �տ� �ƹ��͵� ������ ����
		int b=012;     //  8 ���� - ���� �տ� 0�� ����  -->  07�� �������� 08,09�� ������ ��. 11~������.--> ���� ���ڸ� ���� 0�� ���� ������ �ʰ� ��¥�� ���ų� �ؾ���. 2019�� 8�� 8��
  		int d=0b1010;  //  2 ���� - ���ھտ� 0�� b�� ����
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
		
		
		float f=10.555555f;
		// 4=8
		System.out.println("f="+f);
		
		double d2=10.5;
		System.out.println("d="+d2);
		
		//   +���������
		//   + ���ڿ�����
		//   7+""+7   => ����
        //   7+7  => 14		  ���ڿ��� ���ڸ� ���� �ٿ��� ex) ����
		// 77+""+77+""+7+1   --> 777771
		// 77+""+77+""+(7+1)   --> 77778
		
		
		boolean bcheck=false;
		System.out.println(bcheck);
		

        int t=14, y=25;
        boolean w=t<y;
        System.out.println(w);
		
        
		char ch='K';
		System.out.println("CHAR="+ch);
		
		
		String name="ȫ�浿";
		System.out.println(name+"\t"+6+3);
		System.out.println(6+name+"\n");
		
		System.out.println(name+7+6+8+11+"�ܿ�"+8/2);
		System.out.println(7*3+"����"+8/2+name);
		
		byte bb0=127;
		byte bb=Byte.MAX_VALUE;
		
		short ss0=32767;
		short ss=Short.MAX_VALUE;
		
		int ii0=2145555555;
		int ii=Integer.MAX_VALUE;
	
		long ll=Long.MAX_VALUE;
		
		System.out.println("byte0="+bb0);
		System.out.println("byte="+bb);
		System.out.println("Short0="+ss0);
		System.out.println("Short="+ss);
		System.out.println("Int0="+ii0);
		System.out.println("Int="+ii);
		System.out.println("Long="+ll);
	


	}

}

