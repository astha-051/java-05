import java.util.Scanner;

class count{
	double height;
	double width;
	static double depth=10;

	double display(double height,double width)
	{
		this.height=height;
		this.width=width;
		

		return height*width*depth;
	}
}

public class lab6c7{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter height,width,depth:");
		double h=ab.nextDouble();
		double w=ab.nextDouble();
		// double d=ab.nextDouble();

		System.out.println("enter height,width,depth:");
		double h1=ab.nextDouble();
		double w1=ab.nextDouble();
		// double d=ab.nextDouble();

		count c=new count();
		System.out.println("area="+c.display(h,w));

		count c1=new count();
		System.out.println("area="+c1.display(h1,w1));
	}
}