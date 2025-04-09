import java.util.Scanner;

 class Middle{

	String mid(String s1)
	{
		int position;
		int length;

		if(s1.length()%2==0)
		{
			position=s1.length()/2-1;
			length=2;
		}
		else 
		{
			position=s1.length()/2;
			length=1;
		}

		return s1.substring(position,position+length);
	}
}

public class findmidstring{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a String:");
		String s1=ab.nextLine();

		Middle m=new Middle();

		System.out.println("middle Character="+m.mid(s1));
	}
}