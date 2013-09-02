import java.util.Scanner;


public class Tannenbaum {

	public static void main (String[] args)
	{
		int tag = 0;
		System.out.println("Gib einen Tag ein?");
		Scanner sc = new Scanner(System.in);
		tag = sc.nextInt();
		if (tag<2 || tag>31)
		{
			System.out.println("Der Tag darf nicht kleiner 2 und nicht groeﬂer 31 sein!");
			System.exit(0);
		}
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
			sp+=" ";
		}
		System.out.println(sp+"ii");
		
	}
	public static void UP_Stamm(int tag)
	{
		String sp = "";
		String sa = "";
		for (int i=0;i<tag*2-1;i++){
			sp+="-";
		}
		System.out.println(sp);
		
		for (int i=0;i<tag-1;i++){
			sa+=" ";
		}
		
		System.out.println(sa+"||");
		
		
	}
	
	public static void UP_Links(int tag, int znr)
	{
		String sp = "";
		for (int i =0; i<(tag-znr-1);i++)
		{
			sp+=" ";
		}
		System.out.print(sp+"i/");
		
	}
	
	public static void UP_Rechts(int tag, int znr)
	{
		String sp = "";
		for (int i=1; i<znr;i++)
		{
				sp+="  ";
			
		}
		System.out.println(sp+"\\i");
	}
	
	
	
}
