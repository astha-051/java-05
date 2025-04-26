import java.util.Scanner;

class bank{
	int account;
	String name;
	String email;
	Double balance;
	String type;

	void getAccountDetails(int account,String name,String email,double balance,String type)
	{
		this.account=account;
		this.name=name;
		this.email=email;
		this.balance=balance;
		this.type=type;
	}

	void displayAccountDetail(int account,String name,String email,double balance,String type)
	{
		System.out.println("account details:");
		
		System.out.println("account number="+account);
		System.out.println("name="+name);
		System.out.println("mail="+email);
		System.out.println("balance="+balance);
		System.out.println("account type="+type);
	}

}

public class lab6a3{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter account number:");
		int account=ab.nextInt();
		ab.nextLine();

		System.out.println("enter your name:");
		String name=ab.nextLine();
		

		System.out.println("enter your email:");
		String email=ab.nextLine();
		ab.nextLine();

		System.out.println("enter your bank balance:");
		Double balance=ab.nextDouble();
		ab.nextLine();

		System.out.println("enter you account type:");
		String type=ab.nextLine();

		bank bal=new bank();
		
		bal.getAccountDetails(account,name,email,balance,type);
		bal.displayAccountDetail(account,name,email,balance,type);

	}
}