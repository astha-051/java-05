import java.util.*;

public class itrator{
	public static void main(String[]args)
	{
		List<Integer>  ls=new ArrayList<Integer>();

		int count=56;
		for(int i=1;i<=5;i++)
		{
			ls.add(count);
			count++;
		}

		System.out.println("contents of list:");
		Iterator<Integer> i1=ls.iterator();

		while(i1.hasNext()) //read element
		{
			Object element=i1.next();
			System.out.println(element+" ");
		}
	}
}