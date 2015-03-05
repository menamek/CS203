import java.util.ArrayList;
public class VehicleTestDriver {
public static void main (String args[]){
		
		ArrayList<Asset> assets = new ArrayList<Asset>();
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		ArrayList<Object> objects = new ArrayList<Object>();
		
		
		CorporateCar car = new CorporateCar();
		
		car.move(3);
		
		
		assets.add(car);
		vehicles.add(car);
		objects.add(car);
		
		for (Vehicle v : vehicles){
			System.out.println(v.getSpeed());
			v.accelerate();
			System.out.println(v.getSpeed());
			v.brake();
			System.out.println(v.getSpeed());
		}
		for (Asset a : assets){
			
			System.out.println(a.getPurchasePrice());
			
			
		}
		for(Object o : objects){
			System.out.println(o.toString());
		}
				
	}
}
