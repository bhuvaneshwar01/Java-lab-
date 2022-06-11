class Rectangle{

	double width,height;

	Rectangle(){
		this.width = 1;
		this.height = 1;
	}
	
	Rectangle(double w, double h){
		this.width = w;
		this.height = h;
	}

	public double getArea(){
		return this.height * this.width;
	}

	public double getPerimeter(){
		return 2*(this.width + this.height);
	}
}

class rect{
	public static void main(String args[]){
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(5.6,6.9);

		System.out.println("Rectangle R1, width : " + r1.width + "h : " + r1.height + " Area : " + r1.getArea() + "Peri " + r1.getPerimeter() );
		System.out.println("Rectangle R2, width : " + r2.width + "h : " + r2.height + " Area : " + r2.getArea() + "Peri " + r2.getPerimeter() );
	}
}
