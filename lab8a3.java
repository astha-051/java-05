import java.util.*;

interface Transpote
{
	public void deliver();
}
	
class Animal{
void del()
	{
		System.out.println("Animal");
	}
}

class Camel extends Animal implements Transpote{
	public void deliver()
	{
		System.out.println("camel");
	}
}
	
class Donkey extends Animal implements Transpote{
	public void  deliver()
	{
		System.out.println("Donkey");
	}
}


class Tiger extends Animal{
	void del()
	{
		super.del();
		System.out.println("tiger");
	}
}

class Deer extends Animal{
	void del()
	{	
		super.del();
		System.out.println("deer");
	}
}


public class lab8a3{
	public static void main(String[]args)
	{
		Animal []a=new Animal[4];

		a[0]=new Camel();
		a[1]=new Donkey();
		a[2]=new Tiger();
		a[3]=new Deer();

		for(int i=0;i<4;i++)
		{
			if(a[i]instanceof Transpote)
			{
				((Transpote) a[i]).deliver();
			}
			else 
			{
				a[i].del();
			}
		}
	}
}