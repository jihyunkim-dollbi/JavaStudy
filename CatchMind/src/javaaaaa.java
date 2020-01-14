
public class javaaaaa {
	private javaaaaa()	{}
	static private javaaaaa ins;
	int a;
	
	static public javaaaaa getjavaaaaa() {
		if(ins == null)
		{
			ins =  new javaaaaa();
			return ins;
		}
		else
		{
			return ins;		
		}	
		
	}
	
}
