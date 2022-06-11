import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import java.util.*;

class ex1_replace {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter name and phone to change : ");
        String name = sc.nextLine();
        String ph = sc.nextLine();

        try{
            FileReader fr = new FileReader("telephonedir.txt");
            File f = new File("telephonedir.txt");
            
            Scanner input = new Scanner(fr);
            
            FileWriter fw = new FileWriter("temp.txt");
            File tf = new File("temp.txt");

            while(input.hasNextLine()){
                String data = input.nextLine();
                System.out.println(data);
                if(data.contains(name)){
                    String s = name + "       " + ph + "\n";
                    fw.append(s);
                }
                else{
                    fw.append(data);
                }
            }
            fw.close();
            fr.close();
            f.delete();
            tf.renameTo(new File("telephonedir.txt"));
            input.close();
            System.out.println("Updated Successfully");

        }catch(Exception e){
            System.out.println("Error : " + e);
        }
    }
}
