import java.util.Scanner;

class circle{
	double r;

	void area(double r)
	{
		System.out.println("area="+(3.14*r*r));
	}
}

public class lab6a1{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter r:");
		double a=ab.nextDouble();

		circle s=new circle();

		s.area(a);
	}
}