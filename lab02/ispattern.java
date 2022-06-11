import java.util.*;

class ispattern{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		int length = 0,i = 0;	
		boolean flag = false;

		while(n > 0){
			arr[i] = n%10;
			n = n/10;
			length++;
			i++;
		}

		for(i = 0 ; i < length ; i++ ){
			int count = 1,t;
			while(arr[i] == arr[i+1]){ 
				count++;
				t = arr[i];
				i++;
			}
			if(count >= 4){
				System.out.println(arr[i] + " matched the pattern ( 4 times consecutive )");
				flag = true;
			}
		}

		if(!flag)
			System.out.println("Given number doesnt match the pattern");

	}
}
