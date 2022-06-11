import java.util.*;

class sortarray{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++){
			arr[i] = s.nextInt();
		}
		System.out.println("\nBefore sorting");
		System.out.println("\n");
		for(int i = 0 ; i < n ; i++){
			System.out.print(arr[i] + "\t");
		}

		for(int i = 0 ; i < n ; i++){
			for(int j = i+1 ; j < n ; j++){
				if(arr[i] > arr[j]){
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		System.out.println("\nAfter sorting");
		for(int i = 0 ; i < n ; i++){
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println("\n");
	}
}
		
