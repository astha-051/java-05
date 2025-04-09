import java.util.*;

public class fibonacci{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter n:");
		int n=ab.nextInt();
		int first=0,second=1;

		System.out.println("series:");
		for(int i=1;i<n;i++)
		{
			System.out.println(first+" ");    //0+1=1   1+1=2  1+2=3  2+3=5  3+5=8  5+8=13

			int next=first+second;
			first=second;
			second=next;
		}	
	}
}