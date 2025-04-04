class student{
	double height;
	double width;
	double depth;

	void setter(double height,double width,double depth)
	{
		this.height=height;
		this.width=width;
		this.depth=depth;
	}

	void getter()
	{
		System.out.println("height="+height);
		System.out.println("width="+width);
		System.out.println("depth="+depth);
	}

	void cube()
	{
		System.out.println(height*width*depth);
	}
}

public class cubextra{
	public static void main(String[]args)
	{
		student s1=new student();

		s1.setter(10,20,30);
		s1.getter();
		s1.cube();

		student s2=new student();

		s2.setter(4,5,6);
		s2.getter();
		s2.cube();
	}
}