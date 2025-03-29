import java.util.Scanner;

public class c11h{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter n:");
		int n=ab.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j%2==0)
				{
					System.out.print("0");
				}
				else {
					System.out.print("1");
				}
			}
			System.out.println();
		}
	}
}