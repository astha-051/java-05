import java.util.Scanner;

public class lab31{
	public static void main(String[] args)
	{
	Scanner ab=new Scanner(System.in);
	System.out.println("enter percentage of 5 subject:");
	int a=ab.nextInt();
	int b=ab.nextInt();
	int c=ab.nextInt();
	int d=ab.nextInt();
	int e=ab.nextInt();
	
	float ans=(a+b+c+d+e)*100/500;

	System.out.println("per="+(a+b+c+d+e)*100/500);

	if(ans>=60)
	{
	System.out.println("first-class");
	}
	else if(ans>50 && ans<=59)
	{
	System.out.println("second-class");
	}
	else if(ans>40 && ans<=49)
	{
	System.out.println("third-class");
	}
	else if(ans<=40)
	{
	System.out.println("fail");
	}
	}
}