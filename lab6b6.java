public class lab6b6{
	static int count=0;

	lab6b6()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[]args)
	{
		lab6b6 l1=new lab6b6();
		lab6b6 l2=new lab6b6();
		lab6b6 l3=new lab6b6();
	}
}