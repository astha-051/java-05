import java.util.Scanner;

class person{
	String name;
	int age;

	person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}

	void display()
	{
		System.out.println("name="+name);
		System.out.println("age="+age);
	}
}

public class assign7{
	public static void main(String[]args)
	{
		Scanner ab= new Scanner(System.in);

		System.out.println("enter name and age for person 1:");
		String name1=ab.nextLine();
		int age1=ab.nextInt();
		ab.nextLine();

		person p1=new person(name1,age1);

		System.out.println("enter name and age person 2:");
		String name2=ab.nextLine();
		int age2=ab.nextInt();
		ab.nextLine();

		person p2=new person(name2,age2);
		p1.display();
		p2.display();
	}
}