public class mergesort{

	public static void conquer(int arr[],int si,int mid,int ei)
	{
		int merged[]=new int[ei-si+1]; //new array for store element
		int idx1=si;  //convert into array
		int idx2=mid+1;
		int x=0;

		while(idx1 <= mid && idx2<=ei)
		{
			if(arr[idx1] <= arr[idx2])
			{
				merged[x++] = arr[idx1++]; //idx1++ after every loop
			}
			else 
			{
				merged[x++] = arr[idx2++];  //idx2++ after every loop
			}
		}

		while(idx1 <= mid)
		{
			merged[x++] = arr[idx1++];  //if loop 1 contain more element than loop2
		}

		while(idx2 <= ei)
		{
			merged[x++] = arr[idx2++];  //same as 1
		}

		for(int i=0; i<merged.length;i++)
		{
			arr[si  + i]=merged[i]; //start from si
		}
	}

	public static void divide(int arr[],int si,int ei)
	{
		if(si >= ei)
		{
			return;
		}

		int mid=si+(ei - si)/2; //si+ei/2 contains some problem
		divide(arr,si,mid); //first array length
		divide(arr,mid+1,ei); //last array length

		conquer(arr,si,mid,ei);
	}

	public static void main(String[]args)
	{
		int []arr={5,6,2,1,8,3};

		divide(arr,0,arr.length-1);

		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}