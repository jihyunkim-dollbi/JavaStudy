// ? :
// (���ǹ�?��1:��2)  --> ��(React =>���׿�����)���� ���� ����.
// ���� (true) => ��1
// ���� (false) => ��2
/*
 *   
 * 
 * 
 * 
 * 
 */


import java.util.Scanner;
//����, ����, ���� ������ �Է¹޾Ƽ� ��� -> ����� 60 �̻��̸� true, false

// ���̸� �Է� ==> 15�� �̻��̸� (��ȭ��������) / ���� (��ȭ�����Ұ�)

public class ���׿�����_���׿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        
        /*
         * 
         *  ------------------------------------------------------------------------
         * 
         * scanner �Լ��� ����, 1. import java.util.Scanner; public ���� �����ش�. Ŭ���� ������ֱ�? 
         *                   2. Scanner scan=new Scanner(System.in);  ���´�. ���� �ȿ�!
         *                   
         *                   3. System.out.println("��������:"); ���´�. ---  ȭ�鿡 �̸� ��µ�.
         *                   4. int kor=scan.nextInt(); ���´�.        ---  �츮�� ���ϴ� ������ ���� ����! ���ϴ� ������ �Է��Ѵ�.
         *                      ===              ===
         *                      ����  -----------> ����   ==> ��������Ѵ�.
         *                   
         *                   
         *                      System.out.println("��������:");-     ------ ���� 3 &4 �� �ݺ�!
         *                      int math=scan.nextInt();
         *                   
         *                   
         *                   6.  int avg=(kor+math)/2;               ------ ��հ��� int�� �����ش�. ������ ��հ��� ������ ��Ƴ��ƾ� 60�� �̻�, ���������� ���ǹ����� �Ǻ��ϱ� ����.   
         *                    
         *                   7.  String result=avg>=60?"Pass":"Nonpass"; --- 6������ ���� ��հ��� 60���� ũ�� pass ������ nonpass �� ����ϱ� ����  �������ڸ� �������
         *                   
         *                   8.  System.out.println("���:"+result);    ----- ���������� println �� �̿��� 7���� ������� 60���� ũ��  pass ������ nonpass�� ��Ÿ����.
         *  
         * ---------------------------------------------------------------------------
         *                   
         * 
        System.out.println("��������:");
        
        
        int kor=scan.nextInt();
        //
        
        System.out.println("��������:");
        int eng=scan.nextInt();
        System.out.println("��������:");
        int math=scan.nextInt();
        
        int evg=(kor+eng+math)/3;
        
        
        String result=evg>=60?"Pass":"Nonpass";
        System.out.println("���:"+result);
        
        */
        
      
        System.out.println("����:");

        int age=scan.nextInt();
        
        String result=age>=15?"��������":"�����Ұ�";
        System.out.println(result);
        
        
        // �¼� => 1 2 3 4 5 => 1,2,4 => �¼����� �Ұ��� , 3,5 = > �¼����Ű���
        
        
        System.out.println("�¼�����:"+result);
        System.out.println("�¼��� �Է��ϼ���(1~5)?");
        int seat=scan.nextInt();
        
     //   String result=(seat==1 || seat==2 || seat==4)?"�Ұ���":"����";
        result=(seat==3||seat==5)?"���Ű���":"�Ұ���";
        
        System.out.println(result);
        
        
        
        
        
        
        
        
        
	}

}
