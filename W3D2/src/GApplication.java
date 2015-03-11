import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class GApplication{
	private JButton goodbyeButton;
	private JButton helloButton;
	private JFrame frame;
	private JLabel label;
	public static void main(String[] args) {
		GApplication g = new GApplication();
		g.doThings();
	}
	public void doThings() {
		frame = new JFrame("Gapplication!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300,150);
		this.goodbyeButton = new JButton("Good Bye");
		frame.getContentPane().add(BorderLayout.SOUTH, goodbyeButton);
		goodbyeButton.addActionListener(new GoodbyeListener());
		helloButton = new JButton("Hello");
		frame.getContentPane().add(BorderLayout.NORTH, helloButton);
		helloButton.addActionListener(new HelloListener());
		label = new JLabel("Nothing yet");
		frame.getContentPane().add(BorderLayout.WEST, label);
		frame.setVisible(true);
	}
	private class HelloListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("Hello");
		}
	}
	private class GoodbyeListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			label.setText("Good Bye");
		}
	}
}