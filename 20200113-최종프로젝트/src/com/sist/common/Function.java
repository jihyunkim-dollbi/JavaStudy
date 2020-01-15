package com.sist.common;
/*
 * 네트워크 프로그램(CS) ==> 서버를 거쳐서 클라이언트가 변경
 * 1)서버 : 역할=> 클라이언트의 요청을 받아서=> 응답(명령)
 * 2)클라이언트 => 요청 => 응답을 받아서 클라이언트 프로그램에 출력
 * 
 * 
 *   1. 클라이언트마다 통신이 따로 만들어야한다
 *   				   ===
 *   				   쓰레드 => 통신만 담당!
 *   2. 클라이언트 자체에서 처리하지 않고 => 항상 서버를 통해서 
 * 	 3. 스트림을 이용한 프로그램
 * 		====
 * 		전송할때=> 바이트로       ==> OutputStream
 * 		수신할때=> 문자스트림으로 ==> BufferedReader
 * 
 *  Header => TCP => 실제 데이터와 HEADER(거쳐오는 곳들..) => 헤더가 많을 수록 느려짐...
 *  
 *  쓰레드 -.. DEADROCK 상태가 되지 않도록 해야한다.(특히 동기화에서.. 하나가 멈추면 다음 것이 작동을 못한다.)
 *  
 *  
 *  실시간 갱신을 보여주기 => Waitupdate
 * 	
 *  로그인에서 방에 들어가는 것 까지!!
 * 
 * 
 */
public class Function {

	public static final int LOGIN = 100;  // 로그인 처리 // 목록 출력 명령
	public static final int MYLOG = 110;  // 로그인창에서 대기실로 창 바뀜
	public static final int MAKEROOM=200; // 방정보를 출력하라
	public static final int ROOMIN=210;   // 방에 들어가라  1. 방에 입장한 2. 방에 있으면서 새로운 아바타가 들어왔을때 먼저 들어가 있는 사람의 처리
	public static final int ROOMOUT=220;   // 방을 나가라
	public static final int ROOMADD=230;     // 방
	public static final int MYROOMOUT=240;
	public static final int WAITUPDATE=250;  // 실시간 정보를 갱신하기
	public static final int POSCHANGE=260;   // 방 들어가면 대기실을 방 이름으로 바꿔줌..
	public static final int WAITCHAT=270;
	public static final int ROOMCHAT=280;  //방에서 채팅
	public static final int EXIT=900;     //  
	public static final int MYEXIT=910;  // 기존의 사람에게 리뉴얼된 접속자 명단 보여줌.. 
	
	
	
	
	
	
	
	/*	
	 * Server
	 * Function.LOGIN ==> id|pwd|sex|loc ==> waitVc 에 저장 예정
	 * 
	 * Client
	 * Function.LOGIN ==> id|pwd|sex|loc ==> 테이블에 출려하는 과정
	 * 
	 */
	
	
	
	
	
	
	
	
	
}
