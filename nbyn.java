import java.util.Scanner;

class array{
	void print(int a[][],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}

public class nbyn{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter number of matrix:");
		int n=ab.nextInt();

		int[][] a=new int[n][n];

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("enter elements of["+i+"]["+j+"]:");
				a[i][j]=ab.nextInt();
			}
			System.out.println();
		}

		array h=new array();

		h.print(a,n);
	}
}