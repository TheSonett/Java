import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

class Student {
    private JFrame frame;
    private JTable table;

    private String[][] students = {
            {"1", "Joy Saha", "05"},
            {"2", "Rahul Dey", "10"},
            {"3", "Sumit Das", "12"},
            {"4", "Washim Aqram", "04"}
    };

    private String[] headers = {"ID", "NAME", "ROLL-NO"};

    public Student() {
        table = new JTable(students, headers);
        table.setBounds(30,50,200,300);
        table.setCellSelectionEnabled(true);
        table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                String data = "";
                int[] rows = table.getSelectedRows();
                int[] col = table.getSelectedColumns();

                for(int i = 0; i < rows.length; i++) {
                    for(int j = 0; j < col.length; j++) {
                        data = (String) table.getValueAt(rows[i], col[j]);
                    }
                }
                System.out.println("You selected: " + data);
            }
        });

        JScrollPane sp = new JScrollPane(table);
        frame = new JFrame("Student Database", null);
        frame.add(sp);

        frame.setSize(300,400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

public class Table {
    public static void main(String[] args) {
        new Student();
    }
}
