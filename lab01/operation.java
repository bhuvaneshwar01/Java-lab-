import java.util.*;

class operation{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = sc.nextInt();
		System.out.println("Enter b: ");
		int b = sc.nextInt();
		System.out.println("Sum of two no. : " +(a + b));
		System.out.println("Difference between two no. : " +(a - b));
		System.out.println("Product of two no. : " +(a * b));
		System.out.println("Quotient for " + a+ "/" + b+ " : " +(a / b));
	}
}
