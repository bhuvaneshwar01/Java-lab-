import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class clienta {
    public static void main(String[] args) throws IOException,UnknownHostException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enterport : ");
        int port = sc.nextInt();
        System.out.println("Enter msg : ");
        String str = sc.next();
        Socket client = new Socket("localhost",port);
        System.out.println("Connected to server");

        DataInputStream dis = new DataInputStream(client.getInputStream());
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        System.out.println("Sending : " + str);
        dos.writeUTF(str);
        dis.readUTF();
        dos.flush();
        dos.close();
        client.close();
    }
}
