package com.sist.io2;



/*
 * Thread�� ����ϴ� ���
 * ======> �Ѱ��� �ϸ� ����ϰ� �����(Ŭ���̾�Ʈ������ �б⸸, )
 * =================
 * 1. Runnable(interface) �̿��ϴ� ���
 *  	=>Ŭ���̾�Ʈ(������)
 *  	=> run()�޼ҵ� ���� => ������ ����
 *      class  A implements Runnable
 * 2. Thread�� ��ӹ޾Ƽ� ó��
 * 		=> Thread�� ������ Ȯ���� ��ų�� �ִ�
 * 		class A extends Thread
 * 
 * ==> �����ϴ� ���
 * 	
 * INIT(�ʱ�ȭ �ܰ� - ����: CREATED) ==> Runnable(���)���·� ���ٰ�               => 		Running 		 =====> 1.�Ͻ�����
 * ============================										 						 =====> 2.������ ���� -> interrupt(), join()
 * Thread t1 = new Thread();		t1.start() //�ʿ��� �����͸� ���� ����              run() // start�� �ڵ����� ȣ���.
 * Thread t2 = new Thread();		t2.start()							  run()  //�Ͻ����� =>sleep (), wait() ��� ����ٰ� �ƿ� �����Ű�ų� �ٽ� run������ �� ���� �ִ�. 
 * 
 * 	===>JVM �� 1. �̸��� �ο����ش� thread -0									       
 * 			  2. ������ �ο����ش�(1~10)
 * 				====================
 * 				1 => Min_PRIORITY - GC(������� �������)
 * 				10=> MAX_PRIORITY - (Main method) - ���� ���� ����Ǳ� ������.
 * 				5=> NORM_PRIORITY(�츮�� ���� ��)
 * 
 *   �ú��ҷ� �۵���=> �Ѱ��� �������� ������ => 1���� 10������ �������� => 111=> 222=> 333 
 *   (cpu�� �ð��� ������ ������ �ϰ� �ϴ� ��)
 * 
 *  ������ �������� ���� ���� �������̽� ����� ����.
 *  �����带 ���� ���� ���� 3���� ��ǥ�� ���ÿ� ����.
 *  
 *  runnable ==> �Ѱ��� ��ɸ� ������,
 *  
 *  ���ð��� => �����带 ��ӹ޾Ƽ� ����ؾ���.
 *  
 *  
 * 	
 * 
 */
class MyThread extends Thread
{
	public void run()
	{
		for(int i = 0; i <= 10; i++)    //1���� 10���� ����ϴ� ���
		{
			System.out.println(getName()+":"+i);
			try
			{
				
				Thread.sleep(200);   //0.05��
				
			}catch(Exception ex) {}
			
			
		}
		
	}
	
	
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println(Thread.currentThread().getName());  	   // ==> main  ==> ���� �����ϴ� �������� �̸��� ����.....main
		// ��� �������α׷��� �ּ� �Ѱ��� �����带 ���� ������.
		
		// �����带 �����ϱ� ���� �����ϱ�
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		
   //	t1.setName("ȫ�浿");
	//	t2.setName("��û��");
	//	t3.setName("�ڹ���");
		
	//	t1.setPriority(Thread.MAX_PRIORITY);
	//	t2.setPriority(Thread.MIN_PRIORITY);
	//	t3.setPriority(Thread.MIN_PRIORITY);  // �̷��� �ӵ��� �ο��� ���� �ִ�.
		
		/*
		 * 
ȫ�浿:0
�ڹ���:0
��û��:0
��û��:1
ȫ�浿:1
�ڹ���:1
��û��:2
�ڹ���:2
ȫ�浿:2
��û��:3
ȫ�浿:3
�ڹ���:3
ȫ�浿:4
�ڹ���:4
��û��:4
ȫ�浿:5
��û��:5
�ڹ���:5
ȫ�浿:6
��û��:6
�ڹ���:6
ȫ�浿:7
��û��:7
�ڹ���:7
ȫ�浿:8
�ڹ���:8
��û��:8
ȫ�浿:9
�ڹ���:9
��û��:9
ȫ�浿:10
��û��:10
�ڹ���:10

		 * 
		 * 
		 */
		//�ʿ��� ������ ������ ����
		t1.start();
		t2.start();
		t3.start();
		
		//1~10���� ����ϴ� �����϶� ���
		// t1.run() , t2.run() ,  t3.run()
		/*
		 * 
Thread-0:0
Thread-2:0
Thread-1:0
Thread-1:1
Thread-0:1
Thread-2:1
Thread-2:2
Thread-0:2
Thread-1:2
Thread-1:3
Thread-0:3
Thread-2:3
Thread-1:4
Thread-0:4
Thread-2:4
Thread-1:5
Thread-2:5
Thread-0:5
Thread-0:6
Thread-1:6
Thread-2:6
Thread-1:7
Thread-2:7
Thread-0:7
Thread-0:8
Thread-1:8
Thread-2:8
Thread-1:9
Thread-0:9
Thread-2:9
Thread-1:10
Thread-0:10
Thread-2:10
		 * 
		 */
		
		
		
	}

}
