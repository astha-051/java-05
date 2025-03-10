import java.util.Scanner;

public class arrow{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter n:");
		int n=ab.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*  ");
			}
			System.out.println();
		}

		for(int i=n-1;i>=0;i--)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}