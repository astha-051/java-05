import java.util.*;

public class queueapna{
	public static void main(String[]srgs)
	{
		Queue<Integer> q=new ArrayDeque<>();  //queue implements only by linkedlist or arrydequeue
		//can't create objects of interface  //Linkedlist<>
		for(int i=0;i<5;i++)
		{
			q.add(i);
		}

		while(!q.isEmpty())
		{
			System.out.println(q.peek());
			q.remove();
		}
	}
}