import java.util.*;

class q4{
	public static String prefix(String s1, String s2){
		String res =" ";
		                                                                                             
		for(int i = 0 ; i < s1.length(); i++){
			if(s1.charAt(i) == s2.charAt(i)){
				res += s1.charAt(i);						                        }                                                                                        else
				break;
												  	     }   
													     return res;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		String res = prefix(s1,s2);
		System.out.println(Math.sqrt(5));
		
		System.out.println(res);

		return;
	}
}
