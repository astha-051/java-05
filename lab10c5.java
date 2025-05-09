import java.util.*;

class NumberException extends Exception{
	NumberException(String s)
	{
		super(s);
	}
}

class Number{

	public void display(int a) throws NumberException{

		if(a<10 || a>50)
		{
			throw new NumberException("invalid number!");
		}
		else 
		{
			System.out.println("square="+(a*a));
		}
	}
}
public class lab10c5{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a number less than 50:");
		int a=ab.nextInt();
		Number n=new Number();

		try 
		{
			n.display(a);
		}
		catch(NumberException nm)
		{
			System.out.println("Error!"+nm.getMessage());
		}
	}
}