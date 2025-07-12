import java.util.Scanner;

public class pattern1ton{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter n:");
		int n=ab.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++) //spaces
			{
				System.out.print(" ");
			}

			for(int j=i;j>=1;j--)
			{
				System.out.print(j);
			}

			for(int j=2;j<=i;j++)
			{
				System.out.print(j);
			}

			System.out.println();
		}
	}
}