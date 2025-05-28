import java.util.Scanner;

public class lab23{
	public static void main(String[] args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter length:");
		int a=ab.nextInt();
		System.out.println("enter base:");
		int b=ab.nextInt();

		System.out.println("area="+(a*b));
	}
}