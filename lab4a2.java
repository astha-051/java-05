import java.util.Scanner;

public class lab4a2{
	public static void main(String[]args)
	{
		int [] a={2,4,6,8};
		// for(int i=1;i<=4;i++)
		// {
		// 	System.out.println("enter an element:");
		// 	a[i]=nextInt();
		// }
		double avg;
		int sum=0;

		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}

		avg=sum/a.length;
		System.out.println("avg="+avg);
	}
}