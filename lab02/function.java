import java.util.*;

class function{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int copy[] = new int[n];
		int brr[] = new int[n];
		
		for(int i = 0 ; i < n ; i++ )
			arr[i] = sc.nextInt();

		System.out.println("Given array as List : " + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted Array : " + Arrays.toString(arr));
		System.out.println("Enter number to search : ");
		int x = sc.nextInt();
		System.out.println(x + " found at index : " + Arrays.binarySearch(arr,x));
		
		System.out.println("New Array : " + Arrays.toString(Arrays.copyOf(arr, n)));
		
		System.out.println("Enter "+ n +" element to compare " );
		for(int i = 0 ; i < n ; i++ )
			brr[i] = sc.nextInt();
		System.out.println("Compare: " + Arrays.compare(arr, brr));
	}
}
