package com.sist.io2;



/*
 * Thread를 사용하는 방법
 * ======> 한가지 일만 사용하게 만든다(클라이언트에서는 읽기만, )
 * =================
 * 1. Runnable(interface) 이용하는 방법
 *  	=>클라이언트(윈도우)
 *  	=> run()메소드 구현 => 쓰레드 동작
 *      class  A implements Runnable
 * 2. Thread를 상속받아서 처리
 * 		=> Thread의 역할을 확장을 시킬수 있다
 * 		class A extends Thread
 * 
 * ==> 동작하는 방법
 * 	
 * INIT(초기화 단계 - 생성: CREATED) ==> Runnable(대기)상태로 갔다가               => 		Running 		 =====> 1.일시정지
 * ============================										 						 =====> 2.쓰레드 종료 -> interrupt(), join()
 * Thread t1 = new Thread();		t1.start() //필요한 데이터를 갖다 놓음              run() // start로 자동으로 호출됨.
 * Thread t2 = new Thread();		t2.start()							  run()  //일시정지 =>sleep (), wait() 잠깐 멈췄다가 아예 종료시키거나 다시 run쪽으로 올 수도 있다. 
 * 
 * 	===>JVM 은 1. 이름을 부여해준다 thread -0									       
 * 			  2. 순위를 부여해준다(1~10)
 * 				====================
 * 				1 => Min_PRIORITY - GC(쓰레드로 만들어짐)
 * 				10=> MAX_PRIORITY - (Main method) - 가장 먼저 실행되기 때문에.
 * 				5=> NORM_PRIORITY(우리가 만든 것)
 * 
 *   시분할로 작동함=> 한개씩 순위별로 수행함 => 1부터 10까지의 쓰레드중 => 111=> 222=> 333 
 *   (cpu가 시간을 나눠서 동작을 하게 하는 것)
 * 
 *  쓰레드 여러개를 받을 때는 인터페이스 사용을 못함.
 *  쓰레드를 따로 따로 만들어서 3개의 좌표를 동시에 맞춤.
 *  
 *  runnable ==> 한가지 기능만 있을때,
 *  
 *  슈팅게임 => 쓰레드를 상속받아서 사용해야함.
 *  
 *  
 * 	
 * 
 */
class MyThread extends Thread
{
	public void run()
	{
		for(int i = 0; i <= 10; i++)    //1부터 10까지 출력하는 기능
		{
			System.out.println(getName()+":"+i);
			try
			{
				
				Thread.sleep(200);   //0.05초
				
			}catch(Exception ex) {}
			
			
		}
		
	}
	
	
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println(Thread.currentThread().getName());  	   // ==> main  ==> 현재 동작하는 쓰레드의 이름은 뭐냐.....main
		// 모든 응용프로그램은 최소 한개의 쓰레드를 갖고 동작함.
		
		// 쓰레드를 동작하기 위해 생성하기
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		
		
   //	t1.setName("홍길동");
	//	t2.setName("심청이");
	//	t3.setName("박문수");
		
	//	t1.setPriority(Thread.MAX_PRIORITY);
	//	t2.setPriority(Thread.MIN_PRIORITY);
	//	t3.setPriority(Thread.MIN_PRIORITY);  // 이렇게 속도를 부여할 수도 있다.
		
		/*
		 * 
홍길동:0
박문수:0
심청이:0
심청이:1
홍길동:1
박문수:1
심청이:2
박문수:2
홍길동:2
심청이:3
홍길동:3
박문수:3
홍길동:4
박문수:4
심청이:4
홍길동:5
심청이:5
박문수:5
홍길동:6
심청이:6
박문수:6
홍길동:7
심청이:7
박문수:7
홍길동:8
박문수:8
심청이:8
홍길동:9
박문수:9
심청이:9
홍길동:10
심청이:10
박문수:10

		 * 
		 * 
		 */
		//필요한 데이터 가져고 오기
		t1.start();
		t2.start();
		t3.start();
		
		//1~10까지 출력하는 동작하라 명령
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
