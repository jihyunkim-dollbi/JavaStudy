package com.sist.common;
/*
 * ��Ʈ��ũ ���α׷�(CS) ==> ������ ���ļ� Ŭ���̾�Ʈ�� ����
 * 1)���� : ����=> Ŭ���̾�Ʈ�� ��û�� �޾Ƽ�=> ����(���)
 * 2)Ŭ���̾�Ʈ => ��û => ������ �޾Ƽ� Ŭ���̾�Ʈ ���α׷��� ���
 * 
 * 
 *   1. Ŭ���̾�Ʈ���� ����� ���� �������Ѵ�
 *   				   ===
 *   				   ������ => ��Ÿ� ���!
 *   2. Ŭ���̾�Ʈ ��ü���� ó������ �ʰ� => �׻� ������ ���ؼ� 
 * 	 3. ��Ʈ���� �̿��� ���α׷�
 * 		====
 * 		�����Ҷ�=> ����Ʈ��       ==> OutputStream
 * 		�����Ҷ�=> ���ڽ�Ʈ������ ==> BufferedReader
 * 
 *  Header => TCP => ���� �����Ϳ� HEADER(���Ŀ��� ����..) => ����� ���� ���� ������...
 *  
 *  ������ -.. DEADROCK ���°� ���� �ʵ��� �ؾ��Ѵ�.(Ư�� ����ȭ����.. �ϳ��� ���߸� ���� ���� �۵��� ���Ѵ�.)
 *  
 *  
 *  �ǽð� ������ �����ֱ� => Waitupdate
 * 	
 *  �α��ο��� �濡 ���� �� ����!!
 * 
 * 
 */
public class Function {

	public static final int LOGIN = 100;  // �α��� ó�� // ��� ��� ���
	public static final int MYLOG = 110;  // �α���â���� ���Ƿ� â �ٲ�
	public static final int MAKEROOM=200; // �������� ����϶�
	public static final int ROOMIN=210;   // �濡 ����  1. �濡 ������ 2. �濡 �����鼭 ���ο� �ƹ�Ÿ�� �������� ���� �� �ִ� ����� ó��
	public static final int ROOMOUT=220;   // ���� ������
	public static final int ROOMADD=230;     // ��
	public static final int MYROOMOUT=240;
	public static final int WAITUPDATE=250;  // �ǽð� ������ �����ϱ�
	public static final int POSCHANGE=260;   // �� ���� ������ �� �̸����� �ٲ���..
	public static final int WAITCHAT=270;
	public static final int ROOMCHAT=280;  //�濡�� ä��
	public static final int EXIT=900;     //  
	public static final int MYEXIT=910;  // ������ ������� ������� ������ ��� ������.. 
	
	
	
	
	
	
	
	/*	
	 * Server
	 * Function.LOGIN ==> id|pwd|sex|loc ==> waitVc �� ���� ����
	 * 
	 * Client
	 * Function.LOGIN ==> id|pwd|sex|loc ==> ���̺� ����ϴ� ����
	 * 
	 */
	
	
	
	
	
	
	
	
	
}
