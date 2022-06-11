import java.util.*;

interface InterfaceRegion{
	boolean Contains(Point q);
	double Area();
	void PrintDetails();
}

class Point{
	int x;
	int y;

	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

abstract class Region implements InterfaceRegion{
	String Name;

	Region(String name){
		this.Name = name;
	}
	public String getName(){return Name;}
	abstract public boolean Contains(Point p);
	abstract public double Area();
	abstract public void PrintDetails();

}

class Rectangle extends Region{
	Point tl;
	double height;
	double width;

	Rectangle(int x, int y, double height, double width){
		super("Rectangle");
		tl = new Point(x,y);
		this.height = height;
		this.width = width;		
	}
	public void getHeight(){
	       Scanner sc = new Scanner(System.in);
	       System.out.print("Enter height: ");
       	       double h = sc.nextDouble();
	       height = h;
	}
	public void getWidth(){
	       Scanner sc = new Scanner(System.in);
	       System.out.print("Enter width: ");
       	       double w = sc.nextDouble();
	       width = w;
	}
	public void getPoint(){
	       Scanner sc = new Scanner(System.in);
	       System.out.print("Enter x: ");
       	       int w = sc.nextInt();
	       tl.x = w;
	       System.out.print("Enter y: ");
       	       int q = sc.nextInt();
	       tl.y = q;
	}
	public double Area(){ return height*width;}
	public boolean Contains(Point p){
	       if((p.x >= tl.x && p.x <= (tl.x+width)) && (p.y <= tl.y && p.y >= (tl.y-height))){
		       return true;
	       }
	       else
		       return false;
	}
	public void PrintDetails(){
		System.out.println("\nDetails\n\tName: "+Name+"\n\tHeight: "+height+"\n\tWidth: "+width+"\n\tx: "+tl.x+"\n\ty: "+tl.y+"\n\tArea: "+this.Area());	
	}
}

class Circle extends Region{
	Point c;
	double rad;
	
	Circle(int x, int y, double rad){
		super("Circle");
		c = new Point(x,y);
		this.rad = rad;
	}
	public double Area(){return 3.14*rad*rad;}
	public boolean Contains(Point p){
		if(Math.sqrt((c.x-p.x)*(c.x-p.x)+(c.y-p.y)*(c.y-p.y))<rad)
			return true;
		else
			return false;
	}
	public void PrintDetails(){
		System.out.println("\nDetails:\n\tName: "+Name+"\n\tRadius: "+rad+"\n\tx: "+c.x+"\n\ty: "+c.y+"\n\tArea: "+this.Area());
	}
	public void getRadius(){
	       Scanner sc = new Scanner(System.in);
	       System.out.print("Enter radius: ");
       	       double w = sc.nextDouble();
	       rad = w;
	}
	public void getCenter(){
	       Scanner sc = new Scanner(System.in);
	 try{
	       System.out.print("Enter x: ");
       	       int w = sc.nextInt();
	       c.x = w;
	       System.out.print("Enter y: ");
       	       int q = sc.nextInt();
	       c.y = q;
	 }catch(Exception e){
	 	System.out.println("Decimal values not allowed.");
	 }
	}
}
class shapeTest{
	public static void main(String args[]){
		Rectangle r = new Rectangle(5,5,5,5);
		r.PrintDetails();
		r.getWidth();
		r.PrintDetails();
		Point test1 = new Point(8,3);
		Point test2 = new Point(2,3);
		System.out.println("Rectangle contains (8,3): "+r.Contains(test1));
		System.out.println("Rectangle contains (2,3): "+r.Contains(test2));
	
		Circle c = new Circle(3,3,3);
		c.PrintDetails();
		c.getCenter();
		c.PrintDetails();
		System.out.println("Circle contains (8,2): "+c.Contains(test1));
		System.out.println("Circle contains (2,2): "+c.Contains(test2)+"\n");
	}
}
		
