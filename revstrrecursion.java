import java.util.*;

public class revstrrecursion{
	public static void rev(String str,int index)
	{
		if(index==0)
		{
			System.out.println(str.charAt(index));
			return;
		}
		System.out.println(str.charAt(index));
		rev(str,index-1);
	}

	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a string:");
		String str=ab.nextLine();

		rev(str,str.length()-1);
	}
}