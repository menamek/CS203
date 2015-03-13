/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d4;

import java.awt.BorderLayout;
import java.awt.Component;
import static java.awt.SystemColor.text;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author mena
 */
public class SimpleNotePad implements Serializable {

    private JFrame frame1;
    private JPanel outer;
    private JPanel p1;
    private JTextArea text;
    private JButton save;
    private JButton load;

    public static void main(String[] args) {
        SimpleNotePad app = new SimpleNotePad();
        app.go();
    }

    private void go() {
        this.frame1 = new JFrame();
        frame1.setVisible(true);
        this.outer = new JPanel();
        this.p1 = new JPanel();
        this.text = new JTextArea(30, 40);
        this.save = new JButton("Save");
        this.load = new JButton("Load");
        text.enableInputMethods(true);
        save.addActionListener(new Save());
        load.addActionListener(new Load());
        p1.add(save);
        p1.add(load);
        outer.add(text);
        outer.add(p1);
        frame1.getContentPane().add(BorderLayout.CENTER, outer);
        frame1.getContentPane().add(BorderLayout.NORTH, p1);
        frame1.setSize(400, 400);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    private class Save implements ActionListener, Serializable{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                FileOutputStream out = new FileOutputStream("notepad.txt");
                ObjectOutputStream oos = new ObjectOutputStream(out);
                oos.writeObject(text.getText());
                oos.close();
            } catch (Exception ex) {
                System.out.println("Error");
            }
        }
        }
        

    private class Load implements ActionListener, Serializable {

        @Override
        public void actionPerformed(ActionEvent ae) {
            try {
                FileInputStream in = new FileInputStream("notepad.txt");
                ObjectInputStream ios = new ObjectInputStream(in);
                String x = (String) ios.readObject();
                text.setText(x);
                ios.close();
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}
