// 3 ���� �޼ҵ� �ȿ� ���� ����ִ� ������!
// �Ű����� ���۹�
// �ݹ��� ���۷��� , �ݹ��̺���!   
// ==> �迭/Ŭ������ �ּҷ�..... 
public class �迭7 {
	static void getData2(int a)
	{
		
		a=500;
	}
	static void getData(int[] arr)
	{
		for(int i=0;i <arr.length; i++)
		{
			
			arr[i]= (int)(Math.random()*100)+1;
			
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
			String a="Java";          //��Ʈ���� �Ϲݺ�������̱⶧����(�ݹ��̺���Ÿ��) �޼ҵ忡�� ���� �������൵ �������������� ���´� 
			getData2(a);
			System.out.println(a);    // ���� 500 �̴�.
			
		*/	
			int a=100;          //��Ʈ���� �Ϲݺ�������̱⶧����(�ݹ��̺���Ÿ��) �޼ҵ忡�� ���� �������൵ �������������� ���´� 
			getData2(a);
			System.out.println(a);    // ���� 500 �̴�.
			
			
			
			
		
			int[] arr = new int[5]; // ��� 0��!
			
			for(int i:arr)
			{
				
				System.out.println(i);   // ������� 0��
			}
			getData(arr);
			
			for(int i:arr)
			{
				
				System.out.println(i);  // 
			}
			
			  
	}

}
