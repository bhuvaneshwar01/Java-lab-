import java.util.*;

class employee{
	String name;
	int id;
	double salary;

	employee(){
		this.name = "";
		this.id = -1;
		this.salary = 0;
	}

	employee(String name,int id){
		this.name = name;
		this.id = id;
		this.salary = 0;
	}

	public String tostring(){
		String s = "\nCLASS EMPLOYEES\n\nName : "+this.name+"\nid : "+this.id+"\nsalary : "+this.salary+"\n";
		return s;
	}

	public void display(){
		System.out.println("Name : "+this.name+"\nid : "+this.id+"\nsalary : "+this.salary+"\n");
	}

	public void get(double s){
		this.salary = s ;
	}
 	
	public void get(String s){
		this.name = s ;
	}

	public void get(int id){
		this.id = id ;
	}
}

class dates{
	int dates;
	int month;
	int year;

	dates(int d,int m,int y){
		this.dates = d;
		this.month = m;
		this.year = y;
	}
	
	public String tostring(){
		String s = this.dates+"-"+this.month+"-"+this.year+"\n";
		return s;
	}
}

class permanent extends employee{
	String designation;
	dates doj;
	double experience;

	permanent(String name,int id,String d,int e){
		super(name,id);
		this.designation = d;
		this.doj = new dates(19,4,2022);
		this.experience = (this.doj.year - 2022) + ((this.doj.month - 04)/100);
		
	}
	
	public void computesalary(){
		switch(this.designation){
			case "M":
				this.salary += 50000;
				break;
			case "E":
				this.salary += 40000;
				break;
			case "T":
				this.salary += 30000;
				break;
		}
		this.salary += (1000 * this.experience);
	}

	public void display(){
		String s = "Name : "+this.name+"\nid : "+this.id+"\nsalary : Rs."+this.salary+" /month\nDesignation : "+this.designation+"\nexperiences :"+this.experience+" yrs\nDate of join : "+this.doj.tostring();
		System.out.println("\nPERMANENT EMPLOYEES\n"+ s);
	}
		
}

class dailywages extends employee{
	int wph;
	int no_of_hours;
	dates doj;

	dailywages(String name,int id){
		super(name,id);
		this.wph = 0;
		this.no_of_hours = 0;
		this.doj = new dates(19,4,2022);
	}

	public void setwageperhour(int w,int h){
		this.wph = w;
		this.no_of_hours = h;
	}

	public void computesalary(){
		//System.out.println("\nWages per hours : "+this.wph+"\nNo. of hours :"+this.no_of_hours);
		this.salary += ((this.wph * this.no_of_hours) * 100);
	}

	public void display(){
		String s = "Name : "+this.name+"\nid : "+this.id+"\nsalary : Rs."+this.salary+" /month\nWages per hours : "+this.wph+"\nNo. of hours :"+this.no_of_hours+" \nDate of join : "+this.doj.tostring();
		System.out.println("\nDaily wages\n\n" + s);
	}

}


public class test1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);		
	
		permanent e1 = new permanent("bhuvan",1,"M",3);
		System.out.println(e1.tostring());
		e1.computesalary();
		System.out.println("Before updating ");
		e1.display();
		System.out.print("Enter name to update : ");
		String name = sc.next();

		System.out.println("After updating name ");
		
		e1.get(name);
		e1.display();
		
		System.out.print("Enter ID to update : ");
		int i = sc.nextInt();

		System.out.println("After updating ID ");		
		e1.get(i);		
		e1.display();
		
		dailywages e2 = new dailywages("deepak",2);
		e2.setwageperhour(5,8);
		e2.computesalary();
		e2.display();
		
		
		
	
		return;
	}
}
