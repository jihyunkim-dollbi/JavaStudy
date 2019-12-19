import java.util.Scanner;

/*
 * 	  1.��� ����ϴ� ��(������)
 * 
 * 
 * 		�迭 => Ŭ���� =>��Ű�� = > ���̺귯��		
 * 			
 * 
 *   	 ���α׷� :
 *   	 ������ + ��ɹ� (�޼ҵ�) =>Ŭ����
 *  	============
 *   	������  --> ����(�ڹ� - CBD)
 *          
 *          
 *    2. �ڹ� => ����Ŭ = > html(CSS, JavaScript) -> JSP => MVC = > Spring => Kotlin(�����) ==> ����
 *                      ============================    ===============
 *                      		Front End 				   Back End     
 *    
 *    �迭�� ���� : ������  ==> ���������� ������ ��.
 * 	  ========  ���� ���������� ���� 
 *              ����� => �޸� ũ�⸦ ����
 *              ====================
 *              1) ����
 *                 int[] arr;
 *                 ===   === �迭�� (���� ����� �������� �ּ�)
 *                 ��������                   =======> heap == > stack
 *                 
 *              2) �ʱ�ȭ - ���������� �ʱ�ȭ �׻� �ʿ�
 *                 arr  = {1,2,3,4,5}
 *                 arr = new int[5] ==> �޸� ���� �Ҵ� => ���߿� ����������!
 *              3) ���� �б�, ����  ==> �ε���
 *                 int [] arr= {10,20,30,40,50}
 *                 
 *                 
 *   							arr[0] = 10  arr[0]=20 --> �Ϲݺ���ó�� ��� ����             
 *                    arr		arr[0]  arr[1]     2     3     4   ==> ������... for
 *                    ===       ================================
 *                    100			 10    20    30    40    50
 *                    ===       ================================
 *								 100    104    108    112    116   �ּҰ�!                 
 *                 
 *              
 * 
 *   Ŭ����
 *   1. �������� Ŭ����
 *   2. �׼� Ŭ����(�޼ҵ� ����)
 *   3. ȥ���� Ŭ����
 *   
 *   
 *   3 morning  ������ ����
 *   3 night   å����
 *   1 come �ڵ庹��
 *   1 go  �ڵ庹��
 *   1 break time
 *   9 x 5 = 45
 *   
 *   13 x 2 =26
 *   3 x 2 = 6
 *    
 *   
 *   
 *   
 *   
 */
import java.util.*;
import java.text.*;

public class �迭1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		// �޷� �����
/*       1) ��, ��, �� �Է� �޴´�.
 *       2) 1������ ������ �˰� �־�� �Ѵ�.
 *       3) ������ ���� ����
 *       4) ����ϱ�.(���� ��¥�� �� �ٸ���)
 */
		
		
	
		 
	/*
		while(true)
		{
			
			
			Date date = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:dd");   ==> �ý����� ��¥�� �о���̴� �޼ҵ�.
			System.out.println(sdf.format(date));
			try {
				
				Thread.sleep(1000);
			
			}catch(Exception ex) {
		 
				}
				
		}
		
		*/
		
		// MONTH ->0 ���� �����ؼ� + 1 �������
		// DAY OF WEEK
		Calendar cal = Calendar.getInstance();
		int y = cal.get(cal.YEAR);
		int m = cal.get(cal.MONTH)+1;
		int d = cal.get(cal.DATE);
		int w = cal.get(cal.DAY_OF_WEEK);
				
		char[] strWeek = {'��','��','ȭ','��','��','��','��'};		
	/*	System.out.println(cal.get(cal.YEAR));
		System.out.println(cal.get(cal.MONTH));
		System.out.println(cal.get(cal.DATE));
		System.out.println(cal.get(cal.DAY_OF_WEEK));*/
		System.out.println("=====" + y + "�⵵" + m + "��" + d + "��" + strWeek[w-1] + "����" + "======");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�⵵ �Է�: ");
		int year = scan.nextInt();
		
		System.out.println("�� �Է�: ");
		int month = scan.nextInt();
		
		System.out.println(year + "�⵵ " + month + "��");
			
		System.out.println("\n");
	/*	
		System.out.print("��\t");
		System.out.print("��\t");
		System.out.print("ȭ\t");
		System.out.print("��\t");
		System.out.print("��\t");
		System.out.print("��\t");
		System.out.print("��\t");
	*/	
		
		
		
		
		for(int i = 0; i < 7 ; i++)
		{
			System.out.print(strWeek[i] + "\t");
		}
		
		// 1������ ������ ���Ѵ�.
		// ���⵵�� 12/31������ �� ���� ���Ѵ�
		int total=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400;   // ���⵵
		
		
		// ���ޱ����� ���� ���Ѵ�.
		
		int[] lastDay= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		if((year%4 == 0 && year%100 != 0) ||year%400 ==0)
		   lastDay[1] = 29;
		else
			lastDay[1] = 28;
		
		for(int i = 0; i< month-1; i++)
		{
			
			total+=lastDay[i];
		}
		
		
		
		
		// +1 ===> %7 == ������ ���Ѵ�.
		total++;   // �� ���� 1����
		
		
		
		int week =total%7;  // �Ͽ����� �ε���  �Ͽ����� 0, �������� 1, ȭ������ 2 // ���Ϻ� �ε��� �� ��.
		 // ������ ��¥�� �迭�� ��´�.
		System.out.println();
		for(int i = 1; i <=lastDay[month-1]; i++)  // 1�Ϻ��� �����Ҷ� ù°���̴�. ���� week��ŭ ������ ����.
		{
			
			if(i == 1)
			{
				for(int j = 0; j < week; j++)
				{
					
					System.out.print("\t");
				}
				
				
			}
			
			System.out.printf("%2d\t", i);
			week++;
			if(week>6)
			{
				
				week = 0;    
						System.out.println();
				
			}
			
			
		}
		
		
		
		
	}

}
