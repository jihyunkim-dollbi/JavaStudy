import java.util.*;// Scanner => scanf (c)
/*
 * �ڹ� / C
 * 
 * �ڹ� => Ŭ����
 * C => �Լ�����
 * 
 * 
 */


public class ���׿�����_���������2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // ���� => ���� ���� => �����Է�  int a=10
		/*
		 * int a; //  ����
		   a=10
				
		 * int a=10; //����� ���ÿ� ���� ����
		 * 
		 * �Է��� ���� �޾Ƽ� ����
		 * ����(����) => ������ ���� ����
		 * 
		 */
		/*
         int a=(int)(Math.random()*100)+1;
         // Math.random() => 0.0 ~ 0.99 ==> 0.0 ~99.0   => ������  0~99 + 1 ==> 1~100
         System.out.println("a="+a);
 
         
         // System.in => Ű���� �Է°��� �޴´�.
         Scanner scan=new Scanner(System.in);
         System.out.print("���� �Է�:");
         int b=scan.nextInt();   //int b=scan.nextdouble();
         System.out.println("b="+b);
         
      
          */
         
        // ���������==> +, /
		// ����, ����, ���� ������ �޾Ƽ� ���� , ���=> �Ҽ��� ���ڸ� ���
		
		int kor,eng,math,total;
		double avg;
		// �����ϰ� ��������� �̸� ��������
		
		//�Է��� �� �ִ� ����� Ŭ���� ������ �´�.
		
		  Scanner scan=new Scanner(System.in);
		  
		  System.out.print("��������:");
		  kor=scan.nextInt();
		
		  System.out.print("��������:");
		  eng=scan.nextInt();
				  
		  System.out.print("��������:");
		  math=scan.nextInt();
		  
		  // ����
		  
		  total=kor+eng+math;
		  
		  //���
		  
		  avg=total/3.0;
		  
		  
		  // ������
		 System.out.println("��������:"+kor);
		 System.out.println("��������:"+eng);
		 System.out.println("��������:"+math);
		 System.out.println("����:"+total);
		 System.out.printf("���:%.2f",avg);
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
