/*
 * IO: CheckException �̴� => �ݵ�� ����ó���� �ؾ��Ѵ�.
 * 
 * ==> Input/Output
 * 
 * 1) �޸� �����
 *    ==========> ǥ�� System.in.read(), System.out.println()
 * 
 * 2) ���� �����
 * 3) ��Ʈ��ũ �����
 * 
 * 
 * **TCP(��Ʈ��ũ ��Ʈ�� ���- ��Ʈ��ũ���� �����͸� ���� ���� ����? )
 * **����Ʈ ��Ʈ��: �޸𸮿��� 1byte�� �о��- �׸�����
 * **���ڽ�Ʈ��: �޸𸮿��� 2byte�� �о��- �ѱ�(�ѱ��ڰ� 2byte)
 * **��Ʈ��(input stream, output stream)==> �����Ͱ� �̵��ؿ��� ���� => �ܹ��� ���
 * 
 * ���̺귯������ �����ϴ�  IO  => ����(�ܹ���- �ְ� �״��� �ް� �״��� �ְ�-> ���ÿ� �ְ�ް� �ȵ�.)
 * ====================
 *    			 ����Ʈ��Ʈ��          					      ���ڽ�Ʈ��
 *   			==========						    =======
 * 					|									|
 * 				==========						  ============
 * 		InputStream(�߿�)   OutputStream				Reader		Writer
 * 
 * FileInputStream								FileReader
 * FileOutputStream								FileWiter
 * 
 * 
 * 
 * ������ġ : �ӽ÷� �ѹ��� ������ ���� ����.
 * BufferedInputStream							BufferedReader
 * (======)
 * (��ü����������� buffer(�ӽ÷������س���(����:commit)����.�ӽñ��)- �ӵ�������)
 * BufferedOutputStream							BufferedWriter
 * 
 * 
 * File
 * 
 * ��ü������ ���� =>  ����ȭ  == == == <=> ����ȭ�� ������.  ==
 * ObjectInputStream							  ==
 * ObjectOutputStream							  ==
 * 
 * 
 * 
 * �޸��� �ۼ��� �ӽ� �޸𸮿� �����ߴٰ� �Ϲ��� �޸𸮿� ������(�ӵ� ����)=> �ӽ� �޸𸮰��� : Buffered
 * Web ���� buffered �� ���� �ѹ��� ����ɶ� �ѹ��� �������α׷��� ������ => ex) jsoup -> document �� �޸𸮿� �����͸� ��� ���ٳ��� ó����
 * 
 * 
 * 
 * 
 * 
 * +++ �������α׷� <===> ���� : �Ѱ��� ��η� ���!
 * 
 * +++ ���� ==> ��Ʈ��ũ   ---> �ܹ滐�� �ΰ��� ����ʿ� => 2���� ���α׷��� �ʿ��ϴ�==> �����尡 �ʿ��ϴ�. 
 * 	  	 
 * 
 * 
 * 
 * 
 * 
 * 
 */
public class MainClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
