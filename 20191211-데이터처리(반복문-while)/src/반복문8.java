import java.util.Scanner;

import javax.swing.JOptionPane;

// ������  ==> dan�� �Է� �޾Ƽ�
/*
 * �޼ҵ带 ����� ���� ������.(��� + ������!!)
 * 
 *    ���α׷�
 *    ======
 *    ��������� + java ���̺귯�� + �ܺ� ���¼ҽ�(mvnrepository.com)
 *    ====================================================
 *                          ����.
 *        
 *    //mybatis ���̺귯��
 *    //jsoup - html ������
 *    
 *    
 *    
 *    �������� -> ��𼭺��� ������ �ݺ��ϰ� �Ǵ� ���� 
 *    
 *    2*1=2���� ���������� 1�̴�. 
 */    //= �ڿ��� ������ �ƴϴ�!!

public class �ݺ���8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
    		Scanner scan = new Scanner(System.in);
    		
    		System.out.println("�� �Է�:");
    		int dan = scan.nextInt();
    		
    		//ó��
		    //String s=JOptionPane.showConfirmDialog("�����Է�") --> �Է�â �����
		
    		int i = 1;
    		while(i<=9) 
    		
    		{
    			System.out.printf("%2d * %2d = %2d \n", dan,i,dan*i);
    			i++;
    		}
    		
		
	}

}
