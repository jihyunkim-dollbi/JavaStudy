/*
 *     �������ǹ� : �������� ������ �����ϰ�, �ش� ���� 1���� ������ �ǰ� �����.
 *     1) ���� 
 *          if(���ǹ�)
 *             ���๮��1      ==> true => ���๮��1�� �����ϰ� ����!
 *             					flase=> �ٷ� �ؿ� ���ǹ����� �̵�!
 *		    else if(���ǹ�)
 * 				���๮��2
 * 			else if(���ǹ�)
 * 				���๮��3
 * 			==============
 * 		 	else
 * 				���๮��4 => ���� �ش��ϴ� ������ ���� ��쿡 ó��(����ó��)
 * 
 *       
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
import java.util.Scanner;
public class �������ǹ�1 {   // �������� : public - ����  // private --> ĸ��ȭ��� - ���� �����ִ�!
	                                              // protect? --> ������ ����� ������. ���!

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    // ����ó��
		// 3���� ������ �޾Ƽ� => ������ ���, ����� ���, ������ ���
		// �ʿ��� ������ �����ϱ�!
		
		int kor, eng, math, total, temp; // temp �ӽú���(���������� ���غ���- �������ҋ� '/10')
		double avg;
		char score;
		// �ٽ� ����ϱ� ���� �ʱⰪ�� ������ �־���Ѵ�. 0���� �༭ �ʱ�ȭ �ֱ⵵��. �ٵ� �����ϰ� ���� �����ص� ��� x??
		
		// �Է¹ޱ�
		Scanner scan = new Scanner(System.in);  //system-> static(����)
		// new : �޸� �Ҵ�(�ּ�����.)
		// Scanner(System.in) : ������ ���� �ʱ�ȭ(������)
		// Class => ����� ���� �������� (�츮�� ���ϴ� �޸� ũ�⸦ �������)(����+�޼ҵ�) 
		
		System.out.println("��������: ");
		kor = scan.nextInt();
		
		System.out.println("��������: ");
		eng = scan.nextInt();
		
		
		System.out.println("��������: ");
		math = scan.nextInt();
		
		
		//����
		total  = kor + eng + math;
		//���
		avg = total / 3.0;
		
		temp=(int)avg; // total/3
		
		//����
		
		if(temp >= 90)
			score = 'A';
		else if(temp <= 80)
		    score = 'B';
		else if(temp >= 70)
			score = 'C';
		else if(temp >= 60)
			score = 'D';
		else
			score = 'F';
		
		System.out.println("����: "+ total);
		System.out.printf("���:%.2f\n", avg);
		System.out.println("���� :" + score);
		
		
		
		
		
		
		
	}

}
