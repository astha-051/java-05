
class panta{
	int fifty(int i)
	{
		return i*(3*i-1)/2;
	}
}
public class pantagonal50{
	public static void main(String[]args)
	{
		int count=1;
		panta p=new panta();

		for(int i=1;i<=50;i++)
		{
			System.out.println("numbers="+p.fifty(i));
		}
	}
}