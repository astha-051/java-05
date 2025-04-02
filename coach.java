class coach{
	int totalseat;
	int  manufactureDate;
	int occupancy;

	coach(int totalseat,int manufactureDate,int occupancy)
	{
		this.totalseat=totalseat;
		this.manufactureDate=manufactureDate;
		this.occupancy=occupancy;
	}

	void display()
	{
		System.out.println("\ntotalseat="+totalseat);
		System.out.println("manufactureDate="+manufactureDate);
		System.out.println("occurance="+occupancy);
	}
}

class firstcoach extends coach{
	int firstcoachseat;

	firstcoach(int firstcoachseat)
	{
		super(68,12,30);
		this.firstcoachseat=firstcoachseat;
	}

	void display()
	{	
		super.display();
		System.out.println("firstcoachseat="+firstcoachseat);
	}
}
class secondcoach extends coach{
	int secondcoachseat;

	secondcoach(int secondcoachseat)
	{
		super(68,12,30);
		this.secondcoachseat=secondcoachseat;
	}

	void display()
	{	
		super.display();
		System.out.println("secondcoachseat="+secondcoachseat);
	}
}
 
class thirdcoach extends coach{
	int thirdcoachseat;

	thirdcoach(int thirdcoachseat)
	{
		super(68,12,30);
		this.thirdcoachseat=thirdcoachseat;
	}

	void display()
	{
		super.display();
		System.out.println("thirdcoachseat="+thirdcoachseat);
	}
}