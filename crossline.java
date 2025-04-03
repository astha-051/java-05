import java.util.Scanner;
 
 public class crossline{
 	public static void main(String[]args)
 	{
 		Scanner ab=new Scanner(System.in);
 		System.out.println("enter  n:");
 		int n=ab.nextInt();

 		for(int i=1;i<=n;i++)
 		{
 			for(int j=1;j<=n-i;j++)   //(/)    j<=n=(|)  j=n-i=(/)
 			{
 				System.out.print(" ");
 			}
 			System.out.println("*");
 			System.out.println();
 		}
 	}
 }