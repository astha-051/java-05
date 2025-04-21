import java.util.*;

public class isarraysorted{
	public static boolean sort(int  arr[],int index)
	{
		if(index==arr.length-1)
		{
			return true;//sorted all array
		}
		if(arr[index]<arr[index+1])
		{
			return sort(arr,index+1);
		}
		else {
			return false;
		}
	}

	public  static void main(String[]args)
	{
		int arr[]={1,2,3,4,4};
		System.out.println(sort(arr,0));
	}
}