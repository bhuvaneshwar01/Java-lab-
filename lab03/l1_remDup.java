import java.util.*;

class l1_remDup{
	
	public static int[] removeDuplicate(int arr[],int n){
		int res[] = new int[n];
		int k = 0;
		boolean flag = false;
		for(int i = 0 ; i < n ; i++){
			flag = false;
			for(int j = 0; j < res.length ; j++){
				if(arr[i] == res[j]){
					flag = true;
					break;
				}
			}
			if(!flag){
				res[k] = arr[i];
				k++;
			}
		}
		return res;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];	
			
		for(int i = 0 ; i < n ; i++){
			System.out.print("Array["+i+"] : ");
			arr[i] = sc.nextInt();
		}
		int res[] = removeDuplicate(arr,n);
		for(int i = 0 ; i < res.length ; i++)
			System.out.print(res[i] + "\t");
		System.out.print("\n");
	}
}
