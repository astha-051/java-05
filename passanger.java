import java.util.*;

class pass{
	String passengerName;
	int passengerAge;
	int aadharNumber;
	int seatNumber;

	pass(String passengerName,int passengerAge,int aadharNumber,int seatNumber)
	{
		this.passengerName=passengerName;
		this.passengerAge=passengerAge;
		this.aadharNumber=aadharNumber;
		this.seatNumber=seatNumber;
	}

	void printdetail()
	{
		System.out.println("\npassengerName:"+passengerName);
		System.out.println("passengerAge:"+passengerAge);
		System.out.println("aadharNumber:"+aadharNumber);
		System.out.println("seatNumber:"+seatNumber);
	}
}

public class passanger{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		pass []a=new pass[3];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter name,age,aadhar number and seat number:");
			String passengerName=ab.nextLine();
			
			int passengerAge=ab.nextInt();
			int aadharNumber=ab.nextInt();
			int seatNumber=ab.nextInt();
			ab.nextLine();

			a[i]=new pass(passengerName,passengerAge,aadharNumber,seatNumber);
		}

		for(int i=0;i<a.length;i++)
		{
			a[i].printdetail();
		}
	}
}