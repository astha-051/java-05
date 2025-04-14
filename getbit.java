import java.util.*;

public class getbit{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		
		System.out.println("enter a number:");
		int number=ab.nextInt();

		System.out.println("enter position you want to know:");
		int pos=ab.nextInt();

		int bitmask=1<<pos;

		int newnum=(bitmask & number)==0?0:1;

		System.out.println("this bit position is:"+newnum);
	}
}