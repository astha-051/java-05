import java.util.Scanner;

public class maxfun{
	public static void main(String[] args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter three number:");
		double a=ab.nextDouble();
		double b=ab.nextDouble();
		double c=ab.nextDouble();
		maxfun p=new maxfun();

		p.max(a,b,c);
	}
	public void max(double j,double k,double l)
	{
		if(j>k && j>l)
		{
			System.out.println(j);
		}
		else if(k>l)
		{
			System.out.println(k);
		}
		else 
		{
			System.out.println(l);
		}
	}
}