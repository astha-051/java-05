public class recursionxpown{
	public static int power(int  x,int n){
		if(n==0)  //power 0=1
		{
			return 1;
		}
		if(x==0)  //number 0 than 0
		{
			return 0;
		}

		// int pow1=power(x,n-1);  //count  2^4 than 2^ 3 than 2^2 like that
		// int pow=x*pow1;
		// return pow;
		return x*power(x,n-1);
	}
	public static void main(String[]args)
	{
		int x=2,n=5;
		System.out.println("power:"+power(2,5));
	}		
}