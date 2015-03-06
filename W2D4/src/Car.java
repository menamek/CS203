
public class Car extends Automobile {
	private boolean convertable;
	private int trunkCapacity;
	Car(String mark, String model, int year, String color,
			boolean convertible, int trunkCapacity) {
		super(mark, model, year, color);
	
		this.convertable = convertible;
		this.trunkCapacity = trunkCapacity;
	}
	Car(String make, String model, int year, String color, int trunkCapacity) {
		this(make, model, year, color, false, trunkCapacity);
	}
	Car(String make, String model, int trunkCapacity) {
		//this(make, model, 2015, "unknown", trunkCapacity);
		super(make, model);
		this.convertable = false;
		this.trunkCapacity = trunkCapacity;
	}
	public boolean isConvertable() {
		return convertable;
	}
	public void setConvertable(boolean convertable) {
		this.convertable = convertable;
	}
	public int getTrunkCapacity() {
		return trunkCapacity;
	}
	public void setTrunkCapacity(int trunkCapacity) {
		this.trunkCapacity = trunkCapacity;
	}
	public void accelerate() {
		this.speed = this.speed + 12;
		// this.setSpeed( this.getSpeed() + 12);
		}
}
