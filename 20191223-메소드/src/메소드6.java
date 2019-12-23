import java.util.Scanner;

public class 메소드6 {

	//중복없는 난수 발생
	static int[] getRand(int no)
	{
		
		int[] com = new int[no];
		int su = 0;
		boolean bCheck = false;
		for(int i = 0; i< no; i++)
		{
			bCheck = true;
			while(bCheck)
			{
				//난수발생
				su=(int)(Math.random()*9)+1;
				bCheck = false;
				
				for(int j = 0; j<i; j++)
				{
					if(com[j] == su )
					{
						bCheck = true;
						break;
					}
					
				}
			}
			//중복된 수가 없다.
			com[i] = su;
		}
		
		return com;
	}
	//사용자입력하고
	//리턴형 int[]
	static int[] userInput()//매개변수 필요. x
	{
		int[] user=new int[3];
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("세자리 정수를 입력하시요: ");
			int input = scan.nextInt();
			if(input<100 || input >999)
			{
				
				System.out.println("잘못된 입력입니다.");
			}
			
			user[0] = input/100;
			user[1] = (input%100)/10;
			user[2] = input%10;
				
			if(user[0] == user[1] || user[1] == user[2] || user[0]== user[2])
			{
				
				System.out.println("중복된 수는 사용할 수 없습니다.");
				continue;
			}
			if(user[0] == 0 || user[1] == 1 || user[2] == 2)
			{
				
				System.out.println("0은 사용할 수 없습니다!!");
				continue;
			}
			break;
		}
		return user;
	
	}
	
	
	
	
	//비교하고 //com과 user의 배열   ==> s,b
	static int compare(int[] com, int[] user)
	{
		int s =0, b=0;
		for(int i = 0; i< 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				//배열 안에 같은수 존재여부
				if(com[i] == user[j])
				{
					//같은 자리여부
					if(i == j)
					    s++;

					else 
						b++;
				}
								
			}
			
		}
		
		hint(user,s,b); // 호출할 경우 변수를 가지고 있는 자리에서 호출해야한다. 
		return s;
	/*	
		if(isEnd(s)) // 이것이 true가 되면 종료하고 빠져나가야함. break를 걸수가 없다. if문이라서.  ==>System.exit(0);
		{
			System.out.println("Game Over!!");
			System.exit(0);
		}
	*/
	}
	
	
	
	//힌트   // 위에서 매개변수값 가져와야함 but void사용!!그래서 힌트 호출하기!! =>hint(user,s,b);
	
	static void hint(int[] user, int s, int b)
	{
		System.out.printf("Input Number:%d%d%d, Result : %dS-%dB\n " ,user[0],user[1],user[2],s,b);
	}
	
	
	//종료여부
	static boolean isEnd(int s)
	{
		boolean bCheck = false;
		if(s==3)
			bCheck =true;

		return bCheck;	
	}
	 
	
	//조립
	static void process() 
	{
		
	int[] com =getRand(3);  // 입력을 해야함. ==> 
	
	Scanner scan = new Scanner(System.in);
	 while(true)
	  {
	 	int[] user = userInput();
	 	 int s= compare(com,user);
	 	 if(isEnd(s))   // true라면! 게임을 이긴경우!  // 호출하는 위치가 메소드 이거나 일반 함수일수도있다.if문 안에
	 	 {
	 		 
	 		 	System.out.print("종료할까요?(y|n)");
	 		 	String data= scan.next();
	 		 	if(data.equals("y"))
	 		 	{
	 		 		System.out.println("Game Over!!");
	 		 		System.exit(0);
	 		 	}
	 		 	else
	 		 	{
	 		 		System.out.println("새 게임이 시작되었습니다.");
	 		 		process();
	 		 	}
	 		 
	 	  }
	  }
		
	}
	
	//총 5개의 메소드
	static String start() 
	{	
		return "게임을 시작합니다.";
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(start()); // 메소드 바로 호출!
		String s = start();    // 오론쪽에서 왼쪽으로 대입했으므로 같다는 뜻!
		System.out.println(s);   // 변수로 받아서 호출!
		
		process();
		
	}

}
