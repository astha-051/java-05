import java.util.*;

abstract class Vegetable{
	String color;
	String name;
	public abstract String colour();
}

class Potato extends Vegetable{
	String color;
	String  name;

	Potato(String color,String name)
	{
		this.color=color;
		this.name=name;
	}

	public String colour()
	{
		return color+","+name;
	}
}

class Brinjal extends Vegetable{
	String color;
	String name;

	Brinjal(String color,String name)
	{
		this.color=color;
		this.name=name;
	}

	public String colour()
	{
		return color+","+name;
	}
}

class Tomato extends Vegetable{
	String color;
	String name;

	Tomato(String color,String name)
	{
		this.color=color;
		this.name=name;
	}

	public  String colour()
	{
		return color+ "," +name;
	}
}

public class lab8a1{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		System.out.println("enter a name of vegetable and colour of it:");
		String nm=ab.nextLine();
		String cl=ab.nextLine();

		if(nm.equals("brinjal"))
		{
			Brinjal b=new Brinjal(nm,cl);
			System.out.println("Brinjal:"+b.colour());
		}
		else if(nm.equals("potato"))
		{
			Potato p=new Potato(nm,cl);
			System.out.println("Potato:"+p.colour());
		}
		else if(nm.equals("Tomato"))
		{
			Tomato t=new Tomato(nm,cl);
			System.out.println("Tomato:"+t.colour());
		}
	}
}