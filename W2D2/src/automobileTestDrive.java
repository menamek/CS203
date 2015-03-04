import java.util.ArrayList;
public class automobileTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Automobile> auto = new ArrayList<Automobile>();
		Car car1=new Car();
	    Car car2=new Car();
	    Truck tru1=new Truck();
	    Truck tru2=new Truck();
	    Truck tru3=new Truck();
		auto.add(car1);
		auto.add(car2);
		auto.add(tru1);
		auto.add(tru2);
		auto.add(tru3);
		
		for(Automobile m:auto){
			m.Accelerate();
			m.Accelerate();
			m.Accelerate();
			m.Brake();
			System.out.println(m.getSpeed());
		}
	}

}
