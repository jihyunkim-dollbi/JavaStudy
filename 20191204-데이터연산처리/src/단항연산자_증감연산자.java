/*
 * ===================
 * method ����(static)
 * ===================
 * stack => �޸� ����({} �� ������ �������� ȸ�� - ���� ����ϴ� ���� -> �������� - ��������
 * ===================
 * heap => ����ڰ� ���� => �������÷����� ȸ�� ->�������(��������)
 * ====================
 * 
 * 
 * 
 */
public class ���׿�����_���������� {
  // int a=10 ��������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// --, --
		int a=10;
		a--; // ��ġ���� => a=a+1  => a=10+1
		a--;
		a--;
		System.out.println("a="+a);
		
		int b=10;
		--b;
		--b;
		--b;
		System.out.println("b="+b);
		
		int c=10;
	    int d=c--;   // ���� ���Ը��� ���� ���� , d=10 , c=9
	    System.out.println("c="+c);
	    System.out.println("d="+d);
		
		
	    int e=10;
	    int g=--e;   // e���� ���� �����ϰ� ������ ���� g�� ����   e=9 , g=9  ***** edit -> find/replace  
	    System.out.println("e="+e);		
	    System.out.println("g="+g);
	}

}
