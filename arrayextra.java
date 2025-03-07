import java.util.*;

class astha{
	int []a=new int[5];

	public astha(int []a)
	{
		this.a=a;
	}
	void sort()
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}

		for(int temp:a)
		{
			System.out.println(temp+", ");
		}
	}

	void serch()
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a number you want to search:");
		int search=ab.nextInt();

		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				System.out.println("element fount at index="+i);
				break;
			}
		}

	}

	void sum()
	{
		int sum=0;

		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}

		System.out.println("sum="+sum);
	}

	void avg()
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}

		double avg=sum/a.length;

		System.out.println("avg="+avg);
	}
}

public class arrayextra{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		int []a=new int[5];

		for(int i=0;i<5;i++)
		{
			System.out.println("enter an elements of array:");
			a[i]=ab.nextInt();
		}

		astha a1=new astha(a);

		a1.sort();
		a1.serch();
		a1.sum();
		a1.avg();
	}
}