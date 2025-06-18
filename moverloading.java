

class Stud{
	String name;
	int sem;
	double cpi;

	void dispdata(String n)
	{
		name=n;
		System.out.println("name="+name);
	}

	void dispdata(String n,int sm)
	{
		name=n;
		sem=sm;
		System.out.println("name="+name+"\nsem="+sem);
	}

	void dispdata(String n,int sm,double cpi)
	{
		System.out.println("name="+name+"\nsem="+sem+"\ncpi="+cpi);
	}
}

	public class moverloading{
		public static void main(String[]args)
		{
			Stud s=new Stud();
			s.dispdata("astha",2);
			s.dispdata("princi",2,9.3);
			s.dispdata("ishi");
		}
	}
