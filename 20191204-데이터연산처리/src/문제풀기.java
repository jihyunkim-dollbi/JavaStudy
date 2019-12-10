
public class 문제풀기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		// 문제2번
		 int a=1500000;
         int b=55000;
         double c=a*0.1;
         
         System.out.println("실수령액="+(a+b-c)+"원"+"\n");
         
         // 문제3번
         
         String name="홍길동";
         String department="개발부";
         String position="대리";
         int sal=1500000;
        		 
         System.out.println("이름:"+name);
         System.out.printf("부서:%10s",department);
         System.out.print("직위:"+position);
         System.out.println("급여:"+sal+"\n");
       
        // System.out.printf("평균:%.2f",avg);
         
		
		// 문제 4번
         
         int kor,eng,mat;
         double avg;
         
         String name1="민들레";
         kor=90;
         eng=70;
         mat=75;
         
         int total=kor+eng+mat;
         avg=total/3.0;
         
         System.out.println("이름1:"+name1);
         System.out.println("합계점수:"+(kor+eng+mat));
         System.out.printf("평균점수:%.1f",avg);
        		 
         // 문제 6
         
         int a11=123;
         int b11=10;
         int c11=((a11/(b11-1)));
         
       // Math.ceil(10/3) => 4
         
         System.out.println("\n"+"필요한 바구니의 수:"+c11);
         
         System.out.println("나머지:"+(int)((a11%b11)/10));
         
        
         
         
         
	}

}
