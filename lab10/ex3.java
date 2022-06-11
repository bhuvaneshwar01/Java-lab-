import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class student implements Serializable{
    int age;
    String name;
    String gender;
    int grade;

    student(int age,String name,String gender,int grade){
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }

    void setname(String name){
        this.name = name;
    }
    String setname(){
        return this.name;
    }

}

class ex3 {
    public static void main(String args[]){
        student s1 = new student(20,"bhuvan","male",8);
        try{
            System.out.println("Serializing");
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("db2.dat"));
            out.writeObject(s1);
            out.close();
        }catch(Exception e){
            System.out.println("Error " + e);
        }

        try{
            System.out.println("Deserializing");
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("db2.dat"));
            student s = (student)in.readObject();
            System.out.print("Name : " + s.name + " Age : " + s.age + " Gender " + s.gender + " Grade : " + s.grade + "\n" );
            in.close();
        }catch(Exception e){
            System.out.println("Error " + e);
        }
    }
}
