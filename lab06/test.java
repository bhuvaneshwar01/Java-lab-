class test{
	public static void main(String args[]){
		address a = new address("t.nagar","chennai",600001);
		account ac1 = new account(1004,"bhuvaneshwar",2500,a);
		account ac2 = new account(1003,"rahul",3600,"ashok nagar","chennai",600083);

		ac1.acc_holder_addr.display();
		ac2.acc_holder_addr.display();
	}
}
