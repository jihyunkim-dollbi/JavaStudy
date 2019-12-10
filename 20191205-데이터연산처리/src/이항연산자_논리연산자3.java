// if
public class 이항연산자_논리연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 결과값 ==> boolean
		
		boolean b1=(6<7) && (7==7); // true
			//    true     true  ==> &&
		System.out.println("b1="+b1);
		
		
		b1=(6>7) && (7==7); // false
		System.out.println("b1="+b1);
		
		
		b1=(6>7) || (7==7); // true
		System.out.println("b1="+b1);
		
		b1=(6<7) || (7==7); // true
		System.out.println("b1="+b1);
				
		b1=(6>7) || (7!=7); // false
		System.out.println("b1="+b1);
		
		//true&true (&&)
		//true(||)
		
		
		// 보강!
		
		
	}

}
