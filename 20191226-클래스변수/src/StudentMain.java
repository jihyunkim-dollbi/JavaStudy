class StudentVO{
	
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	char hakjum;
	
}

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// ¸Þ¸ð¸®ÀúÀå
		StudentVO vo = new StudentVO();
		
		vo.name = "È«±æµ¿";
		vo.kor = 90;
		vo.eng = 80;
		vo.math = 70;
		vo.total = vo.kor + vo.eng + vo.math;
		vo.avg = vo.total/3.0;
		
		vo.hakjum = 'A';
		switch((int)(vo.avg/10))
		{
		
		case 10 : case 9:
			vo.hakjum = 'A';
			break;
		case 8 : 
			vo.hakjum = 'B';
			break;
		case 7 : 
			vo.hakjum = 'C';
			break;
		case 6 : 
			vo.hakjum = 'D';
			break;
		default  : 
			vo.hakjum = 'F';
		
		}
		
		
	StudentVO vo1 = new StudentVO();
		
		vo1.name = "È«±æµ¿";
		vo1.kor = 90;
		vo1.eng = 80;
		vo1.math = 70;
		vo1.total = vo1.kor + vo1.eng + vo1.math;
		vo1.avg = vo1.total/3.0;
		
		vo1.hakjum = 'A';
		switch((int)(vo1.avg/10))
		{
		
		case 10 : case 9:
			vo1.hakjum = 'A';
			break;
		case 8 : 
			vo1.hakjum = 'B';
			break;
		case 7 : 
			vo1.hakjum = 'C';
			break;
		case 6 : 
			vo1.hakjum = 'D';
			break;
		default  : 
			vo1.hakjum = 'F';
		
		}
		
		
	StudentVO vo2 = new StudentVO();
		
		vo2.name = "È«±æµ¿";
		vo2.kor = 90;
		vo2.eng = 80;
		vo2.math = 70;
		vo2.total = vo2.kor + vo2.eng + vo2.math;
		vo2.avg = vo2.total/3.0;
		
		vo2.hakjum = 'A';
		switch((int)(vo2.avg/10))
		{
		
		case 10 : case 9:
			vo2.hakjum = 'A';
			break;
		case 8 : 
			vo2.hakjum = 'B';
			break;
		case 7 : 
			vo2.hakjum = 'C';
			break;
		case 6 : 
			vo2.hakjum = 'D';
			break;
		default  : 
			vo2.hakjum = 'F';
		
		}
		
		
	StudentVO vo3 = new StudentVO();
		
		vo3.name = "È«±æµ¿";
		vo3.kor = 90;
		vo3.eng = 80;
		vo3.math = 70;
		vo3.total = vo3.kor + vo3.eng + vo3.math;
		vo3.avg = vo3.total/3.0;
		
		vo3.hakjum = 'A';
		switch((int)(vo3.avg/10))
		{
		
		case 10 : case 9:
			vo3.hakjum = 'A';
			break;
		case 8 : 
			vo.hakjum = 'B';
			break;
		case 7 : 
			vo.hakjum = 'C';
			break;
		case 6 : 
			vo.hakjum = 'D';
			break;
		default  : 
			vo.hakjum = 'F';
		
		}
		
		
	StudentVO vo4 = new StudentVO();
		
		vo.name = "È«±æµ¿";
		vo.kor = 90;
		vo.eng = 80;
		vo.math = 70;
		vo.total = vo.kor + vo.eng + vo.math;
		vo.avg = vo.total/3.0;
		
		vo.hakjum = 'A';
		switch((int)(vo.avg/10))
		{
		
		case 10 : case 9:
			vo.hakjum = 'A';
			break;
		case 8 : 
			vo.hakjum = 'B';
			break;
		case 7 : 
			vo.hakjum = 'C';
			break;
		case 6 : 
			vo.hakjum = 'D';
			break;
		default  : 
			vo.hakjum = 'F';
		
		}
		
		
		
		
		
		
		
		
	}

}
