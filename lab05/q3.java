import java.util.*;

class q3{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String words[] = s.split("#");
		String res[] = new String[words.length*2 - 1];
		int j = 0;
		for(int i = 0 ; i < words.length; i++){
			res[j] = words[i];
			j++;
			if(j != words.length*2 - 1){
				res[j] = "#";
				j++;
			}
		}
		System.out.println(Arrays.toString(res));

		return;
	}
}
