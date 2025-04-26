import java.util.*;
	
class count{
	int vowel=0;
	int a=0,e=0,i=0,o=0,u=0;

	void count1(String s1)
	{
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);

			switch(ch)
			{
				case 'a':
					vowel++;
					a++;
					break;

				case 'e':
					e++;
					vowel++;
					break;

				case 'i':
					i++;
					vowel++;
					break;

				case 'o':
					o++;
					vowel++;
					break;

				case 'u':
					u++;
					vowel++;
					break;
			}
		}

		System.out.println("vowels="+vowel);
		System.out.println("a="+a);
		System.out.println("e="+e);
		System.out.println("i="+i);
		System.out.println("o="+o);
		System.out.println("u="+u);
	}
}
public class lab6b4{
	public static void  main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		count c1=new count();
		while(true)
		{
			System.out.println("enter a sentence:");
			String s1=ab.nextLine();
			
			if(s1.equals("quit"))
			{
				System.out.println("terminated");
				break;
			}
			c1.count1(s1);
		}
	}
}