import java.util.Scanner;

public class c114{
	public static void main(String[]args){
		Scanner ab=new Scanner(System.in);
		System.out.println("enter n:");
		int n=ab.nextInt();

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}