import java.util.*;

class test2{
	public static void main(String args[]){
		sales s[] = new sales[5];
		int arr[][] = new int [5][4];
		Scanner sc = new Scanner(System.out);
		int s;
		int p;
		int d;
		for(int i = 0; i < 5 ; i++){
			System.out.print("S : ");
			s = sc.nextInt();
			System.out.print("P : ");
			p = sc.nextInt();
			System.out.print("D : ");
			d = sc.nextInt();
			arr[p][s] = d;
		}
		for(int i = 0 ; i < 5 ; i++){
			int s = 0;
			for(int j = 0 ; j < 4 ; j++){
				System.out.print(arr[i][j] + " ");
				s += arr[i][j];
			}
			System.out.println(s);
		}
		
		for(int i = 0 ; i < 5 ; i++){
			int 
	}
}
