import java.util.*;

class supermarket{
	private String name;	
	private String desc;
	public int stock;
	public double price;

	supermarket(String n,String d,int s,double p){
		this.name = n;
		this.desc = d;
		this.stock = s;
		this.price = p;
	}

	public void tostring(){
		System.out.println("Product name : " + this.name);
		System.out.println("Product description : " + this.desc + "\nStock : " + this.stock + "\nPrice : " + this.price);
	}

	double addItem(supermarket item){
		return this.price;
	}
	
}	

class Items{
	public double cost = 0;
	public static void main(String args[]){
		supermarket it ;
		Scanner sc = new Scanner(System.in);
		double amt = 0;
		while(true){
			System.out.println("Display total cost -> -1 Exit -> 0 Continue -> 1");
			int c = sc.nextInt();
			if(c == -1){
				System.out.println(amt);
			}
			else if(c == 0){
				System.out.println("Existing...");
				break;
			}
			else if(c == 1){
				System.out.println("Enter product name : ");
				String n = sc.next();
				System.out.println("Enter product description : ");			
				String d = sc.next();
				System.out.println("Enter stock: ");
				int s = sc.nextInt();
				System.out.println("Enter price : ");
				double p = sc.nextDouble();
				it = new supermarket(n,d,s,p);
				amt += it.addItem(it);
				it.tostring();
			}
		}
	}
}


