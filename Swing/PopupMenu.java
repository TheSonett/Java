import java.awt.event.*;
import javax.swing.*;

public class PopupMenu {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Popup window example");
		JPopupMenu popupMenu = new JPopupMenu("Edit");
		JMenuItem cut = new JMenuItem("cut");
		JMenuItem paste = new JMenuItem("paste");
		JMenuItem copy = new JMenuItem("copy");
		JLabel label = new JLabel();
		label.setBounds(40, 40, 180, 30);
	
		popupMenu.add(cut);
		popupMenu.add(paste);
		popupMenu.add(copy);
		
		// actions
		cut.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("You have cut somthing!!");
			}
		});

		paste.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("You pasted something!!");
			}
		});

		copy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("You copied something!!");
			}
		});

		frame.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				popupMenu.show(frame, e.getX(), e.getY());
			}
		});

		frame.add(popupMenu);
		frame.add(label);
		frame.setSize(400, 400);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setLocation(400, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
