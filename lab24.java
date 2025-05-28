import java.util.Scanner;

public class lab24{
	public static void main(String [] args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter ferengit");
		float a=ab.nextFloat();
		System.out.println("enter celcius:");
		float c=ab.nextFloat();

		System.out.println("celcius="+(a-32*5/9));
		System.out.println("ferenhir="+((c*9/5)+32));
	}
}