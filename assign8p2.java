import java.util.*;

class ReverseString{

	String myRevStr(String original)
	{
		String rev="";

		for(int i=original.length()-1;i>=0;i--)
		{
			rev+=original.charAt(i);
			
		}
		return rev;
		
	}
}

public class assign8p2{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a string:");
		String str1=ab.nextLine();

		ReverseString st=new ReverseString();

		System.out.println("reverse="+st.myRevStr(str1));

		StringBuilder str2 = new StringBuilder(str1);

		str2.reverse();

		System.out.println("2-str="+str2);

	}
}