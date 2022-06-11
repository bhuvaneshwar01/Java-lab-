import java.util.*;

class l3_overload{
	public static boolean compare(String s1,String s2){
		return s1.contains(s2);
	}
	
	public static boolean compare(double a,double b){
		if(a == b)
			return true;
		else
			return false;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter float number a : ");		
		double a = sc.nextDouble();
		System.out.print("Enter float number b : ");		
		double b = sc.nextDouble();
		l3_overload l = new l3_overload();
		boolean flag = l.compare(a,b);
		if(flag)
			System.out.println("Given two float numbers are equals");
		else
			System.out.println("Given two float numbers are not equals");
		
		System.out.print("\n\nEnter string s1 : ");	
		
		String s1 = sc.next();
		System.out.print("\nEnter string s2 : ");	
		String s2 = sc.next();
		boolean res = compare(s1,s2);
		if(res)
			System.out.println("Given s1 is substring of s2");
		else
			System.out.println("Given s1 is not substring of s2");
	}
}

