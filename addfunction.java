import java.util.Scanner;

public class addfunction{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter two numbers:");
		double a=ab.nextDouble();
		double b=ab.nextDouble();
		addfunction p=new addfunction();
		p.add(a,b);
	}
	public void add(Double j,double k)
	{
		System.out.println("a+b="+(j+k));
	}
}