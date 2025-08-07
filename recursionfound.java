import java.util.*;

class Find{

	int isInArray(int array[],int find)
	{
		for(int i=0;i<5;i++)
		{
			if(array[i]==find)
			{
				return i;
			}
		}
		return -1;
	}
}

public class recursionfound{
	public static void main(String[]args)
	{
		Scanner  ab=new Scanner(System.in);

		int []array=new int[5];

		for(int i=0;i<5;i++)
		{
			System.out.println("enter an array elements:");
			array[i]=ab.nextInt();
		}

		System.out.println("enter a number to check weather it in array or not:");
		int find=ab.nextInt();

		Find f1=new Find();
		int found=f1.isInArray(array,find);

		if(found==-1)
		{
			System.out.println("element not found");
		}
		else 
		{
			System.out.println("fount at index:"+found);
		}
	}
}