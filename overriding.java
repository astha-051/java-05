class A{
	void draw()
	{
		System.out.println("circle");
	}
}
class B extends A{
	void draw()
	{
		super.draw();
		System.out.println("rectangle");
	}
}
class C extends A{
	void draw()
	{
		super.draw();
		System.out.println("square");
	}
}

public class overriding{
	public static void main(String[]args)
	{
		B b1=new B();
		b1.draw();

		C c1=new C();
		c1.draw();
	}
}