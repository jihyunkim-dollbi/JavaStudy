/*
 * 	�ڹٿ��� �����ϴ� ���̺귯��.
 * => �ڹ�
 *      1) ���������
 *      2) ���̺귯��
 *      ===========> 1) + 2) => �����ϱ�
 * 
 * 		�ڹ� ���� ���̺귯��
 * 		==============
 * 
 * 		java.lang : import �� ���� �ʰ� ����Ѵ�.
 * 		=String: ���ڿ��� ���õ� Ŭ����(������- ������Ʈ)
 *	 
 * 	    1) equals: ���ڿ���
 *		2) trim() : �¿��������
 *		3) indexOf(), lastIndexOf()
 *	    4) length()
 *		5) startsWith, endsWith
 *		6) subString()
 * 		7) split()
 * 		8) valueOf()
 * 
 * 		=System: ����, ��/���, GC
 * 		1) gc-�޸� 
 * 		2) exit()
 * 		3) println()
 * 
 * 		=Object: ��� Ŭ������ ���� Ŭ���� => ��ü�� ������ �Ҹ�
 * 		1) clone() : Ŭ���� ����=> �޸��ּҴ� �ٸ����� ���� ���� ������ش�. A c = a.clone();
 *        �̱��� - �ϳ��� �޸𸮸� ����ϴ� ��. 
 * 		2) finalize() : �Ҹ��� 
 * 		=Math:���а���
 * 		1) random()
 * 		2) ceil()
 * 		=StringBuffer(�ӵ�����)
 * 		1) toString() -> �Էµ� ���ڿ��� ............. �ٲ��� " .toString "
 * 		2) append() :���ڿ� ����
 * 		=Thread
 * 		
 * 		java.util : �����ϰ� ����� �� �ִ� Ŭ������ ����
 *		=Scanner
 *		=StringTokenizer
 *		=Collection(�迭)
 *		=ArrayList, Vector , LinkedList, Map : �ڷᱸ��
 *		===========                     =====
 *		�ڷᱸ��: �޸� ���� ����
 *		
 * 		java.io
 * 		=Reader, Writer(2byte)
 * 		=InputStream, OutputStream(1byte) - close()
 * 		=File 
 * 		=ObjectInputStream, ObjectOutputStream
 * 		= BufferReader
 * 
 * 		java.net
 * 		=Socket
 * 		=URL(encoding) encode=> 2byte-> 1byte ��ȯ����.
 * 
 * 
 */
class My  // source - overriding => finalize ������.
{
	public My() {
		
		System.out.println("My ������ �Լ� ȣ��(��ü ����)");
	}
	
	
	
	public void display()
	{
		System.out.println("My:display() Call....");
		
	}
	
	
	@Override // ��ü���� �޸𸮰� �Ҹ�Ǵ� ����.. 
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("��ü �Ҹ�");
	}
	
	
	
	
}
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// ���� 
			My m =new My(); 
		
			// Ȱ��
			m.display();
			
			//�Ҹ��Ŵ
			m=null; // �Ҹ������ �޸�ȸ�� ��.  => finalize�� ���� �ȵ�.
			
			System.gc(); // �޸�ȸ���� ������
			
			// finalize�� �����.=> �޸𸮰� ȸ���Ǿ�� ������ �ȴ�. 
			
			
			
	}

}
