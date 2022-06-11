class overloading{
	public static void square(int a){
		System.out.println(a*a);
	}
	public static void square(double a){
		System.out.println(a*a);
	}
	public static void main(String args[]){
		square(5);
		square(4.2);
	}
}
