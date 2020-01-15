package com.sist.server;
import java.util.*;
public class Room {

	
	
	String roomName, roomState, roomPwd;
	int current, maxcount;   // 인원이 들어올때마다 current는 계속 증가하고 , 증가하다 인원이 차면 maxcount
	Vector<Server.Client> userVc = new Vector<Server.Client>();  // 방에 접속한 사람들 //방에 있는 사람 한번에 제어하기  
	//Server.Client  Client는 서버클래스 안에 있는 내부클래스이기때문에 Server. 을 통해 사용할 수 있다. Server클래스 에서는 자유롭게 사용(생략)하지만 다른 클래스에서는 . 을 이용해 불러와야한다.
	//포함하고 있는 클래스 + (.) + 내부클래스
	
	
	public Room(String roomName, String roomState, String roomPwd, int maxcount) { //general contructor using field ==> 생성자를 만들면서 매개변수를 선택해서 만든다.
	
		this.roomName = roomName;
		this.roomState = roomState;
		this.roomPwd = roomPwd;
		this.maxcount = maxcount;
		current=1; //방을 만들면 현재인원 1
		//인덱스번호 0번이 방장이 될 것임 , 나가면 줄고, 들어오면 값이 늘어남 // 0번이 빠지면 방장이 바뀜 => 그 다음방장은 1번이 방장 될 것. => "메시지 방장이 변경되었습니다."
		// 룸이 만들어진 다음에 .... 그래서 생성자로 초기화를 줌.		
		
		
	}
	
	
	
	
	
	
}
