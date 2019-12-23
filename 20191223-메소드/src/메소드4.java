// 만개의 레시피 - 레시피 - 제목을 배열로 넣음
public class 메소드4 {

	
	static String[] recipeData()
	{
		
		String[] data = {
				"버섯으로 관자 느낌 내는 방법! 새송이버섯간장버터구이 만들기",
				"완전맛있는 차돌박이찜! 미소된장마요소스도 함께~",
				"고기처럼 쫄깃한 밥도둑 반찬'새송이버섯 간장버터구이'레시피",
				"새우요리 갈릭마요새우~ 요거 완전 맛있지~",
				"해물찜처럼 맛있는 백종원 소시지콩나물찜",
				"초간단 머그컵 퐁당 오 쇼콜라*.*",
				"단짠단짠의 대패덮밥",
				"부타동 : 일본식 돼지고기 덮밥 간단한 점심 메뉴로 굿! ",
				"담백한 새우연두부달걀탕",
				"차돌박이 파스타 "
		};
		
		return data;
	}
	
	
	static String maxLengthName()  //매개변수 필요 x  // 글자 길이 비교하기
	{
		
		String res="";
		String[] data = recipeData();
		int max = 0;
		for(int i = 0; i < data.length; i++)
		{
			if(max < data[i].length())
				max = data[i].length();  
		}
		
		
		for(String s:data)   // 가장 긴 글자 찾기
		{
			if(s.length() == max)
			{
				res = s;
				break;
			}	
		}
		
		return res;
		
	}
	
	static String minLengthName()  //매개변수 필요 x  // 글자 길이 비교하기
	{
		
		String res="";
		String[] data = recipeData();
		int min = data[0].length();          //0을 주면 0이 가장 작은 값으로 읽으니까 배열로 준다. 숫자같은 경우 음수가 있기도 해서 0사용 가능
		for(int i = 0; i < data.length; i++)
		{
			if(min > data[i].length())
				min = data[i].length();  
			
		}
		
		
		for(String s:data)   // 가장 긴 글자 찾기
		{
			if(s.length() == min)
			{
				res = s;
				break;
			}	
		}
		
		return res;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] data = recipeData();  // 전체값 받아옴

		for(String s:data)  // 받기
		{
			System.out.println(s);
		}
		
        System.out.println(" ========가장 짧은 레시피명 출력=========");
		
		System.out.println(maxLengthName()); 
		
		
		System.out.println(" ========가장 짧은 레시피명 출력=========");
		
		System.out.println(minLengthName()); 
		
		
		
		
		
		
	}

}
