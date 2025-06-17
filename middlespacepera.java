import java.util.Scanner;

public class middlespacepera{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a number:");
		int a=ab.nextInt();

		for(int i=1;i<=a;i++)
		{
			for(int k=1;k<=a-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if((j==1 || j==2*i-1|| i==a))
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