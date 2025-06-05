
import java.util.Scanner;

public class lab32{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter a number:");
		int a=ab.nextInt();

		if(a%2==0)
		{
			System.out.println(a+"is even");
		}
		else 
		{
			System.out.println(a+"is odd");
		}

	}
}