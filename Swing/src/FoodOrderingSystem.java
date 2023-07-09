import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class FoodSystem {
    private JFrame frame;
    private JLabel label = new JLabel("Select Food Items from below => ");

    // private JCheckBox c1 = new JCheckBox("Pizza - Rs. 50");
    // private JCheckBox c2 = new JCheckBox("Burgur - Rs. 55");
    // private JCheckBox c3 = new JCheckBox("Chicken 65 Roll - Rs. 80");

    private JRadioButton c1 = new JRadioButton("Pizza - Rs. 50");
    private JRadioButton c2 = new JRadioButton("Burgur - Rs. 55");
    private JRadioButton c3 = new JRadioButton("Chicken 65 Roll - Rs. 80");

    private JPanel panel = new JPanel(null);
    private JButton order = new JButton("Order");

    public FoodSystem(int width, int height) {
        frame = new JFrame("Food Ordering System");
        frame.setSize(width, height);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setContentPane(panel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set positions
        label.setBounds(70, 30, 200, 40);
        c1.setBounds(70, 70, 200, 40);
        c2.setBounds(70, 100, 200, 40);
        c3.setBounds(70, 130, 200, 40);
        order.setBounds(90, 190, 100, 30);

        // actions
        order.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int totalAmount = 0;
                String msg = "";
                if(c1.isSelected()) {
                    msg += c1.getText() + "\n";
                    totalAmount += 50;
                }
                if(c2.isSelected()) {
                    msg += c2.getText() + "\n";
                    totalAmount += 55;
                }
                if(c3.isSelected()) {
                    msg += c3.getText() + "\n";
                    totalAmount += 80;
                }

                msg += "-----------------\n";
                JOptionPane.showMessageDialog(panel, (msg + "Total: " + totalAmount), "Bill Order", JOptionPane.INFORMATION_MESSAGE);
            }
        });


        // adding components to panel
        panel.add(label);
        panel.add(c1);
        panel.add(c2);
        panel.add(c3);
        panel.add(order);

        // adding to frame
        frame.add(panel);
    }
}


public class FoodOrderingSystem {
    public static void main(String[] args) {
        new FoodSystem(500, 450);
    }
}
