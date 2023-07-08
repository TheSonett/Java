import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class CombinationBox {
    public static void main(String[] args) {
        String[] languages = {"C++", "Java", "C#", "Python", "C", "Rust"};
        JComboBox<String> comboBox = new JComboBox<>(languages);
        comboBox.setBounds(100, 30, 100, 20);
        
        JLabel label = new JLabel();
        label.setBounds(220, 30, 180, 20);

        comboBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String msg = "You have selected: " + comboBox.getSelectedItem();
                label.setText(msg);
            }
            
        });

        JPanel panel = new JPanel(null);
        JFrame frame = new JFrame("Combo Example");
        panel.add(comboBox);
        panel.add(label);
        
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setContentPane(panel);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
