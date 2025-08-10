public class recursionpowlogn{
	public static int power(int x,int n)
	{
		if(x==0)
		{
			return 0;
		}
		if (n==0)
		{
			return 1;
		}

		if(n%2==0)  //for even power
		{
			return power(x,n/2) * power(x,n/2);
		}
		else 
		{
			return power(x,n/2) *  power(x,n/2) * x;
		}
	}

public static void main(String[]args)
{
	int x=2,n=10;
	System.out.println("power:"+power(x,n));
}
}