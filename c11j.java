import java.util.Scanner;

public class c11j{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter n:");
		int n=ab.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
					if((j==1 || j==3)||(i==1||i==n))
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