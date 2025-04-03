import java.util.Scanner;

class studentH{
	String name;
	int age;
	int sem;
	String branch;
	String uni;

	studentH(String name,int age)
	{
		this.name=name;
		this.age=age;
		this.sem=2;
		this.branch="BSCSH";
		this.uni="DU";
	}
	studentH(studentH sh,String nm,int ag)
	{
		this.name=nm;
		this.age=ag;
		this.sem=sh.sem;
		this.branch=sh.branch;
		this.uni=sh.uni;
	}

	void display()
	{
		System.out.println("\nname="+name);
		System.out.println("age="+age);
		System.out.println("sem="+sem);
		System.out.println("branch="+branch);
		System.out.println("uni="+uni);
	}

}

public class copyconst{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter name & age for sh1:");
		studentH sh1=new studentH(ab.next(),ab.nextInt());

		System.out.println("enter name & age for sh2:");
		studentH sh2=new studentH(ab.next(),ab.nextInt());

		sh1.display();
		sh2.display();
	}
}