import java.util.*;

class product{
	int id;
	String name;
	double price;
	int quantity;

	public product(int id,String name,double price,int quantity)
	{
		this.id=id;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}

	void display()
	{
		this.price=this.price*this.quantity;

		System.out.println("total stock="+this.quantity);
		System.out.println("totalprice="+this.price);
	}
}

public class productexam7{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		product []a=new product[3];

		for(int i=0;i<3;i++)
		{
			System.out.println("enter product id,name,price and quantity:");
			int id=ab.nextInt();
			ab.nextLine();
			String name=ab.nextLine();
			double price=ab.nextDouble();
			int quantity=ab.nextInt();
			a[i]=new product(id,name,price,quantity);
		}

		for(int i=0;i<3;i++)
		{
			a[i].display();
		}
	}
}