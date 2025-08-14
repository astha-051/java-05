import java.util.*;

class Count1{

	public void Count(int number)
	{
		int count=0;

		while(number!=0)
		{
			count+=(number & 1);  //increement if last
			number>>=1;
		}

		System.out.println("1 in the number are:"+count);
	}
}

public class represent1{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a number:");
		int number=ab.nextInt();

		Count1 c1=new Count1();
		c1.Count(number);
	}
}

// Continuing the example with n = 5 (binary 101):

// First shift: 101 >>> 1 → 010

// Second shift: 010 >>> 1 → 001

// Third shift: 001 >>> 1 → 000