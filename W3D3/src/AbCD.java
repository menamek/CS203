import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AbCD extends JPanel {

	public static void main(String[] args) {
		AbCD a = new AbCD();
		a.go();

	}

	private void go() {
		JFrame frame = new JFrame();
		JPanel jp = new JPanel();
		jp.setBackground(Color.gray);

		JButton b = new JButton("A");
		b.setPreferredSize(new Dimension(100, 100));
		b.addActionListener(new L1());
		JButton b1 = new JButton("B");
		b1.addActionListener(new L2());
		b1.setPreferredSize(new Dimension(100, 100));
		JButton b2 = new JButton("C");
		b2.addActionListener(new L3());
		b2.setPreferredSize(new Dimension(100, 100));
		JButton b3 = new JButton("D");
		b3.addActionListener(new L4());
		b3.setPreferredSize(new Dimension(100, 100));
		jp.add(b);
		jp.add(b1);
		jp.add(b2);
		jp.add(b3);
		frame.getContentPane().add(BorderLayout.CENTER, jp);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);

	}

	private class L1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("A");
		}
	}

	private class L2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("B");
		}
	}

	private class L3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("C");
		}
	}

	private class L4 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("D");
		}
	}

}
