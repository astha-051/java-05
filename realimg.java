import java.util.*;

class complex{
	float real,img;

	complex()
	{
		real=0.0f;
		img=0.0f;
	}

	complex(float real,float img) //const overloaded
	{
		this.real=real;
		this.img=img;
	}

	public void add(float real,float img)
	{
		this.real+=real;
		this.img+=img;
		System.out.println("real part add:"+this.real);
		System.out.println("img part added:"+this.img+"i");
	}
}

public class realimg{
	public static void main(String[]args)
	{
		complex c1=new complex(11,33);
		complex c2=new complex(12,34);

		c1.add(12,34);
	}
}