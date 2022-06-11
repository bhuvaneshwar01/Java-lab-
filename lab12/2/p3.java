import javax.swing.*;
import java.util.*;
import java.awt.*;

class gui extends JFrame{
    JFrame frame;
    JLabel label;
    JRadioButton red,yellow,white,gray,green;
    JTextField textField;
    JButton left,right;
    // public void actionPerformed(ActionEvent e) 
    // {
    //     System.out.println(e);
    // }
    gui()
    {
        frame = new JFrame("base");
        label=new JLabel("Select background");
        red=new JRadioButton("red");
        yellow=new JRadioButton("yellow");
        white=new JRadioButton("white");
        green=new JRadioButton("green");
        gray=new JRadioButton("gray");
        textField=new JTextField("Welcome to java");
        left=new JButton("left");
        right=new JButton("right");


        frame.add(label);
        frame.add(red);
        frame.add(yellow);
        frame.add(white);
        frame.add(green);
        frame.add(gray);

        frame.add(textField);
        frame.add(left);
        frame.add(right);
    }
}

class p3{
    public static void main(String[] args) {
        new gui();
    }
}
