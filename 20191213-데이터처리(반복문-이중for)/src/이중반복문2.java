/*
 * ����ó��, �ڵ��׽�Ʈ ==> double for statement
 * 
 * //break    : �ݺ��� �ߴ��Ҷ�
 *   for(int i=1; i<=10;i++)    ==> 1 2 3 4 ���� �ϰ� break �ɸ��� ������ ������ ������ �� ��� ��!
 *   {
 *   
 *   if(i == 5)
 *     break;   ==> ���� ���⼭ �����϶�.
 *     System.out.println(i);
 *   
 *   }
 *   
 *      
 * //continue : Ư���κ��� ���� �Ҷ�
 *  for(int i=1; i<=10;i++)    ==>  1 2 3 4 6 7 8 9 10 ==> 5�� �����ϰ� ���
 *   {
 *   
 *   if(i == 5)
 *     continue;   ==> 5�� ���� ������ ���� �ٽ� �����϶�.   ex) �ܾ�ã����?
 *     System.out.println(i);
 *   
 *   }
 * 
 * 
 */
 
 
public class ���߹ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			
			if(i == 5)
				break;   
				System.out.println(i);
				
		}
			
			System.out.println("===continue===");
			
			for(int i=1; i<=10; i++) {
				
				if(i%2 != 0 )    
					continue;   
					System.out.println(i);
			}		
			
	}

}
