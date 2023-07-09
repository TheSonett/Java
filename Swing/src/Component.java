import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyComponent implements ActionListener {
    private JComponent component = null;
    private int x = 30;
    private int y = 30;
    public MyComponent() {
        component = new JComponent() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);

                Graphics2D g2d = (Graphics2D) g;

                g2d.setColor(Color.green);
                g2d.fillRect(x, y, 100, 100);


            }
        };

        Timer timer = new Timer(100, this);
        timer.start();
    }
    public JComponent getComponent() {
        return this.component;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x += 10;
        y += 20;

        component.repaint();
    }
}

public class Component {
    public static void main(String[] args) {
        MyComponent component = new MyComponent();
        JFrame frame = new JFrame("Graphics Window");
        frame.add(component.getComponent());

        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setFocusable(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
