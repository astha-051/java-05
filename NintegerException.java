import java.util.*;

class nagetive extends Exception{
	nagetive(String msg)
	{
		super(msg);
	}
}
class divide10 extends Exception{
	divide10(String msg)
	{
		super(msg);
	}
}
class graeter extends Exception{
	graeter(String msg)
	{
		super(msg);
	}
}
class greater7 extends Exception{
	greater7(String msg)
	{
		super(msg);
	}
}

public class NintegerException{
	public static void main(String[]args) throws Exception
	{
		Scanner ab=new Scanner(System.in);

		int n,sum=0;
		while(true)
		{
			System.out.println("enter n:");
			n=ab.nextInt();

			if(n<0)
			{
				throw new nagetive("sorry it's nagetive:"+sum);
			}
			else if(n%10==0)
			{
				throw new divide10("it's divide by 10:"+sum);
			}
			else if(n>=1000 && n<=2000)
			{
				throw new graeter("graeter 1000 and less 2000:"+sum);
			}
			else if(n>=7000)
			{
				throw new greater7("greater 7000:"+sum);
			}
			else if(n==0)
			{
				System.out.println("sum="+sum);
				System.exit(0);
			}
			else 
			{
				sum+=n;
			}
		}
	}
}