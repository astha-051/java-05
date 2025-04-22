import java.util.Scanner;

public class lab4a1{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter a line:");
		String s1=ab.nextLine();
		int count1=0;
		int count2=0;

		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='u'||s1.charAt(i)=='i'||s1.charAt(i)=='e'||s1.charAt(i)=='o')
			{
				count1++;
			}
			else 
			{
				count2++;
			}
		}
		System.out.println("vowels="+count1);
		System.out.println("consonant="+count2);
	}
}