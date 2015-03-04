
public class Truck extends Automobile {
	private int carryingCapacity;
	private boolean hasTailGate;
	
	public int getCarryingCapacity(){
		return carryingCapacity;
	}
	public void setCarryingCapacity(int carryingCapacity){
		this.carryingCapacity=carryingCapacity;
	}
	
	public boolean getHasTailGate(){
		return hasTailGate;
	}
	public void setHasTailGate(boolean hasTailGate){
		this.hasTailGate=hasTailGate;
	}
	
	public void Accelerate(){
		setSpeed(7);
	}
		
}
