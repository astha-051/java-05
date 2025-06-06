import java.util.Scanner;

public class lab35{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter a year:");
		int a=ab.nextInt();
		boolean flag=true;

	float ans=(a%4==0 &&  a%100!=0)||(a%400==0)?flag=true:flag=false;	

	if(flag)
	{
	System.out.println(a+"leap year");
	}
	else 
	{
		System.out.println(a+"not leap year");
	}
	}
}