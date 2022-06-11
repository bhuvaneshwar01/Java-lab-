import java.util.*;

class binarySearch{
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

	int binarysearch(int arr[],int l,int r,int x){
		if(r >= l ){
			int mid = l + (r-1) /2;
			if(arr[mid] == x)
				return mid;
			if(arr[mid] > x)
				return binarysearch(arr,l,mid-1,x);
			
			return binarysearch(arr,mid+1,r,x);
		}
		return -1;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i = 0 ; i < n ; i++ )
			arr[i] = sc.nextInt();

		int x = sc.nextInt();

		binarySearch bs = new binarySearch();
		bs.insertionsort(arr);
		System.out.println("Given array (sorted) : " + Arrays.toString(arr));
		int res = bs.binarysearch(arr,0,n-1,x);
		if(res == -1)
			System.out.println("404 ERROR FOUND - NOT FOUNDED");
		else
			System.out.println("FOUNDED AT :  " + res);
		
	}
}
