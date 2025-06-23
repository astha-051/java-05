public class nokiaphn{
	public static String[] keypad= {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

	public static void comb(String str,int index,String combination)
	{
		if(index==str.length())
		{
			System.out.println(combination);
			return;
		}

		char current=str.charAt(index);

		String mapping=keypad[current-'0'];  //keypad's index number

		for(int i=0;i<mapping.length();i++)
		{
			comb(str,index+1,combination+mapping.charAt(i));  //takes first than second than third
		}
	}

	public static void main(String[]args)
	{
		String str="23";
		comb(str,0,"");
	}
}