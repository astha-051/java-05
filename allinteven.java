import java.util.Scanner;
class even{
	boolean flag(int a)
	{
		while(a>0)
		{
		int digit=a%10;
		if(digit%2!=0)
		{
			return false;
		}
		a=a/10;
	}
	return true;
	}
}

public class allinteven{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a with more than one digit:");
		int a=ab.nextInt();

		even e=new even();

		if(e.flag(a))
		{
			System.out.println("all even");
		}
		else 
		{
			System.out.println("all are not evan");
		}
	}
}