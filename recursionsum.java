public class recursionsum{

	public static void sum(int i,int n,int sum) //i for increment n for ending number and store sum of all number
	{
		if(i==n)  //base condition
		{
			sum+=i;  //becase we need to add also n into sum
			System.out.println(sum);
			return;
		}
		sum+=i;
		sum(i+1,n,sum);  //recursive call
	}
	public static void main(String[]args)
	{
		sum(1,5,0);
	}
}