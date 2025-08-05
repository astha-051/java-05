import java.util.Scanner;

public class rectanglearea{

		double height;
		double width;
		double depth;

	void setdata(double h,double w,double d)
	{
		height=h;
		width=w;
		depth=d;
	}
	double area()
	{
		return height*width*depth;
	}
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter 1streactangle's height,width and depth:");
		double h1=ab.nextDouble();
		double w1=ab.nextDouble();
		double d1=ab.nextDouble();
		rectanglearea r1=new rectanglearea();
		r1.setdata(h1,w1,d1);


		System.out.println("enter 2ndreactangle's height,width and depth:");
		double h2=ab.nextDouble();
		double w2=ab.nextDouble();
		double d2=ab.nextDouble();
		rectanglearea r2=new rectanglearea();
		r2.setdata(h2,w2,d2);

		System.out.println("1st area="+r1.area());
		System.out.println("2nd area="+r2.area());
	}
}