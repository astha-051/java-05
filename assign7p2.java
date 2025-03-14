import java.util.Scanner;

class RailwayReservation{
	int PNRno;
	String customer_name;
	int age;

	RailwayReservation(int PNRno,String customer_name,int age)
	{
		this.PNRno=PNRno;
		this.customer_name=customer_name;
		this.age=age;
	}

	void display()
	{
		System.out.println("\nPNRno="+PNRno);
		System.out.println("name="+customer_name);
		System.out.println("age="+age);
	}
}

public class assign7p2{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter PNRno,name and age:");
		RailwayReservation c1=new RailwayReservation(ab.nextInt(),ab.next(),ab.nextInt());

		System.out.println("enter PNRno,name and age:");
		RailwayReservation c2=new RailwayReservation(ab.nextInt(),ab.next(),ab.nextInt());

		System.out.println("enter PNRno,name and age:");
		RailwayReservation c3=new RailwayReservation(ab.nextInt(),ab.next(),ab.nextInt());

		c1.display();
		c2.display();
		c3.display();
	}
}