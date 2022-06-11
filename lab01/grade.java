import java.util.*;

class grade{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int g = s.nextInt();
		if(g < 35){
			System.out.println("Grade B");
		}
		else if(g >= 35 && g < 90){
			System.out.println("Grade A");
		}
		else if(g >= 90 && g <= 100){
			System.out.println("Grade O");
		}
		else{
			System.out.println("INVALID");
		}
	}
}
