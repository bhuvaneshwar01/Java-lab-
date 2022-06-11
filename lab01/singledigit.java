import java.util.*;

class singledigit{
	public static void main(String args[]){
		int[] d = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 digit pos number : ");
		int a = sc.nextInt(); 
		d[4] = a%10;
		a = a/10;
		d[3] = a%10;
		a = a/10;
		d[2] = a%10;
		a = a/10;
		d[1] = a%10;
		a = a/10;
		d[0] = a%10;
		a = a/10;
		System.out.println(d[0]);
		System.out.println(d[1]);
		System.out.println(d[2]);
		System.out.println(d[3]);
		System.out.println(d[4]);
	}
}
