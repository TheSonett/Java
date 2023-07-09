import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileWindow {
    private JFrame frame = null;
    private JButton openFileBtn = null;

    public FileWindow() {
        frame = new JFrame("File Window");
        openFileBtn = new JButton("Open File");
        openFileBtn.setBounds(30, 40, 100, 30);

        // action
        openFileBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFileChooser fileChooser = new JFileChooser("D:");
                int file = fileChooser.showOpenDialog(null); // open popup window
                if(file == JFileChooser.APPROVE_OPTION) {
                    System.out.println(fileChooser.getSelectedFile().getAbsoluteFile()); // file path
                    // read file contains
                    String filePath = String.valueOf(fileChooser.getSelectedFile().getAbsoluteFile());
                    try {
                        File myFile = new File(filePath);
                        Scanner input = new Scanner(myFile);

                        while(input.hasNextLine()) {
                            System.out.println(input.nextLine());
                        }
                    }
                    catch (FileNotFoundException ex) {
                        System.out.println(ex.getMessage());
                    }

                }
            }
        });

        frame.add(openFileBtn);
        frame.setSize(new Dimension(500, 500));
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class FileChooser {
    public static void main(String[] args) {
        new FileWindow();
    }
}
