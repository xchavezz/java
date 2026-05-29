import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpperLower {

    JFrame frame;
    JTextField textField;
    JButton upperBtn, lowerBtn;

    UpperLower() {

        frame = new JFrame("Upper & Lower Case Converter");
        frame.setSize(400, 250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textField = new JTextField();
        textField.setBounds(50, 40, 250, 30);
        frame.add(textField);

        upperBtn = new JButton("UPPER");
        upperBtn.setBounds(50, 100, 100, 30);
        frame.add(upperBtn);

        lowerBtn = new JButton("LOWER");
        lowerBtn.setBounds(200, 100, 100, 30);
        frame.add(lowerBtn);

        // Uppercase button action
        upperBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String text = textField.getText();
                textField.setText(text.toUpperCase());

            }
        });

        // Lowercase button action
        lowerBtn.addActionListener(new ActionListener() {
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
