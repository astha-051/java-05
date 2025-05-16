import java.io.*;
import java.util.*;

public class lab12a2{
	public static void main(String[]args)
	{
		try{
			// FileWriter fw= new FileWriter("xyz.txt");
			BufferedWriter bw=new BufferedWriter(new FileWriter("xyz.txt"));

			Scanner ab=new Scanner(new File("abc.txt"));

			while(ab.hasNextLine())
			{
				String s=ab.nextLine();
				s=s.replaceAll("i","u");
				System.out.println("replaced");
				bw.append(s);
				bw.newLine();
			}
			// fw.close();
			bw.close();
			ab.close();
		}

		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}