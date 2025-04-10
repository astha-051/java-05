import java.util.*;

class  Area{
	double height;
	double width;
	

	Area(double height,double width)
	{
		this.height=height;
		this.width=width;
	}

	Area(Area a1,double width)
	{
		this.height=a1.height;
		this.width=a1.width;
	}

	public double display(double height,double width)
	{
		return height*width;
	}
}

public class  copconst{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter height and width for one:");
		double height=ab.nextDouble();
		double width=ab.nextDouble();

		System.out.println("enter width for second:");
		double newwidth=ab.nextDouble();

		Area a1=new Area(height,width);
		Area a2=new Area(a1,newwidth);

		System.out.println("first area:"+a1.display(height,width));
		System.out.println("second area:"+a2.display(height,newwidth));
	}
}