// ������ ������ - ������ - ������ �迭�� ����
public class �޼ҵ�4 {

	
	static String[] recipeData()
	{
		
		String[] data = {
				"�������� ���� ���� ���� ���! �����̹���������ͱ��� �����",
				"�������ִ� ����������! �̼ҵ��帶��ҽ��� �Բ�~",
				"���ó�� �̱��� �䵵�� ����'�����̹��� ������ͱ���'������",
				"����丮 �����������~ ��� ���� ������~",
				"�ع���ó�� ���ִ� ������ �ҽ����ᳪ����",
				"�ʰ��� �ӱ��� ���� �� ���ݶ�*.*",
				"��§��§�� ���е���",
				"��Ÿ�� : �Ϻ��� ������� ���� ������ ���� �޴��� ��! ",
				"����� ���쿬�κδް���",
				"�������� �Ľ�Ÿ "
		};
		
		return data;
	}
	
	
	static String maxLengthName()  //�Ű����� �ʿ� x  // ���� ���� ���ϱ�
	{
		
		String res="";
		String[] data = recipeData();
		int max = 0;
		for(int i = 0; i < data.length; i++)
		{
			if(max < data[i].length())
				max = data[i].length();  
		}
		
		
		for(String s:data)   // ���� �� ���� ã��
		{
			if(s.length() == max)
			{
				res = s;
				break;
			}	
		}
		
		return res;
		
	}
	
	static String minLengthName()  //�Ű����� �ʿ� x  // ���� ���� ���ϱ�
	{
		
		String res="";
		String[] data = recipeData();
		int min = data[0].length();          //0�� �ָ� 0�� ���� ���� ������ �����ϱ� �迭�� �ش�. ���ڰ��� ��� ������ �ֱ⵵ �ؼ� 0��� ����
		for(int i = 0; i < data.length; i++)
		{
			if(min > data[i].length())
				min = data[i].length();  
			
		}
		
		
		for(String s:data)   // ���� �� ���� ã��
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

		String[] data = recipeData();  // ��ü�� �޾ƿ�

		for(String s:data)  // �ޱ�
		{
			System.out.println(s);
		}
		
        System.out.println(" ========���� ª�� �����Ǹ� ���=========");
		
		System.out.println(maxLengthName()); 
		
		
		System.out.println(" ========���� ª�� �����Ǹ� ���=========");
		
		System.out.println(minLengthName()); 
		
		
		
		
		
		
	}

}
