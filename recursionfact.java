import java.util.*;

class fact{

	int factorial(int n)
	{
		if(n==0 || n==1)
		{
			return 1;
		}

		else 
		{
			return n*factorial(n-1); //first it calculate n-1 and than multuply it by n
		}
	}
}

public class recursionfact{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a number:");
		int a=ab.nextInt();

		fact p=new fact();
		int ans=p.factorial(a);  //returns a as a factorial output

		System.out.println("ans="+ans);
	}
}