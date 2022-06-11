import java.util.*;

class uniques{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[91];
		int a[] = new int[5];
		
		for(int i = 0 ; i < 91 ; i++ )
			arr[i] = 0;
		
		int i = 0;
		while(i < 5){
			int t = sc.nextInt();
			if(t >= 10 && t <= 100){
				if(arr[t-10] == 0){
					arr[t-10]++;
					System.out.println("Duplicate does not exits " );
					a[i] = t;
					i++;
				}
				else{
					System.out.println("Duplicate exist");
				}
			}
			else{
				System.out.println("Write between 10-100");
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
