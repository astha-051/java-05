import java.util.*;

class outer{
	String collagename="darshan";

	void display()
	{
		System.out.println("name="+collagename);
		inner i= new inner();
		i.add();
	}

	

	class inner{
		String str="university";

		void add()
		{
			System.out.println("adding string="+(collagename+str));
		}
	}
}

public class outerexam6{
	public static void main(String[]args)
	{
		outer o=new outer();
		o.display();
	}
}