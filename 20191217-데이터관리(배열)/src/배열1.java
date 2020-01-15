import java.util.Scanner;

/*  반복하기 1. while 2. for 3. method
 * 
 *  배열이란 여러개의 데이터를 한 개의 이름으로 묶어 제어를 함께 하는 것. => 인덱스를 이용
 *        												**0부터 시작
 *  1) 형식
 *  
 *      1. 선언
 *         데이터형[] 비열명
 *         = 기본타입: int, long, short .. (자바에서 제공) 
 *            int[]
 *            char[]
 *            double[]
 *         = 사용자 정의 타입: class..(클래스도 배열처리 가능하다.)
 *           class Moive
 *           Moive[] arr
 *           String[] names
 *           =======
 *           사용자정의
 *           
 *           
 *      2. 초기값
 * 		   
 *   	 = arr={1,2,3,4,5,6}
 *       = arr=new int[6] => 자체 초기값 (int:0, long:0, String:null)    
 *         **null  == > 메모리에 저장된 주소값이 존재하지 않는다.
 *         **new ==> 주소값을 가져온다는 것. 메모리주소를 만듬. 배열 공간을 설계해놓기.
 *           new를 썼을때 모두에게 영향이 간다. 따라서 spring 에서는 new를 주로 사용하지 않는다.
 *           
 *         ??? reflection : (but, reflection을 쓰면 new를 생성하지 않아도 배열을 선언할 수 있다.)
 *             spring / new
 *             
 *                    losely public? 객체지향적으로 결합성을 낮게, 영향력을 낮게하기.
 *      
 *      
 *      3. 데이터 읽기
 *      
 *         = arr[index] ==> 갯수보다 한개가 적다
 *      
 *      
 *      4. 데이터 저장
 *      
 *        == arr[1] = 10
 * 
 * 
 */
public class 배열1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		
		// 숫자 야구 게임 만들기
        // 3개의 자리수를 맞춰나가기.	
		// ==================
		// 난수 = >729 맞춰 가나기
		// 사용자 입력 => 567 ==>0s-1b   
		//             785   1s-0b
		             //793   1s 1b
		             
/*                     279  1s-2b      s는 같은 자리   b는 같은 개수
 *                     729  3s 0b     ==> break
 * 
 * 		1. 중복없는 난수 발생 ==>com[] 
 * 		2. 사용자 입력 ==>user[]
 *  		비교 com[], user[] 둘다 필요!  리턴형으로 만들수없다. 값이 두개이기때문에.! 이때 매개변수를 통해 값을 넘겨줘야함.
 * 		3. 힌트   s, b
 * 		4. 종료여부 확인
 * 		5. 3s => 종료한다
 *       =============> 반복  횟수지정 안되므로, 맞힐때까지 계속 돌려야하므로 while문 사용
 */
		// 중복되는 변수 user, com, s,b ==> 중복변수는 전역변수로 잡기
		// 중복이 없으면 지역변수로 잡기
		// for문안에서는 지역변수..
		
		
		    
/*		       
		       for(int i = 0; i < 3 ; i++)
		       {
		    	   com[i]=(int)(Math.random()*5)+1;
		    	   
		       }
		
		       for(int i:com)
		       {
		    	   System.out.print("i= "+ i + " ");
		    	   
*/		    	  
		
				Scanner scan  = new Scanner(System.in);
				
				 //총 5개의 메소드를 만들기.
				 //프로젝트 시 중요. 
//// 덧글!
				int[] com = new int[9];
				
				int su=0; // 난수 발생시 저장할 넘버(com 넘버와 비교하여 중복이 아닐시 저장될 것임.) 
				boolean bCheck=false; // 중복여부 확인 중복;true 중복 아닐시;false 나옴
				
				for(int i=0; i<com.length;i++) /// 정확한 횟수 있음 - 9
				{
					bCheck=true;
					
					//==========================중복안된 난수발생
					  while(bCheck) // 정확한 횟수모음 for문 (;;)는 사용 못함.
					  {
						  // 난수 발생
						  su=(int)(Math.random()*9)+1;
						  bCheck=false; // default값을 줌.
						  // 중복여부 확인 i는 저장된 개수, i가 3개 검색하면 3개만 검색하면 됨, < 이유는 첫번째 것은 검색할 필요 x
						  for(int j=0; j<i; j++) 
						  {
							  if(com[j] == su)   // else를 여기서 걸면 안되는 이유는 for믄이라는 것은 항상 0부터 시작하기 때문에.
								                 // 어떤 수가 나왔을때 그 인덱스 자리의 숫자와만 맞혀보고 맞으면 끝난다. 그렇기 때문에 맨 위에 주어야한다. 
							  {
								  bCheck = true;
								  break;
							  }
						  }
						  
						  
						  
					  }
					//========================== 
			        com[i]=su;
				}
				
	// 덧붙끝							
				 
				int[] user = new int[3];
		
		        while(true)
		        {
		        	
		        	System.out.print("3자리 정수를 입력:");
		        	int input=scan.nextInt();
		        	
		        	// 입력받은 값에 대한 오류처리와 유효성검사가 중요하다.
		        	// 오류 처리 1
		        	if(input < 100 || input >999)  //99보다 작거나 999보다 크거나는 오류
		        	{
		        		
		        		System.out.println("잘못된 입력입니다.다시 입력하시오.");
		        		// 오류 처리임에도 종료가 아니라 다시 시작해야함
		        		continue;
		        	}
		        	
		        	
		        	// 배열의 값을 변경  //567   5를 저장하려면 100으로 나눠야 알수있다.
		        	user[0]=input/100;
		        	user[1]=(input%100)/10; //6
		        	user[2]=input%10; //7
		        	
		        	
		        	// 오류처리 => 중복된 수를 사용할 수 없다, 0을 사용할 수 없다.--> 0이 앞에 붙으면 8진법이기 때문에.
		        	// 오류 처리 2
		        	if(user[0] == user[1] || user[1] == user[2] || user[0] == user[2])
		        	
		        	{
		        		
		        		System.out.println("중복된 수는 사용 못합니다."); // 같은 수가 나오면 힌트가 어렵게 된다.729-777 1s 2b
		        		continue;
		        	}
		        	
		        	// 오류 처리 3
		        	if(user[0] == 0 || user[1] == 0 || user[2] == 0)
		        	{
		        		
		        		System.out.println("0은 사용할 수없습니다.");
		        		continue;
		        	}
		        	
		        	// 로컬 호스트 - 개인, 따라서 ip를 주고 시작해야 컴퓨터가 연결됟ㅁ.
		        	
		        	// 값 2개를 가지고 비료를 할 경우 무조건 2차 포문
		        	// 비교 시작   - 총1-3, 2-3, 3-3 총 9번 돌림
		              int s = 0, b = 0;
		              for(int i = 0; i<3; i++)   // i ==> com
		              {
		            	  
		            	  for(int j = 0; j < 3; j++) //j ==user
		            	  {
		            		  
		            		  if(com[i] ==user[j])  // 같은 수만 있는지 조사
		            		  {
		            			  
		            			 if(i == j)
		            				 s++;
		            			 else
		            				 b++;
		            		  }
		            	  }
		              }
		        	
		        	// 힌트
		        	System.out.printf("Input Number: %d, Result:%dS-%dB\n",
		        			input,s,b);
		        	System.out.println("=====================================");
		        	System.out.print("S: ");
		        	for(int i=0; i<s;i++)
		        	{
		        		System.out.print("●");
		        	}
		        	System.out.print("\nB: ");
		        	for(int i=0; i<b;i++)
		        	{
		        		System.out.print("○");
		        	}
		        	
		        	System.out.println("\n=====================================");
		        	
		        	// 종료여부 확인
		        	if(s==3)
		        	{
		        		System.out.println("Game Over");
		        		break;
		        	}
		        	
		        } 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
