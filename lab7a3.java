import java.util.*;

class cube{
	double height;

	cube(double height)
	{
		this.height=height;
	}

	void display() //over-riding
	{
		System.out.println("volume="+height);
	}
}

class cube1 extends cube{
	double width;
	double depth;
	double height=10;

	cube1(double width,double depth)
	{
		super(30); //super with const.
		this.width=width;
		this.depth=depth;
	}

	void display()  //over-riding
	{
		super.display();
		System.out.println("volume="+(height*width*depth));
		System.out.println("this.height="+this.height);
		System.out.println("super.height="+super.height);  //super variable
	}
}

public class lab7a3{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		cube1 c1=new cube1(10,20);
		c1.display();
	}
}