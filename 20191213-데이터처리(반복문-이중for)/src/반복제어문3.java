/* < �ݺ������� ���̴� ���>  --> ((if�������� return���Ἥ ���α׷� ���ᰡ��!))
 * break 
 * continue
 * ========   ������ �ݺ����� ����(�ش� �� �ȿ����� ����)
 *            break  == > for, do~while, while, switch case
 *            continue => for, do~while, while
 *            return  ==> ��� ����� ��� ����
 *  
 */
public class �ݺ����3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i = 1; i <= 3; i++)
		{
			if(i == 2)  // i���� 2�� �����ϰ� ������ ��� ����
			continue;   // 2nd for �� �ۿ� �־��ֱ�. ��/�Ʒ� ��ġ �߿�. �Ʒ� continue ����� ���� �ȵ�.���� 2nd for�� �������� ���� �ɾ��־����.
			
			for(int j = 1; j <= 3; j++)
			{
				//if(j == 2)
				//	break;   // 2���� break �Ǿ� 2�� 3��� �ȳ���
			
				//if(j == 2)
				//continue; // 2�� ���ϰ� 1�� 3�� ���� ����   
				System.out.println("i=" + i +" j="+ j);
				
			}
			// break; // �� ��쿡�� i�� 2,3 ��� ��� �ȵ�.
			
			}
		
		
		
		
		
		
	}

}
