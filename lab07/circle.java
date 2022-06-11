
import java.util.*;

class circle2D{
	public double center_x;
	public double center_y;
	public double radius;

	circle2D(){
		center_x = 0;
		center_y = 0;
		radius = 1;
	}

	circle2D(double cx,double cy,double r){
		center_x = cx;
		center_y = cy;
		radius = r;
	}

	public double getRadius(){
		return this.radius;
	}
	
	public double getX(){
		return this.center_x;
	}
	
	public double getY(){
		return this.center_y;
	}

	public double getPerimeter(){
		return (2*3.14*radius);
	}
	
	public double getArea(){
		return (3.14*radius);
	}	
	
	public boolean contain(double x, double y){
		double d = Math.sqrt(((this.center_x*this.center_x) - (x*x)) + ((this.center_y*this.center_y) - (y*y)));
		if(d <= this.radius)
			return true;
		else
			return false;
	}

	public boolean contain(circle2D c){
		double d = Math.sqrt(((this.center_x*this.center_x) - (c.center_x*c.center_x)) + ((this.center_y*this.center_y) - (c.center_y*c.center_y)));
		if(this.radius >d + c.radius)
			return true;
		else
			return false;
	}

	
}

class circle{
	
	public static boolean overlaps(circle2D a, circle2D b){
		double r = a.radius + b.radius;
		double d = Math.sqrt(((a.center_x*a.center_x) - (b.center_x*b.center_x)) + ((a.center_y*a.center_y) - (b.center_y*b.center_y)));	
		if(r >= d)
			return true;
		else
			return false;
	}

	public static void findBiggestcircle(circle2D c[]){
		circle2D res = new circle2D();
		int l = c.length;
		for(int i = 0 ; i < l ; i++){
			if(res.radius < c[i].radius){
				res = c[i];
			}
		}
		System.out.println("\n\nBiggest circle is x : " + res.getX() + "\ty: " + res.getY() + "\tRadius : " + res.getRadius());
	}
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		circle2D c[] = new circle2D[5];

		c[0] = new circle2D(1,2,3);
		c[1] = new circle2D(2,2,2);
		c[2] = new circle2D(1,1,3);
		c[3] = new circle2D(2,4,5);
		c[4] = new circle2D();		
		
		for(int i = 0 ; i < 5 ; i++){ 
			System.out.println("[" + i +"]\t" + "Center point =>  x : " + c[i].center_x + "\ty : " + c[i].getY() + "\tRadius : " + c[i].getRadius() +  "\tArea : " + c[i].getArea() + "\tPerimeter : " + c[i].getPerimeter()); 
		}
	
		System.out.println("\nTo check inside another circle\n");
		System.out.print("enter between [0 - 4] a : ");
		int a = sc.nextInt();

		System.out.print("enter between [0 - 4] b : ");
		int b = sc.nextInt();

		System.out.println(" is circle 'a' inside circle 'b' ? " + c[a].contain(c[b]));

		System.out.println("\nTo check inside given points\n");
		System.out.print("enter between [0 - 4] a : ");
		a = sc.nextInt();

		System.out.print("Enter some random point : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		System.out.println(" is circle 'a' inside the given point (x,y) ? "+ c[a].contain(x,y));

		System.out.println("\nOverlapping another circle\n");
		System.out.print("enter between [0 - 4] a : ");
		a = sc.nextInt();

		System.out.print("enter between [0 - 4] b : ");
		b = sc.nextInt();

		System.out.println(" is circle 'a' overlap circle 'b' ? " + circle.overlaps(c[a],c[b]));

		circle.findBiggestcircle(c);
	}
}
