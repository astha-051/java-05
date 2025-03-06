import java.util.Scanner;

public class armstrong{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter a number:");
		int a=ab.nextInt();
		armstrong r=new armstrong();

		if(r.arm(a))
		{
			System.out.println("number is armstrong");
		}
		else 
		{
			System.out.println("number is  not armstrong");
		}
	}
	public boolean arm(int n)
	{
		int temp=n;
		int r;
		int sum=0;
		int num=0;

		while(temp!=0)
		{
			temp/=10;
			num++;
		}

		temp=n;
		while(temp!=0)
		{
			r=temp%10;
			sum+=Math.pow(r,num);
			temp/=10;
		}

		return sum==n;
	}
}