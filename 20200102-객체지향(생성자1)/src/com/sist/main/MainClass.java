package com.sist.main; // 코딩 순서 => package => import => class


import com.sist.board.Board;   // 우리가 만든것도 import 할 수 있다.패키지에서 패키지를 불러올때 import 를 사용한다.따라서 패키지를 만드는 순간 접근을 어디까지 할 것인지 계산해야한다.
/*
 *    public          (protected       default)      private
 * ==========================================================
 * 모든 클래스 사용 가능         같은 폴더(패키지)에서만 접근 가능           본인 클래스 에서만 접근 가능!(id...)
 * 생성자(public or default) 메소드 etc..   패키지명 다르면 사용 못함.
 * 					   **protected:상속받은 경우==> 다른 패키지도 접근 가능
 * 
 * 상속==> 필요한 것만 얻어 쓰겠다!!!
 */








public class MainClass {

	public static void main(String[] args) {  // 다른 패키지에서 호출할 것이기 때문에 public이 되어야한다. 
		// TODO Auto-generated method stub

		Board b = new Board(1, "게시판", "2020-01-02");  // 폴더가 다른 경우 디폴드를 사용 못한다. 따라서 Board 생성자를 public으로 만들어줘야함.		
	}
}
