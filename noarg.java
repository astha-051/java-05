import java.util.Scanner;

class cube{
	double width;
	double height;
	double depth;

	cube(double width,double height,double depth)
	{
		System.out.println("constuctiong cube");
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	void col()
	{
		double volume=width*height*depth;
		System.out.println("volume="+volume);
	}
}

public class noarg{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		cube c=new cube(10,10,10);
		c.col();
	}
}