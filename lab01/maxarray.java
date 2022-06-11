import java.util.*;

class maxarray{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		int max = -1;
		for(int i = 0 ; i < n ; i++){
			arr[i] = s.nextInt();
			if(max < arr[i]){
				max = arr[i];
			}
		}
		System.out.println("Max : " + max);
	}
}
		
