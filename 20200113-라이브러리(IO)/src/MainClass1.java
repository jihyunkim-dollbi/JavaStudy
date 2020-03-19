/*
 * IO: CheckException 이다 => 반드시 예외처리를 해야한다.
 * 
 * ==> Input/Output
 * 
 * 1) 메모리 입출력
 *    ==========> 표준 System.in.read(), System.out.println()
 * 
 * 2) 파일 입출력
 * 3) 네트워크 입출력
 * 
 * 
 * **TCP(네트워크 스트림 방식- 네트워크에서 데이터를 절대 잃지 않음? )
 * **바이트 스트림: 메모리에서 1byte씩 읽어옴- 그림파일
 * **문자스트림: 메모리에서 2byte씩 읽어옴- 한글(한글자가 2byte)
 * **스트림(input stream, output stream)==> 데이터가 이동해오는 공간 => 단방향 통신
 * 
 * 라이브러리에서 제공하는  IO  => 단점(단방향- 주고 그다음 받고 그다음 주고-> 동시에 주고받고 안됨.)
 * ====================
 *    			 바이트스트림          					      문자스트림
 *   			==========						    =======
 * 					|									|
 * 				==========						  ============
 * 		InputStream(중요)   OutputStream				Reader		Writer
 * 
 * FileInputStream								FileReader
 * FileOutputStream								FileWiter
 * 
 * 
 * 
 * 보조장치 : 임시로 한번에 저장해 놓는 공간.
 * BufferedInputStream							BufferedReader
 * (======)
 * (전체데이터제어시 buffer(임시로저장해놓고(저장:commit)시작.임시기억)- 속도빠르게)
 * BufferedOutputStream							BufferedWriter
 * 
 * 
 * File
 * 
 * 객체단위로 저장 =>  직렬화  == == == <=> 병렬화로 가져옴.  ==
 * ObjectInputStream							  ==
 * ObjectOutputStream							  ==
 * 
 * 
 * 
 * 메모장 작성시 임시 메모리에 저장했다가 하번에 메모리에 저장함(속도 빠름)=> 임시 메모리공간 : Buffered
 * Web 에서 buffered 에 놓고 한번에 연결될때 한번에 응용프로그램에 가져옴 => ex) jsoup -> document 에 메모리에 데이터를 모두 갖다놓고 처리함
 * 
 * 
 * 
 * 
 * 
 * +++ 응용프로그램 <===> 파일 : 한개의 통로로 충분!
 * 
 * +++ 서버 ==> 네트워크   ---> 단방퍙의 두개의 통로필요 => 2개의 프로그램이 필요하다==> 쓰레드가 필요하다. 
 * 	  	 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
