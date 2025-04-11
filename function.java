import java.util.*;

public class function{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter two number:");
		int a=ab.nextInt();
		int b=ab.nextInt();
		function f1=new function();
		System.out.println("add:"+f1.add(a,b));
	}
	public int add(int a,int b)
	{
		return a+b;
	}
}