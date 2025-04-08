import java.util.Scanner;

public class factorial{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter a number:");
		int a=ab.nextInt();

		factorial f=new factorial();

		int result=f.fact(a);
		System.out.println("factorial="+result);
	}

	public int fact(int n)
	{
		int ans=1;
		for(int i=1;i<=n;i++)
		{
			ans*=i;
		}

		return ans;
	}
}