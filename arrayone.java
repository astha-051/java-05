import java.util.Scanner;

public class  arrayone{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter an array:");
		int n=ab.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("enter an array elements:a["+i+"]:");
			a[i]=ab.nextInt();
		}
		System.out.println("reverse array:");
		// for(int i=0;i<a.length;i++)  //only print
		// {
		// 	System.out.println(a[i]);
		// }

		for(int i=n-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}