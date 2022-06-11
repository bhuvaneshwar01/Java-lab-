import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;


class eclient {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void startConnection(String ip, int port) throws IOException,UnknownHostException{
        clientSocket = new Socket(ip, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public String sendMessage(String msg) throws IOException{
        String line = "";
 
        // keep reading until "Over" is input
        while (!line.equals("Over"))
        {
            try
            {
                line = in.readLine();
                out.writeUTF(line);
            }
            catch(IOException i)
            {
                System.out.println(i);
            }
        }
    }

    public void stopConnection() throws IOException{
        in.close();
        out.close();
        clientSocket.close();
    }
}

public class client {
    public static void main(String args[]) throws IOException{
        eclient client = new eclient();
        client.startConnection("127.0.0.1", 5500);
        String response = client.sendMessage("hello server");
    }
}