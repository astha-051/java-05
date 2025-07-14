import java.util.*;

class person1{
	String name;
	int age;

	public String display(String personname)
	{
		// System.out.println("name="+name);
		// System.out.println("age="+age);
		name=personname;
		return name;
	}
}

public class person{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		person1 p1=new person1();
		 person1 p2=new person1();
		System.out.println("enter name and age for first person:");
		String personname=ab.next();
		int age=ab.nextInt();

		System.out.println("enter name and age for first person:");
		String pername=ab.next();
		age=ab.nextInt();
		
		System.out.println("first name:"+ p1.display(personname));
		System.out.println("second name:"+p2.display(pername));
	}
}