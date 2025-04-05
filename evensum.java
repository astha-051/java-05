import java.util.Scanner;

public class evensum{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a size of an array:");
		int n=ab.nextInt();

		int a[]=new int[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("enter an array element:");
			a[i]=ab.nextInt();
		}

		int sum=0;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum+=a[i];
			}
		}

		System.out.println("sum="+sum);
	}
}