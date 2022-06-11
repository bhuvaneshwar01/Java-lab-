import java.util.*;

class occurance{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size of the array : ");		
		int n = s.nextInt();
		int[] arr = new int[n];
		int[] occ = new int[n];
		for(int i = 0 ; i < n ; i++){
			arr[i] = s.nextInt();
			occ[i] = 1;
		}
		boolean flag;
		for(int i = 0 ; i < n ; i++){
			flag = false;
			for(int j = 0; j < i; j++){
				if(arr[i] == arr[j]){
					occ[i] = occ[j];
					flag = true;
					break;
				}
			}
			if(flag == false){
				for(int j = i+1 ; j < n ; j++){
					if(arr[i] == arr[j])
						occ[i]++;
				}
			}
		}
		for(int i = 0 ; i < n ; i++){
			System.out.println(arr[i] + " occur " + occ[i]);
		}
	}
}
	
	
