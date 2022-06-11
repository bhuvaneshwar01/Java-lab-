import java.util.Random;
import java.util.Scanner;

class thread1 extends Thread{
    public static void display(int n){
        try{

            thread1.sleep(n*1000);
        }catch(Exception e){
            System.out.println(e);
        }
        System.out.println("Sleep time : " + n);
    }
    public void run(){
        int n = (int)Math.floor(Math.random()*(10)+1);
        System.out.println("random value : " + n);
        thread1.display(n);
    }
}
public class q1 {
    public static void main(String args[]){
        thread1 t1 = new thread1();
        t1.start();
        return;
    }
}
