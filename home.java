import java.util.Scanner;

public class home{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter a range for leap year:");
		int a=ab.nextInt();
		int b=ab.nextInt();
		home l=new home();

		for(int i=a;i<=b;i++)
		{
			l.leap(i);
		}

	}
	public void leap(int n)
	{
		if((n%4==0 && n%100!=0)||(n%400==0))
		{
			System.out.println(n+"is leap year");
		}
	}
}