
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculator extends JPanel{
	private JButton k, b,b1,b2,b3,c,c1,c2,c3,d,d1,d2,d3,e,e1,e2,e3;
	private JFrame frame;	
	private JTextField field1;
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.go();
		
	}

	private void go() {
		// TODO Auto-generated method stub
		this.frame = new JFrame();
		JPanel outer= new JPanel();
		this.field1 = new JTextField(10);
		JPanel jp5= new JPanel();
		jp5.add(field1);
		field1.setEditable(true);
		field1.requestFocus();
		this.k = new JButton("c");
		jp5.add(k);
		outer.add(jp5);
		k.addActionListener(new L17 ());
		frame.getContentPane().add(BorderLayout.NORTH,jp5);
		JPanel jp1= new JPanel();
		JPanel jp2= new JPanel();
		JPanel jp3= new JPanel();
		JPanel jp4= new JPanel();
		this.b = new JButton("7");
		this.b1 = new JButton("8");
		this.b2 = new JButton("9");
		this.b3 = new JButton("+");
		b.addActionListener(new L1());
		b1.addActionListener(new L2());
		b2.addActionListener(new L3());
		b3.addActionListener(new L4());
		jp1.add(b);
		jp1.add(b1);
		jp1.add(b2);
		jp1.add(b3);
		this.c = new JButton("4");
		this.c1 = new JButton("5");
		this.c2 = new JButton("6");
		this.c3 = new JButton("-");
		c.addActionListener(new L5());
		c1.addActionListener(new L6());
		c2.addActionListener(new L7());
		c3.addActionListener(new L8());
		jp2.add(c);
		jp2.add(c1);
		jp2.add(c2);
		jp2.add(c3);
		this.d = new JButton("1");
		this.d1 = new JButton("2");
		this.d2 = new JButton("3");
		this.d3 = new JButton("*");
		d.addActionListener(new L9());
		d1.addActionListener(new L10());
		d2.addActionListener(new L11());
		d3.addActionListener(new L12());
		jp3.add(d);
		jp3.add(d1);
		jp3.add(d2);
		jp3.add(d3);
		this.e = new JButton(".");
		this.e1 = new JButton("0");
		this.e2 = new JButton("=");
		this.e3 = new JButton("/");
		e.addActionListener(new L13());
		e1.addActionListener(new L14());
		e2.addActionListener(new L15());
		e3.addActionListener(new L16());
		jp4.add(e);
		jp4.add(e1);
		jp4.add(e2);
		jp4.add(e3);
		
		frame.getContentPane().add(BorderLayout.CENTER,outer);
		outer.add(jp1);
		outer.add(jp2);
		outer.add(jp3);
		outer.add(jp4);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(200,250);
		frame.setVisible(true);
	}
	private class L1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			field1.setText("7");
		}
	}
		private class L2 implements ActionListener{

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				field1.setText("8");
			}
		}
			private class L3 implements ActionListener{

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					field1.setText("9");
				}
			}
				private class L4 implements ActionListener{

					@Override
					public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						field1.setText("+");
					}
				}
					private class L5 implements ActionListener{

						@Override
						public void actionPerformed(ActionEvent e) {
							// TODO Auto-generated method stub
							field1.setText("4");
						}
					}
						private class L6 implements ActionListener{

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								field1.setText("5");
							}
						}
							private class L7 implements ActionListener{

								@Override
								public void actionPerformed(ActionEvent e) {
									// TODO Auto-generated method stub
									field1.setText("6");
								}
							}
								private class L8 implements ActionListener{

									@Override
									public void actionPerformed(ActionEvent e) {
										// TODO Auto-generated method stub
										field1.setText("-");
									}
								}
									private class L9 implements ActionListener{

										@Override
										public void actionPerformed(ActionEvent e) {
											// TODO Auto-generated method stub
											field1.setText("1");
										}
									}
										private class L10 implements ActionListener{

											@Override
											public void actionPerformed(ActionEvent e) {
												// TODO Auto-generated method stub
												field1.setText("2");
											}
										}
											private class L11 implements ActionListener{

												@Override
												public void actionPerformed(ActionEvent e) {
													// TODO Auto-generated method stub
													field1.setText("3");
												}
											}
												private class L12 implements ActionListener{

													@Override
													public void actionPerformed(ActionEvent e) {
														// TODO Auto-generated method stub
														field1.setText("*");
													}
												}
													private class L13 implements ActionListener{

														@Override
														public void actionPerformed(ActionEvent e) {
															// TODO Auto-generated method stub
															field1.setText(".");
														}
													}
														private class L14 implements ActionListener{

															@Override
															public void actionPerformed(ActionEvent e) {
																// TODO Auto-generated method stub
																field1.setText("0");
															}
														}
															private class L15 implements ActionListener{

																@Override
																public void actionPerformed(ActionEvent e) {
																	// TODO Auto-generated method stub
																	field1.setText("=");
																}
															}
																private class L16 implements ActionListener{
																	@Override
																	public void actionPerformed(ActionEvent e) {
																		// TODO Auto-generated method stub
																		field1.setText("/");
																	}
						
																}
																private class L17 implements ActionListener{
																	@Override
																	public void actionPerformed(ActionEvent e) {
																		// TODO Auto-generated method stub
																		field1.setText("");
																	}
						
																}
																


	}
													
													
