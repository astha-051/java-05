import java.util.*;

public class everyocuur{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a string:");
		String str=ab.nextLine();

		int []count=new int[300];

		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			count[ch]++;
		}

		for(int i=0;i<256;i++)   //loop goes until ascii value
		{
			if(count[i]>0)
			{
				System.out.println((char)i+"="+count[i]);
			}
		}
	}
}

//If ch = 'a', then count[97]++ will increment the value at index 97 (the ASCII value of 'a').
// If ch = 'b', then count[98]++ will increment the value at index 98 (the ASCII value of 'b').