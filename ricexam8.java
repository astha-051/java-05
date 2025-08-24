import java.util.*;

class rice{
	double weight;

	public rice()
	{
		this.weight=10.0;
	}

	public rice(double weight)
	{
		this.weight=weight;
	}

	public void add()
	{
		System.out.println("total weight="+(this.weight));
	}

	public void gram(int adgram)
	{
		double we=adgram/1000;
		this.weight+=we;
		System.out.println("weight in gram:"+this.weight);
	}
}


public class ricexam8{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		rice r1=new rice();

		System.out.println("enter weight:");
		double weight=ab.nextDouble();

		rice r2=new rice(weight);

		r1.add();
		r2.add();

		System.out.println("enter weight in gram:");
		int adgram=ab.nextInt();

		r1.gram(adgram);
		r2.gram(adgram);
	}
}