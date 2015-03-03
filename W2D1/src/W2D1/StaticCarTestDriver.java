package W2D1;

public class StaticCarTestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	StaticCar car1=new StaticCar();
    StaticCar car2=new StaticCar();
    
    car1.moveDown(car1, 0);
    car1.moveDown(car1, 0);
    car1.moveRight(car1, 0);
    
    car2.moveup(car2, 0);
    car2.moveup(car2, 0);
    car2.moveLeft(car2, 0);
    car2.returnLocation(car1);
    car2.returnLocation(car2);
    }

}
