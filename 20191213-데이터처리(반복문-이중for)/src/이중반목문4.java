import java.util.Scanner;

/*
 * 
 * ������ ���
 * 
 * for+while 
 * 
 * 
 * 
 */
public class ���߹ݸ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1 ; i <= 9; i++)
		{
			
			for(int j=1 ; j <= 9; j++) {
				
				System.out.printf("%2d *%2d = %2d\t" ,j,i,j*i);
				
			}
			
			System.out.println();
			
		}
		
		
		Scanner scan = new Scanner(System.in);
	//	=======================================
		// heap �� ����	scan. ---> scan �ȿ� heap �� ������ �ִ� next()�� �ҷ���	
        // ��� ���ʿ� ���� �޸𸮰��� �ݺ��Ǿ� ������.
		
		
		int a =1;
    //  =======================================
		// stack �� ����- �޸𸮰�? 	
	     
    // static --> public ! �������� ����@
		
		
		System.out.println("\nfor + while==========");
		
				
		for(int i=1; i<=9; i++) {
			
			int j=1;        // int�� �����ϹǷν� �޸� ���� ������, �޸𸮰�9��.
			while(j<=9) {   // ���ǹ�
				
				System.out.printf("%2d *%2d = %2d\t\n" ,j,i,j*i);
				j++;   // ����
			}
			
			System.out.println();
		}
		
		
	}

}
