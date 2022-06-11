import java.util.*;

class q1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String words[] = s.split(" ");
		for(int i = 0 ; i < words.length ; i++){
			char c = words[i].charAt(0);
			if(c >= 'A' && c <= 'Z')
				System.out.print(c);
		}
		System.out.print("\n");
	}
}
		
		
			
