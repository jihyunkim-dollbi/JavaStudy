class Box implements Cloneable { // 메소드 없다. 클래스를 모아놓을 목적만 있다.
	
	int a = 10;
	int b = 20;
	@Override
	protected Object clone() throws CloneNotSupportedException {  // ==> 컴파일 exception => 예외처리 하고 사용해야함.
		// Object 형이기 때문에 Box로 형변환 해줘야함.
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box b1 = new Box();
		Box b2 = b1; // 같은 주소 참조.
		
		
		b2.a=100;
		b2.b=200;
		
		System.out.println("b1.a = " + b1.a);
		System.out.println("b1.b = " + b1.b);
		
		try {
		Box b3 =(Box)b1.clone();
		
		System.out.println("b3.a = " + b3.a);
		System.out.println("b3.b = " + b3.b);
		
		//b3.a = 100 ==> 변경 후 변경값을 그대로 복사했기때문에.
		//b3.b = 200
		//new해서 가져오면 10, 20 가져올 것임. 
		
		b3.a=1000;
		b3.b=2000;
		System.out.println("b3.a = " + b3.a);
		System.out.println("b3.b = " + b3.b);
		

		System.out.println("b1.a = " + b1.a);
		System.out.println("b1.b = " + b1.b);
		// b1.a =100 // b3와 주소 다름.
		// b1.b =200 
				
		
		}catch(Exception e) {}
		
		
	}

}
