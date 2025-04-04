import java.util.Scanner;

public class diff{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter two numbers:");
		int a=ab.nextInt();
		int b=ab.nextInt();
		System.out.println("a-b="+(a-b));

		if(a-b>0)
		{
			System.out.println("dif. is positive");
		}
		else 
			System.out.println("dif. is nagative");
	}
}
