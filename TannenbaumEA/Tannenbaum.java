
public class Tannenbaum {

	public static void main (String[] args)
	{
		int tag = 10;
		System.out.println("TEST");
		UP_Spitze(tag);
		for (int i=1;i<tag;i++)
		{
			UP_Links(tag,i);
			UP_Rechts(tag,i);
		}
		UP_Stamm(tag);
	}
	
	public static void UP_Spitze(int tag)
	{
		String sp = "";
		for (int i=0;i<tag-1;i++){
			sp+=".";
		}
		System.out.println(sp+"ii");
		
	}
	public static void UP_Stamm(int tag)
	{
		String sp = "";
		for (int i=0;i<tag*2-1;i++){
			sp+="-";
		}
		
		System.out.println(sp);
		
	}
	
	public static void UP_Links(int tag, int znr)
	{
		String sp = "";
		for (int i =0; i<(tag-znr-1);i++)
		{
			sp+=".";
		}
		System.out.print(sp+"i/");
		
	}
	
	public static void UP_Rechts(int tag, int znr)
	{
		String sp = "";
		for (int i=1; i<znr;i++)
		{
				sp+="..";
			
		}
		System.out.println(sp+"\\i");
	}
	
	
	
}
