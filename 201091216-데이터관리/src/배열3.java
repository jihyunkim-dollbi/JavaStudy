
public class �迭3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int com = (int)(Math.random()*3); // 0 , 1 , 2 ���� ���� ��
		
/*		if (com == 0)
		{
			System.out.println("����");
		}
		else if(com == 1)
		{
			System.out.println("����");
		}
		else if(com == 2)
		{
			System.out.println("��");
		}
*/		
		
		// ���� �ڵ��� �Ʒ� ó�� �ٿ����Ҵ�.
		
		String[] res = {"����", "����", "��"};
		System.out.println(res[com]);
		                 //========> res �� com ��°!
		
		// ��� ���̴°�? � �����Ͱ� 0���� �����Ҷ�, �Է��ϴ� ���� ������ for���� ������ �迭 ����ϱ�.
		
		
		int user = (int)(Math.random()*5); //0*5 ~ 0.99*5 ==> 0~4.999 ==>������ �޴´� => 0~4���� => 0,1,2,3,4
		                                   //���� Math.random �޼ҵ带 ���������, ���� �� 5 �� ������ �迭 ������ ����.
		
		
		
		
	}

}
