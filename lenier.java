import java.util.Scanner;

public class lenier{
	public static void main(String[]args)
	{
		Scanner ab=new Scanner(System.in);
		System.out.println("enter an array number:");
		int  n=ab.nextInt();
		

		int []a=new int[n];

		for(int i=0;i<n;i++)
		{
			System.out.println("enter a number:");
			a[i]=ab.nextInt();
		}

		System.out.println("enter a  number to search:");
		int search=ab.nextInt();

		boolean found=false;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				System.out.println("found at="+i);
				found=true;
				break;
			}
		}

		if(!found)
		{
			System.out.println("number is not found");
		}
	}
}






// import java.util.Scanner;

// public class lab53 {
//     public static void main(String[] args) {
//         Scanner ab = new Scanner(System.in);
//         System.out.println("Enter the size of the array:");
//         int n = ab.nextInt();

//         int[] a = new int[n];

//         for(int i = 0; i < n; i++) {
//             System.out.println("Enter an element in ascending order:");
//             a[i] = ab.nextInt();
//         }

//         System.out.println("Enter a number to rotate:");
//         int rotationCount = ab.nextInt();

//         // Normalize the rotation count
//         rotationCount = rotationCount % n;

//         // Reverse the entire array
//         for(int start = 0, end = n - 1; start < end; start++, end--) {
//             int temp = a[start];
//             a[start] = a[end];
//             a[end] = temp;
//         }

//         // Reverse the first part
//         for(int start = 0, end = rotationCount - 1; start < end; start++, end--) {
//             int temp = a[start];
//             a[start] = a[end];
//             a[end] = temp;
//         }

//         // Reverse the second part
//         for(int start = rotationCount, end = n - 1; start < end; start++, end--) {
//             int temp = a[start];
//             a[start] = a[end];
//             a[end] = temp;
//         }

//         System.out.println("Array after rotation:");
//         for(int i = 0; i < n; i++) {
//             System.out.print(a[i] + " ");
//         }
//     }
// }
