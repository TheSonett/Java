import javax.swing.*;
import java.awt.*;

public class FlowLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window");
        frame.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEADING));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));
        frame.add(new JButton("11"));
        frame.add(new JButton("12"));

        frame.setPreferredSize(new Dimension(400, 400));
        frame.setLocation(400, 200);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
