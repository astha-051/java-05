import java.util.*;

class astha{
	int x;
	int y;

	public astha(){
		this.x=0;
		this.y=0;
	}
	public astha(int x){
		this.x=x;
	}

	public astha(int x,int y)
	{
		this.x=x;
		this.y=y;
	}

	public astha(double x,double y)
	{
		this.x=(int)x;
		this.y=(int)y;
	}

	public void print()
	{
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}

public class overloadexam5{
	public static void main(String[]args)
	{
		astha v1=new astha();
		v1.print();

		astha v2=new astha(10);
		v2.print();

		astha v3=new astha(20,30);
		v3.print();

		astha v4=new astha(20.5,30.5);
		v4.print();
	}
}