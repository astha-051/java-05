import java.util.*;

class member{
	String name;
	int age;
	int phone;
	String address;
	double salary;

	member(String name,int age,int phone,String address,double salary)
	{
		this.name=name;
		this.age=age;
		this.phone=phone;
		this.address=address;
		this.salary=salary;
	}

	void salary()
	{
		System.out.println("\nname="+name);
		System.out.println("age="+age);
		System.out.println("phone number="+phone);
		System.out.println("address="+address);
		System.out.println("salary="+salary);
	}
}

class  employee extends member{
	String specialization;
	String department;

	employee(String name,int age,int phone,String address,double salary,String specialization,String department)
	{
		super(name,age,phone,address,salary);
		this.specialization=specialization;
		this.department=department;
	}

	void salary()
	{
		super.salary();
		System.out.println("specialization="+specialization);
		System.out.println("department="+department);
	}
}

class manager extends member{
	String specialization;
	String department;

	manager(String name,int age,int phone,String address,double salary,String specialization,String department)
	{
		super(name,age,phone,address,salary);
		this.specialization=specialization;
		this.department=department;
	}

	void salary()
	{
		super.salary();
		System.out.println("specialization="+specialization);
		System.out.println("department="+department);
	}
}

public class lab7b3{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter name,age,phone number,address and salary:");
		String name=ab.nextLine();
		int age=ab.nextInt();
		int phone=ab.nextInt();
		ab.nextLine();
		String address=ab.nextLine();
		
		double salary=ab.nextDouble();

		System.out.println("enter specialization and department of employee:");
		String specialization=ab.nextLine();
		ab.nextLine();
		String department=ab.nextLine();

		employee e1=new employee(name,age,phone,address,salary,specialization,department);

		System.out.println("enter specialization and department of manager:");
		 specialization=ab.nextLine();
		ab.nextLine();
		 department=ab.nextLine();

		manager m1=new manager(name,age,phone,address,salary,specialization,department);


		e1.salary();
		m1.salary();
	}
}