import java.net.*;   //q2
import java.util.Scanner;
import java.io.*;
 
class Struct implements Serializable {
    char c;
    int i;
    float f;
 
    Struct(char c, int i, float f) {
        this.c = c;
        this.i = i;
        this.f = f;
    }
}
 
class client1 {
    public static void main(String[] args) throws Exception {
        try {
            Scanner sc = new Scanner(System.in);
 
            System.out.println("Enter char, int and float value to send to server:");
            char c = sc.nextLine().charAt(0);
            int i = sc.nextInt();
            float f = sc.nextFloat();
 
            Struct st = new Struct(c, i, f);
 
            System.out.println("Sending object of class Struct to Server with values:" + st.c + " " + st.i + " " + st.f);
            
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(st);
 
            byte[] buf = baos.toByteArray();
 
            InetAddress ip = InetAddress.getByName("127.0.0.1");  
 
            DatagramPacket dp = new DatagramPacket(buf, buf.length, new InetSocketAddress(ip,9999));
            DatagramSocket ds = new DatagramSocket(null);
            ds.send(dp);
 
            System.out.println("Object sent");
            ds.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

