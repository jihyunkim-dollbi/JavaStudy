package 데이터저장;
/*
 *  이름,국어,영어,수학 점수를 저장한 후
 *  이름, 국어,영어 수학, 총점, 평균을 출력
 * 
 */


public class ㅇㅇㅇ {

	public static void main(String[] args) {
  
		String name="kim";
		int Kor=100;
		int Eng=95;
		int Math=90;
		
		System.out.print("이름:"+name+"\t");
		System.out.print("국어점수"+Kor+"\t");
		System.out.print("영어점수:"+Eng+"\t");
		System.out.print("수학점수:"+Math+"\t");
		System.out.print("총점:"+(Kor+Eng+Math)+"\t");
		System.out.print("평균:"+(Kor+Eng+Math)/3.0+"\n");
		
		System.out.println("이름:"+name+"\t");
		System.out.println("국어점수"+Kor+"\t");
		System.out.println("영어점수:"+Eng+"\t");
		System.out.println("수학점수:"+Math+"\t");
		System.out.println("총점:"+(Kor+Eng+Math)+"\t");
		System.out.println("평균:"+(Kor+Eng+Math)/3.0+"\t");
		
		
		
		// 정수/정수=정수
		
		// QUESTION - 간격을 두줄,세줄 하고 싶으면 어떻게 할까?
		//          -  System.out.println("평균:%.2f",(Kor+Eng+Math)/3.0); -->Doesn't work!
		
		System.out.printf("평균:%.2f",(Kor+Eng+Math)/3.0);
		
		
	}

}
