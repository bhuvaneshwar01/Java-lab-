import java.util.*;

class book{
	String title;
	String authorName;
	double price;
	int bookno;

	book(String title,String n,double p,int no){
		this.title = title;
		this.authorName = n;
		this.price = p;
		this.bookno = no;
	}

	book(){
		this.title = "--";
		this.authorName = "--";
		this.price = 0;
	}
	
	String getAuthor(){
		return this.authorName;
	}

	String getTitle(){
		return this.title;
	}
}

class librarymember extends book{
	String name;
	book mybooks[] = new book[10];
	int mid;

	librarymember(String n,int id){
		this.name = n;
		this.mid = id;
		for(int i = 0 ; i < 10 ; i++){
			mybooks[i] = new book();
		}
	}

	void borrow(book b[]){
		int k = 0;
		if(b.length >= 10){
			System.out.println("Cant exceeded more than 10");
		}
		else{
			for(int i= 0 ; i < 10 ; i++){
				if(this.mybooks[i].title == "--"){
					k = i;
					break;
				}
			}
			for(int i = k, j = 0 ; i < 10 && j < b.length ; i++, j++){
				this.mybooks[i] = b[j];
				System.out.println(this.mybooks[i].title + " Added\n");
			}
			System.out.println("\nAdded Successfully\n");
		}
	}
	
	void returnn(book b[]){
		int i = 0;
		while(i < b.length){
			for(int j = 0 ; j < 10 ; j++){
				if(mybooks[j].title == b[i].title){
					System.out.println(mybooks[i].title + " deleted\n");
					mybooks[i] = new book();
					break;
				}
			}
			i++;
		}
	}

	String tostring(){
		return "Name : " + this.name + "\tMembership ID : " + this.mid + "\n";
	}

	void getbooks(){
		for(int i = 0 ; i < 10 ; i++){
			if(this.mybooks[i].title == "--"){
				break;
			}
			else{
				System.out.println("[" + i + "]" +" Title : " + this.mybooks[i].title + " Author : " + this.mybooks[i].authorName);
			}
		}
	}
	
}

class spot{
	public static boolean search(librarymember l1 ,int n){
		for(int i = 0 ; i < 10 ; i++){
			if(l1.mybooks[i].bookno == n){
				return true;
			}
		}
		return false;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		book b[] = new book[3];
		for(int i = 0 ; i < 3 ; i++){
			b[i] = new book("aa"+i,"bbb"+i,i+100,i);
		}
		librarymember l1 = new librarymember("bhuvan",1);
		l1.borrow(b);
		l1.getbooks();
		System.out.print("Enter book no to search : ");
		int c = sc.nextInt();
		System.out.println("Search for bookno : "+ c +" -> " + spot.search(l1,c));
		l1.returnn(b);
		System.out.println(l1.tostring());
		return;
	}
}
