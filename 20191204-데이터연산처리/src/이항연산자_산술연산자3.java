// % => ������ ������
/*
 * 
 * ������ ==> ����ȯ(����������)
 *          ��� : / , % 
 *               / => 0���� ���� �� ����.
 *               ����/���� = ����
 *               
 *               % => ������ ���� ��ȣ�� ���󰣴�
 *                    ���%���(or ����) ==> ���
 *                    ����%����(or ���) ==> ����
 *                    
 *                    
 *                    
 */
public class ���׿�����_���������3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //   int a=30;
       // int b=7;
        //int c=a/b;
       // System.out.println("c="+c); // ����/������ �Ҽ��� ���� ���� �����.
        
        int a=30;
        double b=4.0;
        double c=a/b;   // ū������ �޾���
        System.out.println("c="+c); //  ���ڿ��� �������̴�. ���� �Ǽ��� ���ڿ� �߿��� �Ǽ��� ū���̴�.  ���������� �Ϲ������� ���ڿ����� �ִ�.
        
        //  ������
        int d1=5%2; 
        int d2=-5%2;
        int d3=-5%-2;
        int d4=5%-2;
        
        System.out.println("d1="+d1);
        System.out.println("d2="+d2);
        System.out.println("d3="+d3);
        System.out.println("d4="+d4);
        
        // ���� ������ ��ȣ�� ����.
        // 345667 �� 3,4,5,6,6,7 �� ������ �ʿ�, �Ǵ� ����� ���Ҷ� �ʿ�. 
        
        
        int e=369;
        
        int h100=e/100;
        int h10=(e%100)/10;
        int h1=e%10;
        
        System.out.println("100�ڸ�:"+h100);
        System.out.println("10�ڸ�:"+h10);
        System.out.println("1�ڸ�:"+h1);
        
        ///////////////////////////////////////////
        // �ڸ��� ���� ���ϱ�.
        
        int r=65430;
        
        
        int k10000=r/10000;
        int k1000=(r%10000)/1000;
        int k100=(r%1000)/100;
        int k10=(r%100)/10;
        int k1=(r%10)/1;
        
        System.out.println("\n"+65430+"\n");
        System.out.println("10000�ڸ� ����="+k10000);
        System.out.println("1000�ڸ� ����="+k1000);
        System.out.println("100�ڸ� ����="+k100);
        System.out.println("10�ڸ� ����="+k10);
        System.out.println("1�ڸ� ����="+k1);
        
        
        
        String s='A'+10f+100L+100+10.5+"";
        
        //        110.5+"" -> "110.5"+'A' => "110.5A"+10
        //     "110.5A10"+100  =>"110.5A10100
        // �տ��� ���, ������ �ǰ� �ڿ��� ���ڿ��� �ٴ´�.
        System.out.println(s);

        
        
	}

}
