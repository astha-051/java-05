import java.util.Scanner;

class cha{
	void between(char start,char end)
	{
		if(start<end) 
		{
			for(char ch=start;ch<=end;ch++)
			{
				System.out.println(ch+" ");
			}
		}
		else 
		{
			System.out.println("not valid");
		}
	}
}

public class charbetween{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter first char:");
		char start=ab.next().charAt(0);

		System.out.println("enter second char:");
		char end=ab.next().charAt(0);

		cha ca=new cha();
		ca.between(start,end);
		
	}
}