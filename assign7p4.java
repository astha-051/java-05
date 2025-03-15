import java.util.Scanner;

class restaurant{
	int iteam;
	double price;
	double ratings;

	restaurant()
	{
		iteam=5;
		price=120.30;
		ratings=4.2;  //no-argument const.
	}
	void display()
	{
		System.out.println("\niteams="+iteam);
		System.out.println("price="+price);
		System.out.println("ratings="+ratings);
	}  //display

	restaurant(int iteam,double price,double ratings)
	{
		this.iteam=iteam;
		this.price=price;
		this.ratings=ratings;
	}  //perameterized const.
}

public class assign7p4{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		restaurant r1=new restaurant();

		r1.display();

		restaurant r2=new restaurant(10,200.00,3.3);

		r2.display();
	}
}