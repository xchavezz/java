import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FLowLayoutExample implements ActionListener {

    JFrame frame;
    JButton b1, b2, b3, b4, b5;

    FLowLayoutExample() {

        frame = new JFrame();
        frame.setSize(400, 400);
        frame.setTitle("FlowLayout Example");
        frame.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 30));

        b1 = new JButton("Button1");
        b2 = new JButton("Button2");
        b3 = new JButton("Button3");
        b4 = new JButton("Button4");
        b5 = new JButton("Button5");

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource().equals(b1)) {
            System.out.println("Button 1 clicked...");
        } else if (ae.getSource().equals(b2)) {
            System.out.println("Button 2 clicked...");
        } else if (ae.getSource().equals(b3)) {
            System.out.println("Button 3 clicked...");
        } else if (ae.getSource().equals(b4)) {
            System.out.println("Button 4 clicked...");
        } else if (ae.getSource().equals(b5)) {
            System.out.println("Button 5 clicked...");
        }
    }

    public static void main(String[] args) {
        new FLowLayoutExample();
    }
}
