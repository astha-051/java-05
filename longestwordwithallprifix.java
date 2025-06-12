public class longestwordwithallprifix{

	static class Node{
		Node[] children;
		boolean eow;

		Node()
		{
			children=new Node[26];

			for(int i=0;i<26;i++)
			{
				children[i]=null;
			}
			eow=false;
		}
	}

	static Node root=new Node();

	public static void insert(String word)
	{
		Node current=root;

		for(int i=0;i<word.length();i++)
		{
			int index=word.charAt(i)-'a';

			if(current.children[index] == null)
			{
				current.children[index]=new Node();
			}
			if(i == word.length()-1)
			{
				current.children[index].eow=true;
			}

			current=current.children[index];
		}
	}

	public static String ans="";

	public static void longestword(Node root,StringBuilder temp)
	{
		if(root == null)
		{
			return;
		}

		for(int i=0;i<26;i++)
		{
			if(root.children[i] != null && root.children[i].eow==true)
			{
				temp.append((char)(i+'a'));

				if(temp.length() > ans.length())
				{
					ans=temp.toString();
				}

				longestword(root.children[i],temp);

				temp.deleteCharAt(temp.length()-1);
			}
		}
	}

	public static void main(String[]args)
	{
		String words[]={"a","ap","app","appl","apple","apply","banana"};

		for(int i=0;i<words.length;i++)
		{
			insert(words[i]);
		}

		longestword(root,new StringBuilder(""));
		System.out.println(ans);
	}	
}