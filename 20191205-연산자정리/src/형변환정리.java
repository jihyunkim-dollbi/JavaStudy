/*
 * �ڵ� ����ȯ
 *   => int + double =double
 *      ===
 *      double�� �������� ����.
 *    
 *   => char + int = int
 *      ===
 *      int�� �ٲٰ� ����
 *      
 *         
 *         
 *      ==> char c='A'
 *      c>='A' && C<='Z'
 *         ==        ==
 *         65        90   => char �� ��� ���� => int����
 *         
 *         **int ���ϴ� ����� �� ���� ������ int �� ��.
 *         ==>byte+byte = int
 *         ==>short+short = int
 *         ==>char+char = int
 *      
 *      *      
 *      
 * ���� ����ȯ : cast ������    - ����� ���ϰų� A�� B�� C�� ��� int�� ����ȯ�� ���Ѽ� �����!!!!!!!!!!!!!!
 * =========downcasting
 * 
 * int ==> char
 * 
 *  ===> int a=65 ==> char b=(char)a;
 *  ===> char c=65; o �� ���ܷ� int �������� ������ �ִ�. because char�� ���� ���� ������ �ֱ⶧����.
 *       int a=10.7 x
 *       float f=10.7 x----------------------������ 10.7�� f�� �߰� ���߱� ������ ��ǻ�Ͱ� double�� �ν��ϹǷ� float�� f�� �߰��ؾ��Ѵ�.
 *       
 *       
 *       double d='A' O
 *       ���� ������ �������� �׻� Ŀ���Ѵ�.  
 *     
 *       char c=(char&int)65.0 o
 *  
 *  
 * double==> int
 * 
 * 
 *  
 */
public class ����ȯ���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
