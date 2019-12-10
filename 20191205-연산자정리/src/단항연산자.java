/*
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class 단항연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        int b=a++; //후치 - b를 a로 변경, 그리고 a는 ++시켜줌
        int c=++a;
        // a,b,c =12, 10, 12	
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        
        char ch='A';
        System.out.println(ch++);  // 출력하고 증가
        System.out.println(++ch);  // 증가하고 출력
        // char ch=h+1  --> char : char
        
        int i=10;
        int j=i++ + i++ + ++i + ++i + i++ + i++ + i-- + --i;  
        //    10    11    13    14   14       15    16    14
        
        int x=10;
        int y=9;
        
        boolean bCheck=(x<y)&&(++y==x);   // and  연산자는 앞의 연산이  false이기 때문에 뒤의 연산은 되지 않는다. or 연산일 경우는 앞에있는게 true면 종로. false면 뒤에 있는것 연산함.
        System.out.println(bCheck);
        System.out.println("x="+x);
        System.out.println("y="+y);
        
        
        //증감 연산자 ==> 반복문에 많이 쓰임. 일정량 증가하여 마지막에 도달하면 끝!
        
        // ! => 부정연산자 => boolean  => 조건문을 만들때 주로 사용!   !(--------) 앞에 !를 붙여줌  , ~ 안되는 것을 구하고 싶을때, 먼저 범위를 주고 ! 를 붙이면 범위에 포함 안되는 것을 구할수있다.
        // 3,5를 구할때 124678  => !(seat==3||seat==5)  
        
         
        
        
        
        
	}

}
