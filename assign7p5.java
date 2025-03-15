import java.util.Scanner;

public class assign7p5{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a sentence:");
		String s1=ab.next();
		char ch='a';
		int count=0;

		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println("occurance of a="+count);
	}
}