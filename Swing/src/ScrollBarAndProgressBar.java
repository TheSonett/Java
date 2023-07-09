import java.awt.event.*;
import javax.swing.*;

class ScrollBar {
    private JScrollBar scrollBar;
    private JLabel label;

    public ScrollBar() {
        scrollBar = new JScrollBar();
        scrollBar.setBounds(100, 100, 50, 100);

        label = new JLabel();
        label.setBounds(200,100, 400, 100);

        scrollBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                label.setText("Value changed: " + e.getValue());
            }

        });
    }

    public JScrollBar getScrollBar() {
        return this.scrollBar;
    }

    public JLabel getLabel() {
        return this.label;
    }

}

class ProgressBar {
    private JProgressBar progressBar;
    private JLabel label;
    private int i = 0;

    public ProgressBar() {
        progressBar = new JProgressBar(0, 200);
        progressBar.setBounds(100, 100, 50, 100);
        progressBar.setStringPainted(true);

        label = new JLabel();
        label.setBounds(200,100, 400, 100);
    }

    public void iterate() throws InterruptedException{
        while(i <= 2000){
            progressBar.setValue(i);
            i = i + 20;

            Thread.sleep(150);
        }
    }

    public JProgressBar getProgressBar() {
        return this.progressBar;
    }

    public JLabel getLabel() {
        return this.label;
    }

}

public class ScrollBarAndProgressBar {

    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Window");

//		 ScrollBar scrollBar = new ScrollBar();
//	     frame.add(scrollBar.getScrollBar());
//	     frame.add(scrollBar.getLabel());

        ProgressBar progressBar = new ProgressBar();

        frame.add(progressBar.getProgressBar());
        frame.add(progressBar.getLabel());
        progressBar.iterate();

        frame.setSize(400, 400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
