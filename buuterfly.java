import java.util.Scanner;

public class buuterfly{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter n:");
		int n=ab.nextInt();

		//upper half
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}

			for(int k=1;k<=(2*(n-i));k++)   //space
			{
				System.out.print(" ");
			}

			for(int j=1;j<=i;j++)    //right-part
			{
				System.out.print("*");
			}

			System.out.println();
		}

		//lower-part
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}

			for(int k=1;k<=2*(n-i);k++)
			{
				System.out.print(" ");
			}

			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}