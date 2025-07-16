import java.util.*;

public class power2{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter  a number:");
		int number=ab.nextInt();

		if((number&(number-1))==0)
		{
			System.out.println("yes it is power of 2");
		}
		else 
		{
			System.out.println("not power of 2");
		}
	}
}

// The expression (number & (number - 1)== 0) works because:

// For powers of 2: e.g. 8 → 1000
// 8 - 1 = 7 → 0111
// 1000 & 0111 = 0000