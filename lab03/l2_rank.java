import java.util.*;

class l2_rank{
	
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int i = 0;
		String arr[] = new String[6];
		while(i < 6){
			int ch = 0;
			System.out.println("Enter the " + (i+1) + " preferance");
			System.out.println("1)\tMachine learning\n2)\tJava programming\n3)\tImage processing");
			System.out.println("4)\tSoft computing\n5)\tPython programming\n6)\tDeep learning");
			ch = s.nextInt();
			switch(ch){
				case 1:
					arr[i] = "Machine learning";
					i++;
					break;
				case 2:
					arr[i] = "Java programming";
					i++;
					break;
				case 3:
					arr[i] = "Image processing";
					i++;
					break;
				case 4:
					arr[i] = "Soft computing";
					i++;					
					break;
				case 5:
					arr[i] = "Python programming";
					i++;
					break;
				case 6:
					arr[i] = "Deep learning";
					i++;
					break;
				default: 
					System.out.println("Wrong number" );
					break;
			}	
		}
		System.out.println("User preferance: (high preferance to low preferance)");
		for(i = 0 ; i < 6 ; i++)
			System.out.println(arr[i]); 
	}
}
