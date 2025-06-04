import java.util.Scanner;

public class lab25{
	public static void main(String[] args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter a:");
		int a=ab.nextInt();
		System.out.println("enter b:");
		int b=ab.nextInt();
		System.out.println("enter c:");
		int c=ab.nextInt();

		if(a>b && a>c)
		{
			System.out.println(a);	
		}
		if(b>c)
		{
			System.out.println(b);	
		}
		else 
		{
			System.out.println(c);
		}
	}
}