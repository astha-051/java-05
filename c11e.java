import java.util.Scanner;

public class c11e{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter n:");
		int n=ab.nextInt();

		for (int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}