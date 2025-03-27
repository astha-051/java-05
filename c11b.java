import java.util.Scanner;

public class c11b{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter n:");
		int n=ab.nextint();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}