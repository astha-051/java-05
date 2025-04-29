import java.util.Scanner;

class student1{
	int id_no;
	int number_of_subject_registered;
	String [] subject_code;
	double [] subject_credit;
	String [] grade_obtained;
	double spi;

	student1(int id_no,int number_of_subject_registered,String[] subject_code,double [] subject_credit,String [] grade_obtained)
	{
		this.id_no=id_no;
		this.number_of_subject_registered=number_of_subject_registered;
		this.subject_code=subject_code;
		this.subject_credit=subject_credit;
		this.grade_obtained=grade_obtained;
		this.spi=0.0;
	}

	public void calculate_spi()
	{
		double total_credits=0;
		double total_points=0;

		for(int i=0;i<this.number_of_subject_registered;i++)
		{
			total_credits+=subject_credit[i];
		
			total_points += grade_to_points(grade_obtained[i]) * subject_credit[i];
		}
		if(total_credits!=0)
		{
			spi=total_points/total_credits;
		}
	}

	double grade_to_points(String grade)
	{
		switch(grade)
		{
		case "A":
			return 10.0;
			
		case "B":
			return 9.0;
			
		case "C":
			return 8.0;
			
		case "D":
			return 7.0;

		default:
			return 0.0;
		}
	}
	void display()
	{
		System.out.println("id_no="+id_no);
		System.out.println("spi="+spi);
	}
}

public class lab7a1
{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter number of students:");
		int n=ab.nextInt();
		ab.nextLine();

		student1 []a=new student1[n];

		for(int i=0;i<a.length;i++)
		{
			System.out.print("enter student's id no : ");
			int id_no=ab.nextInt();

			System.out.print("enter student's number of subject  registered : ");
			int number_of_subject_registered=ab.nextInt();
			ab.nextLine();

			String[] subject_code=new String[number_of_subject_registered];
			double[] subject_credit=new double[number_of_subject_registered];
			String[] grade_obtained=new String[number_of_subject_registered];

			for(int j=0;j<number_of_subject_registered;j++)
			{
				System.out.println("enter subject code:");
				subject_code[i]=ab.next();

				System.out.println("enter subject  credit:");
				subject_credit[i]=ab.nextDouble();
				
				System.out.println("enter grade obtained:");
				grade_obtained[i]=ab.next();
			}

			a[i]=new student1(id_no,number_of_subject_registered,subject_code,subject_credit,grade_obtained);

			a[i].calculate_spi();
		     a[i].display();
		}  

		
	}
}
