import java.util.*;
class rectcalc {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of the rectangle: ");
		int a = sc.nextInt();
		System.out.println("Enter width of the rectangle : ");
		int b = sc.nextInt();
		System.out.println("Area : " + (a*b) + "\tPerimeter : " + (2*(a+b)));
	}
}
