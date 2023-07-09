import javax.swing.*;

public class MenuBar {
    public static void main(String[] args) {
        JMenu menu = new JMenu("Menu");
        JMenu submenu = new JMenu("More Menu");
        JMenuItem i1 = new JMenuItem("Item 1");
        JMenuItem i2 = new JMenuItem("Item 2");
        JMenuItem i3 = new JMenuItem("Item 3");
        JMenuItem i4 = new JMenuItem("Item 4");
        JMenuItem i5 = new JMenuItem("Item 5");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);

        JMenuBar menuBar = new JMenuBar();
        menuBar.add(menu);

        JFrame frame = new JFrame("GUI Window");

        frame.setJMenuBar(menuBar);
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
