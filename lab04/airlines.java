import java.util.*;

class airlines{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int seat[] = new int[10];
		boolean vis[] = new boolean[10];

		int z = 0,k = 1000;
		
		while(z < 10){
			System.out.println("Which class ?\nOptions\n [1] First class\n [2] Economy class\n [3] exit");
			int ch = sc.nextInt(),y = 0;
			if(ch == 1){
				System.out.println("Seat Available");
				for(int i = 0 ; i < 5 ; i++){
					if(vis[i] == false){
						System.out.print((i+1) + " , "); 
						y++;
					}
				}
				if(y != 0){
					System.out.println("Enter seat number : ");
					int a = sc.nextInt();
					vis[a-1] = true;
					seat[a-1] = k;
					k++;
				}
				else{
					char j;
					System.out.println("Sorry First class not available! Are you okay for economy class? Type 'Y' (yes) or N (no)");
					j = sc.next().charAt(0);
					if(j == 'Y')
						ch = 2;
					else
						System.out.println("Next Flight leaves in 3 hours");
				}
				
			}
			if(ch == 2){
				y = 0;
				System.out.println("Seat Available");
				for(int i = 5 ; i < 10 ; i++){
					if(vis[i] == false){
						System.out.print((i+1) + " , "); 
						y++;
					}
				}
				if(y < 10){
					System.out.println("Enter seat number : ");
					int a = sc.nextInt();
					vis[a-1] = true;
					seat[a-1] = k;
					k++;
				}
				else
					System.out.println("Full booked");
			}
			if(ch == 3)
				break;
			z++;
		}		
		
	}
}
