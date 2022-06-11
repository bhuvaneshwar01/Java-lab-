import java.util.*;
class switchcalc{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		int a = sc.nextInt();
		System.out.println("Enter b");
		int b = sc.nextInt();
		System.out.println("Enter choice\n1)Addition\n2)Subtraction\n3)Multiplication\n4)Division");
		int choice = sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("Sum of 2 numbers : " + (a+b));
				break;
			case 2:
				System.out.println("Diff between  2 numbers " + a + " & " + b + " : " + (a-b));
				break;
			case 3:
				System.out.println("Product of 2 numbers : " + (a*b));
			        break;
			case 4:
				System.out.println("Quotient : " + (a/b) + "\tRemainder : " + (a%b));
				break;
			default:
				System.out.println("Invalid type between 1-4");

		}
	}
}
