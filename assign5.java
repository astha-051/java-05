import java.util.Scanner;

class bank{
	int acc;
	double balance;
	static String name;

	bank(int acc,double balance,String name)
	{
		this.acc=acc;
		this.balance=balance;
		this.name=name;
	}

	void display()
	{
		System.out.println("\nYOUR ACCOUNT NUMBER:"+acc);
		System.out.println("YOUR CURRENT BALANCE:"+balance);
		System.out.println("BANK:"+name);
	}
}

public class assign5{
	static{
		System.out.println("welcome in HDFC bank");
	}
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter number  of array object:");
		int n=ab.nextInt();

		bank []a=new bank[n];

		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter account number and balance:");
			a[i]=new bank(ab.nextInt(),ab.nextDouble(),"HDFC");
		}

		for(int i=0;i<a.length;i++)
		{
			a[i].display();
		}
	}
}