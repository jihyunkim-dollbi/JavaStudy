import java.util.Scanner;

public class �迭2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] arr = new int[3];
		                 // ===  : 3�� �ǹ̴� ĭ�� ����!
		                    		
		Scanner scan = new Scanner(System.in);  // �迭 �ȿ� ���� ���� Ű����� �Է��ϱ�.
		
		int max = 0;
		
		for(int i=0; i<arr.length; i++)   // 0���� �����ؼ� 1,2 ���� �� 3�� ���ư� = > ������ �迭�� 3ĭ�� ������ ������!
		{
		
			System.out.println((i+1)+"��° ���� �Է�: ");
		   
			arr[i] = scan.nextInt();
		    if(arr[i]>max)
			   max=arr[i];
		 
		}
		System.out.println("���� ū��: "+max);
		
		
		
		 
	}

}
