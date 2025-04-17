interface A{
	public void meth1();
	public void meth2();
}
interface B extends A{
	public void meth3();
}
interface C extends B{
	public void meth4();
}

class Bone implements B{
	public void meth1()
	{
		System.out.println("1");
	}
	public void meth2()
	{
		System.out.println("2");
	}
	public void meth3()
	{
		System.out.println("3");
	}
}

class Ctwo implements C{
	public void meth1()
	{
		System.out.println("1");
	}
	public void meth2()
	{
		System.out.println("2");
	}
	public void meth3()
	{
		System.out.println("3");
	}
	public void meth4()
	{
		System.out.println("4");
	}
}

public  class hierachyinterface{
	public static void main(String[]args)
	{
		Bone b1=new Bone();
		Ctwo c2=new Ctwo();

		b1.meth1();
		b1.meth2();
		b1.meth3();

		c2.meth1();
		c2.meth2();
		c2.meth3();
		c2.meth4();
	}
}