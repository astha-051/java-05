import java.util.*;

class count{
	static int count=0;

	public count()  //constructor
	{
		count++;
	}

	public static void show()
	{
		System.out.println("object created="+count);
	}
}

public class objcount{
	public static void main(String[]args)
	{
		count c1=new count();
		count c2=new count();
		count c3=new count();

		count.show();
	}
}





// wap to create a class name student havic static member function name showcount() 
// which print the number of object craeted of class student