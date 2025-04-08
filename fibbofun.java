import java.util.Scanner;

public class fibbofun{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter a number which stop the series:");
		int a=ab.nextInt();
		fibbofun p=new fibbofun();

		for(int i=1;i<a;i++)
		{
			p.fibbo(i);
		}
	}
	public void fibbo(int n)
	{
		if(n>=2)
		{
			for(int i=2;i<n;i++)
			{
				System.out.println("series="+((n-1)+(n-2)));
			}
		}
	}
}