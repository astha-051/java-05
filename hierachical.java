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
class  C extends A{
	int m;

	void add()
	{
		System.out.println("added:"+(i+m));
	}
}

class hierachical{
	public static void main(String[]args)
	{
		A a1=new A();
		a1.i=10;
		B b2=new B();
		b2.i=20;
		b2.j=20;
		C c3=new C();
		c3.i=40;
		c3.m=30;

		a1.add();
		b2.add();
		c3.add();
	}
}