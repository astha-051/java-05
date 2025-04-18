import java.io.*;

public class outputstream{
	public static void main(String[]args) throws Exception
	{
		FileInputStream fout=new FileInputStream("filedemo.txt");

		int i=0;

		while((i=fout.read())!=-1)
		{
			System.out.print((char)i);
		}
		fout.close();
	}
}