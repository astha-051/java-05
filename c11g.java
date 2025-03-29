import java.util.Scanner;

public class c11g{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter n:");
		int n=ab.nextInt();
		int k=1;

		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(k  );
				k++;
			}
			System.out.println();
		}
	}
}