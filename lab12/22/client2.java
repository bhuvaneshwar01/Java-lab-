import java.io.*;   //q2
import java.net.*;
 
class Struct implements Serializable{
    char c;
    int i;
    float f;
    Struct(char c, int i, float f) {
        this.c = c;
        this.i = i;
        this.f = f;
    }
}
 
class client2 {
    public static void main(String[] args) throws Exception {
        try
        {
            DatagramSocket ds = new DatagramSocket(9999);  
 
            byte[] recvBuf = new byte[5000];
            DatagramPacket packet = new DatagramPacket(recvBuf, recvBuf.length);
            ds.receive(packet);
 
            int byteCount = packet.getLength();
            ByteArrayInputStream byteStream = new ByteArrayInputStream(recvBuf);
            ObjectInputStream is = new ObjectInputStream(new BufferedInputStream(byteStream));
            Struct o = (Struct) is.readObject();
 
            System.out.println("Object received from Server with values: " + o.c + " "  + o.i + " "  + o.f);
 
            ds.close();
            is.close();
 
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}

