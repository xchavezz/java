import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpperLower {

    JFrame frame;
    JTextField textField;
    JButton upper_Btn, lower_Btn;

    UpperLower() {

        frame = new JFrame("Upper & Lower Case Converter");
        frame.setSize(400, 250);
        frame.setLayout(null);

        textField = new JTextField();
        textField.setBounds(50, 40, 250, 30);
        frame.add(textField);

        upper_Btn = new JButton("TO UPPER");
        upper_Btn.setBounds(50, 100, 120, 30);
        frame.add(upper_Btn);

        lower_Btn = new JButton("TO LOWER");
        lower_Btn.setBounds(200, 100, 120, 30);
        frame.add(lower_Btn);

        upper_Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                textField.setText(text.toUpperCase());
            }
        });

        lower_Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                textField.setText(text.toLowerCase());
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new UpperLower();
    }
}
