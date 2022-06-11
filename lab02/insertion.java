import java.util.*;

class insertion{
	void insertionsort(int arr[]){
		int n = arr.length;
		for(int i = 1 ; i < n ; i++){
			int key = arr[i];
			int j = i-1;
			while(j >= 0 && key < arr[j]){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n ; i++ )
			arr[i] = sc.nextInt();
		
		System.out.println("Given array : " + Arrays.toString(arr));
		insertion is = new insertion();
		is.insertionsort(arr);
		System.out.println("Sorted array : " + Arrays.toString(arr));
		
	}
}
