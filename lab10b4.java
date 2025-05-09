import java.util.*;

class  ZeroException extends Exception{
	ZeroException(String s)
	{
		super(s);
	}
}

class Zero{

	public void display1(int a,int b) throws ZeroException{

		if(b==0)
		{
			throw new ZeroException("Error! plese enter  another number");
		}
		else
		{
			System.out.println("ans="+(a/b));
		}
	}
}

public class lab10b4{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		Zero z=new Zero();

		System.out.println("enter a number:");
		String str1=ab.nextLine();

		System.out.println("enter 2nd number:");
		String str2=ab.nextLine();


		try
		{
			int a=Integer.parseInt(str1);
			int b=Integer.parseInt(str2);

			z.display1(a,b);
		}
		catch(NumberFormatException n) 
		{
			System.out.println("NumberException"+n.getMessage());
		}
		catch(ZeroException z1)
		{
			System.out.println("ZeroException"+z1.getMessage());
		}
	}
}