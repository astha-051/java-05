import java.util.*;

public class lab5b6{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter  a number:");
		int num=ab.nextInt();

		for(int i=0;i<num;i++)
		{
			for(int k=0;k<num-i-1;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				if(j==0 || j==i)
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

		for(int i=num;i>=0;i--)
		{
			for(int k=0;k<=num-i-1;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				if(j==0 || j==i)
				{
					System.out.print("* ");
				}
				else 
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}  //border peramid
	}
}