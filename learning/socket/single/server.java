import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    private ServerSocket serversocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void start(int port) throws IOException{
        serversocket = new ServerSocket(port);
        clientSocket = serversocket.accept();

        out = new PrintWriter(clientSocket.getOutputStream());
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        String g = in.readLine();
        if ("hello server".equals(g)) {
            out.println("hello client");
        }
        else {
            out.println("unrecognised greeting");
        }
    }

    public void stop() throws IOException{
        in.close();
        out.close();
        clientSocket.close();
        serversocket.close();
    }

    public static void main(String args[]) throws IOException{
        server s = new server();
        s.start(5500);
    }
}
