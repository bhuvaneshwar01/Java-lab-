class staticMethod{
	static int a = 10;
		
	void display(){
		System.out.println("This is instance method");
	}
	public static void show(){
		System.out.println("This is static method");
	}
	public static void main(String args[]){
		staticMethod s = new staticMethod();
		s.display();
		show();
		int c = staticMethod.a;
		System.out.println(a);
	
	}
}
