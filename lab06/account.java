class account{
	int account;
	String name;
	double balance;
	address acc_holder_addr;

	account(int ac,String nm,double bal,address adr){
		this.account = ac;
		this.name = nm;
		this.balance = bal;
		this.acc_holder_addr = adr;
	}

	account(int ac,String nm,double bal,String st,String ct,int pin){
		this.account = ac;
		this.name = nm;
		this.balance = bal;
		this.acc_holder_addr = new address(st,ct,pin);
	}
}
