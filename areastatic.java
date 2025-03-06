import java.util.Scanner;

class myClass{
	double radius;

	void area(double radius)
	{
		System.out.println("area="+(3.14*radius*radius));
	}   //non-static diffrent class

	static void area1(double radius)
	{
		System.out.println("area="+(3.14*radius*radius));
	}   //static diffrent class 
} 

public class areastatic{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter r:");
		double r=ab.nextDouble();

		myClass m1=new myClass();
		m1.area(r);  //call non-static diffrent class

		myClass.area1(r);  //call static diffrent class

		areastatic ar=new areastatic();

		ar.area3(r); // call non-static diffrent class

		areastatic.area4(r);  //call static same class
	}

	void area3(double radius)
	{
		System.out.println("area="+(3.14*radius*radius));
	}  //non-static same class 

	static void area4(double radius)
	{
		System.out.println("area="+(3.14*radius*radius));
	}  //static same class
}