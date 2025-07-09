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