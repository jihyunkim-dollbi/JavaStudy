package com.sist.main; // �ڵ� ���� => package => import => class


import com.sist.board.Board;   // �츮�� ����͵� import �� �� �ִ�.��Ű������ ��Ű���� �ҷ��ö� import �� ����Ѵ�.���� ��Ű���� ����� ���� ������ ������ �� ������ ����ؾ��Ѵ�.
/*
 *    public          (protected       default)      private
 * ==========================================================
 * ��� Ŭ���� ��� ����         ���� ����(��Ű��)������ ���� ����           ���� Ŭ���� ������ ���� ����!(id...)
 * ������(public or default) �޼ҵ� etc..   ��Ű���� �ٸ��� ��� ����.
 * 					   **protected:��ӹ��� ���==> �ٸ� ��Ű���� ���� ����
 * 
 * ���==> �ʿ��� �͸� ��� ���ڴ�!!!
 */








public class MainClass {

	public static void main(String[] args) {  // �ٸ� ��Ű������ ȣ���� ���̱� ������ public�� �Ǿ���Ѵ�. 
		// TODO Auto-generated method stub

		Board b = new Board(1, "�Խ���", "2020-01-02");  // ������ �ٸ� ��� �����带 ��� ���Ѵ�. ���� Board �����ڸ� public���� ����������.		
	}
}
