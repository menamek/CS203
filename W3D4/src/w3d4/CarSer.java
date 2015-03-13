/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w3d4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author mena
 */
public class CarSer {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO Auto-generated method stub
        Car c1 = new Car();
        c1.moveup();
        c1.moveRight();
        c1.printLocation();

        Car c2 = new Car();
        c2.moveLeft();
        c2.moveDown();
        c2.printLocation();

        FileOutputStream outFileStream = new FileOutputStream("car.txt");
        ObjectOutputStream oos = new ObjectOutputStream(outFileStream);

        oos.writeObject(c1);
        oos.writeObject(c2);
        oos.close();

        FileInputStream fis = new FileInputStream("car.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Car x = (Car) ois.readObject();
        Car y = (Car) ois.readObject();
        System.out.println(x.getX() + " and " + y.getX());
    }
}
