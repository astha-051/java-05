import java.util.*;

class computer{

	processor p=new processor();
	computer()
	{
		p.display("INTEL",2255.25);
	}

	class processor{
		String brand;
		double speed;

		void display(String brand,double speed)
		{
			System.out.println("brand:"+brand);
			System.out.println("speed:"+speed);
		}
	}
}
	
public class outerexam2{
	public static void main(String[]args)
	{
		computer c=new computer();
	}
}