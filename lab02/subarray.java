import java.util.*;

class subarray{

	int subsum(int arr[],int x,int y,int n){
		int sum = 0;
		for(int i = x ; i < y && i < n ; i++)
			sum += arr[i];
		return sum;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n ; i++ )
			arr[i] = sc.nextInt();
		
		System.out.print("Start at (index) : ");
		int x = sc.nextInt();

		System.out.print("End at (index) : ");
		int y = sc.nextInt();

		subarray bs = new subarray();
		System.out.println("Given array  : " + Arrays.toString(arr));
		int res = bs.subsum(arr,x,y,n);
		System.out.println("Sum of array from " + x + " to " + y + " :  " + res);
		
	}
}
