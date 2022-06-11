import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class invoice implements Serializable {
    int number;
    String description;
    int quantity;
    double price;

    invoice(int number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }
}

class ex2 {
    public static void main(String args[]) {
        invoice arr[] = new invoice[5];
        arr[0] = (new invoice(5, "book", 5, 200));
        arr[1] = (new invoice(4, "pen", 6, 100));
        arr[2] = (new invoice(8, "pencil", 3, 20));
        arr[3] = (new invoice(2, "eraser", 6, 20));
        arr[4] = (new invoice(1, "scale", 9, 280));

        try{
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("db.dat"));
            out.writeObject(arr);
            out.close();
        } catch(Exception e){
            System.out.println("Error : " + e);
        }

        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("db.dat"));
            invoice res[] = null;
            res = (invoice [])in.readObject();
            for(int i = 0 ; i < 5 ; i++){
                System.out.println("["+i+"] Number : " + arr[i].number + " Description : " + arr[i].description + " Quantity :"  + arr[i].quantity + " Price : "  + arr[i].price);
            }
            in.close();
        }catch(Exception e){
            System.out.println("Reading error : " + e);
        }
    }
}
