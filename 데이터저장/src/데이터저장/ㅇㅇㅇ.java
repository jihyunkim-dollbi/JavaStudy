package ����������;
/*
 *  �̸�,����,����,���� ������ ������ ��
 *  �̸�, ����,���� ����, ����, ����� ���
 * 
 */


public class ������ {

	public static void main(String[] args) {
  
		String name="kim";
		int Kor=100;
		int Eng=95;
		int Math=90;
		
		System.out.print("�̸�:"+name+"\t");
		System.out.print("��������"+Kor+"\t");
		System.out.print("��������:"+Eng+"\t");
		System.out.print("��������:"+Math+"\t");
		System.out.print("����:"+(Kor+Eng+Math)+"\t");
		System.out.print("���:"+(Kor+Eng+Math)/3.0+"\n");
		
		System.out.println("�̸�:"+name+"\t");
		System.out.println("��������"+Kor+"\t");
		System.out.println("��������:"+Eng+"\t");
		System.out.println("��������:"+Math+"\t");
		System.out.println("����:"+(Kor+Eng+Math)+"\t");
		System.out.println("���:"+(Kor+Eng+Math)/3.0+"\t");
		
		
		
		// ����/����=����
		
		// QUESTION - ������ ����,���� �ϰ� ������ ��� �ұ�?
		//          -  System.out.println("���:%.2f",(Kor+Eng+Math)/3.0); -->Doesn't work!
		
		System.out.printf("���:%.2f",(Kor+Eng+Math)/3.0);
		
		
	}

}
