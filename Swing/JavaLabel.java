// The object of JLabel class is a component for placing text in a container.

import javax.swing.*;
import java.awt.event.*;

public class JavaLabel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI Window", null);
        frame.setSize(500, 300);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel();
        label.setText("default text!");
        label.setBounds(140, 20, 100, 60);

        JTextField textField = new JTextField();
        textField.setBounds(200, 200, 100, 80);

        JButton button = new JButton("Add", null);
        button.setBounds(150, 100, 60, 40);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText(textField.getText());
            }
        });

        // adding stuffs
        frame.add(label);
        frame.add(textField);
        frame.add(button);
    }
}
