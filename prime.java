import java.util.Scanner;

public class prime{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a number:");
		int n=ab.nextInt();

		boolean flag=true;

		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=true;
			}
		}
		if(flag=true)
		{
			System.out.println("prime");
		}
		else 
		{
			System.out.println("not prime");
		}
	}

}