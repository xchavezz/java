import javax.swing.JFrame;
import javax.swing.JBUtton;
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

        upperBtn = new JButton(" TO UPPER");
        upperBtn.setBounds(50, 100, 100, 30);
        frame.add(upper_Btn);

        lowerBtn = new JButton(" TO LOWER");
        lowerBtn.setBounds(200, 100, 100, 30);
        frame.add(lower_Btn);
        
        textField = new JTextField();
        textField.setBounds(50, 40, 250, 30);
        frame.add(textField);

        upperBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String text = textField.getText();
                textField.setText(text.toUpperCase());

            }
        });

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
