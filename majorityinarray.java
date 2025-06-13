import java.util.*;

public class majorityinarray{

	public static void majorityElements(int num[])
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		int n=num.length;

		for(int i=0;i<n;i++)
		{
			if(map.containsKey(num[i]))//if key exist
			{
				map.put(num[i],map.get(num[i])+1); //key same but value add by 1
			}
			else //key doesn't exist
			{
				map.put(num[i],1);
			}
		}

		for(int key:map.keySet())  //keyset={1,3,2,5} key take one by one value with each iteration
		{
			if(map.get(key) > n/3)
			{
				System.out.println(key);
				System.out.println("done");
			}
		}
	}	

	public static void main(String[]args)
	{
		int num[]={1,2};

		majorityElements(num);
	}
}