import java.util.Scanner;

public class pro26{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a binary number:");
		String a=ab.nextLine();

		int decimal=Integer.parseInt(a,2);

		System.out.println("decimal="+decimal);
	}
}