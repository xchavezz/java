import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Printmessage implements ActionListener {

    JFrame frame;
    JButton click_btn;

    Printmessage() {

        frame = new JFrame();
        frame.setTitle("Just click me");
        frame.setSize(400, 400);
        frame.setLayout(null);

        click_btn = new JButton("Click me");
        click_btn.setBounds(20, 40, 180, 25);

        frame.add(click_btn);
        click_btn.addActionListener(this);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        System.out.println("I am clicked ..............");
    }

    public static void main(String[] args) {
        new Printmessage();
    }
}
