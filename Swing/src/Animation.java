import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Panel implements ActionListener {
    protected JPanel panel;

    protected Image enemy;
    protected Image background;

    protected int x_position = 0;
    protected int y_position = 0;

    protected int x_velocity = 3;
    protected int y_velocity = 3;

    private Timer timer;
    private final int PANEL_WIDTH = 600;
    private final int PANEL_HEIGHT = 460;

    public Panel() {
        enemy = new ImageIcon("./src/character_0014.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        background = new ImageIcon("./src/background_0010.png").getImage().getScaledInstance(PANEL_WIDTH, PANEL_HEIGHT, Image.SCALE_SMOOTH);

        panel = new JPanel() {
            @Override
            public void paint(Graphics g) {
                super.paint(g);
                Graphics2D g2d = (Graphics2D) g;

                g2d.drawImage(background, 0, 0, null);
                g2d.drawImage(enemy, x_position, y_position, null);
            }
        };

        panel.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        panel.setBackground(Color.BLACK);

        timer = new Timer(10, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(x_position > PANEL_WIDTH - enemy.getWidth(null) || x_position < 0) {
            x_velocity *= -1;
        }

        if(y_position > PANEL_HEIGHT - enemy.getHeight(null) || y_position < 0) {
            y_velocity *= -1;
        }

        x_position += x_velocity;
        y_position += y_velocity;

        panel.repaint();
    }
}

class Window extends Panel {
    private JFrame frame;

    public Window() {
        frame = new JFrame("2D Animation");

        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }
}


public class Animation {
    public static void main(String[] args) {
        new Window();
    }
}
