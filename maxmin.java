import java.util.Scanner;

public class maxmin{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a number for loop:");
		int n=ab.nextInt();

		int mina=Integer.MAX_VALUE;
		int maxa=Integer.MIN_VALUE;
		int sum=0;

		for(int i=0;i<n;i++)
		{
			System.out.println("enter an elements:");
			int a=ab.nextInt();
		
			if(a<mina)
			{
				mina=a;
			}
			if(a>maxa)
			{
				maxa=a;
			}
			sum+=a;
		}
		double avg=(double)sum/n;

		System.out.println("min="+mina);
		System.out.println("max="+maxa);
		System.out.println("avg="+avg);
	}
}