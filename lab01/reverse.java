import java.util.*;

class reverse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = n;
		System.out.println("\nUsing while loop");
		while(n > 0){
			System.out.print(n%10);
			n = n/10;
		}
		System.out.println("\nUsing do-while loop");
		do{
	                   System.out.print(a%10);
	                   a = a/10;
		}while(a > 0);
		System.out.println("\n");
	}
}
