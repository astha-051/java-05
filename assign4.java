import java.util.Scanner;

class stud{
	String name;
	int roll;
	static String uni;

	stud(String name,int roll,String uni)
	{
		this.name=name;
		this.roll=roll;
		this.uni="DARSHAN";
	}

	void display()
	{
		System.out.println("\nname="+name);
		System.out.println("roll no.="+roll);
		System.out.println("university="+uni);
	}
}

public class assign4{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter three student's name and roll.no:");

		stud s1=new stud(ab.next(),ab.nextInt(),"DU");
		stud s2=new stud(ab.next(),ab.nextInt(),"DU");
		stud s3=new stud(ab.next(),ab.nextInt(),"DARSHAN");
		s3.name="zzz";

		s1.display();
		s2.display();
		s3.display();
	}
}