import java.util.Scanner;

public class assign8p1{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a sentence:");
		String s1=ab.nextLine();
		String s2="";

		for(int i=0;i<s1.length();i++)
		{
			if(i%2==0)
			{
				s2+=Character.toLowerCase(s1.charAt(i));
			}
			else 
			{
				s2+=Character.toUpperCase(s1.charAt(i));
			}
		}

		System.out.println("second string="+s2);
	}
}