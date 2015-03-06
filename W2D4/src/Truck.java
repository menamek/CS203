
public class Truck extends Automobile {
	private int carryingCapacity;
	private boolean hasTailGate;
	
	Truck(String mark, String model, int year, String color, int carryingCapacity,
			boolean hasTailGate){
		super(mark, model, year, color);
		this.carryingCapacity = carryingCapacity;
		this.hasTailGate =  hasTailGate;
		
	}
	Truck(String make, String model, int year, String color, int carryingCapacity){
		this(make, model, year, color, carryingCapacity, false);
		
	}
	Truck(String make, String model, int carryingCapacity){
		super(make, model);
		this.carryingCapacity = carryingCapacity;
		this.hasTailGate =  false;
		
	}
	
	public int getCarryingCapacity() {
		return carryingCapacity;
	}
	public void setCarryingCapacity(int carryingCapacity) {
		this.carryingCapacity = carryingCapacity;
	}
	public boolean isHasTailGate() {
		return hasTailGate;
	}
	public void setHasTailGate(boolean hasTailGate) {
		this.hasTailGate = hasTailGate;
	}
	public void accelerate() {
		this.speed = this.speed + 7
				
				;
		
		//this.setSpeed( this.getSpeed() + 7);
	}
}