/*
 *  ��������� (+,-,/,*,%) : �ٸ� ���������� ������� ���
 *      1) int ���� ��������(byte, short, char) => ����ó���� �Ǹ� ==> int�� �ȴ�
 *      
 *     byte + byte => int
 *     char + byte => int
 *     short+ byte + char => int
 *     
 *     
 *     byte+int => int
 *     short+char+int => int
 *  
 *     short+ char+double => double    => String �� �� ũ��.
 *     ""+77 ==> "77"
 *     
 *     ""+7.5  ==>"7.5"
 *     
 *     ""+true ==> "true"
 *     
 *     
 *     
 *     ���� ū ������ �� ������ �޾ƾ� �Ѵ�.
 * 
 * 
 * 789 => 7 8 9
 * 
 */

      
       
public class ���׿�����_��������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // byte b=127;
         //byte c=10;
         //byte d=byte(b+c);   
  
       byte b=(byte)300;
       
       System.out.println(b);
		
       System.out.println(Integer.toBinaryString(300));
       
       System.out.println(""+true);
       
       
       
       
       
       
       /*300
        * 
        * 100101100  ->  1 �ڸ� 00101100
        *                     32 8 4 ==> 44
        *                     
        *                     ����Ʈ�� 8���� ��Ʈ�� �����Ƿ� 300�� 9���� ��Ʈ���̴� . ���� �ڿ������� 8���� �߶� ����Ѵ�.
        *                     byte�� �ʰ��� int�� �Ѿ�Ƿ� int�� �����.
        * 
        */
	}

}
