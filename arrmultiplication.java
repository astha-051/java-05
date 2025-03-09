import java.util.Scanner;

public class arrmultiplication{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a row a:");
		int row=ab.nextInt();

		System.out.println("enter columns a:");
		int col=ab.nextInt();

		System.out.println("enter a row b:");
		int row2=ab.nextInt();

		System.out.println("enter columns b:");
		int col2=ab.nextInt();

		if(col2!=row)
		{
			System.out.println("multiplication not possible");
			return;
		}

		int a[][]=new int[row][col];
		int b[][]=new int[row2][col2];
		int result[][]=new int[row][col2];

		System.out.println("enter the value of matrix a:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=ab.nextInt();
			}
		}


		System.out.println("enter the value of matrix b:");
		for(int i=0;i<row2;i++)
		{
			for(int j=0;j<col2;j++)
			{
				b[i][j]=ab.nextInt(); 
			}
		}

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col2;j++)
			{
				for(int k=0;k<col;k++)      //handle element of matrix a row and matrix b col
				{
					result[i][j]+=a[i][k]*b[k][j];
				}
			}
		}

		System.out.println("multiplication is:");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col2;j++)
			{
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
}