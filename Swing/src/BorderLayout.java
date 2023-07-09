import javax.swing.*;
import java.awt.*;

public class BorderLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window");
        frame.setLayout(new java.awt.BorderLayout(10, 10));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(Color.BLUE);
        panel2.setBackground(Color.BLACK);
        panel3.setBackground(Color.RED);
        panel4.setBackground(Color.GREEN);
        panel5.setBackground(Color.CYAN);

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        frame.add(panel1, java.awt.BorderLayout.EAST);
        frame.add(panel2, java.awt.BorderLayout.WEST);
        frame.add(panel3, java.awt.BorderLayout.NORTH);
        frame.add(panel4, java.awt.BorderLayout.SOUTH);
        frame.add(panel5, java.awt.BorderLayout.CENTER);

        frame.setLocation(400, 200);
        frame.setPreferredSize(new Dimension(400, 400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
