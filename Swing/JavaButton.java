// The JButton class is used to create a labeled button that has platform independent implementation.

import java.awt.event.*;
import javax.swing.*;

public class JavaButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example", null);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 150, 20);

        JButton button = new JButton("Click", null);
        button.setBounds(130, 100, 100, 50);
        button.setEnabled(true);
        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("You clicked me!!");
            }
            
        });


        frame.add(button);
        frame.add(textField);
    }
}
