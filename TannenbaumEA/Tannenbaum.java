
public class Tannenbaum {

	public static void main (String[] args)
	{
		int tag = 5;
		System.out.println("TEST");
		UP_Spitze(5);
		for (int i=1;i<=tag;i++)
		{
			
		}
	}
	
	public static void UP_Spitze(int tag)
	{
		String sp = "";
		for (int i=0;i<tag-1;i++){
			sp+=".";
		}
		System.out.println(sp+"ii");
		
	}
	
	public static void UP_links(int tag, int znr)
	{
		String sp = "";
		for (int i =0; i<(tag-znr);i++)
		{
			sp+=".";
		}
		System.out.println(sp+"i/");
		
	}
	
	public static void UP_rechts(int tag, int znr)
	{
		
		
	}
	
	
	
}
