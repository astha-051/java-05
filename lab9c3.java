import  java.util.*;

interface Playable{
	public void play();
}

class Football implements Playable{
	String sports;
	Football(String sports)
	{
		this.sports=sports;
	}
	public void play()
	{
		System.out.println("this sport="+sports);
	}
}

class Vollyball implements Playable{
	String sports;
	Vollyball(String sports)
	{
		this.sports=sports;
	}
	public void play()
	{
		System.out.println("this sport="+sports);
	}
}

class Basketball implements Playable{
	String sports;
	Basketball(String sports)
	{
		this.sports=sports;
	}
	public void play()
	{
		System.out.println("this sport="+sports);
	}
}

public class lab9c3{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);

		Football f=new Football("FOOTBALL");
		Vollyball v=new Vollyball("VOLLYBALL");
		Basketball b=new Basketball("BASKETBALL");

		f.play();
		v.play();
		b.play();
	}
}