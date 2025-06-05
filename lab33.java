import java.util.Scanner;

public class lab33
{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter 3 numbers:");
		double a=ab.nextDouble();
		double b=ab.nextDouble();
		double c=ab.nextDouble();

		double ans=(a>b && a>c)?a:(b>c?b:c);

		System.out.println("largest="+ans);
	}
}