import javax.swing.*;

// Without Inheritance
class Frame {
	private JFrame frame;
	
	public Frame(int width, int height) {
		frame = new JFrame();
		
		frame.setSize(width, height);
		frame.setName("My First GUI Window");
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Click Me");
		button.setBounds(100, 100, 140, 40);
		
		frame.add(button);
	}
}

// By Inheriting the JFrame Class
class Frame2 extends JFrame {
	public Frame2(int width, int height) {
		this.setSize(width, height);
		this.setName("My First GUI Window");
		this.setLayout(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("Click Me");
		button.setBounds(100, 100, 140, 40);
		
		this.add(button);
	}
}


public class JavaFrame {

	public static void main(String[] args) {
		Frame2 frame = new Frame2(330, 400);
	}

}
