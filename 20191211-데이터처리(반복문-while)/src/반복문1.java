/*
 *  1. �ݺ���
 *  
 *  while
 *  =======
 *    ����) ������-> ������ �ȵɼ����ִ�.
 *       �ʱⰪ                1
 *       while(���ǹ�)  2
 *       {
 *         �ݺ� ���๮��    3
 *         ������            4  -> 2�� ���� false�� �ɋ�����.
  *       }
 *        
 *        ex)
 *         
 *        1~10
 *        int i = 1;
 *        while(i<=10)  
 *        {
 *         System.out.println(i);
 *         i++;
 *        }
 *  
 *  do while
 *  =========
 *       ����) ������ - �ѹ��̻��� �ݵ�� ����
 *          �ʱⰪ                1
 *          do
 *          {
 *            ���๮��          2
 *            ������            3
 *         
 *          }while(���ǹ�); 4
 *         
 *        ex)
 *        
 *         int i=1;
 *         do
 *         {
 *         
 *         System.out.println(i);  // �ϴ� ���
 *         i++; // ����� ������. 10�� �ɋ����� ���.
 *         }while(i<=10)  -> �����Ȱ��� ��.
 * 
 *   for
 *   ======
 *        ����) 1    2     4
 *        for(�ʱⰪ;���ǽ�;������)
 *        {
 *            ���๮��   3
 *        }
 * 
 *         ex) 
 *         for(int i = 1; i<=10; i++)
 *           {
 *              System.out.println(i);
 *           }
 * 
 *    ��� ����(���� -> ������/ ��-> �Ʒ�x)
 *    =========>
 *    =========>
 *    =========>
 *    
 * 
 *   1���� 10���� ��� ���ٿ� 3����
 * 
 * 
 */
public class �ݺ���1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int i = 1;
		while(i<=10) {
			
			
			System.out.print(i + "\t");
			
			if(i%3 == 0)
			System.out.println();
			i++;
			
			
			
			
			System.out.println("\ndo~while");
		
	      	i = 1;  //�ʱⰪ�ֱ�
	      		      			    
	      	do {
	      		
	      		System.out.print(i + "\t");
				
				if(i%3 == 0)
				System.out.println();
				i++;
	      		
	      	}while(i<=10);
		
		
		     System.out.println("\nfor");
		     
		    
		     for(i=1; 1<=10; i++)
		     {
		    	 System.out.print(i + "\t");
					
					if(i%3 == 0)
					System.out.println();
					
		     }
			
		}
		
		
	}

}
