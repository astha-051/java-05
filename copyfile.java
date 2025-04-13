import java.io.*;

public class copyfile{
	public static void main(String[]args) throws IOException
	{
		FileInputStream in =null;
		FileOutputStream out=null;

		try{
			in=new FileInputStream("abc.txt");
			out=new FileOutputStream("filedemo.txt");
			int c;
			while((c=in.read())!=-1)
			{
				out.write(c);
			}
			System.out.println("copied");
		}
		finally{
			if(in!=null)
			{
				in.close();
			}
			if(out!=null)
			{
				out.close();
			}
		}
	}
}