import java.util.*;

class q2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		String c;
		String words[] = s.split(" ");
		
		System.out.println("Number of words " + words.length);
		
		for(int i = 0,j = words.length - 1; i < j; i++,j--){
			String t = words[i];
			words[i] = words[j];
			words[j] = t;
		}
		
		for(int i = 0 ; i < words.length ; i++){
			System.out.print(words[i] + " ");
		}
		System.out.print("\n");
		return;
	}
}
