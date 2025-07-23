import java.util.*;

public class queue{
	public static void main(String[]args)
	{
		Queue<String> q1=new LinkedList<String>();

		q1.add("astha");
		q1.add("princi");
		q1.add("ishi");
		q1.add("dwija");

		System.out.println(" element in q:"+q1);
		System.out.println("removed elemnt:"+q1.remove());
		System.out.println("head:"+q1.element());
		System.out.println("peek:"+q1.peek());
		System.out.println("poll:"+q1.poll());//delete also
		System.out.println("element in queue:"+q1);
	}
}