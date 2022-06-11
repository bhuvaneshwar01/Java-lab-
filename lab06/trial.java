import java.util.*;

class trial{
	public static void main(String args[]){
		ArrayList<Integer>a = new ArrayList<Integer>();
		for(int i = 0 ; i < 10 ; i++)
			a.add(i);

		for(int i = 0 ; i < 10 ; i++)
			System.out.println(a.get(i));
		a.remove(0);
				for(int i = 0 ; i < 10 ; i++)
			System.out.println(a.get(i));

	}
}

