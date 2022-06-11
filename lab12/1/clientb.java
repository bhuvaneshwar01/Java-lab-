import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class clientb {
    public static void main(String[] args) throws IOException,UnknownHostException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enterport : ");
        int port = sc.nextInt();
        Socket s = new Socket("localhost",port);

        DataInputStream dis = new DataInputStream(s.getInputStream());

        String str = dis.readUTF();
        System.out.println("[x] Received Input : " + str);

        dis.close();
        s.close();
    }
}
