		// 1~45���� ���� �߻� , �ߺ����� 6�� 
		// �迭 ==>6��
		// �� �� ==> for�� 6����  ==> �� �ȿ��� while�� ������(�����߻�,�迭 ����� �����Ϳ� ����(����))
/*
 * 			for(6Ƚ��)
 * 		{
 * 
 *   		while(�ߺ�)
 *   		{
 *   		�����߻�
 *   		�迭 ����� �����Ϳ� ����(����)
 *   
 *   		}
 * 
 * 			�迭 ����
 * 		}
 * 
 * 
 * 		
 */
		
		
		
		// ó�����  ->  �Ű����� x
		// ��±��!
        // ȥ�� ���μ���.
	
public class �޼ҵ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int[] com = new int[6];
		 
		 // ������ �迭�ȿ� �������� �ִ��� ���غ�
		 int su = 0;
		 boolean bCheck = false;
		 
		 
		 //ó��
		 for(int i = 0 ; i< 6; i++)
		 {
			  bCheck = true;
			  
			  while(bCheck)
			  {
				  su = (int)(Math.random()*45)+1;
				  bCheck = false;
				  
				  for(int j=0; j<i; j++)
				  {
					  
					  if(com[j] == su)
					  {
						  bCheck = true;
						  break;
					  }
					  
				  }
				  
			  }
			  
			  //�迭�� ����
			  com[i] = su;
			  
			  
			  
			  		// 0.0~0.99*45
			        // (int) 0~44
			  		// +1 ->1~45
		 }
		
		//���- �ε����� �ƴ� �����͸� �����´�.
		 for(int i:com) // ����� ������ �Ѱ��� �о�´�.(for-each)
		 {
			System.out.print(i +  " ");
			 
			 
		 }
		 
		 
		 
		 
		 
		 
		
	}

}
