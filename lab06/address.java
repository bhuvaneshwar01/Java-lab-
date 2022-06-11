class address{
	String street_name;
	String city;
	int pincode;

	address(String n,String c,int p){
		this.street_name = n;
		this.city = c;
		this.pincode = p;
	}	
	void display(){
		System.out.println("Address : " +  this.street_name + ", " + this.city + ", Pincode : " + this.pincode);
	}
}

