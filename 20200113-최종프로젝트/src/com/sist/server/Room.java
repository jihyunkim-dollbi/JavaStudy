package com.sist.server;
import java.util.*;
public class Room {

	
	
	String roomName, roomState, roomPwd;
	int current, maxcount;   // �ο��� ���ö����� current�� ��� �����ϰ� , �����ϴ� �ο��� ���� maxcount
	Vector<Server.Client> userVc = new Vector<Server.Client>();  // �濡 ������ ����� //�濡 �ִ� ��� �ѹ��� �����ϱ�  
	//Server.Client  Client�� ����Ŭ���� �ȿ� �ִ� ����Ŭ�����̱⶧���� Server. �� ���� ����� �� �ִ�. ServerŬ���� ������ �����Ӱ� ���(����)������ �ٸ� Ŭ���������� . �� �̿��� �ҷ��;��Ѵ�.
	//�����ϰ� �ִ� Ŭ���� + (.) + ����Ŭ����
	
	
	public Room(String roomName, String roomState, String roomPwd, int maxcount) { //general contructor using field ==> �����ڸ� ����鼭 �Ű������� �����ؼ� �����.
	
		this.roomName = roomName;
		this.roomState = roomState;
		this.roomPwd = roomPwd;
		this.maxcount = maxcount;
		current=1; //���� ����� �����ο� 1
		//�ε�����ȣ 0���� ������ �� ���� , ������ �ٰ�, ������ ���� �þ // 0���� ������ ������ �ٲ� => �� ���������� 1���� ���� �� ��. => "�޽��� ������ ����Ǿ����ϴ�."
		// ���� ������� ������ .... �׷��� �����ڷ� �ʱ�ȭ�� ��.		
		
		
	}
	
	
	
	
	
	
}
