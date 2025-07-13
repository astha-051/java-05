public class permutationstring{
	public static void permutation(String str,String Newpermutation){

		if(str.length()==0)
		{
			System.out.println(Newpermutation);
			return;
		}

		for(int i=0;i<str.length();i++)
		{
			char current=str.charAt(i);
			//abc->ab/ac/bc
			String newstr=str.substring(0,i)+str.substring(i+1); //0=a,i-1=b,i+1=c
			permutation(newstr,Newpermutation+current);
		}

	}
	public static void main(String[]args)
	{
		String str="abc";
		permutation(str,"");
	}
}