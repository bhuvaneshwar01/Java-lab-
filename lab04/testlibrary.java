import java.util.*;



class LibraryMember{	

	String name;
	int membershipno;
	double membershipfee;
	int numberOfBooks;

	LibraryMember(){
		this.name = " ";
		this.membershipno = 0;
		this.membershipfee = 0;
		this.numberOfBooks = 0;
	}
	
	LibraryMember(String name, int mno, double mfee){
		this.name = name;
		this.membershipno = mno;
		this.membershipfee = mfee;
		this.numberOfBooks = 0;
		
	}

	public int getmembershipno(){
		return this.membershipno;
	}

	public void getDetails(){
		System.out.println("Name  : " + this.name);
		System.out.println("MembershipNo  : " + this.membershipno);
		System.out.println("Membershipfee : " + this.membershipfee);
		System.out.println("Number of books having  : " + this.numberOfBooks);
	}

	public  String getName(){
		return this.name;
	}

	public void borrow(int n){
		System.out.println(" MemberShipNo : " + this.membershipno  + "  Number of Books already borrowed : " + this.numberOfBooks);
		if((this.numberOfBooks + n) <= 5){
			this.numberOfBooks += n;
			System.out.println("\n\nAdded\nMemberShipNo : " + this.membershipno  + "   Number of Books already borrowed : " + this.numberOfBooks);
		}
		else{
			System.out.println("Can't exceeded more than 5 books");
		}
	}

	public void returnn(int n){
		System.out.println("\n\n MemberShipNo : " + this.membershipno  + "  Number of Books already borrowed : " + this.numberOfBooks);
		if((this.numberOfBooks - n) >= 0){
			this.numberOfBooks -= n;
			System.out.println("\n\nUpdated\nMemberShipNo : " + this.membershipno  + " Number of Books remaing : " + this.numberOfBooks);
		}
		else{
			System.out.println("\n\nLimit Underflow");
		}
	}
}

class testlibrary{

	public static void search(int x,LibraryMember l[] ){
		boolean flag = false;
		for(int i = 0 ; i < 5 ; i++){
			if(l[i].getmembershipno() == x){
				System.out.println("Founded");
				l[i].getDetails();
				flag = true;
			}
		}

		if(flag == false){
			System.out.println("Not Founded\n\n");
		}

	}
	
	public static void main(String args[]){
		int k = 1000;
		Scanner sc = new Scanner(System.in);
		
		LibraryMember l[] = new LibraryMember[5];
		l[0] = new LibraryMember("harrish" ,++k, 360);
		l[1] = new LibraryMember("harry" ,++k, 200);
		l[2] = new LibraryMember("john" ,++k, 256);
		l[3] = new LibraryMember("swift" ,++k, 400);
		l[4] = new LibraryMember("sara" ,++k, 256);

		for(int i = 0 ; i < 5 ; i++)
			l[i].getDetails();
		
		System.out.println("\n\nEnter the membership no to search : ");
		int x = sc.nextInt();
		search(x,l);

		l[0].borrow(4);
		
		

		l[3].borrow(5);

		l[1].returnn(1);

		l[2].returnn(2);

		
		return;
		
	}
}
