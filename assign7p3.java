import java.util.Scanner;

class Course{
	String course_name;
	String instructor;
	double credit;


	Course(String course_name,String instructor,double credit)
	{
		this.course_name=course_name;
		this.instructor=instructor;
		this.credit=credit;
	}

	Course(Course c,String course_name,double credit)
	{
		this.course_name=course_name;
		this.instructor=c.instructor;
		this.credit=credit;
	}

	void display()
	{
		System.out.println("\ncourse name="+course_name);
		System.out.println("instructor name="+instructor);
		System.out.println("credit of subject="+credit);
	}
}

public class assign7p3{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter course name,instructor and credit:");
		String course_name=ab.nextLine();
		String instructor=ab.nextLine();
		double credit=ab.nextDouble();

		Course c1=new Course(course_name,instructor,credit);

		Course c2=new Course(c1,"c++",5.0);

		c1.display();
		c2.display();

	}
}