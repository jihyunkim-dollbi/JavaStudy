import java.util.Scanner;

// ��������
// + - * /
// char c�� �迭�� �޾Ƽ� ���ϰ� for������ ���갪 �����ϱ�. 
//1. char �迭�� �ޱ� �����!
//2. �����ϱ� for������ ������
//3. �������� double�� void�� �����
//4. print void�� ����ϱ�!!
public class �޼ҵ�11 {
/*	
	static int[] input()
	{
		
		int[] arr = new int[2];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("ù��° ������ �Է��ϼ���: ");
		arr[0] = scan.nextInt();
		
		System.out.println("�ι�° ������ �Է��ϼ���: ");
		arr[1] = scan.nextInt();
		
		
		return arr;
		
	}
	
	
	static char[] input2()    // ��ĳ�ʷ� �Է¹޴� ���� �Ű������� �ƴϹǷ�==> �ϴ� ��Ʈ������ �ް�, �������� �������  char�� �����ϰ� ���߾���.
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("(+,-,*,/)�����ڸ� �Է��ϼ���: ");
		
		String op = "";
		
		op = scan.next();
		char[] c = op.toCharArray(); 
				
		return c;
	}
	
	
	static void calc(int[]arr, char[] c)
	{
	 
		int a = arr[0];
		int b = arr[1];
		
		
		
	   if (c == '+')
	   {
		   
		   System.out.println(a+b);
	   }
			   
	   else if(c == '-')
	   {
		   
		   System.out.println(a-b);
	   }
	   else if(c == '*')
	   {
		   System.out.println(a*b);
	   }
	   else if(c == '/')
	   {
		   if(b == 0)
		   {
			   System.out.println("0���� ���� �� �����ϴ�.");
		   }
		   else
			   System.out.println((int)a/b);    // ���� �� ū���� ������ ���� 0�� ���´�! �ֳ��ϸ� int �̱⶧���� �Ҽ������� ��� �������� ������!
		   
	   }
	   else
	   {
		   System.out.println("�����ڸ� �ٽ� �Է����ּ���.");
	   }
	   	   
	}
	
	
	
	
	
/*	
	static double result(int[]arr, char c)
	{
		int aa = arr[0];
		int bb = arr[1];
		
		double d = arr[0]
			
		
		return 
	}
*/	
	
/*	
	static void print(int[] arr, char c)
	{
		
		System.out.printf("%d %c %d = %.1f",arr[0], c, arr[1], calc() );
		
		
	}
	
*/
	/*
	static void process() 
	{
		int[] num = input();
		  char[] c = input2();
		   calc(num, c);      //calc(arr,c) �� ���������� arr���� error �߻�. arr�� ���� ������ calc���� arr�迭�� �־���� ������!!
		
	}
	
*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}

	
}
