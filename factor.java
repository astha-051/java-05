import java.util.Scanner;

public class factor{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter a number:");
		int a=ab.nextInt(); 
		factor f=new factor();

			f.fact(a);
			
		
	}
	public void fact(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println("factors="+i);
			}
		}
		
	}
}