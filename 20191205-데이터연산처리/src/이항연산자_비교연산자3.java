// 1,2 => 난수를 발생시킴 => 홀이냐 1, 짝이냐2

import java.util.Scanner;
public class 이항연산자_비교연산자3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//(Math.random()  => 0.0~0.99 = > 0.0~1.999 곱하기 아면 이렇게 나오는데 INT로 바꿨기 때문에 0~1, 
		//그리고 +1 추가해서 1~2사이가 나옴
		
       int com=(int)(Math.random()*2)+1;
       Scanner scan=new Scanner(System.in);
       System.out.println("입력(홀,짝):");
       String input=scan.next();
       
       String result=com%2==0?"짝":"홀";
       String dap=input.equals(result)?"정답":"오답";
       //문자의 비교는 == 아니고 equals(비교 연산자)로 해야한다.
       System.out.println("com="+com);
       System.out.println("dap="+dap);
       
       
	}

}
