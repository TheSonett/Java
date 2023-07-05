// The object of a JTextField class is a text component that allows the editing of a single line text.
// 

import javax.swing.*;
import java.awt.event.*;

class Calculator {
    private JFrame window = null;

    private JButton plusButton = null;
    private JButton minusButton = null;

    private JTextField firstField = null;
    private JTextField secondField = null;
    private JTextField resultField = null;

    public Calculator() {
        window = new JFrame("Calculator App", null);
        window.setSize(300, 300);
        window.setVisible(true);
        window.setLayout(null);
        //window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        firstField = new JTextField();
        secondField = new JTextField();
        resultField = new JTextField();
        firstField.setBounds(50,50,150,20);
        secondField.setBounds(50,100,150,20);
        resultField.setBounds(50,150,150,20);

        plusButton = new JButton("+", null);
        plusButton.setBounds(50,200,50,50);
        minusButton = new JButton("-", null);
        minusButton.setBounds(120,200,50,50);

        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer a = Integer.parseInt(firstField.getText());
                Integer b = Integer.parseInt(secondField.getText());

                Integer sum = a + b;

                resultField.setText(sum.toString());
            }
        });

        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Integer a = Integer.parseInt(firstField.getText());
                Integer b = Integer.parseInt(secondField.getText());

                Integer minus = a - b;

                resultField.setText(minus.toString());
            }
        });


        // adding components
        window.add(firstField);
        window.add(secondField);
        window.add(resultField);
        window.add(plusButton);
        window.add(minusButton);
    }
}

public class FieldAndArea {
    public static void main(String[] args) {
        new Calculator();            
    }
}
