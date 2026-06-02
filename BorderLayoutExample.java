import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class BorderLayoutExample implements ActionListener {

    JButton btn1, btn2, btn3, btn4, btn5;
    JFrame frame;

    BorderLayoutExample() {

        frame = new JFrame();
        frame.setTitle("BorderLayout Example");
        frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());

        btn1 = new JButton("North Button");
        frame.add(btn1,BorderLayout.NORTH);

        btn2 = new JButton("South Button");
        frame.add(btn2,BorderLayout.SOUTH);

        btn3 = new JButton("East Button");
        frame.add(btn3,BorderLayout.EAST);

        btn4 = new JButton("West Button");
        frame.add(btn4,BorderLayout.WEST);

        btn5 = new JButton("Center Button");
        frame.add(btn5,BorderLayout.CENTER);

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource().equals(btn1)) {
            System.out.println("North Button Clicked...");
        }

        if (ae.getSource().equals(btn2)) {
            System.out.println("South Button Clicked...");
        }
        if (ae.getSource().equals(btn3)) {
            System.out.println("East Button Clicked...");
        }
        if (ae.getSource().equals(btn4)) {
            System.out.println("West Button Clicked...");

        }
        if (ae.getSource().equals(btn5)) {
            System.out.println("Centre Button Clicked...");
        }
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}
