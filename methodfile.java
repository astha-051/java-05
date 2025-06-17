import java.io.*;

public class methodfile{
	public static void main(String[]args) throws Exception
	{
		File f1=new File("filedemo.txt");
		f1.createNewFile();

		System.out.println("file created");

		System.out.println("file name:"+f1.getName());

		System.out.println("path:"+f1.getPath());

		System.out.println("abs path:"+f1.getAbsolutePath());

		System.out.println("parent:"+f1.getParent());

		System.out.println(f1.exists()?"yes,exist":"no,not exist");

		System.out.println(f1.canWrite()?"eritabel":"not writable");

		System.out.println(f1.canRead()?"readable":"not readable");

		System.out.println(f1.isDirectory()?"yes directory":"not directory");

		System.out.println(f1.isFile()?"yes file":"not file");

		System.out.println(f1.isAbsolute()?"yes absolute":"not absolute");

		System.out.println("last modified:"+f1.lastModified());

		System.out.println("file size:"+f1.length()+"bytes");
	}
}