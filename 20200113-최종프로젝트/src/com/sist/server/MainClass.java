package com.sist.server;
import java.io.*;

import com.sun.xml.internal.fastinfoset.tools.FI_DOM_Or_XML_DOM_SAX_SAXEvent;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.

		try
		{
			// reader로 2byte씩 받아야 한글이 보임.
			FileReader fis = new FileReader("C:\\Users\\sist\\git\\repository\\20200113-최종프로젝트\\src\\com\\sist\\server\\Server.java");
			
			String s="";
			int i=0;
			while((i=fis.read()) !=-1 )
			{
				//-1 = EOF => 한글자씩 읽어서 문자열 결합하기.
				s+=String.valueOf((char)i);
				
			}
			System.out.println(s);
			
			
		}catch(Exception ex) {}
	
		
	}

}
