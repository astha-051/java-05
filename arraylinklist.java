import java.util.*;

public class arraylinklist{
	public static void main(String[]args)
	{
		List<Integer> l1=new ArrayList<Integer>(); //arraylist

		l1.add(01);
		l1.add(02);
		l1.add(03);

		System.out.println("array elemnts:");
		System.out.println(l1);

		List<Double> l2=new LinkedList<Double>(); //linked list

		l2.add(23.23);
		l2.add(56.65);
		l2.add(98.98);

		System.out.println("linked list:");
		System.out.println(l2);
	}
}