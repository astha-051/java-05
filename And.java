import java.util.Scanner;

public class And{
	public static void main(String[] args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter a:");
		int a=ab.nextInt();
		System.out.println("enter b:");
		int b=ab.nextInt();
		System.out.println("a="+Integer.toBinaryString(a));
		System.out.println("b="+Integer.toBinaryString(b));
		System.out.println("a&b="+(a&b));
		System.out.println("a&b="+Integer.toBinaryString(a&b));
	}
}