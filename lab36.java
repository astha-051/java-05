import java.util.Scanner;

public class lab36
{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter a number:");
		int a=ab.nextInt();

		int n=a;
		int rev=0;

		while(n!=0)
		{
			int digit=a%10;
			rev=rev*10+digit;
			a=a/10;
		}

		if(n==rev)
		{
			System.out.println(a+"palindrome");
		}
		else 
		{
			System.out.println(a+"not palindrome");
		}
	}
}