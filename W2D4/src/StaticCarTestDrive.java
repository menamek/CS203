

public class StaticCarTestDrive {
    public static void main (String[] args) {
        
        StaticCar one = new StaticCar(4, 5, "Toyota", "Addis Abeba");
        StaticCar two = new StaticCar(10, 20);
        
        
        StaticCar.setX(one, 3);
        StaticCar.setY(one, 3);
        
        StaticCar.setX(two, -3);
        StaticCar.setY(two, -3);
        
        StaticCar.setName(one, "Car One");
        StaticCar.setName(two, "Car Two");
        
        StaticCar.moveDown(one, 1);
        StaticCar.moveRight(one, 1);
        
        StaticCar.moveRight(one, 1);
        StaticCar.moveDown(one, 1);
        
        StaticCar.moveUp(two, 1);
        StaticCar.moveLeft(two, 1);
        StaticCar.moveLeft(two, 1);
        StaticCar.moveUp(two, 1);
        
        StaticCar.setLocation(one, "Car One is at X: " 
                + StaticCar.getX(one) + ", Y: " + StaticCar.getY(one));
        StaticCar.setLocation(two,  "Car Two is at X: " 
                + StaticCar.getX(two) + ", Y: " + StaticCar.getY(two));
        
        System.out.println(StaticCar.getLocation(one));
        System.out.println(StaticCar.getLocation(two));
    } 
}
