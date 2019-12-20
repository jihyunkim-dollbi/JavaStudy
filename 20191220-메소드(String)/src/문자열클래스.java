import java.util.Scanner;

/*
 *   String = ¹®ÀÚ¿­À» Á¦¾îÇÒ¶§ »ç¿ë
 *   
 *   java.lang ==> import »ý·«°¡´É
 *   
 *   ¹®ÀÚ¿­À» ÀúÀåÇÏ´Â ¹æ¹ý
 *      1) String º¯¼ö¸í = "Hello Java"; 
 *      2) String º¯¼ö¸í = new String ('Hello Java') // °°Àº ¹®ÀÚ¿­ => º°µµ·Î ÀúÀå
 *                      =====
 *                      »õ·Î¿î ¸Þ¸ð¸®¿¡ ÀúÀåÀ» ÇÏ¶ó.
 *                      
 *      
 *   String ¿¡¼­ Á¦°øÇÏ´Â ±â´É 
 *   
 *   1) equals : ÀúÀåµÈ ¹®ÀÚ¿­ÀÌ °°ÀºÁö ¿©ºÎ¸¦ È®ÀÎ(true/ false)
 *               ID, PWD => ·Î±×ÀÎ(´ë¼Ò¹®ÀÚ ±¸¹®) 
 *    			 ¹®ÀÚ¿­Àº ( == )(X)
 *    
 *			String s = "Hello";  ==> s,s1 
 *			String s1 = "Hello";
 *			if(s == s1)  true  ==> ¹®ÀÚ¿­ºñ±³
 *			String s2 = new String("Hello")  ==> s2 - 
 *			if(s.equals(s2)) false!   ==> ÁÖ¼Ò°ª ºñ±³
 *    			
 *    
 *       ==>  ¿øÇü
 *          (¸®ÅÏÇü) boolean equals(String data)
 *            
 *   2) substring : ¹®ÀÚ¿­À» ÀÚ¸¦¶§  
 *      			Strings="01234567";
 *                  substring(3) ==> "34567" ==> ¾ÕÀÇ 3ÀÚ¸®¸¦ ¾ø¾Ö°í ³ª¸ÓÁö¸¦ °¡Á®¿Í¶ó
 *                  String s="112ºÐ,15¼¼ÀÌ»ó°ü¶÷°¡" 
 *                  substring(0,3) ==> "112"  --> °á±¹ 012¸¸ °¡Á®¿Í¶ó ==> ¸¸¾à 0,4¸¦ ÇÏ¸é 112ºÐÀÌ µÇ°í Á¤¼ö°¡ ¾Æ´Ï±â ‹š¹®¿¡ ¿À·ù.
 *                             ==
 *                             end-1
 *                             ex) È®ÀåÀÚ°¡ javaÀÎ°Í¸¸ °¡Á®¿Í¶ó.!
 *                             
 *    			    substring(int start)
 *   				substring(int start, in end)
 *   
 *   3) length : ¹®ÀÚ¿­ °¹¼ö
 *      String s=" Hello È«±æµ¿"; -> 9 °³
 *      ex) µðÀÚÀÎÇÒ¶§, ±ÛÀÚ°³¼ö¸¦ ¸ÂÃâ¶§!
 *      
 *            
 *   4) trim : ÁÂ¿ìÀÇ °ø¹é¹®ÀÚ Á¦°Å
 *       String s=" Hello Java ";
 *       ==>s.length ==>12
 *       ===>s.trim().length ==>10  ==> ¾ÕµÚÀÇ ¸ðµç °ø¹éÀ» Á¦°Å, Áß°£ÀÇ °ø¹éÀº Á¦°Å ¾ÈÇÔ
 *       
 *       ex) »ç¿ëÀÚ·Î±×ÀÎ½Ã spaceÅ° °ª --> Á¦°ÅÇØÁÖ°í -> »ç¿ëÀÚÀÇ ¿À·ù ¹æÁöÇØÁÜ
 *            --> ¸Þ¼Òµå! °ø¹éÀÌ ÀÖÀ¸¸é trimÀ» ½á¶ó.
 *           
 *       
 *   5) startsWith, endsWith :  µÎ°³¸¦ µ¿½Ã¿¡ ¾²¸é ´Ü¾î°¡ Æ÷ÇÔµÈ ¹®ÀÚ¸¦ °¡Á®¿Í¶ó.
 *      (¾Õ±ÛÀÚ·Î Ã£±â)( µÞÀÚ¸®·Î Ã£±â) 
 *       ==========  =========
 *      
 *       starsWith("ÀÚ¹Ù")
 *       endsWith(" ")	
 *   
 *   
 *   
 *    	ex)°Ë»ö±â ¸¸µé¶§ »ç¿ë!
 *   
 *   
 *   6) indexOf, lastIndexOf(³»°¡ ¿øÇÏ´Â ´Ü¾î³ª ¹®ÀÚ¿­ Ã£À»¶§) : 
 *   	¹®ÀÚÀÇ À§Ä¡(indexOf : ¾Õ¿¡¼­, lastIndexOf: µÚ¿¡¼­)
 *   	String s="hello java";
 *                0123456789
 *   	s.indexOf('a') ==> 7
 *   	s.lastIndexOf('a')  ==> 9  --> È®ÀåÀÚ Ã£À»¶§,
 *   
 *      ex) substring°ú ÇÔ²² ¸¹ÀÌ ¾²ÀÓ.
 *   
 *   7) split : 
 *      String s= "ÀÌº´Çö, ÇÏÁ¤¿ì, ¸¶µ¿¼®, ÀüÇýÁø, ¼öÁö";
 *                 
 *      ,º°·Î Àß¶ó¼­ ¹è¿­¿¡ ÀúÀåÇØÁÜ.
 *      
 *      String[] name = s.split(",");  , º°·Î ÀÚ¸§
 *      String[] name = s.split(" "); °ø¹é º°·Î ÀÚ¸§
 *      Á¤±Ô½Ä --> ÀÌÇü½ÄÀ» °¡Áø °ÍÀ» ´Ù Ã£¾Æ¶ó
 *      ====
 *      211.238.142.181
 *      211.238.142.1
 *      211.238.142.23
 *      211.238.142.0
 *      211.238.1.1 
 *      [0-9] {1,3}\\. [0-9] {1,3}\\. [0-9] {1,3}\\. [0-9] {1,3} ==> ÆÐÅÏÀ¸·Î µé¾î°¨.
 *      ¼ýÀÚ 0¿¡¼­ 9 »çÀÌ¿¡ 1ÀÚ¸®¿¡¼­ 3ÀÚ¸®±îÁö ÀÖ´Ù.
 *   
 *       \\Ãß°¡ .±îÁö Ã£±â?
 *   
 *   8) toUpperCase, toLowerCase : 
 *      ´ë¹®ÀÚ·Î º¯È¯      ¼Ò¹®ÀÚ·Î º¯È¯
 *      
 *      String s="Hello";
 *      s.toUpperCase() ==> HELLO
 *      s.toLowerCase() ==> hello
 *      
 *      
 *   9) replace, replaceAll : 
 *      ======   ============> µÚ¿¡µµ Á¤±Ô½Ä ºÙÀ½.
 *       		String s="113ºÐ"
 *       		s.replaceAll("[^0-9]","") ==>113
 *                             =====
 *                             ¸ðµç ¼ýÀÚ
 *              s.replaceAll("^[0-9]","") ==> ¹Ù±ùÀÇ ^ ¶æÀº ~½ÃÀÛÇÏ´Â ¸ðµç °Í! 
 *              s.replaceAll("^[0-9]$","") ==> ~·Î ³¡³ª´Â ¸ðµç ¹®ÀÚ!
 *              s.replaceAll("[^°¡-ÆR]","")   ==> ÇÑ±Û•û°í ´Ù Áö¿ö¶ó
 *              s.replaceAll("[^A-Za-z]","")  ==> ¿µ¹®»©°í ´Ù Áö¿ö¶ó
 *      
 *      
 *      
 *      
 *       º¯°æ ==> String s="Hello Java"
 *               s.replace('a','b') ==> Hello jbvb
 *                         ========
 *                         ¸ðµç a¸¦ b·Î ¹Ù²Ù½Ã¿À!
 *
 *	10) contains() : ¹®ÀÚ¿­ ¾È¿¡ Æ÷ÇÔµÈ ¹®ÀÚ¸¦ Ã£´Â °æ¿ì 
 *  			
 *                 	 
 *
 *
 */
// °Ë»ö ÀÚµ¿¿Ï¼º±â´É°ú ºñ½ÁÇÏ°Ô °Ë»öÇÏ¸é Æ÷ÇÔ ´Ü¾î ¸ðµÎ Ã£¾Æ¿À±â ¸¸µé±â
public class ¹®ÀÚ¿­Å¬·¡½º {

	
	static String[] autoComplate(String data)
	
	{
		
		String[] ss = 
			
			{
				
				"ÀÚ¹Ù¿Í JSP","ÀÚ¹Ù ÇÁ·Î±×·¡¹Ö","½ºÇÁ¸µ5","Ajax¿Í JSP","¸®´ö½º¿Í ¸®¾×Æ®","ÀÚ¹Ù ¿À¶óÅ¬","MVC ±¸Á¶",
				"ÄÚÆ²¸°°ú ¾Èµå·ÎÀÌµå","ÄÚÆ²¸° ÇÁ·Î±×·¥","½ºÇÁ¸µ µ¥ÀÌÅÍ","È¥ÀÚ¹è¿ì´Â ÀÚ¹Ù","Áö´ÉÇüÀ¥ ÇÁ·Î±×·¡¹Ö","À¥ÇÁ·Î±×·¥",
				"ÀÚ¹Ù À¥ÇÁ·Î±×·¥","¿À¶óÅ¬ ÀÚ¹Ù"
	        };
		
		String[] findData = new String[10];
		int j = 0;
		for(int i =0; i<ss.length; i++)
		{
			
			if(ss[i].contains(data))  // data°¡ Æ÷ÇÔµÈ ¸ðµç ¹®ÀÚ¸¦ Ã£¾Æ¶ó.
			//if(ss[i].startsWith(data))  // data·Î ½ÃÀÛÇÏ´Â ¹®ÀÚ¸¦ Ã£¾Æ¶ó.
			{
				
				findData[j] = ss[i];
				j++;
				
			 }
		}
		return findData;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	     
		Scanner scan = new Scanner(System.in);
		
		System.out.print("°Ë»ö¾î ÀÔ·Â: ");
		String data = scan.next();
		
		String[] fd = autoComplate(data);
		for(int i = 0; i<fd.length; i++)
		{
			
			if(fd[i] != null)
			{
				
				System.out.println(fd[i]);
			}
			
		}
		
		
		
	}

}
