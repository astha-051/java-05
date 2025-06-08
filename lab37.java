import java.util.Scanner;

public class lab37{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter a range:");
		int a1=ab.nextInt();
		int a2=ab.nextInt();
		lab37 p=new lab37();
		for(int i=a1;i<=a2;i++)
		{
			if(p.prime(i))
			{
				System.out.println("prime="+i);
			}
		}

}
	public boolean prime(int n)
{
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
		{
			return false;
		}
	}
	return true;
}
}