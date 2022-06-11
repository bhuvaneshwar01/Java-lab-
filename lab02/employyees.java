import java.util.*;

class employyees{
		public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of employees : ");
		int n = sc.nextInt();
		
		int arr[][] = new int[n][7];
		int total[] = new int[n];
		int temp[] = new int[n];
		
		for(int i = 0 ; i < n ; i++){
			total[i] = 0;
		}

		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < 7 ; j++){
				arr[i][j] = sc.nextInt();
				total[i] += arr[i][j];	
			}
		}
		
		for(int i = 0 ; i < n ; i++){
			temp[i] = total[i];
		}

		Arrays.sort(temp);

		for(int i = n-1 ; i >= 0 ; i --){
			for(int j = 0 ; j < n ; j++){
				if(temp[i] == total[j]){
					System.out.println("Employees " + j + " : " + temp[i]);
					break;
				}
			}
		}
		
	}
}

