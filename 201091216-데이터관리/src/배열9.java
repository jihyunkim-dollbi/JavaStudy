/*
 * static 변수
 * instance 변수
 * 
 */


import java.util.Scanner;

public class 배열9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
        // 3명의 학생 => 국어, 영어, 수학 점수를 입력받는다. => 출력 
	
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
			
			
			System.out.println((i+1) + "번째 국어 점수를 입력하세요: ");
			kor[i] = scan.nextInt();
			System.out.println((i+1) + "번째 영어 점수를 입력하세요: ");
			eng[i] = scan.nextInt();
			System.out.println((i+1) + "번째 수학 점수를 입력하세요: ");
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
			
			
			
		switch((int)avg[i]/10) // 정수,문자,문자열 ,실수(X)

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
			
			
			
			//출력
		  for(int i=0; i<3; i++)    // 출력하는 곳!
			  
		  {
			  
			  System.out.println(kor[i]+" "+eng[i]+ " " + math[1] + " " + total[i] + " " + avg[i] + " "+ score[i]);
			  

			  
			  
		  }
		
		
		
		
		
		
	}

}
