import java.util.Scanner;

public class lab16
{
	public static void main(String[] args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter a character:");
		String s1=ab.nextLine();

		if(s1.equals("a")||s1.equals("e")||s1.equals("i")||s1.equals("o")||s1.equals("u"))
		{
			System.out.println("vowels");
		}
		else 
		{
			System.out.println("consonent");
		}
	}
}