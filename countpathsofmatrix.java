public class countpathsofmatrix{
	public static int countpath(int i,int j,int n,int m)
	{
		if(i==n || j==m)
		{
			return 0;
		}
		if(i == n-1 && j == m-1)  //in that case you have only  one path
		{
			return 1;
		}

		int downcount=countpath(i+1,j,n,m); //move down
		int rightcount=countpath(i,j+1,n,m);  //right move

		return downcount+rightcount;
	}

	public static void main(String[]args)
	{
		int n=3,m=3;
		int total=countpath(0,0,n,m);
		System.out.println("total paths="+total);
	}
}