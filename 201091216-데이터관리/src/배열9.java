/*
 * static ����
 * instance ����
 * 
 */


import java.util.Scanner;

public class �迭9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
        // 3���� �л� => ����, ����, ���� ������ �Է¹޴´�. => ��� 
	
		//80 80 80 240 B 2  80.0
		//90 90 90 270 A 1  90.0
		//70 70 70 210 C 3  70.0
		
		Scanner scan = new Scanner(System.in);
		
		

		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] math = new int[3];
		int[] total = new int[3];
		double[] avg = new double[3];
	    char[] score=new char[3];
		
		int max = 0;
		int min = 0;
		int mid = 0;
		
		for(int i = 0; i < 3; i++)
		{
			
			
			System.out.println((i+1) + "��° ���� ������ �Է��ϼ���: ");
			kor[i] = scan.nextInt();
			System.out.println((i+1) + "��° ���� ������ �Է��ϼ���: ");
			eng[i] = scan.nextInt();
			System.out.println((i+1) + "��° ���� ������ �Է��ϼ���: ");
			math[i]= scan.nextInt();
			
			total[i] = kor[i] + eng[i] + math[i];
			avg[i] = total[i] / (int)3.0;
	
			
			
			/*	
			if(avg[i] > 90)
			{
				grade[i] ='A';
						
			}
			if  (avg[i] > 80)
			{
			   
				grade[i] = 'B';
				
			}if (avg[i] > 70)
			{
				
				grade[i] = 'C';
			
			}if (avg[i] > 60 )
			{
				
				grade[i] = 'D';
							
			}
			else
				 grade[i] = 'F';
			
		}	
		
		*/
			
			
			
		switch((int)avg[i]/10) // ����,����,���ڿ� ,�Ǽ�(X)

    	{

    	case 10:

    	case 9:

    		score[i]='A';

    		break;

    	case 8:

    		score[i]='B';

    		break;

    	case 7:

    		score[i]='C';

    		break;

    	case 6:

    		score[i]='D';

    		break;

    	default:

    		score[i]='F';
    	}
			
			
			
	}		
			
			
			
			//���
		  for(int i=0; i<3; i++)    // ����ϴ� ��!
			  
		  {
			  
			  System.out.println(kor[i]+" "+eng[i]+ " " + math[1] + " " + total[i] + " " + avg[i] + " "+ score[i]);
			  

			  
			  
		  }
		
		
		
		
		
		
	}

}
