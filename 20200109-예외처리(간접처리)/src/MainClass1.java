import java.io.IOException;
import java.sql.SQLException;

class MyException{
	
	// 구현된 내용 중에 예상되는 에러가 있다. => 시스템에 알려만 줄것임. => throws
	// 순서상관x
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
		// 메모리할당
		//NumberFormatException, NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException
		//런타임 : 생략가능한 exception들...
		MyException m = new MyException(); // m주소에 diplay() 저장....==> 객체생성
		m.display(); //==> 생략가능한 exception들...
		
		//1. main에 throws IOException, SQLException 추가하거나...
		
		//2.
		try {
		
		m.display1(); //
		}catch(IOException e) {}
		catch(SQLException e) {}
		
		// 3.
		try {
			
			m.display1();
		}catch(Exception e) {}   // 더 큰 상속도를 가진 기능 사용 가능. 
		
		
		
		// 4. 
		try {
			
			m.display1();
		}catch(Throwable e) {} 
		
		
		
			
	}

}
