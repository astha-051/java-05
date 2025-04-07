import java.util.Scanner;
class fact{
	void print(int a)
	{
		int digit=a%10;
		if(digit%3==0)
		{

		}

	}
}

public class factor3{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a number with more than one digit:");
		int a=ab.nextInt();

		fact f=new fact();
		f.print(a);
	}
}