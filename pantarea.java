import java.util.Scanner;

class panta{
	double area(double a)
	{
		return (1.0/4)*Math.sqrt(5*(5+2*Math.sqrt(5))*a*a);
	}
}

public class pantarea{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter size of pantagon:");
		double a=ab.nextDouble();

		panta p=new panta();

		System.out.println("area="+p.area(a));
	}
}