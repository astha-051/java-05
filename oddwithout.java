import java.util.Scanner;

public class oddwithout{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter a number:");
		int a=ab.nextInt();

		oddwithout w=new oddwithout();

		if(w.without(a))
		{
			System.out.println("odd");
		}
		else 
		{
			System.out.println("even");
		}
	}

	public boolean without(int n)
	{
		return (n&1)==1;
	}
}