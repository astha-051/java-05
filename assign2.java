import java.util.Scanner;
class MyBank{
	int actnum;
	String type;
	double balance;

	MyBank(){
		this.balance=10000;
	}

	MyBank(int actnum,String type,double balance)
	{
		this.actnum=actnum;
		this.type=type;
		this.balance=10000+balance;
	}

	void credit(double amount)
	{
		this.balance=amount+balance;
		System.out.println("credited amount="+balance);
	}

	void debit(double amount2)
	{
		this.balance=balance-amount2;
		if(this.balance<10000)
		{
			System.out.println("you can't debit from this account");
		}
		else 
		{
			System.out.println("amount after debit="+balance);
		}
		
	}

	void display()
	{
		System.out.println("account number="+actnum+"\tbalance="+balance);
	}
}

public class assign2
{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		while(true)
		{
			System.out.println("enter between 1 to 4 number:\n 1 for checking balance: \n 2 for credit balance: \n 3 for debit balance: \n 4 for exit:");
			int number=ab.nextInt();

			switch(number)
			{
			case 1: System.out.println("enter balance,account number:");

					double balance=ab.nextDouble();
					int actnum=ab.nextInt();
				
					MyBank mb1=new MyBank(actnum,"saving",balance);
					mb1.display();
					break;   //check balance

			case 2:System.out.println("acount cerdit amount:");
					 double amount=ab.nextDouble();

					MyBank mb2=new MyBank(2222,"saving",20000);
					mb2.credit(amount);
					break; //credit

			case  3:System.out.println("enter debit amount:");
					double amount1=ab.nextDouble();

					MyBank mb3=new MyBank(3333,"saving",20000);

					mb3.debit(amount1);
					break;  //debit

			case 4:System.out.println("exit");
					System.exit(0);  //exit
			}
		}
	}
}