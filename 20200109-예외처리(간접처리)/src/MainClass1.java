import java.io.IOException;
import java.sql.SQLException;

class MyException{
	
	// ������ ���� �߿� ����Ǵ� ������ �ִ�. => �ý��ۿ� �˷��� �ٰ���. => throws
	// �������x
	public void display() throws NumberFormatException, NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException {
		
		System.out.println("MyException: display Call....");
	
		
	}
	
	public void display1() throws IOException, SQLException {
		
		System.out.println("MyException: display1 Call....");
	}
	
	
}
public class MainClass1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		// �޸��Ҵ�
		//NumberFormatException, NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException
		//��Ÿ�� : ���������� exception��...
		MyException m = new MyException(); // m�ּҿ� diplay() ����....==> ��ü����
		m.display(); //==> ���������� exception��...
		
		//1. main�� throws IOException, SQLException �߰��ϰų�...
		
		//2.
		try {
		
		m.display1(); //
		}catch(IOException e) {}
		catch(SQLException e) {}
		
		// 3.
		try {
			
			m.display1();
		}catch(Exception e) {}   // �� ū ��ӵ��� ���� ��� ��� ����. 
		
		
		
		// 4. 
		try {
			
			m.display1();
		}catch(Throwable e) {} 
		
		
		
			
	}

}
