import java.util.Scanner;

public class pro30{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a number:");
		int a=ab.nextInt();

		StringBuilder s1=new StringBuilder();

		while(a>0)
		{
			s1.insert(0,a%2);
			a/=2;
		}

		System.out.println("binary="+s1.toString());
	}
}