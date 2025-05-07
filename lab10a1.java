import java.util.*;

public class lab10a1{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		try
		{
			int a=20,b=1;

			System.out.println("divison="+a/b); //flip it if arithmetic exception generate
												 // than not array exception generate
			int h[]=new int[4];

			for(int i=0;i<4;i++)
			{
				System.out.println("enter elements of array elements:");
				h[i]=ab.nextInt();
			}

			System.out.println("fifth element:"+h[5]);
		} 
		catch(ArithmeticException c)
		{
			System.out.println("exception of arithmatic:"+c.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException b)
		{
			System.out.println("array exception:"+b.getMessage());
		}
		finally
		{
			System.out.println("go ahead");
		}
	}
}