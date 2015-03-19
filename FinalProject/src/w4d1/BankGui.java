/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w4d1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;
import javax.swing.JTextArea;

/**
 *
 * @author mena
 */
public class BankGui extends JFrame {

    public BankGui() {
        JTextArea text = new JTextArea();
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream("bank.data");
            ois = new ObjectInputStream(fis);
            Account x = (Account) ois.readObject();
            while (x != null) {
                text.append("Name: " + x.getAccountType() + "\n");
                text.append("Name: " + x.getCustomer() + "\n");
                text.append("current Balance as of : " + x.getCurrentDate() + " is " + x.getCurBalance() + "\n");
                text.append("Account opened on: " + String.format("%tc", x.GetDate()));
                text.append("\n\n");
                x = (Account) ois.readObject();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        JFrame f = new JFrame();
        f.getContentPane().add(text);

        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setSize(500, 400);
        f.setVisible(true);

    }

    public static void main(String[] args) {
        new BankGui();
    }
}
