import java.util.*;

class Counter implements  Runnable{       
      Storage st;
      int n ;
      public Counter(Storage store , int n){
            st = store;
            this.n = n ;
      }
      @Override
      public void run() {
            synchronized(st) {
                  for(int i = 0 ; i < n; i++){
                        while(!st.isPrinted()) {   
                              try {
                                    st.wait();
                              } 
                              catch(Exception e) {
                                    System.out.println(e);
                              }
                        }
                        System.out.println(Thread.currentThread().getName() + " - " + i);
                        st.setValue(i);
                        st.setPrinted(false);
                        st.notify();
                  }
            }
      }
}
class Printer implements Runnable{
      Storage st;
      int n ;

      public Printer(Storage st , int n){
            this.st = st;
            this.n = n ;
      }
      @Override
      public void run() {
            synchronized(st) {
                  for(int i = 0; i < n; i++) {
                        while(st.isPrinted()) {
                              try {
                                    st.wait();
                              } 
                              catch(Exception e) { 
                                    System.out.println(e);
                              }
                        }
                        System.out.println(Thread.currentThread().getName() + " - " + st.getValue() + "\n");
                        st.setPrinted(true);
                        st.notify();
                  }
            }
      }      
}
class Storage{
      int  i;
      boolean printed = true;
      public void setValue(int i){
            this.i = i;
      }
      public int getValue(){
            return this.i;
      }
      public boolean isPrinted() {
            return printed;
      }
      public void setPrinted(boolean p) {
            printed = p;
      }
}

public class q3 {
      public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the number : ");
            int n = sc.nextInt();

            Storage st = new Storage();
            Counter c = new Counter(st , n );
            Printer p = new Printer(st , n );
            new Thread(c,"Counter").start();  
            new Thread(p,"Printer").start();   
      }
}