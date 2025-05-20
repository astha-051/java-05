import java.io.*;

public class lab13a1{
	public static void main(String[]args)
	{
		try{
		BufferedReader fr=new BufferedReader(new FileReader("student.txt"));

		String line="";

		while((line=fr.readLine())!=null)
		{
			String l=line;
			// Student s=new Student(l);
			System.out.println(l);
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}

	}
}