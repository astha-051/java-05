import java.util.Scanner;

public class lab4a4{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter a string:");
		String s1=ab.nextLine();

		int a=s1.length();

		System.out.println("len="+a);

		String second=s1.substring(a/2);

		System.out.println("half="+second);
	}
}