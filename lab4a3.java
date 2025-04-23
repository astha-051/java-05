import java.util.*;

public class lab4a3{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		
		System.out.println("enter an array:");
		int a=ab.nextInt();
		int []arr=new int[a];

		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter an elements:");
			arr[i]=ab.nextInt();
		}
		System.out.println("Reverse order:");
		for(int i=a-1;i>=0;i--)
		{
			System.out.print(arr[i]+"");
		}
	}
}