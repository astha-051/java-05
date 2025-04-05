import java.util.Scanner;

public class doublecross{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter n:");
		int n=ab.nextInt();

		for(int i=1;i<=4;i++)
		{
			for(int k=2;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=4;j++)
			{
				if(j==1||j==4||i==1||i==4)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

		for(int i=1;i<=n;i++)
		{
			for(int k=n;k>=1;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(2*i-1);j++)
			{
				if(j==1||j==(2*i-1))
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
		}


		for(int i=2;i<=n;i++)
		{
			for (int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=(2*i-1);j++)
			{
				if(j==1||j==(2*i-1))
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}