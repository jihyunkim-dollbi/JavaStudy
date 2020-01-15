import java.util.Scanner;

import javax.swing.JOptionPane;

// 구구단  ==> dan을 입력 받아서
/*
 * 메소드를 만들고 재사용 가능함.(제어문 + 연산자!!)
 * 
 *    프로그램
 *    ======
 *    사용자정의 + java 라이브러리 + 외부 오픈소스(mvnrepository.com)
 *    ====================================================
 *                          조립.
 *        
 *    //mybatis 라이브러리
 *    //jsoup - html 번역기
 *    
 *    
 *    
 *    루프변수 -> 어디서부터 어디까지 반복하게 되는 변수 
 *    
 *    2*1=2에서 루프변수는 1이다. 
 */    //= 뒤에는 변수가 아니다!!

public class 반복문8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
    		Scanner scan = new Scanner(System.in);
    		
    		System.out.println("단 입력:");
    		int dan = scan.nextInt();
    		
    		//처리
		    //String s=JOptionPane.showConfirmDialog("정수입력") --> 입력창 만들기
		
    		int i = 1;
    		while(i<=9) 
    		
    		{
    			System.out.printf("%2d * %2d = %2d \n", dan,i,dan*i);
    			i++;
    		}
    		
		
	}

}
