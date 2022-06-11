import java.util.*;

class q5{
	public static String convert(String s){
		String r = "";
		int a;
		for(int i = 0 ; i < s.length() ; i++){
			char c = s.charAt(i);
			if(Character.isUpperCase(c)){
				r += Character.toLowerCase(c);
			}
			else{
				r += Character.toUpperCase(c);
			}
				
		}

		return r;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		String r = convert(s);
		System.out.print(r+"\n");
	}
}
		
		
			
