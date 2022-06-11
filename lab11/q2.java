import java.util.Scanner;

class fibonacci extends Thread{
    int n;
    fibonacci(int n){
        this.n = n;
    }
    public void run(){
        int arr[] = new int[n+1];
        arr[0] = 0;
        arr[1] = 1;
        for(int i = 2 ; i <= n ; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        for(int i = 0 ; i <= n ; i++){
            System.out.println("Fibonacci [" + i + "] : "+arr[i] );
        }
        System.out.println("\n");
    }
}

public class q2 extends Thread{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int n = sc.nextInt();
        fibonacci t1 = new fibonacci(n);

        System.out.println("Enter numbers : ");
        n = sc.nextInt();
        fibonacci t2 = new fibonacci(n);

        t1.start();
        try{
            if(t1.isAlive()){
                t1.join();
            }
        }catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
