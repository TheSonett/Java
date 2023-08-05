import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Viewport {
    public static JToggleButton btn = null;
    public static JViewport viewport = null;
    public static void main(String[] args) {
        JFrame frame = new JFrame("Viewport");

        viewport = new JViewport();
        viewport.setSize(new Dimension(500, 600));
        viewport.setBackground(Color.BLACK);
        viewport.setOpaque(true);

        btn = new JToggleButton("Click");
        btn.setBounds(560, 30, 150, 20);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(btn.isSelected())
                    viewport.setBackground(Color.red);
                else
                    viewport.setBackground(Color.black);
            }
        });

        frame.add(viewport, BorderLayout.WEST);
        frame.add(btn, BorderLayout.CENTER);

        frame.setLayout(new BorderLayout());
        frame.setSize(new Dimension(800, 600));
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}