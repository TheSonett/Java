import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CheckBoxes {
    private static JPanel panel = new JPanel(null);
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window");
        frame.setSize(450, 300);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setContentPane(panel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JCheckBox checkBox1 = new JCheckBox("C++");
        checkBox1.setBounds(new Rectangle(40, 30, 100, 30));

        JCheckBox checkBox2 = new JCheckBox("Java");
        checkBox2.setBounds(new Rectangle(40, 60, 100, 30));

        JLabel display = new JLabel();
        display.setBounds(new Rectangle(30, 100, 300, 30));

        // actions
        checkBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int state = e.getStateChange();
                display.setText("You have " + (state == 1 ? "checked " : "unchecked ") + checkBox1.getText());

                if (state == 1)
                    checkBox2.setEnabled(false); 
                else 
                    checkBox2.setEnabled(true);
            }
        });

        checkBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int state = e.getStateChange();
                if(state == 1)
                    display.setText("You have checked " + checkBox2.getText());
                else
                    display.setText("You have unchecked " + checkBox2.getText());

                if (state == 1)
                    checkBox1.setEnabled(false); 
                else 
                    checkBox1.setEnabled(true);
            }
        });


        // adding
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(display);
        frame.add(panel);
    }
}
