import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

class server{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int port = sc.nextInt();
        ServerSocket socket = new ServerSocket(port);

        System.out.println("Server listening on port : " + port);
        Socket client1 = socket.accept();
        System.out.println("[+]   Connected to client 1");
        
        DataOutputStream dos = new DataOutputStream(client1.getOutputStream());
        DataInputStream dis = new DataInputStream(client1.getInputStream());

        String s = dis.readUTF();
        System.out.println("[-] Client : " + s);

        Socket client2 = socket.accept();
        DataOutputStream dos2 = new DataOutputStream(client2.getOutputStream());
        int res = (int)s.charAt(0);

        char ch = (char)(res-1);

        String s2 = "" + ch;
        System.out.println("Sending to client2 : " + s2);

        dos2.writeUTF(s2);

        dos2.flush();
        dos.writeUTF("close");
        dis.close();
        System.out.println("******Closing connection*****");
        client1.close();
        client2.close();
        socket.close();
    }
}