// % => 나머지 연산자
/*
 * 
 * 연산자 ==> 형변환(연습많이필)
 *          산술 : / , % 
 *               / => 0으로 나눌 수 없다.
 *               정수/정수 = 정수
 *               
 *               % => 왼쪽편 값의 부호를 따라간다
 *                    양수%양수(or 음수) ==> 양수
 *                    음수%음수(or 양수) ==> 음수
 *                    
 *                    
 *                    
 */
public class 이항연산자_산술연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //   int a=30;
       // int b=7;
        //int c=a/b;
       // System.out.println("c="+c); // 정수/정수는 소수점 이하 값은 사라짐.
        
        int a=30;
        double b=4.0;
        double c=a/b;   // 큰것으로 받아줌
        System.out.println("c="+c); //  문자열은 정수값이다. 따라서 실수와 문자열 중에는 실수가 큰것이다.  정수값에는 일반정수와 문자열값도 있다.
        
        //  나머지
        int d1=5%2; 
        int d2=-5%2;
        int d3=-5%-2;
        int d4=5%-2;
        
        System.out.println("d1="+d1);
        System.out.println("d2="+d2);
        System.out.println("d3="+d3);
        System.out.println("d4="+d4);
        
        // 따라서 왼편의 부호를 따라감.
        // 345667 를 3,4,5,6,6,7 로 나눌때 필요, 또는 배수를 구할때 필요. 
        
        
        int e=369;
        
        int h100=e/100;
        int h10=(e%100)/10;
        int h1=e%10;
        
        System.out.println("100자리:"+h100);
        System.out.println("10자리:"+h10);
        System.out.println("1자리:"+h1);
        
        ///////////////////////////////////////////
        // 자릿수 개수 구하기.
        
        int r=65430;
        
        
        int k10000=r/10000;
        int k1000=(r%10000)/1000;
        int k100=(r%1000)/100;
        int k10=(r%100)/10;
        int k1=(r%10)/1;
        
        System.out.println("\n"+65430+"\n");
        System.out.println("10000자리 개수="+k10000);
        System.out.println("1000자리 개수="+k1000);
        System.out.println("100자리 개수="+k100);
        System.out.println("10자리 개수="+k10);
        System.out.println("1자리 개수="+k1);
        
        
        
        String s='A'+10f+100L+100+10.5+"";
        
        //        110.5+"" -> "110.5"+'A' => "110.5A"+10
        //     "110.5A10"+100  =>"110.5A10100
        // 앞에는 계산, 연산이 되고 뒤에는 문자열이 붙는다.
        System.out.println(s);

        
        
	}

}
