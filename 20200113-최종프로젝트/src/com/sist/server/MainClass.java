package com.sist.server;
import java.io.*;

import com.sun.xml.internal.fastinfoset.tools.FI_DOM_Or_XML_DOM_SAX_SAXEvent;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		try
		{
			// reader�� 2byte�� �޾ƾ� �ѱ��� ����.
			FileReader fis = new FileReader("C:\\Users\\sist\\git\\repository\\20200113-����������Ʈ\\src\\com\\sist\\server\\Server.java");
			
			String s="";
			int i=0;
			while((i=fis.read()) !=-1 )
			{
				//-1 = EOF => �ѱ��ھ� �о ���ڿ� �����ϱ�.
				s+=String.valueOf((char)i);
				
			}
			System.out.println(s);
			
			
		}catch(Exception ex) {}
	
		
	}

}
