/*
 * 1-2+3-4+5.......-10
 * 
 * ���� = 1. user
 *       2. manager  // ������������ ���� ������ ���� �ִ�.
 * 
 * 2019 0.5
 * 2020 1
 * 2021 0.5
 * 2022
 * 
 * 
 */
public class �ݺ���2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int sum=0;
		for(int i=1;i<=10;i++) {
			
			
			if(i%2 ==0)
				sum-= i;  // '-'�� �ٿ��� 
			else
				sum+=i;   // '+'�� �ٿ���
			
		}
        	System.out.println("sum=" + sum);
	}

}
