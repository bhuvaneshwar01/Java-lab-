import java.util.*;

class charoccurance{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter character : ");
		String str  = sc.next();
		char x = sc.next().charAt(0);
		int freq[] = new int[26];
		for(int i = 0 ; i < 0 ; i++)
			freq[i] = 0;

		for(int i = 0 ; i < str.length() ; i++){
			char c = str.charAt(i);
			freq[c - 'a']++;
		}

		System.out.println(x + " occur " + freq[x-'a'] + "times");
	}
}
