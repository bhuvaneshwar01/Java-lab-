import java.util.*;

class minimax{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
		
		for(int i = 0 ; i < n ; i++ )
			arr[i] = sc.nextInt();
	
		for(int i = 0 ; i < n ; i++ ){
			if(arr[i] > max)	max = arr[i];
			if(arr[i] < min)	min = arr[i];
		}
		
		System.out.println("Max Element : " + max);
		System.out.println("Min Element : " + min);
	}
}
