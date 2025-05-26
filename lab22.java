import java.util.Scanner;

public class lab22{
	public static void main(String[] args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("calculater");
		System.out.println("enter a number");
		int a=ab.nextInt();
		System.out.println("enter 2nd number");
		int b=ab.nextInt();
		ab.nextLine();
		System.out.println("enter operator");
		String s1=ab.nextLine();

		if(s1.equals("+"))
		{
			System.out.println("result: "+a+"+"+b+"="+(a+b));
		}
		else if(s1.equals("-"))
		{
			System.out.println("result: "+a+"-"+b+"="+(a-b));
		}
		else if(s1.equals("*"))
		{
			System.out.println("result: "+a+"*"+b+"="+(a*b));
		}
		else if(s1.equals("/"))
		{
			System.out.println("result: "+a+"/"+b+"="+(a/b));
		}
		else if(s1.equals("%"))
		{
			System.out.println("result: "+a+"%"+b+"="+(a%b));
		}
		else 
		{
			System.out.println("invalid input");
		}
	}
}