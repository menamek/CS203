
public class Car extends Automobile {
	private boolean convertable;
	private int trunkCapacity;
	
	public boolean getConvertable(){
		return convertable;
	}
	public void setConvertable(boolean convertable){
		this.convertable=convertable;
	}
	
	public int getTrunkCapacity(){
		return trunkCapacity;
	}
	public void setTrunkCapacity(int year){
		this.trunkCapacity=trunkCapacity;
	}
	public void Accelerate(){
		setSpeed(12);
	}
}
