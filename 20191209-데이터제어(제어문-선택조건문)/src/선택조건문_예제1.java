/*
 * ���� = > ��ǻ�Ϳ��� ������ ���� ���� �ϴ� ��.
 * 
 * 
 */
public class �������ǹ�_����1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = (int)(Math.random()*101);  // 0~100
		// 0.0~0.99 = > 0.99 *101 ==> 100.~
		System.out.println("score = " + score);
		
		//90�̻� -> A 80-> B 70 ->C 60 ->D  60 ���ϴ� F ���.
		
	//	if(score < 60) {
	//		System.out.println("F�����Դϴ�.");
	//	}
	//	else {
	//		if(score >= 90)
	//				System.out.println("A����");
	//		if(score >= 80)
	//			System.out.println("B����");
	//		if(score >= 70)
	//			System.out.println("C����");
	//		if(score >= 60)
	//			System.out.println("D����");
			
	//	}
		
		/// ���� ���� ������� ���� ���, 70 ������ ����� D,C ������ ��� ������ ������ �̰��� ������ ������ ����־���Ѵ�.
		
		     if (score >= 90 && score <= 100) {
		    	 System.out.println("A����");
		     }
		     else 
		     {
		    	 // ��ø if => ���� ���ǹ�
		    	 // if�� �������� ������� ��쿡�� ���� �´� ��� ������ ������ ���ִ�.
		    	 
		    	if(score >= 80 && score < 90)     
		    	 System.out.println("B����");
		     
		        if (score >= 70 && score < 80)
		    	 System.out.println("C����");
		     
		        if (score >= 60 && score < 70)
		    	 System.out.println("D����");
		        if (score <60)
		        	System.out.println("F����");
		     }
		     
		
		  //   10���� �����ְ� ó���ϸ� �� ���� ���� �ִ�. 
		  //   ���ǹ� ���� ; �� ������ ����ȵ�.
		     
		     
		
		
		
		
		
		
	}

}
