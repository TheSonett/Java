import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;

public class ItemList {
    public static void main(String[] args) {
        JPanel panel = new JPanel(new BorderLayout());
        List<String> myList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            myList.add("List Item no => " + i);
        }

        JList<String> list = new JList<String>(myList.toArray(new String[myList.size()]));
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setViewportView(list);
        list.setLayoutOrientation(JList.VERTICAL);
        panel.add(scrollPane);
        
        JFrame frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(500, 250);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
