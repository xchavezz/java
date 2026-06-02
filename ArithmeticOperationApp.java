import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ArithmeticOperationApp extends JFrame implements ActionListener {

    JPanel top_panel, bottom_panel;
    JLabel user_lbl;
    JTextField user_input_txt;
    JButton add_btn, sub_btn, mul_btn, div_btn;

    double result = 0;

    ArithmeticOperationApp() {

        setTitle("Arithmetic Operation");
        setSize(500, 500);
        setLayout(new GridLayout(2, 1, 10, 20));

        top_panel = new JPanel();
        top_panel.setLayout(new GridLayout(2, 1));

        user_lbl = new JLabel("User Input");
        user_input_txt = new JTextField();

        top_panel.add(user_lbl);
        top_panel.add(user_input_txt);

        bottom_panel = new JPanel();
        bottom_panel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        add_btn = new JButton("ADD");
        sub_btn = new JButton("Subtract");
        mul_btn = new JButton("Multiply");
        div_btn = new JButton("Divide");

        bottom_panel.add(add_btn);
        bottom_panel.add(sub_btn);
        bottom_panel.add(mul_btn);
        bottom_panel.add(div_btn);

        add(top_panel);
        add(bottom_panel);

       
        add_btn.addActionListener(this);
        sub_btn.addActionListener(this);
        mul_btn.addActionListener(this);
        div_btn.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent a) {

        double input = Double.parseDouble(user_input_txt.getText());

        if (a.getSource().equals(add_btn)) {
            result = result + input;
        }
        else if (a.getSource().equals(sub_btn)) {
            result = result - input;
        }
        else if (a.getSource().equals(mul_btn)) {
            result = result * input;
        }
        else if (a.getSource().equals(div_btn)) {

            if (input==0) {
                user_input_txt.setText("Error");
                return;
            }

            result = result / input;
        }

        user_input_txt.setText(String.valueOf(result));
    }

    public static void main(String[] args) {
        new ArithmeticOperationApp();
    }
}
