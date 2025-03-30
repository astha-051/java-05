import java.util.Scanner;

public class c11i{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter  n:");
		int n=ab.nextInt();
		char b='A';
		int a=1;

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print(b);
					b++;
				}
				else 
				{
					System.out.print(a);
					a++;				
				}
			}
			System.out.println();
		}
	}
}