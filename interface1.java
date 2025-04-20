import java.util.*;
interface vehicle{
	public void left();
	public void right();
	public void accelerate();
	public void slow();
}
class vehicle1 implements vehicle{
	public void left()
	{
		System.out.println("left");
	}
	public void right()
	{
		System.out.println("right");
	}
	public void accelerate()
	{
		System.out.println("accelerate");
	}
	public void slow()
	{
		System.out.println("slow");
	}
}
public class  interface1{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		vehicle v1=new vehicle1();
		v1.left();
	}
}