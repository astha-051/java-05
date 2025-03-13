import java.util.Scanner;

class train{
	public int trainNo;
	public String trainName;

	train(int trainNo,String trainName)
	{
		this.trainNo=trainNo;
		this.trainName=trainName;
	}

	static class engine{
		private int engineNo;
		String fuel;
		public engine(int engineNo,String fuel)
		{
			this.engineNo=engineNo;
			this.fuel=fuel;
		}

		void display()
		{
			System.out.println("engine number="+engineNo);
			System.out.println("fuel="+fuel);
		}
	}

	void display()
	{
		System.out.println("train number="+trainNo);
		System.out.println("train name="+trainName);
	}

	
}

public class assign6{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		train t1=new train(123,"local");

		train.engine t2=new train.engine(456,"coal");

		t1.display();
		t2.display();

	}
}