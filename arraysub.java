import java.util.Scanner;

class myarray{

	void display(int[]a) //display
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a["+i+"]:"+a[i]);
		}
	}  //display

	int [] bubble(int[]a)  //bubble
	{
		int temp;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}

		return a;
	}  //bubble

	int search(int[]a,int s)  //search
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==s)
			{
				return i;
			}
		}
		return -1;
	}  //search

	int sum(int[]a)   //sum
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}

		return sum;
	}  //sum


	double avg(int[]a) //avg
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		double avg=(double)sum/a.length;

		return avg;
	}  //avg
}

public class arraysub{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter n:");
		int n=ab.nextInt();

		int a[]=new int[n];

		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter a["+i+"]:");
			a[i]=ab.nextInt();
		}

		myarray m=new myarray();

		m.display(a); //call-1

		m.bubble(a);  //call-2

		System.out.println("after bubble sort:");
		m.display(a); //print-2

		System.out.println("enter an element for search:");
		int s=ab.nextInt();

		int index=m.search(a,s);  //call-3
		System.out.println(s+":found at:"+index);

		int sum=m.sum(a);   //call-4
		System.out.println("sum="+sum); 

		double avg=m.avg(a);  //call-5
		System.out.println("avg="+avg);
	}
}