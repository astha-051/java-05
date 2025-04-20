import java.util.*;

class Sort{
	public void printArray(int array[])
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
}

public class insertionsort
{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter an array number:");
		int number=ab.nextInt();

		int array[]=new int[number];
		for(int i=0;i<array.length;i++)
		{
			System.out.println("enter an array elements:");
			array[i]=ab.nextInt();
		}
		for(int i=1;i<array.length;i++)
		{
			int current=array[i]; //sorted part
			int j=i-1;  //place i-1 to j (unsorted part)
			while(j>=0 && current < array[j])  //where j is greater than 0
			{
				array[j+1]=array[j];
				j--; //where j is being 0 from unsorted part
			}

			array[j+1]=current;//array[j+1] contains j+1 in all loop runs with another unsorted part
		}

		Sort s1=new Sort();
		s1.printArray(array);
	}
}