import javax.swing.*;   //q3
import java.awt.*;
import java.awt.event.*;
 
public class prog3 extends JFrame {
    public prog3() {
        JPanel p = new JPanel(new GridLayout(4, 1));
 
        JPanel p1 = new JPanel();
        JLabel l1 = new JLabel("Select Message Panel Background");
 
        p1.add(l1);
 
        JPanel p2 = new JPanel();
 
        ButtonGroup G = new ButtonGroup();
 
        JRadioButton r1 = new JRadioButton("Red");    
        JRadioButton r2 = new JRadioButton("Yellow");    
        JRadioButton r3 = new JRadioButton("White");    
        JRadioButton r4 = new JRadioButton("Grey");    
        JRadioButton r5 = new JRadioButton("Green");    
 
        
          
        G.add(r1);
        G.add(r2);
        G.add(r3);
        G.add(r4);
        G.add(r5);
 
        p2.add(r1);
        p2.add(r2);
        p2.add(r3);
        p2.add(r4);
        p2.add(r5);
 
        JLabel l2 = new JLabel("Welcome to Java", SwingConstants.LEFT);
        l2.setBorder(BorderFactory.createLineBorder(Color.black));
        l2.setOpaque(true);
 
        r1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l2.setBackground(Color.RED);
            }
        });
 
        r2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l2.setBackground(Color.YELLOW);
            }
        });
 
        r3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l2.setBackground(Color.WHITE);
            }
        });
 
        r4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l2.setBackground(Color.GRAY);
            }
        });
 
        r5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l2.setBackground(Color.GREEN);
            }
        });
 
        JPanel p3 = new JPanel(new GridLayout(1, 2));
        JButton bl = new JButton("<-");
        JButton br = new JButton("->");
 
        bl.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l2.setHorizontalAlignment(SwingConstants.LEFT);
            }
        });
 
        br.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l2.setHorizontalAlignment(SwingConstants.RIGHT);
            }
        });
 
        p3.add(bl);
        p3.add(br);
 
        p.add(p1);
        p.add(p2);
        p.add(l2);
        p.add(p3);
 
        add(p);
    }
 
    public static void main(String[] args) {
        prog3 frame = new prog3(); 
 
        frame.setSize(400, 300); 
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true); 
    }
}

