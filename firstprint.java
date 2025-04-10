import java.util.Scanner;
class first{
	int print(int a)
	{
		while(a>=10)
		{
			a/=10;
		}
		return a;
	}
}

public class firstprint{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a with more than one digit:");
		int a=ab.nextInt();

		first f=new first();
		System.out.println("first int is="+f.print(a));
	}
}