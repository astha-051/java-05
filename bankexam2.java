import java.util.*;

class account{
	int number;
	int balance;

	static String bank;

	account(int number,int balance,String bank)
	{
		this.number=number;
		this.balance=balance;
		account.bank=bank;
	}
	void display()
	{
		System.out.println("account number="+number);
		System.out.println("account balance="+balance);
		System.out.println("bank name="+bank);
	}
}

public class bankexam2{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		account []a=new account[2];

		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter account number,balance and bank name:");
			int number=ab.nextInt();
			int balance=ab.nextInt();
			ab.nextLine();
			String bank=ab.nextLine();

			a[i]=new account(number,balance,name);
		}

		for(int i=0;i<a.length;i++)
		{
			a[i].display();
		}
	}
}