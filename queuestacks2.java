import java.util.*;

public class queuestacks2{

	static class queue{

		static Stack<Integer> s1=new Stack<>();
		static Stack<Integer> s2=new Stack<>();

		public static boolean isEmpty()
		{
			return s1.isEmpty();
		}

		public static void add(int data)
		{
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());  //s1's elements in s2
			}

			s1.push(data);  //add data from bottom

			while(!s2.isEmpty())
			{
				s1.push(s2.pop());
			}
		}

		public static int remove()
		{
			if(isEmpty())
			{
				System.out.println("empty");
				return -1;
			}

			return s1.pop();  //elements remove
		}

		public static int peek()
		{
			if(isEmpty())
			{
				System.out.println("empty");
				return -1;
			}

			return s1.peek();  //elements cannot remove
		}
	}
	public static void main(String[]args)
	{
		queue q=new queue();
		int i=1;
		while(i<=5)
		{
			q.add(i);
			i++;
		}

		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}
	}
}