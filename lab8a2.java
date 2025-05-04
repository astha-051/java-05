import java.util.*;

interface A{
	String name1="astha";

	void display1();
}

interface A1 extends A{
	String name2="priya";

	void display2();
}

interface A2 extends A{
	String name3="ishi";

	void display3();
}

interface A12 extends A1,A2{
	String name4="dwija";

	void display4();
}

class B implements A12{

	public void display1()
	{
		System.out.println(name1);
	}

	public void display2()
	{
		System.out.println(name2);
	}

	public void display3()
	{
		System.out.println(name3);
	}

	public void display4()
	{
		System.out.println(name4);
	}
}

public class lab8a2{
	public static void main(String[]args)
	{
		B obj=new B();

		obj.display1();
		obj.display2();
		obj.display3();
		obj.display4();
	}
}