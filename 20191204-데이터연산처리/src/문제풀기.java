
public class ����Ǯ�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		// ����2��
		 int a=1500000;
         int b=55000;
         double c=a*0.1;
         
         System.out.println("�Ǽ��ɾ�="+(a+b-c)+"��"+"\n");
         
         // ����3��
         
         String name="ȫ�浿";
         String department="���ߺ�";
         String position="�븮";
         int sal=1500000;
        		 
         System.out.println("�̸�:"+name);
         System.out.printf("�μ�:%10s",department);
         System.out.print("����:"+position);
         System.out.println("�޿�:"+sal+"\n");
       
        // System.out.printf("���:%.2f",avg);
         
		
		// ���� 4��
         
         int kor,eng,mat;
         double avg;
         
         String name1="�ε鷹";
         kor=90;
         eng=70;
         mat=75;
         
         int total=kor+eng+mat;
         avg=total/3.0;
         
         System.out.println("�̸�1:"+name1);
         System.out.println("�հ�����:"+(kor+eng+mat));
         System.out.printf("�������:%.1f",avg);
        		 
         // ���� 6
         
         int a11=123;
         int b11=10;
         int c11=((a11/(b11-1)));
         
       // Math.ceil(10/3) => 4
         
         System.out.println("\n"+"�ʿ��� �ٱ����� ��:"+c11);
         
         System.out.println("������:"+(int)((a11%b11)/10));
         
        
         
         
         
	}

}
