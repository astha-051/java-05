public class allxlast{
	public static void last(String str,int index,int count,String newstr)
	{
		if(index==str.length())
		{
			for(int i=0;i<count;i++)
			{
				newstr+='x';
			}
			System.out.println(newstr);
			return;
		}
		char current=str.charAt(index);
		if(current == 'x')
		{
			count++;
			last(str,index+1,count,newstr);

		}
		else 
		{
			newstr+=current;
			last(str,index+1,count,newstr);
		}
	}

	public static void main(String[]args)
	{
		String str="astxxxxxxha";
		last(str,0,0,"");
	}
}