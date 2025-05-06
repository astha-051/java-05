import java.util.*;

interface Shape{
	public void getArea();
}
class Rectangle implements Shape{
	int b;
	int h;

	Rectangle(int b,int h)
	{
		this.b=b;
		this.h=h;
	}

	public void getArea()
	{
		System.out.println("Rectangle area="+(b*h));
	}
}
class Circle implements Shape{
	int r;

	Circle(int r)
	{
		this.r=r;
	}

	public void getArea()
	{
		System.out.println("circle area="+(Math.PI*r*r));
	}
}

class Triangle implements Shape{
	int b;
	int h;

	Triangle(int b,int h)
	{
		this.b=b;
		this.h=h;
	}
	public void getArea()
	{
		System.out.println("triangle area="+(0.5*b*h));
	}
}

public class lab9b2{
	public static void main(String[]args)

	{		
		Rectangle r=new Rectangle(5,10);
		r.getArea();

		Circle c=new Circle(5);
		c.getArea();

		Triangle t=new Triangle(5,10);
		t.getArea();
	}
}