import java.io.PrintWriter;
import java.io.File;
import java.util.*;

class ex1{
	public static void main(String args[]){
		System.out.println("Number pf entries :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		try{
			File f1 = new File("telephonedir.txt");
			PrintWriter output = new PrintWriter(f1);
			while(n-- > 0){
				System.out.print("Enter name : ");
				String name = sc.next();
				System.out.print("Enter mobile no. : ");
				String ph = sc.next();
	
				output.println(name+"       "+ph);
				
			}
			output.close();
			
		}catch(Exception e){
			System.out.println("Writing error");
		}

	

	}
}
