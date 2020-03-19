package com.sist.board;   // ��Ű���� ���� ��� ������ Ŭ������ �� �ִ��� �˼� ����.(�о�ȭ ���, ��ɺ��� ������ �ִ�.)==> �Խ��� Ŭ������ �������.
/*
 * java. 
 * javax.
 * src�� ������ ���� class�� ��޵Ǿ� import�� �� �� ����.
 * ���� src�ȿ� ��Ű���� ����� ��Ű������ ��Ű���� Ŭ������ �����Ҷ���  import�� �� �ִ�.
 * 
 * ���� ��� �޼ҵ�� public=> �����Ұ���., ��� �����ʹ� private ���� �� ����.
 * 
 * public getter - ������ �����Ë�  ==> getId => 
 * public setter - �������� �����ҋ� ==> setId => Id�� �����ض�
 * 
 * private������ �ݵ�� �޼ҵ带 �̿��ؼ� ������ �� �ִ�. get(), set() ==> �ٸ� Ŭ�������� ���� ����,
 * ==> ĸ��ȭ �ڵ�! = > �����ʹ� ���߰�=> �޼ҵ带 �̿��ؼ� �����͸� �ְ� �޴�!
 * 
 * ������ ������, �ַ� private or default�� ��´�.
 * ������, �޼ҵ� => public���� ��´�.
 * 
 * 
 * 
 */

public class Board {
	
	// �ɹ�����, ��������
	int no;
	String name;
	String regdate;   // ����Ʈ ���� ==> ���� �����ȿ����� ����. ==> �ν��Ͻ� ����? 
	
	// ������1
	public Board(int no, String name, String regdate) // ����������.
	{	
		this.no=no; // ==> int no; �� ���� �����ϰڴٴ� �ǹ�. no ���������� ��밡����.
		this.name=name;
		this.regdate=regdate;	
	}
	
	public Board() // ����������.
	{	
	
		System.out.println("jello");
		
	}
	
	
	// �޼ҵ�1
	public void boardList()  // public���� Ŭ������ ������ �ٸ� Ŭ�������� ��� �����ϴ�. 
	{
		System.out.println("��ȣ: " + no);
		System.out.println("�̸�: " + name);
		System.out.println("�����: " + regdate);
	}

}
