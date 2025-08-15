import java.util.*;

public class reversestack{

	public static void pushToBottom(int data, Stack<Integer> s)
		{
			if(s.isEmpty())
			{
				s.push(data);
				return;
			}
			int top=s.pop();  //remove from the stack
			pushToBottom(data,s);  //removes onne by one

			s.push(top);  //push  top after add
		}

		public static void reverse(Stack<Integer> s)  //stack reverse than push from bottom
		{
			if(s.isEmpty())
			{
				return;
			}
			int top=s.pop();
			reverse(s);

			pushToBottom(top,s);
		}
	public static void main(String[]args)
	{
		Stack<Integer> s=new Stack<>();

		for(int i=0;i<5;i++)
		{
			s.push(i);
		}

		reverse(s);
		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}
	}
}