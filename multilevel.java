class A{
	int i;

	void add()
	{
		System.out.println("added:"+i);
	}
}
class B extends A{
	int j;

	void add()
	{
		System.out.println("added:"+(i+j));
	}
}
class C extends B{
	int m;

	void add()
	{
		System.out.println("added:"+(j+m));
	}
}

class  multilevel{
	public static void main(String[]args)
	{
		A a1=new A();
		a1.i=10;

		B b2=new B();
		b2.i=20;
		b2.j=30;

		C c3=new C();
		c3.j=20;
		c3.m=80;


		a1.add();
		b2.add();
		c3.add();

	}
}