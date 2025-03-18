import java.util.Scanner;


public class bubble{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter an array number:");
		int n=ab.nextInt();

		int []a=new int[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("enter an array element:");
			a[i]=ab.nextInt();
		}

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

		for(int temp:a)
		{
			System.out.println(temp+",  ");
		}
	}
}