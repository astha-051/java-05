import java.util.Scanner;

class real{
	int a;
	int b;

	real(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println(a);
		System.out.println(b);
	}

	void add(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("a+b="+(a+b)+"i");
	}
}

public class lab6b5{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		real z=new real(30,50);
		z.add(30,50);

		real z1=new real(20,40);
		z1.add(20,40);
	
		
	}
}