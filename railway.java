import java.util.*;
import java.io.*;

class thread1 extends Thread{

	public void run(){

		for(int  i=1;i<2;i++)
		{
			System.out.println("saturday");

			try{
				Thread.sleep(10000);
			}
			catch(InterruptedException q)
			{
				q.printStackTrace();
			}
		}
	}
}

class custom extends Exception
{
	custom(String s)
	{
		super(s);
	}
}
class train{
	private String source;
	private String destination;

	train(String source,String destination)
	{
		this.source=source;
		this.destination=destination;
	}

	void display()
	{
		System.out.println("source="+source);
		System.out.println("destination="+destination);
	}
}

class passenger{
	String passengerName;
	int passengerAge;
	int aadharNumber;
	String gender;
	int  contactNo;

	passenger(String passengerName,int passengerAge,int aadharNumber,String gender,int contactNo)
	{
		this.passengerName=passengerName;
		this.passengerAge=passengerAge;
		this.aadharNumber=aadharNumber;
		this.gender=gender;
		this.contactNo=contactNo;
	}

	void display()
	{
		System.out.println("\npassangerName="+passengerName);
		System.out.println("passengerAge="+passengerAge);
		System.out.println("aadharNumber="+aadharNumber);
		System.out.println("gender="+gender);
		System.out.println("contactNo="+contactNo);
	}
}

class personDisability extends passenger{
	String desabilityType;

	personDisability(String desabilityType,String passengerName,int passengerAge,int aadharNumber,String gender,int contactNo)
	{
		super(passengerName,passengerAge,aadharNumber,gender, contactNo);
		this.desabilityType=desabilityType;
	}

	void display()
	{
		super.display();
		System.out.println("desabilityType="+desabilityType);
	}
}

class child extends passenger{

	child(String passengerName,int passengerAge,int aadharNumber,String gender,int contactNo)
	{
		super(passengerName,passengerAge,aadharNumber,gender, contactNo);
	}
	void display()
	{
		super.display();
		System.out.println("childage="+passengerAge);
	}
}

abstract class coach{
	protected int totalseat;
	protected int occupancy;
	protected int avilableSeat;

	coach(int totalseat,int occupancy,int avilableSeat)
	{
		this.totalseat=totalseat;
		this.occupancy=occupancy;
		this.avilableSeat=avilableSeat;
	}

	void display()
	{
		System.out.println("\ntotalseat="+totalseat);
		System.out.println("occurance="+occupancy);
		System.out.println("avilableSeat="+avilableSeat);
	}

	abstract double price(int number,String stationName);
}

class firstAc extends coach{
	int firstAcseat;
	int number;
	String stationName;

	firstAc(int totalseat,int occupancy,int avilableSeat,int firstACseat)
	{
		super(totalseat,occupancy,avilableSeat);
		this.firstAcseat=firstAcseat;
	}

	void display()
	{	
		super.display();
		System.out.println("firstcoachseat="+firstAcseat);
	}
	public double price(int number,String stationName)
	{
		if(stationName.equalsIgnoreCase("ahemdabad"))
		{
			return number*1*300;
		}
		else if(stationName.equalsIgnoreCase("surat"))
		{
			return number*1*500;
		}
		else if(stationName.equalsIgnoreCase("mumbai"))
		{
			return number*1*750;
		}

		else if(stationName.equalsIgnoreCase("kanyakumari"))
		{
			return number*1*3970;
		}

		else //bangluru
		{ 
			return number*1*2823;
		}
	}
}
class secondAc extends coach{
	int secondAcseat;
	int number;
	String stationName;

	secondAc(int totalseat,int occupancy,int avilableSeat,int secondAcseat)
	{
		super(totalseat,occupancy,avilableSeat);
		this.secondAcseat=secondAcseat;
	}

	void display()
	{	
		super.display();
		System.out.println("secondcoachseat="+secondAcseat);
	}
	public double price(int number,String stationName)
	{
		if(stationName.equalsIgnoreCase("Ahemdabad"))
		{
			return number*2*300;
		}
		else if(stationName.equalsIgnoreCase("surat"))
		{
			return number*2*500;
		}
		else if(stationName.equalsIgnoreCase("mumbai"))
		{
			return number*2*750;
		}

		else if(stationName.equalsIgnoreCase("kanyakumari"))
		{
			return number*2*3970;
		}

		else //bangluru
		{ 
			return number*2*2823;
		}
	}
}
 
class thirdAc extends coach{
	int thirdAcseat;
	int number;
	String stationName;

	thirdAc(int totalseat,int occupancy,int avilableSeat,int thirdAcseat)
	{
		super(totalseat,occupancy,avilableSeat);
		this.thirdAcseat=thirdAcseat;
	}

	void display()
	{
		super.display();
		System.out.println("thirdcoachseat="+thirdAcseat);
	}
	public double price(int number,String stationName)
	{
		if(stationName.equalsIgnoreCase("Ahemdabad"))
		{
			return number*3*300;
		}
		else if(stationName.equalsIgnoreCase("surat"))
		{
			return number*3*500;
		}
		else if(stationName.equalsIgnoreCase("mumbai"))
		{
			return number*3*750;
		}

		else if(stationName.equalsIgnoreCase("kanyakumari"))
		{
			return number*3*3970;
		}

		else //bangluru
		{ 
			return number*3*2823;
		}
	}
}

class sleeperCoach extends coach
{
	int sleeperCoachseat;
	int number;
	String stationName;

	sleeperCoach(int totalseat,int occupancy,int avilableSeat,int sleeperCoachseat)
	{
		super(totalseat,occupancy,avilableSeat);
		this.sleeperCoachseat=sleeperCoachseat;
	}

	void display()
	{
		super.display();
		System.out.println("sleeperCoach="+sleeperCoachseat);
	}
	public double price(int number,String stationName)
	{
		if(stationName.equalsIgnoreCase("Ahemdabad"))
		{
			return number*4*300;
		}
		else if(stationName.equals("surat"))
		{
			return number*4*500;
		}
		else if(stationName.equalsIgnoreCase("mumbai"))
		{
			return number*4*750;
		}

		else if(stationName.equalsIgnoreCase("kanyakumari"))
		{
			return number*4*3970;
		}

		else //bangluru
		{ 
			return number*4*2823;
		}
	}
}

interface ticket{

	public void display(double price,int seat);
}

class ticket1 implements ticket
{
	double price;
	int seatNo;

	public void display(double price,int seat)  //over-loading
	{
		System.out.println("\n ticket price="+price);
		System.out.println("seatNumber="+seat);
	}
}

public class railway{
	static
	{
		System.out.println("welcome to our railway website");
	}

	public static void main(String[]args)
	{
		while(true)
		{
		Scanner ab=new Scanner(System.in);
		System.out.println("book ticket or cancel:");
		String decision=ab.nextLine();

		
		if(decision.equals("book ticket"))
		{
			String source="null";
		try{
				System.out.println("enter source station:");
				source=ab.nextLine(); 
			}
			catch(Exception a)
			{
				System.out.println("invalid input!please enter valid valid name:");
				System.out.println(a.getMessage());
			}
			finally
			{
				System.out.println("go ahead");
			}

		System.out.println("enter destination station:");
		String destination=ab.nextLine();

		System.out.println("enter passanger number:");
		int number=ab.nextInt();
		ab.nextLine();

		passenger []p=new passenger[number];
		for(int i=0;i<number;i++)
		{
			System.out.println("enter passanger name:");
			String passengerName=ab.nextLine();

			System.out.println("enter passanger age:");
			int passengerAge=ab.nextInt();
			ab.nextLine();

			System.out.println("enter aadhar number:");
			int aadharNumber=ab.nextInt();
			ab.nextLine();

			System.out.println("enter gender:");
			String gender=ab.nextLine();

			System.out.println("enter contact number:");
			int contactNo=ab.nextInt();
			ab.nextLine();

			p[i]=new passenger(passengerName,passengerAge,aadharNumber,gender,contactNo);
			p[i].display();
			System.out.println("-------------------------");
		}

		System.out.println("enter passanger's disability type and if you have no disability enter NO:");
		String desability=ab.nextLine();

		if(desability.equals("NO"))
		{
			System.out.println("no desability person");
		}
		else 
		{
			System.out.println("which type of disability have a person:");
			String desabilityType=ab.nextLine();

			System.out.println("enter that person name:");
			String passengerName=ab.nextLine();

			System.out.println("enter age of that person:");
			int passengerAge=ab.nextInt();
			ab.nextLine();

			System.out.println("enter aadharNumber of that person:");
			int aadharNumber=ab.nextInt();
			ab.nextLine();

			System.out.println("enter gender:");
			String gender=ab.nextLine();

			System.out.println("enter contach no of their care taker:");
			int contactNo=ab.nextInt();

			personDisability p1=new personDisability(desabilityType,passengerName,passengerAge,aadharNumber,gender,contactNo);
			p1.display();
		}

		System.out.println("if you have no child with than enter no or enter yes:");
		String child=ab.nextLine();
		ab.nextLine();

		if(child.equals("NO"))
		{
			System.out.println("\n no child");
		}
		else 
		{

			System.out.println("enter child name:");
			String passengerName=ab.nextLine();

			System.out.println("enter your child age:");
			int passengerAge=ab.nextInt();
			ab.nextLine();

			int aadharNumber=0;

			System.out.println("enter gender of your child:");
			String gender=ab.nextLine();

			System.out.println("enter contactNo of parents:");
			int contactNo=ab.nextInt();

			child c=new child(passengerName,passengerAge,aadharNumber,gender,contactNo);
			c.display();
		}

		System.out.println("enter class :");
		String class1=ab.next();

		int totalseat=30;
		int occupancy=number;
		int avilableSeat=(30-number);

		coach c1;
		int minus=30-number;

		int seat=400;

		for(int i=1;i<=number;i++)
		{
			seat++;

		if(class1.equals("sleeper"))
		{
			c1=new sleeperCoach(totalseat,occupancy,avilableSeat,minus);
			c1.display();
			double tick=c1.price(number,destination);

			ticket1 t1=new ticket1();
			t1.display(tick,seat);
		}
		else if(class1.equals("firstAc"))
		{
			c1=new firstAc(totalseat,occupancy,avilableSeat,minus);
			c1.display();
			double tick1=c1.price(number,destination);

			ticket1 t1=new ticket1();
			t1.display(tick1,seat);
		}
		else if(class1.equals("secondAc"))
		{
			c1=new secondAc(totalseat,occupancy,avilableSeat,minus);
			c1.display();
			double tick2=c1.price(number,destination);

			ticket t1=new ticket1();
			t1.display(tick2,seat);
		}
		else if(class1.equals("thirdAc"))
		{
			c1=new thirdAc(totalseat,occupancy,avilableSeat,minus);
			c1.display();
			double tick3=c1.price(number,destination);

			ticket1 t1=new ticket1();
			t1.display(tick3,seat);
		}
		System.out.println("-----------------------");
		}

		System.out.println("-----------------------");

	if(source.equalsIgnoreCase("rajkot"))
	{
		final int trainNumber=12268;
		int j=2025;
		int tn=1001;
		for(int i=1;i<=number;i++)
		{
			System.out.println("your PNR number of "+i+" person is:"+j);
			j++;

			System.out.println("your ticket nuber of "+i+" person is:"+tn);
			tn++;
		}	

		if(source.equalsIgnoreCase("rajkot") && (destination.equalsIgnoreCase("mumbai") ||destination.equalsIgnoreCase("ahemdabad")))
		{
			System.out.println("yout train name is (RAJDHANI EXPRESS)");
			System.out.println("your train number is:"+trainNumber);

			System.out.println("------------------------------");
		}
	}

	else if(source.equalsIgnoreCase("kashmir"))
	{
		final int trainNumber=16317;
		int j=3000;
		int tn=2000;

		for(int i=1;i<=number;i++)
		{
			System.out.println("your PNR number of "+i+" person is:"+j);
			j++;

			System.out.println("your ticket number "+i+" person is:"+tn);
			tn++;
		}

		if(source.equalsIgnoreCase("kashmir") && destination.equalsIgnoreCase("kanyakumari") || destination.equalsIgnoreCase("bangluru") )
		{
			System.out.println("your train name is (HIMSAGAR EXPRESS)");
			System.out.println("your train number is:"+trainNumber);

			System.out.println("------------------------------");
		}

	}

		train t=new train(source,destination);
		t.display();

		System.out.println("---------------------------");
		System.out.println("confirm ticket");

		thread1 t1=new thread1();
		t1.start();


	String ticketdetails="";

		try
		{
			FileWriter fw=new FileWriter("ticket.txt");
			for(int i=1;i<=number;i++)
			{
				seat++;

				ticketdetails=
								"class="+class1+"\n" +
								"seat number="+seat+"\n"  +
								"destination="+destination+"\n"+
								"------------------------------\n";

				fw.append(ticketdetails);
				fw.write("\n");
			}
			fw.close();
			System.out.println("details sved sucessfully");
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

	else if(decision.equalsIgnoreCase("cancel"))
	{
		System.out.println("enter your ticket number to cancel:");
		int cancelTicket=ab.nextInt();

		if(cancelTicket==seat)
		{

		System.out.println("exit or cancel ");
		try
		{
			FileWriter fw=new FileWriter("ticket.txt");
			fw.write(" ");
			fw.close();
			System.out.println("cancle sucessfully");
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
		break;
		}
		else 
		{
			System.out.println("ticket not found");
		}
	}
	}
	}
}