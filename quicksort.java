public class quicksort{

	public static int partition(int arr[],int low,int high)
	{
		int pivot=arr[high]; // pivot 
		int i=low-1;  //i for tracking shorter elements

		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)
			{
				i++; //give place to elements
				//swap  shorter elements and pivot
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}

		i++; //give place to elements

		int temp=arr[i];  //for larger elements than pivot
		arr[i]=arr[high];
		arr[high]=temp;

		return i;  //pivot index
	}

	public static void quick(int []arr,int low,int high)
	{
		if(low<high)
		{
			int pivotidx= partition(arr,low,high);

			quick(arr,low,pivotidx-1); //shorter than pivot
			quick(arr,pivotidx+1,high);  //larger than pivot
		}
	}

	public static void main(String[]args)
	{
		int []arr={8,5,2,4,6,1};

		int n=arr.length;

		quick(arr,0,n-1);   //n=length sp we take n-1

		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}