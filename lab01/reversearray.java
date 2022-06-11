import java.util.*;

class reversearray{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of the array ");
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
			arr[i] = s.nextInt();
		}
		System.out.println("Given array");
		for(int i = 0 ; i < n ; i++){
			System.out.print(arr[i] +"\t");
		}
		System.out.println("\nReverse array");
		for(int i = n-1 ; i >= 0 ; i--){
			System.out.print(arr[i] +"\t");
		}
		System.out.println("\n");
	}
}
