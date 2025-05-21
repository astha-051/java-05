import java.util.Scanner;

public class lab15{
	public static void main(String[] args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter a meter:");
		double m=ab.nextDouble();

		System.out.println("feet="+(m*3.28084));
	}
}