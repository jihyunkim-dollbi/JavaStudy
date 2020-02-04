package com.sist.temp;



class A
{
	
	public void disp1()
	{
		
		System.out.println("disp1");
	}
	public void disp2()
	{
		System.out.println("disp2");
		
	}
	
	
	
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
		
		A aa = new A();
		System.out.println("a=" + aa);
		Class claName = Class.forName("com.sist.temp.A");
		Object obj = claName.newInstance();
			System.out.println("obj" + obj);
			
			
		//	Method[] methods = claName.getDeclaredMethods();
		//	for(java.lang.reflect.Method m:methods)
		//	{
		//		m.invoke(obj, NULL);			
		//	}
			
		}catch(Exception ex) {}
		
		
	}

}
