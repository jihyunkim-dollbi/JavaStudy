/*
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
public class ���׿����� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        int b=a++; //��ġ - b�� a�� ����, �׸��� a�� ++������
        int c=++a;
        // a,b,c =12, 10, 12	
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        
        char ch='A';
        System.out.println(ch++);  // ����ϰ� ����
        System.out.println(++ch);  // �����ϰ� ���
        // char ch=h+1  --> char : char
        
        int i=10;
        int j=i++ + i++ + ++i + ++i + i++ + i++ + i-- + --i;  
        //    10    11    13    14   14       15    16    14
        
        int x=10;
        int y=9;
        
        boolean bCheck=(x<y)&&(++y==x);   // and  �����ڴ� ���� ������  false�̱� ������ ���� ������ ���� �ʴ´�. or ������ ���� �տ��ִ°� true�� ����. false�� �ڿ� �ִ°� ������.
        System.out.println(bCheck);
        System.out.println("x="+x);
        System.out.println("y="+y);
        
        
        //���� ������ ==> �ݺ����� ���� ����. ������ �����Ͽ� �������� �����ϸ� ��!
        
        // ! => ���������� => boolean  => ���ǹ��� ���鶧 �ַ� ���!   !(--------) �տ� !�� �ٿ���  , ~ �ȵǴ� ���� ���ϰ� ������, ���� ������ �ְ� ! �� ���̸� ������ ���� �ȵǴ� ���� ���Ҽ��ִ�.
        // 3,5�� ���Ҷ� 124678  => !(seat==3||seat==5)  
        
         
        
        
        
        
	}

}
