import java.util.*;
import java.io.*;

class Thread1 extends Thread{

	synchronized public void run()
	{
		for(int i=1;i<15;i++)
		{
			System.out.println("0");
		
		try 
		{
			Thread1.sleep(500);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	}
}

class Thread2 extends Thread{

	synchronized public void run()
	{
		for(int i=1;i<15;i++)
		{
			System.out.println("1");
		
		try 
		{
			Thread2.sleep(500);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	}
}

public class lab13a2{
	public static void main(String[]args)
	{
		Thread1 t1=new Thread1();

		Thread2 t2=new Thread2();

		t1.start();
		t2.start();
	}
}