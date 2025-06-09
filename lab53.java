import java.util.Scanner;

public class lab53{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter  an array:");
		int n=ab.nextInt();

		int []a=new int[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("enter an elements in assending order:");
			 a[i]=ab.nextInt();
		}

		
		System.out.println("enter a number to rotate:");
		int j=ab.nextInt();

		// for(int k=j;k<a.length;k++)
		// {
		// 	System.out.print(a[k]);
		// }

		// for(int k=j;k>=0;k--)
		// {
		// 	System.out.print(a[k]);
		// }

		int []b=new int[n];
		for(int i=0;i<n;i++)
		{
			b[(i+j)%n]=a[i];
		}

		System.out.println("roateted array:");
		for(int i=0;i<n;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println();

		System.out.println("enter an index you want to search:");
		int search=ab.nextInt();

		boolean found=false;

		for(int i=0;i<b.length;i++)
		{
			if(b[i]==search)
			{
				System.out.println("found at"+i);
				found=true;
				break;
			}

		}

			if(!found)
			{
				System.out.println("nmot found");
			}
	}
}





//  a=1,2,3,4,5; j=2;number where the loop rotate first iteration i=0;a[0]=1;b;(0+2)%5=2; b[2]=2;

// i=1;a[1]=2;b(1+2)%5=3; b[3]=2; i=3;a[3]=4;b(3+2)%5=0 a[0]=4 i=4;a[4]=5;b(4+2)%5=1  a[1]=5;