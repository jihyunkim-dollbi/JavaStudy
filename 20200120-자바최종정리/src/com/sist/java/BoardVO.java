package com.sist.java;
/*
 * BOARD의 값만 가지고 있는 클래스
 * 
 * 아래는 캡슐화 과정! 외부에서 여기 데이터를 가져다 사용 가능!!
 * 
 */
public class BoardVO {

	private int no; // 게시물번호
	private String name;
	private String subject;
	
	
	
	
	//외부와 접속이 가능하게 만들어줌
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	
	
	
	
}
