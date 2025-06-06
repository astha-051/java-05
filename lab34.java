import java.util.Scanner;

public class lab34
{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter a number:");
		double a=ab.nextDouble();
		boolean flag=true;

		for(int i=0;i<a-1;i++)  //last number 
		{
			if(a%i==0)
			{
				flag=false;
			}
			else 
			{
				flag=true;
			}
		}

		if(flag)
		{
			System.out.println(a+"is prime");
		}
		else 
		{
			System.out.println(a+"is not prime");
		}
	}
}