import java.util.*;

class salesperson{
	int age;
	String name;
	double salary;
	double salesAmt;
	int noofsales;
	double saleAmountPerYear[] = new double[12];

	salesperson(int age,String name,double salary){
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.salesAmt = 0;
		this.noofsales = 0;
	}

	public void addSale(double amt){
		this.salesAmt += amt;
		this.noofsales++;			
		saleAmountPerYear[this.noofsales%12] += amt;
	}

	void monthperformance(){
		System.out.println("Monthly performance");
		for(int i = 0 ; i < 12 ; i++){
			System.out.println((i+1) + "\t" + this.saleAmountPerYear[i]);
		}
	}

	public int getSale(){
		return this.noofsales;
	}

	public double getTotalSalesAmount(){
		return salesAmt;
	}

	public void display(){
		System.out.println("\nDetails :-");
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
		System.out.println("Total salary : " + this.salary);
		System.out.println("Total sales amount  : " + this.salesAmt);
		System.out.println("No of sales : " + this.noofsales);
	}

	public double findTotalSalary(){
		if(this.noofsales >= 10 && this.noofsales < 20){
			this.salary += 1000;
			return this.salary;
		}
		else if(this.noofsales >= 20 && this.noofsales < 40){
			this.salary += 2000;
			return this.salary;
		}
		else if(this.noofsales >= 40){
			this.salary += 5000;
			return this.salary;
		}
		else
			return this.salary;
	}
}

class q4{
	public static double findBonus(salesperson s){
		if(s.noofsales >= 10 && s.noofsales < 20){
			return 1000;
		}
		if(s.noofsales >= 20 && s.noofsales < 40){
			return 2000;
		}
		if(s.noofsales >= 40){
			return 5000;
		}
		
		return 0;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter employers name : ");
		String n = sc.next();
		System.out.print("Enter employers age : ");
		int age = sc.nextInt();
		System.out.print("Enter employers salary : ");
		double sal = sc.nextDouble();
			
		salesperson s1 = new salesperson(age,n,sal);
		s1.addSale(2000);
		s1.addSale(3000);
		s1.addSale(4000);
		s1.addSale(5000);
		s1.addSale(6000);
		s1.addSale(7000);
		s1.addSale(8000);
		s1.addSale(9000);
		s1.addSale(1000);
		s1.addSale(2000);
		s1.addSale(3000);
		s1.addSale(4000);
		s1.addSale(5000);
		s1.addSale(6000);
		s1.addSale(7000);
		s1.addSale(4000);
		s1.addSale(5000);
		s1.addSale(6000);
		s1.addSale(7000);

		while(true){
			System.out.println("\n\n\n1) addsales\n2) get sales\n3) getTotalsalesAmt\n4) display\n5) findBonus\n6) findTotalSalary\n7) salesAmountPerYear\n\n Enter ch : ");
			int ch = sc.nextInt();
			boolean r = true;
			
			
			
			
			switch(ch){
				case 1: 
					System.out.print("Enter Amount : ");
					int amt = sc.nextInt();
					s1.addSale(amt);
					break;
				case 2:
					System.out.println("No. of sales : " + s1.getSale());
					break;
				case 3:
					System.out.println("Total sales amount : " + s1.getTotalSalesAmount());
					break;
				case 4:
					s1.display();
					break;
				case 5:
					System.out.println("Total bonus amount : " +findBonus(s1));
					break;
				case 6:
					System.out.println("Total salary : " +s1.findTotalSalary());
					break;
				case 7:
					s1.monthperformance();
					break;				
				case 8:
					System.out.println("existing");
					r = false;
					break;
			}
			if(r == false)
				break;
		}
		return;
		
	}
}
