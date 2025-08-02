class railwaystation{
	String stationName;
	String trainName;
	int trainNumber;

	railwaystation(String stationName,String trainName,int trainNumber)
	{
		this.stationName=stationName;
		this.trainName=trainName;
		this.trainNumber=trainNumber;
	}

	void display()
	{
		System.out.println("\nstationName="+stationName);
		System.out.println("trainName="+trainName);
		System.out.println("trainNumber="+trainNumber);
	}
}