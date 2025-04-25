import java.util.Scanner;

	class time{
		int hour;
		int min;
		int sec;

		public time(int hour,int min,int sec){
			this.hour=hour;
			this.min=min;
			this.sec=sec;
		}

		void astha(time t){
			int h=this.hour+t.hour;
			int m=this.min+t.min;
			int s=this.sec+t.sec;

			System.out.println("total hour="+h);
			System.out.println("total min="+m);
			System.out.println("total sec="+s);
		}

	}
public class lab6a2{
	public static void main(String[]args)
	{	 
		Scanner ab=new Scanner(System.in);

		System.out.println("enter hour:");
			int hour=ab.nextInt();

			System.out.println("enter min:");
			int min=ab.nextInt();

			System.out.println("enter second:");
			int sec=ab.nextInt();
			time t=new time(hour,min,sec);


		System.out.println("enter hour:");
			int hour2=ab.nextInt();

			System.out.println("enter min:");
			int min2=ab.nextInt();

			System.out.println("enter second:");
			int sec2=ab.nextInt();

			time t1=new time(hour2,min2,sec2);

			t.astha(t1);
			
	}
}