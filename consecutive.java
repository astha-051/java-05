import java.util.Scanner;

class check{
	boolean test(int x,int y,int z)
	{
		int max=Math.max(x,Math.max(y,z));
		int min=Math.min(x,Math.min(y,z));
		int middle=(x+y+z)-max-min;

		return (max-middle==1) &&  (middle-min==1);
	}
}

public class consecutive{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter first number:");
		int a=ab.nextInt();

		System.out.println("enter second number:");
		int b=ab.nextInt();

		System.out.println("enter third number:");
		int c=ab.nextInt();

		check d=new check();

		
		if(d.test(a,b,c))
		{
		System.out.println("consecutive");
		}
		else {
			System.out.println("not consecutive");
		}
	}
}